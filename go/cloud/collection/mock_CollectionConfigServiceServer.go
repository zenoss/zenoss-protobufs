// Code generated by mockery v2.12.2. DO NOT EDIT.

package collection

import (
	testing "testing"

	mock "github.com/stretchr/testify/mock"
)

// MockCollectionConfigServiceServer is an autogenerated mock type for the CollectionConfigServiceServer type
type MockCollectionConfigServiceServer struct {
	mock.Mock
}

type MockCollectionConfigServiceServer_Expecter struct {
	mock *mock.Mock
}

func (_m *MockCollectionConfigServiceServer) EXPECT() *MockCollectionConfigServiceServer_Expecter {
	return &MockCollectionConfigServiceServer_Expecter{mock: &_m.Mock}
}

// GetConfigStream provides a mock function with given fields: _a0, _a1
func (_m *MockCollectionConfigServiceServer) GetConfigStream(_a0 *GetConfigStreamRequest, _a1 CollectionConfigService_GetConfigStreamServer) error {
	ret := _m.Called(_a0, _a1)

	var r0 error
	if rf, ok := ret.Get(0).(func(*GetConfigStreamRequest, CollectionConfigService_GetConfigStreamServer) error); ok {
		r0 = rf(_a0, _a1)
	} else {
		r0 = ret.Error(0)
	}

	return r0
}

// MockCollectionConfigServiceServer_GetConfigStream_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetConfigStream'
type MockCollectionConfigServiceServer_GetConfigStream_Call struct {
	*mock.Call
}

// GetConfigStream is a helper method to define mock.On call
//  - _a0 *GetConfigStreamRequest
//  - _a1 CollectionConfigService_GetConfigStreamServer
func (_e *MockCollectionConfigServiceServer_Expecter) GetConfigStream(_a0 interface{}, _a1 interface{}) *MockCollectionConfigServiceServer_GetConfigStream_Call {
	return &MockCollectionConfigServiceServer_GetConfigStream_Call{Call: _e.mock.On("GetConfigStream", _a0, _a1)}
}

func (_c *MockCollectionConfigServiceServer_GetConfigStream_Call) Run(run func(_a0 *GetConfigStreamRequest, _a1 CollectionConfigService_GetConfigStreamServer)) *MockCollectionConfigServiceServer_GetConfigStream_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run(args[0].(*GetConfigStreamRequest), args[1].(CollectionConfigService_GetConfigStreamServer))
	})
	return _c
}

func (_c *MockCollectionConfigServiceServer_GetConfigStream_Call) Return(_a0 error) *MockCollectionConfigServiceServer_GetConfigStream_Call {
	_c.Call.Return(_a0)
	return _c
}

// WaitForProbeConfig provides a mock function with given fields: _a0
func (_m *MockCollectionConfigServiceServer) WaitForProbeConfig(_a0 CollectionConfigService_WaitForProbeConfigServer) error {
	ret := _m.Called(_a0)

	var r0 error
	if rf, ok := ret.Get(0).(func(CollectionConfigService_WaitForProbeConfigServer) error); ok {
		r0 = rf(_a0)
	} else {
		r0 = ret.Error(0)
	}

	return r0
}

// MockCollectionConfigServiceServer_WaitForProbeConfig_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'WaitForProbeConfig'
type MockCollectionConfigServiceServer_WaitForProbeConfig_Call struct {
	*mock.Call
}

// WaitForProbeConfig is a helper method to define mock.On call
//  - _a0 CollectionConfigService_WaitForProbeConfigServer
func (_e *MockCollectionConfigServiceServer_Expecter) WaitForProbeConfig(_a0 interface{}) *MockCollectionConfigServiceServer_WaitForProbeConfig_Call {
	return &MockCollectionConfigServiceServer_WaitForProbeConfig_Call{Call: _e.mock.On("WaitForProbeConfig", _a0)}
}

func (_c *MockCollectionConfigServiceServer_WaitForProbeConfig_Call) Run(run func(_a0 CollectionConfigService_WaitForProbeConfigServer)) *MockCollectionConfigServiceServer_WaitForProbeConfig_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run(args[0].(CollectionConfigService_WaitForProbeConfigServer))
	})
	return _c
}

func (_c *MockCollectionConfigServiceServer_WaitForProbeConfig_Call) Return(_a0 error) *MockCollectionConfigServiceServer_WaitForProbeConfig_Call {
	_c.Call.Return(_a0)
	return _c
}

// NewMockCollectionConfigServiceServer creates a new instance of MockCollectionConfigServiceServer. It also registers the testing.TB interface on the mock and a cleanup function to assert the mocks expectations.
func NewMockCollectionConfigServiceServer(t testing.TB) *MockCollectionConfigServiceServer {
	mock := &MockCollectionConfigServiceServer{}
	mock.Mock.Test(t)

	t.Cleanup(func() { mock.AssertExpectations(t) })

	return mock
}
