# zenoss-protobufs
Public protobuf messages for data-receiver

# Using Protobufs

Inspect the protobufs inside the protobufs folder for data_receiver.proto:

    protobufs/
    `-- zenoss
        `-- cloud
            `-- data_receiver.proto

Design your code as per normal protobuf coding standards:

    https://developers.google.com/protocol-buffers/docs/tutorials

# Regenerating the new gRPC code, based on the new .proto:

    make

Make that you have new asociated gRPC code for the following languages:

    - Golang
    - Java
    - Python


# Functional Testing

After making changes to data_receiver.proto, generate an API key as per:

    https://help.zenoss.com/docs/administering-zenoss-cloud/enabling-access-for-zenoss-api-clients/managing-streaming-data-clients-and-zenoss-api-keys/creating-a-zenoss-api-key

Now set your *ZENOSS_API_KEY* environment variable:

    export ZENOSS_API_KEY="asldkf.alsdjfal.sdkjf209u09cjoj2oi"

Then ensure that the functional tests pass:

    make test

If you have test items that need modification or fixing, add those to test/data_receiver_test.go.
