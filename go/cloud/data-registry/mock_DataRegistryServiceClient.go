// Code generated by mockery v2.12.2. DO NOT EDIT.

package data_registry

import (
	context "context"

	grpc "google.golang.org/grpc"

	mock "github.com/stretchr/testify/mock"

	testing "testing"
)

// MockDataRegistryServiceClient is an autogenerated mock type for the DataRegistryServiceClient type
type MockDataRegistryServiceClient struct {
	mock.Mock
}

type MockDataRegistryServiceClient_Expecter struct {
	mock *mock.Mock
}

func (_m *MockDataRegistryServiceClient) EXPECT() *MockDataRegistryServiceClient_Expecter {
	return &MockDataRegistryServiceClient_Expecter{mock: &_m.Mock}
}

// CreateOrUpdateMetric provides a mock function with given fields: ctx, in, opts
func (_m *MockDataRegistryServiceClient) CreateOrUpdateMetric(ctx context.Context, in *RegisterMetricRequest, opts ...grpc.CallOption) (*RegisterMetricResponse, error) {
	_va := make([]interface{}, len(opts))
	for _i := range opts {
		_va[_i] = opts[_i]
	}
	var _ca []interface{}
	_ca = append(_ca, ctx, in)
	_ca = append(_ca, _va...)
	ret := _m.Called(_ca...)

	var r0 *RegisterMetricResponse
	if rf, ok := ret.Get(0).(func(context.Context, *RegisterMetricRequest, ...grpc.CallOption) *RegisterMetricResponse); ok {
		r0 = rf(ctx, in, opts...)
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(*RegisterMetricResponse)
		}
	}

	var r1 error
	if rf, ok := ret.Get(1).(func(context.Context, *RegisterMetricRequest, ...grpc.CallOption) error); ok {
		r1 = rf(ctx, in, opts...)
	} else {
		r1 = ret.Error(1)
	}

	return r0, r1
}

// MockDataRegistryServiceClient_CreateOrUpdateMetric_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'CreateOrUpdateMetric'
type MockDataRegistryServiceClient_CreateOrUpdateMetric_Call struct {
	*mock.Call
}

// CreateOrUpdateMetric is a helper method to define mock.On call
//  - ctx context.Context
//  - in *RegisterMetricRequest
//  - opts ...grpc.CallOption
func (_e *MockDataRegistryServiceClient_Expecter) CreateOrUpdateMetric(ctx interface{}, in interface{}, opts ...interface{}) *MockDataRegistryServiceClient_CreateOrUpdateMetric_Call {
	return &MockDataRegistryServiceClient_CreateOrUpdateMetric_Call{Call: _e.mock.On("CreateOrUpdateMetric",
		append([]interface{}{ctx, in}, opts...)...)}
}

func (_c *MockDataRegistryServiceClient_CreateOrUpdateMetric_Call) Run(run func(ctx context.Context, in *RegisterMetricRequest, opts ...grpc.CallOption)) *MockDataRegistryServiceClient_CreateOrUpdateMetric_Call {
	_c.Call.Run(func(args mock.Arguments) {
		variadicArgs := make([]grpc.CallOption, len(args)-2)
		for i, a := range args[2:] {
			if a != nil {
				variadicArgs[i] = a.(grpc.CallOption)
			}
		}
		run(args[0].(context.Context), args[1].(*RegisterMetricRequest), variadicArgs...)
	})
	return _c
}

func (_c *MockDataRegistryServiceClient_CreateOrUpdateMetric_Call) Return(_a0 *RegisterMetricResponse, _a1 error) *MockDataRegistryServiceClient_CreateOrUpdateMetric_Call {
	_c.Call.Return(_a0, _a1)
	return _c
}

// CreateOrUpdateMetrics provides a mock function with given fields: ctx, opts
func (_m *MockDataRegistryServiceClient) CreateOrUpdateMetrics(ctx context.Context, opts ...grpc.CallOption) (DataRegistryService_CreateOrUpdateMetricsClient, error) {
	_va := make([]interface{}, len(opts))
	for _i := range opts {
		_va[_i] = opts[_i]
	}
	var _ca []interface{}
	_ca = append(_ca, ctx)
	_ca = append(_ca, _va...)
	ret := _m.Called(_ca...)

	var r0 DataRegistryService_CreateOrUpdateMetricsClient
	if rf, ok := ret.Get(0).(func(context.Context, ...grpc.CallOption) DataRegistryService_CreateOrUpdateMetricsClient); ok {
		r0 = rf(ctx, opts...)
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(DataRegistryService_CreateOrUpdateMetricsClient)
		}
	}

	var r1 error
	if rf, ok := ret.Get(1).(func(context.Context, ...grpc.CallOption) error); ok {
		r1 = rf(ctx, opts...)
	} else {
		r1 = ret.Error(1)
	}

	return r0, r1
}

