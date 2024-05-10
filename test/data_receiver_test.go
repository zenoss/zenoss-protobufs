package test

import (
	"context"
	"crypto/tls"
	"fmt"
	"log"
	"os"
	"testing"
	"time"

	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials"
	"google.golang.org/grpc/metadata"

	"github.com/zenoss/zenoss-protobufs/go/cloud/data_receiver"
)

func TestDataReceiver(t *testing.T) {
	dialOption := grpc.WithTransportCredentials(credentials.NewTLS(&tls.Config{}))

	conn, err := grpc.Dial("api-zing-preview.zenoss.io:443", dialOption)
	if err != nil {
		log.Fatal(err)
	}

	ZenossAPIKey := os.Getenv("ZENOSS_API_KEY")
	if ZenossAPIKey == "" {
		log.Fatal("Missing ZENOSS_API_KEY environment variable: failing")
	}

	client := data_receiver.NewDataReceiverServiceClient(conn)
	ctx := metadata.AppendToOutgoingContext(
		context.Background(),
		"zenoss-api-key",
		ZenossAPIKey)

	r, err := client.PutEvents(ctx, &data_receiver.Events{
		DetailedResponse: true,
		Events: []*data_receiver.Event{
			{
				Timestamp: time.Now().UnixNano() / 1e6,
				Name:      "cluther.prototest.PutEvents",
				Dimensions: map[string]string{
					"source": "puffer.cluther.tld",
					"app":    "prototest",
				},
				Type:     "cluther.prototest",
				Summary:  "testing data-receiver.PutEvents",
				Severity: data_receiver.Severity_SEVERITY_INFO,
			},
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	fmt.Printf("data-receiver.PutEvents: succeeded=%d failed=%d\n", r.Succeeded, r.Failed)

	pec, err := client.PutEvent(ctx)
	if err != nil {
		log.Fatal(err)
	}

	err = pec.Send(&data_receiver.EventWrapper{
		EventType: &data_receiver.EventWrapper_Canonical{
			Canonical: &data_receiver.Event{
				Timestamp: time.Now().UnixNano() / 1e6,
				Name:      "cluther.prototest.PutEvent",
				Dimensions: map[string]string{
					"source": "puffer.cluther.tld",
					"app":    "prototest",
				},
				Type:     "cluther.prototest",
				Summary:  "testing data-receiver.PutEvent",
				Severity: data_receiver.Severity_SEVERITY_INFO,
			},
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	fmt.Printf("data-receiver.PutEvent: succeeded=1 failed=0")
}
