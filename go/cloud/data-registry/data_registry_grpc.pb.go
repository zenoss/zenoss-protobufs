// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.3.0
// - protoc             (unknown)
// source: zenoss/cloud/data_registry.proto

package data_registry

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

const (
	DataRegistryService_CreateOrUpdateMetric_FullMethodName  = "/zenoss.cloud.DataRegistryService/CreateOrUpdateMetric"
	DataRegistryService_CreateOrUpdateMetrics_FullMethodName = "/zenoss.cloud.DataRegistryService/CreateOrUpdateMetrics"
	DataRegistryService_UpdateMetric_FullMethodName          = "/zenoss.cloud.DataRegistryService/UpdateMetric"
	DataRegistryService_RegisterDefinition_FullMethodName    = "/zenoss.cloud.DataRegistryService/RegisterDefinition"
	DataRegistryService_UpdateDefinition_FullMethodName      = "/zenoss.cloud.DataRegistryService/UpdateDefinition"
	DataRegistryService_GetMetric_FullMethodName             = "/zenoss.cloud.DataRegistryService/GetMetric"
)

// DataRegistryServiceClient is the client API for DataRegistryService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type DataRegistryServiceClient interface {
	CreateOrUpdateMetric(ctx context.Context, in *RegisterMetricRequest, opts ...grpc.CallOption) (*RegisterMetricResponse, error)
	CreateOrUpdateMetrics(ctx context.Context, opts ...grpc.CallOption) (DataRegistryService_CreateOrUpdateMetricsClient, error)
	UpdateMetric(ctx context.Context, in *UpdateMetricRequest, opts ...grpc.CallOption) (*RegisterMetricResponse, error)
	RegisterDefinition(ctx context.Context, in *Definition, opts ...grpc.CallOption) (*DefinitionResponse, error)
	UpdateDefinition(ctx context.Context, in *DefinitionUpdate, opts ...grpc.CallOption) (*DefinitionResponse, error)
	GetMetric(ctx context.Context, in *GetMetricRequest, opts ...grpc.CallOption) (*GetMetricResponse, error)
}

type dataRegistryServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewDataRegistryServiceClient(cc grpc.ClientConnInterface) DataRegistryServiceClient {
	return &dataRegistryServiceClient{cc}
}