// MockDataRegistryServiceClient_CreateOrUpdateMetrics_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'CreateOrUpdateMetrics'
type MockDataRegistryServiceClient_CreateOrUpdateMetrics_Call struct {
	*mock.Call
}

// CreateOrUpdateMetrics is a helper method to define mock.On call
//  - ctx context.Context
//  - opts ...grpc.CallOption
func (_e *MockDataRegistryServiceClient_Expecter) CreateOrUpdateMetrics(ctx interface{}, opts ...interface{}) *MockDataRegistryServiceClient_CreateOrUpdateMetrics_Call {
	return &MockDataRegistryServiceClient_CreateOrUpdateMetrics_Call{Call: _e.mock.On("CreateOrUpdateMetrics",
		append([]interface{}{ctx}, opts...)...)}
}

func (_c *MockDataRegistryServiceClient_CreateOrUpdateMetrics_Call) Run(run func(ctx context.Context, opts ...grpc.CallOption)) *MockDataRegistryServiceClient_CreateOrUpdateMetrics_Call {
	_c.Call.Run(func(args mock.Arguments) {
		variadicArgs := make([]grpc.CallOption, len(args)-1)
		for i, a := range args[1:] {
			if a != nil {
				variadicArgs[i] = a.(grpc.CallOption)
			}
		}
		run(args[0].(context.Context), variadicArgs...)
	})
	return _c
}

func (_c *MockDataRegistryServiceClient_CreateOrUpdateMetrics_Call) Return(_a0 DataRegistryService_CreateOrUpdateMetricsClient, _a1 error) *MockDataRegistryServiceClient_CreateOrUpdateMetrics_Call {
	_c.Call.Return(_a0, _a1)
	return _c
}

// GetMetric provides a mock function with given fields: ctx, in, opts
func (_m *MockDataRegistryServiceClient) GetMetric(ctx context.Context, in *GetMetricRequest, opts ...grpc.CallOption) (*GetMetricResponse, error) {
	_va := make([]interface{}, len(opts))
	for _i := range opts {
		_va[_i] = opts[_i]
	}
	var _ca []interface{}
	_ca = append(_ca, ctx, in)
	_ca = append(_ca, _va...)
	ret := _m.Called(_ca...)

	var r0 *GetMetricResponse
	if rf, ok := ret.Get(0).(func(context.Context, *GetMetricRequest, ...grpc.CallOption) *GetMetricResponse); ok {
		r0 = rf(ctx, in, opts...)
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(*GetMetricResponse)
		}
	}

	var r1 error
	if rf, ok := ret.Get(1).(func(context.Context, *GetMetricRequest, ...grpc.CallOption) error); ok {
		r1 = rf(ctx, in, opts...)
	} else {
		r1 = ret.Error(1)
	}

	return r0, r1
}

// MockDataRegistryServiceClient_GetMetric_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetMetric'
type MockDataRegistryServiceClient_GetMetric_Call struct {
	*mock.Call
}

// GetMetric is a helper method to define mock.On call
//  - ctx context.Context
//  - in *GetMetricRequest
//  - opts ...grpc.CallOption
func (_e *MockDataRegistryServiceClient_Expecter) GetMetric(ctx interface{}, in interface{}, opts ...interface{}) *MockDataRegistryServiceClient_GetMetric_Call {
	return &MockDataRegistryServiceClient_GetMetric_Call{Call: _e.mock.On("GetMetric",
		append([]interface{}{ctx, in}, opts...)...)}
}

func (_c *MockDataRegistryServiceClient_GetMetric_Call) Run(run func(ctx context.Context, in *GetMetricRequest, opts ...grpc.CallOption)) *MockDataRegistryServiceClient_GetMetric_Call {
	_c.Call.Run(func(args mock.Arguments) {
		variadicArgs := make([]grpc.CallOption, len(args)-2)
		for i, a := range args[2:] {
			if a != nil {
				variadicArgs[i] = a.(grpc.CallOption)
			}
		}
		run(args[0].(context.Context), args[1].(*GetMetricRequest), variadicArgs...)
	})
	return _c
}

