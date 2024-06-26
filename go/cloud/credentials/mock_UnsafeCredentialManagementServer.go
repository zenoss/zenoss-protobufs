// Code generated by mockery v2.42.0. DO NOT EDIT.

package credentials

import mock "github.com/stretchr/testify/mock"

// MockUnsafeCredentialManagementServer is an autogenerated mock type for the UnsafeCredentialManagementServer type
type MockUnsafeCredentialManagementServer struct {
	mock.Mock
}

type MockUnsafeCredentialManagementServer_Expecter struct {
	mock *mock.Mock
}

func (_m *MockUnsafeCredentialManagementServer) EXPECT() *MockUnsafeCredentialManagementServer_Expecter {
	return &MockUnsafeCredentialManagementServer_Expecter{mock: &_m.Mock}
}

// mustEmbedUnimplementedCredentialManagementServer provides a mock function with given fields:
func (_m *MockUnsafeCredentialManagementServer) mustEmbedUnimplementedCredentialManagementServer() {
	_m.Called()
}

// MockUnsafeCredentialManagementServer_mustEmbedUnimplementedCredentialManagementServer_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'mustEmbedUnimplementedCredentialManagementServer'
type MockUnsafeCredentialManagementServer_mustEmbedUnimplementedCredentialManagementServer_Call struct {
	*mock.Call
}

// mustEmbedUnimplementedCredentialManagementServer is a helper method to define mock.On call
func (_e *MockUnsafeCredentialManagementServer_Expecter) mustEmbedUnimplementedCredentialManagementServer() *MockUnsafeCredentialManagementServer_mustEmbedUnimplementedCredentialManagementServer_Call {
	return &MockUnsafeCredentialManagementServer_mustEmbedUnimplementedCredentialManagementServer_Call{Call: _e.mock.On("mustEmbedUnimplementedCredentialManagementServer")}
}

func (_c *MockUnsafeCredentialManagementServer_mustEmbedUnimplementedCredentialManagementServer_Call) Run(run func()) *MockUnsafeCredentialManagementServer_mustEmbedUnimplementedCredentialManagementServer_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockUnsafeCredentialManagementServer_mustEmbedUnimplementedCredentialManagementServer_Call) Return() *MockUnsafeCredentialManagementServer_mustEmbedUnimplementedCredentialManagementServer_Call {
	_c.Call.Return()
	return _c
}

func (_c *MockUnsafeCredentialManagementServer_mustEmbedUnimplementedCredentialManagementServer_Call) RunAndReturn(run func()) *MockUnsafeCredentialManagementServer_mustEmbedUnimplementedCredentialManagementServer_Call {
	_c.Call.Return(run)
	return _c
}

// NewMockUnsafeCredentialManagementServer creates a new instance of MockUnsafeCredentialManagementServer. It also registers a testing interface on the mock and a cleanup function to assert the mocks expectations.
// The first argument is typically a *testing.T value.
func NewMockUnsafeCredentialManagementServer(t interface {
	mock.TestingT
	Cleanup(func())
}) *MockUnsafeCredentialManagementServer {
	mock := &MockUnsafeCredentialManagementServer{}
	mock.Mock.Test(t)

	t.Cleanup(func() { mock.AssertExpectations(t) })

	return mock
}
