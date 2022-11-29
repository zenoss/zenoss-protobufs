// Code generated by mockery v2.14.0. DO NOT EDIT.

package credentialsmanagement

import (
	context "context"

	grpc "google.golang.org/grpc"

	mock "github.com/stretchr/testify/mock"
)

// MockCredentialManagementClient is an autogenerated mock type for the CredentialManagementClient type
type MockCredentialManagementClient struct {
	mock.Mock
}

type MockCredentialManagementClient_Expecter struct {
	mock *mock.Mock
}

func (_m *MockCredentialManagementClient) EXPECT() *MockCredentialManagementClient_Expecter {
	return &MockCredentialManagementClient_Expecter{mock: &_m.Mock}
}

// GetCredential provides a mock function with given fields: ctx, in, opts
func (_m *MockCredentialManagementClient) GetCredential(ctx context.Context, in *GetCredentialRequest, opts ...grpc.CallOption) (*GetCredentialResponse, error) {
	_va := make([]interface{}, len(opts))
	for _i := range opts {
		_va[_i] = opts[_i]
	}
	var _ca []interface{}
	_ca = append(_ca, ctx, in)
	_ca = append(_ca, _va...)
	ret := _m.Called(_ca...)

	var r0 *GetCredentialResponse
	if rf, ok := ret.Get(0).(func(context.Context, *GetCredentialRequest, ...grpc.CallOption) *GetCredentialResponse); ok {
		r0 = rf(ctx, in, opts...)
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(*GetCredentialResponse)
		}
	}

	var r1 error
	if rf, ok := ret.Get(1).(func(context.Context, *GetCredentialRequest, ...grpc.CallOption) error); ok {
		r1 = rf(ctx, in, opts...)
	} else {
		r1 = ret.Error(1)
	}

	return r0, r1
}

// MockCredentialManagementClient_GetCredential_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetCredential'
type MockCredentialManagementClient_GetCredential_Call struct {
	*mock.Call
}

// GetCredential is a helper method to define mock.On call
//  - ctx context.Context
//  - in *GetCredentialRequest
//  - opts ...grpc.CallOption
func (_e *MockCredentialManagementClient_Expecter) GetCredential(ctx interface{}, in interface{}, opts ...interface{}) *MockCredentialManagementClient_GetCredential_Call {
	return &MockCredentialManagementClient_GetCredential_Call{Call: _e.mock.On("GetCredential",
		append([]interface{}{ctx, in}, opts...)...)}
}

func (_c *MockCredentialManagementClient_GetCredential_Call) Run(run func(ctx context.Context, in *GetCredentialRequest, opts ...grpc.CallOption)) *MockCredentialManagementClient_GetCredential_Call {
	_c.Call.Run(func(args mock.Arguments) {
		variadicArgs := make([]grpc.CallOption, len(args)-2)
		for i, a := range args[2:] {
			if a != nil {
				variadicArgs[i] = a.(grpc.CallOption)
			}
		}
		run(args[0].(context.Context), args[1].(*GetCredentialRequest), variadicArgs...)
	})
	return _c
}

func (_c *MockCredentialManagementClient_GetCredential_Call) Return(_a0 *GetCredentialResponse, _a1 error) *MockCredentialManagementClient_GetCredential_Call {
	_c.Call.Return(_a0, _a1)
	return _c
}

type mockConstructorTestingTNewMockCredentialManagementClient interface {
	mock.TestingT
	Cleanup(func())
}

// NewMockCredentialManagementClient creates a new instance of MockCredentialManagementClient. It also registers a testing interface on the mock and a cleanup function to assert the mocks expectations.
func NewMockCredentialManagementClient(t mockConstructorTestingTNewMockCredentialManagementClient) *MockCredentialManagementClient {
	mock := &MockCredentialManagementClient{}
	mock.Mock.Test(t)

	t.Cleanup(func() { mock.AssertExpectations(t) })

	return mock
}