func (_c *MockDataRegistryServiceClient_GetMetric_Call) Return(_a0 *GetMetricResponse, _a1 error) *MockDataRegistryServiceClient_GetMetric_Call {
	_c.Call.Return(_a0, _a1)
	return _c
}

// RegisterDefinition provides a mock function with given fields: ctx, in, opts
func (_m *MockDataRegistryServiceClient) RegisterDefinition(ctx context.Context, in *Definition, opts ...grpc.CallOption) (*DefinitionResponse, error) {
	_va := make([]interface{}, len(opts))
	for _i := range opts {
		_va[_i] = opts[_i]
	}
	var _ca []interface{}
	_ca = append(_ca, ctx, in)
	_ca = append(_ca, _va...)
	ret := _m.Called(_ca...)

	var r0 *DefinitionResponse
	if rf, ok := ret.Get(0).(func(context.Context, *Definition, ...grpc.CallOption) *DefinitionResponse); ok {
		r0 = rf(ctx, in, opts...)
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(*DefinitionResponse)
		}
	}

	var r1 error
	if rf, ok := ret.Get(1).(func(context.Context, *Definition, ...grpc.CallOption) error); ok {
		r1 = rf(ctx, in, opts...)
	} else {
		r1 = ret.Error(1)
	}

	return r0, r1
}

// MockDataRegistryServiceClient_RegisterDefinition_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'RegisterDefinition'
type MockDataRegistryServiceClient_RegisterDefinition_Call struct {
	*mock.Call
}

// RegisterDefinition is a helper method to define mock.On call
//  - ctx context.Context
//  - in *Definition
//  - opts ...grpc.CallOption
func (_e *MockDataRegistryServiceClient_Expecter) RegisterDefinition(ctx interface{}, in interface{}, opts ...interface{}) *MockDataRegistryServiceClient_RegisterDefinition_Call {
	return &MockDataRegistryServiceClient_RegisterDefinition_Call{Call: _e.mock.On("RegisterDefinition",
		append([]interface{}{ctx, in}, opts...)...)}
}

func (_c *MockDataRegistryServiceClient_RegisterDefinition_Call) Run(run func(ctx context.Context, in *Definition, opts ...grpc.CallOption)) *MockDataRegistryServiceClient_RegisterDefinition_Call {
	_c.Call.Run(func(args mock.Arguments) {
		variadicArgs := make([]grpc.CallOption, len(args)-2)
		for i, a := range args[2:] {
			if a != nil {
				variadicArgs[i] = a.(grpc.CallOption)
			}
		}
		run(args[0].(context.Context), args[1].(*Definition), variadicArgs...)
	})
	return _c
}

func (_c *MockDataRegistryServiceClient_RegisterDefinition_Call) Return(_a0 *DefinitionResponse, _a1 error) *MockDataRegistryServiceClient_RegisterDefinition_Call {
	_c.Call.Return(_a0, _a1)
	return _c
}

// UpdateDefinition provides a mock function with given fields: ctx, in, opts
func (_m *MockDataRegistryServiceClient) UpdateDefinition(ctx context.Context, in *DefinitionUpdate, opts ...grpc.CallOption) (*DefinitionResponse, error) {
	_va := make([]interface{}, len(opts))
	for _i := range opts {
		_va[_i] = opts[_i]
	}
	var _ca []interface{}
	_ca = append(_ca, ctx, in)
	_ca = append(_ca, _va...)
	ret := _m.Called(_ca...)

	var r0 *DefinitionResponse
	if rf, ok := ret.Get(0).(func(context.Context, *DefinitionUpdate, ...grpc.CallOption) *DefinitionResponse); ok {
		r0 = rf(ctx, in, opts...)
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(*DefinitionResponse)
		}
	}

	var r1 error
	if rf, ok := ret.Get(1).(func(context.Context, *DefinitionUpdate, ...grpc.CallOption) error); ok {
		r1 = rf(ctx, in, opts...)
	} else {
		r1 = ret.Error(1)
	}

	return r0, r1
}

// MockDataRegistryServiceClient_UpdateDefinition_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'UpdateDefinition'
type MockDataRegistryServiceClient_UpdateDefinition_Call struct {
	*mock.Call
}

