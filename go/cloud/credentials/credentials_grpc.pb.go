// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             (unknown)
// source: zenoss/cloud/credentials.proto

package credentials

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// CredentialManagementClient is the client API for CredentialManagement service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type CredentialManagementClient interface {
	GetCredential(ctx context.Context, in *GetCredentialRequest, opts ...grpc.CallOption) (*GetCredentialResponse, error)
}

type credentialManagementClient struct {
	cc grpc.ClientConnInterface
}

func NewCredentialManagementClient(cc grpc.ClientConnInterface) CredentialManagementClient {
	return &credentialManagementClient{cc}
}

func (c *credentialManagementClient) GetCredential(ctx context.Context, in *GetCredentialRequest, opts ...grpc.CallOption) (*GetCredentialResponse, error) {
	out := new(GetCredentialResponse)
	err := c.cc.Invoke(ctx, "/zenoss.cloud.credentials.CredentialManagement/GetCredential", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// CredentialManagementServer is the server API for CredentialManagement service.
// All implementations must embed UnimplementedCredentialManagementServer
// for forward compatibility
type CredentialManagementServer interface {
	GetCredential(context.Context, *GetCredentialRequest) (*GetCredentialResponse, error)
	mustEmbedUnimplementedCredentialManagementServer()
}

// UnimplementedCredentialManagementServer must be embedded to have forward compatible implementations.
type UnimplementedCredentialManagementServer struct {
}

func (UnimplementedCredentialManagementServer) GetCredential(context.Context, *GetCredentialRequest) (*GetCredentialResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetCredential not implemented")
}
func (UnimplementedCredentialManagementServer) mustEmbedUnimplementedCredentialManagementServer() {}

// UnsafeCredentialManagementServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to CredentialManagementServer will
// result in compilation errors.
type UnsafeCredentialManagementServer interface {
	mustEmbedUnimplementedCredentialManagementServer()
}

func RegisterCredentialManagementServer(s grpc.ServiceRegistrar, srv CredentialManagementServer) {
	s.RegisterService(&CredentialManagement_ServiceDesc, srv)
}

func _CredentialManagement_GetCredential_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetCredentialRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CredentialManagementServer).GetCredential(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/zenoss.cloud.credentials.CredentialManagement/GetCredential",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CredentialManagementServer).GetCredential(ctx, req.(*GetCredentialRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// CredentialManagement_ServiceDesc is the grpc.ServiceDesc for CredentialManagement service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var CredentialManagement_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "zenoss.cloud.credentials.CredentialManagement",
	HandlerType: (*CredentialManagementServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetCredential",
			Handler:    _CredentialManagement_GetCredential_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "zenoss/cloud/credentials.proto",
}