func (c *dataRegistryServiceClient) CreateOrUpdateMetric(ctx context.Context, in *RegisterMetricRequest, opts ...grpc.CallOption) (*RegisterMetricResponse, error) {
	out := new(RegisterMetricResponse)
	err := c.cc.Invoke(ctx, DataRegistryService_CreateOrUpdateMetric_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataRegistryServiceClient) CreateOrUpdateMetrics(ctx context.Context, opts ...grpc.CallOption) (DataRegistryService_CreateOrUpdateMetricsClient, error) {
	stream, err := c.cc.NewStream(ctx, &DataRegistryService_ServiceDesc.Streams[0], DataRegistryService_CreateOrUpdateMetrics_FullMethodName, opts...)
	if err != nil {
		return nil, err
	}
	x := &dataRegistryServiceCreateOrUpdateMetricsClient{stream}
	return x, nil
}

type DataRegistryService_CreateOrUpdateMetricsClient interface {
	Send(*RegisterMetricRequest) error
	CloseAndRecv() (*RegisterMetricsResponse, error)
	grpc.ClientStream
}

type dataRegistryServiceCreateOrUpdateMetricsClient struct {
	grpc.ClientStream
}

func (x *dataRegistryServiceCreateOrUpdateMetricsClient) Send(m *RegisterMetricRequest) error {
	return x.ClientStream.SendMsg(m)
}

func (x *dataRegistryServiceCreateOrUpdateMetricsClient) CloseAndRecv() (*RegisterMetricsResponse, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(RegisterMetricsResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *dataRegistryServiceClient) UpdateMetric(ctx context.Context, in *UpdateMetricRequest, opts ...grpc.CallOption) (*RegisterMetricResponse, error) {
	out := new(RegisterMetricResponse)
	err := c.cc.Invoke(ctx, DataRegistryService_UpdateMetric_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataRegistryServiceClient) RegisterDefinition(ctx context.Context, in *Definition, opts ...grpc.CallOption) (*DefinitionResponse, error) {
	out := new(DefinitionResponse)
	err := c.cc.Invoke(ctx, DataRegistryService_RegisterDefinition_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataRegistryServiceClient) UpdateDefinition(ctx context.Context, in *DefinitionUpdate, opts ...grpc.CallOption) (*DefinitionResponse, error) {
	out := new(DefinitionResponse)
	err := c.cc.Invoke(ctx, DataRegistryService_UpdateDefinition_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataRegistryServiceClient) GetMetric(ctx context.Context, in *GetMetricRequest, opts ...grpc.CallOption) (*GetMetricResponse, error) {
	out := new(GetMetricResponse)
	err := c.cc.Invoke(ctx, DataRegistryService_GetMetric_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// DataRegistryServiceServer is the server API for DataRegistryService service.
// All implementations must embed UnimplementedDataRegistryServiceServer
// for forward compatibility
type DataRegistryServiceServer interface {
	CreateOrUpdateMetric(context.Context, *RegisterMetricRequest) (*RegisterMetricResponse, error)
	CreateOrUpdateMetrics(DataRegistryService_CreateOrUpdateMetricsServer) error
	UpdateMetric(context.Context, *UpdateMetricRequest) (*RegisterMetricResponse, error)
	RegisterDefinition(context.Context, *Definition) (*DefinitionResponse, error)
	UpdateDefinition(context.Context, *DefinitionUpdate) (*DefinitionResponse, error)
	GetMetric(context.Context, *GetMetricRequest) (*GetMetricResponse, error)
	mustEmbedUnimplementedDataRegistryServiceServer()
}

// UnimplementedDataRegistryServiceServer must be embedded to have forward compatible implementations.
type UnimplementedDataRegistryServiceServer struct {
}

func (UnimplementedDataRegistryServiceServer) CreateOrUpdateMetric(context.Context, *RegisterMetricRequest) (*RegisterMetricResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateOrUpdateMetric not implemented")
}
func (UnimplementedDataRegistryServiceServer) CreateOrUpdateMetrics(DataRegistryService_CreateOrUpdateMetricsServer) error {
	return status.Errorf(codes.Unimplemented, "method CreateOrUpdateMetrics not implemented")
}
func (UnimplementedDataRegistryServiceServer) UpdateMetric(context.Context, *UpdateMetricRequest) (*RegisterMetricResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateMetric not implemented")
}
func (UnimplementedDataRegistryServiceServer) RegisterDefinition(context.Context, *Definition) (*DefinitionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RegisterDefinition not implemented")
}
func (UnimplementedDataRegistryServiceServer) UpdateDefinition(context.Context, *DefinitionUpdate) (*DefinitionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateDefinition not implemented")
}
func (UnimplementedDataRegistryServiceServer) GetMetric(context.Context, *GetMetricRequest) (*GetMetricResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetMetric not implemented")
}
func (UnimplementedDataRegistryServiceServer) mustEmbedUnimplementedDataRegistryServiceServer() {}

// UnsafeDataRegistryServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to DataRegistryServiceServer will
// result in compilation errors.
type UnsafeDataRegistryServiceServer interface {
	mustEmbedUnimplementedDataRegistryServiceServer()
}

func RegisterDataRegistryServiceServer(s grpc.ServiceRegistrar, srv DataRegistryServiceServer) {
	s.RegisterService(&DataRegistryService_ServiceDesc, srv)
}

func _DataRegistryService_CreateOrUpdateMetric_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RegisterMetricRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataRegistryServiceServer).CreateOrUpdateMetric(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: DataRegistryService_CreateOrUpdateMetric_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataRegistryServiceServer).CreateOrUpdateMetric(ctx, req.(*RegisterMetricRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataRegistryService_CreateOrUpdateMetrics_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(DataRegistryServiceServer).CreateOrUpdateMetrics(&dataRegistryServiceCreateOrUpdateMetricsServer{stream})
}

type DataRegistryService_CreateOrUpdateMetricsServer interface {
	SendAndClose(*RegisterMetricsResponse) error
	Recv() (*RegisterMetricRequest, error)
	grpc.ServerStream
}

type dataRegistryServiceCreateOrUpdateMetricsServer struct {
	grpc.ServerStream
}

func (x *dataRegistryServiceCreateOrUpdateMetricsServer) SendAndClose(m *RegisterMetricsResponse) error {
	return x.ServerStream.SendMsg(m)
}

func (x *dataRegistryServiceCreateOrUpdateMetricsServer) Recv() (*RegisterMetricRequest, error) {
	m := new(RegisterMetricRequest)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func _DataRegistryService_UpdateMetric_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateMetricRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataRegistryServiceServer).UpdateMetric(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: DataRegistryService_UpdateMetric_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataRegistryServiceServer).UpdateMetric(ctx, req.(*UpdateMetricRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataRegistryService_RegisterDefinition_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Definition)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataRegistryServiceServer).RegisterDefinition(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: DataRegistryService_RegisterDefinition_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataRegistryServiceServer).RegisterDefinition(ctx, req.(*Definition))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataRegistryService_UpdateDefinition_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DefinitionUpdate)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataRegistryServiceServer).UpdateDefinition(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: DataRegistryService_UpdateDefinition_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataRegistryServiceServer).UpdateDefinition(ctx, req.(*DefinitionUpdate))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataRegistryService_GetMetric_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetMetricRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataRegistryServiceServer).GetMetric(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: DataRegistryService_GetMetric_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataRegistryServiceServer).GetMetric(ctx, req.(*GetMetricRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// DataRegistryService_ServiceDesc is the grpc.ServiceDesc for DataRegistryService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var DataRegistryService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "zenoss.cloud.DataRegistryService",
	HandlerType: (*DataRegistryServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateOrUpdateMetric",
			Handler:    _DataRegistryService_CreateOrUpdateMetric_Handler,
		},
		{
			MethodName: "UpdateMetric",
			Handler:    _DataRegistryService_UpdateMetric_Handler,
		},
		{
			MethodName: "RegisterDefinition",
			Handler:    _DataRegistryService_RegisterDefinition_Handler,
		},
		{
			MethodName: "UpdateDefinition",
			Handler:    _DataRegistryService_UpdateDefinition_Handler,
		},
		{
			MethodName: "GetMetric",
			Handler:    _DataRegistryService_GetMetric_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "CreateOrUpdateMetrics",
			Handler:       _DataRegistryService_CreateOrUpdateMetrics_Handler,
			ClientStreams: true,
		},
	},
	Metadata: "zenoss/cloud/data_registry.proto",
}