// UpdateDefinition is a helper method to define mock.On call
//  - ctx context.Context
//  - in *DefinitionUpdate
//  - opts ...grpc.CallOption
func (_e *MockDataRegistryServiceClient_Expecter) UpdateDefinition(ctx interface{}, in interface{}, opts ...interface{}) *MockDataRegistryServiceClient_UpdateDefinition_Call {
	return &MockDataRegistryServiceClient_UpdateDefinition_Call{Call: _e.mock.On("UpdateDefinition",
		append([]interface{}{ctx, in}, opts...)...)}
}

func (_c *MockDataRegistryServiceClient_UpdateDefinition_Call) Run(run func(ctx context.Context, in *DefinitionUpdate, opts ...grpc.CallOption)) *MockDataRegistryServiceClient_UpdateDefinition_Call {
	_c.Call.Run(func(args mock.Arguments) {
		variadicArgs := make([]grpc.CallOption, len(args)-2)
		for i, a := range args[2:] {
			if a != nil {
				variadicArgs[i] = a.(grpc.CallOption)
			}
		}
		run(args[0].(context.Context), args[1].(*DefinitionUpdate), variadicArgs...)
	})
	return _c
}

func (_c *MockDataRegistryServiceClient_UpdateDefinition_Call) Return(_a0 *DefinitionResponse, _a1 error) *MockDataRegistryServiceClient_UpdateDefinition_Call {
	_c.Call.Return(_a0, _a1)
	return _c
}

// UpdateMetric provides a mock function with given fields: ctx, in, opts
func (_m *MockDataRegistryServiceClient) UpdateMetric(ctx context.Context, in *UpdateMetricRequest, opts ...grpc.CallOption) (*RegisterMetricResponse, error) {
	_va := make([]interface{}, len(opts))
	for _i := range opts {
		_va[_i] = opts[_i]
	}
	var _ca []interface{}
	_ca = append(_ca, ctx, in)
	_ca = append(_ca, _va...)
	ret := _m.Called(_ca...)

	var r0 *RegisterMetricResponse
	if rf, ok := ret.Get(0).(func(context.Context, *UpdateMetricRequest, ...grpc.CallOption) *RegisterMetricResponse); ok {
		r0 = rf(ctx, in, opts...)
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(*RegisterMetricResponse)
		}
	}

	var r1 error
	if rf, ok := ret.Get(1).(func(context.Context, *UpdateMetricRequest, ...grpc.CallOption) error); ok {
		r1 = rf(ctx, in, opts...)
	} else {
		r1 = ret.Error(1)
	}

	return r0, r1
}

// MockDataRegistryServiceClient_UpdateMetric_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'UpdateMetric'
type MockDataRegistryServiceClient_UpdateMetric_Call struct {
	*mock.Call
}

// UpdateMetric is a helper method to define mock.On call
//  - ctx context.Context
//  - in *UpdateMetricRequest
//  - opts ...grpc.CallOption
func (_e *MockDataRegistryServiceClient_Expecter) UpdateMetric(ctx interface{}, in interface{}, opts ...interface{}) *MockDataRegistryServiceClient_UpdateMetric_Call {
	return &MockDataRegistryServiceClient_UpdateMetric_Call{Call: _e.mock.On("UpdateMetric",
		append([]interface{}{ctx, in}, opts...)...)}
}

func (_c *MockDataRegistryServiceClient_UpdateMetric_Call) Run(run func(ctx context.Context, in *UpdateMetricRequest, opts ...grpc.CallOption)) *MockDataRegistryServiceClient_UpdateMetric_Call {
	_c.Call.Run(func(args mock.Arguments) {
		variadicArgs := make([]grpc.CallOption, len(args)-2)
		for i, a := range args[2:] {
			if a != nil {
				variadicArgs[i] = a.(grpc.CallOption)
			}
		}
		run(args[0].(context.Context), args[1].(*UpdateMetricRequest), variadicArgs...)
	})
	return _c
}

func (_c *MockDataRegistryServiceClient_UpdateMetric_Call) Return(_a0 *RegisterMetricResponse, _a1 error) *MockDataRegistryServiceClient_UpdateMetric_Call {
	_c.Call.Return(_a0, _a1)
	return _c
}

// NewMockDataRegistryServiceClient creates a new instance of MockDataRegistryServiceClient. It also registers the testing.TB interface on the mock and a cleanup function to assert the mocks expectations.
func NewMockDataRegistryServiceClient(t testing.TB) *MockDataRegistryServiceClient {
	mock := &MockDataRegistryServiceClient{}
	mock.Mock.Test(t)

	t.Cleanup(func() { mock.AssertExpectations(t) })

	return mock
}
