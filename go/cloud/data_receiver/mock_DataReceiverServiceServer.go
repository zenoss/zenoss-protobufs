// Code generated by mockery v2.14.0. DO NOT EDIT.

package data_receiver

import (
	context "context"

	mock "github.com/stretchr/testify/mock"
)

// MockDataReceiverServiceServer is an autogenerated mock type for the DataReceiverServiceServer type
type MockDataReceiverServiceServer struct {
	mock.Mock
}

type MockDataReceiverServiceServer_Expecter struct {
	mock *mock.Mock
}

func (_m *MockDataReceiverServiceServer) EXPECT() *MockDataReceiverServiceServer_Expecter {
	return &MockDataReceiverServiceServer_Expecter{mock: &_m.Mock}
}

// PutEvent provides a mock function with given fields: _a0
func (_m *MockDataReceiverServiceServer) PutEvent(_a0 DataReceiverService_PutEventServer) error {
	ret := _m.Called(_a0)

	var r0 error
	if rf, ok := ret.Get(0).(func(DataReceiverService_PutEventServer) error); ok {
		r0 = rf(_a0)
	} else {
		r0 = ret.Error(0)
	}

	return r0
}

// MockDataReceiverServiceServer_PutEvent_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'PutEvent'
type MockDataReceiverServiceServer_PutEvent_Call struct {
	*mock.Call
}

// PutEvent is a helper method to define mock.On call
//  - _a0 DataReceiverService_PutEventServer
func (_e *MockDataReceiverServiceServer_Expecter) PutEvent(_a0 interface{}) *MockDataReceiverServiceServer_PutEvent_Call {
	return &MockDataReceiverServiceServer_PutEvent_Call{Call: _e.mock.On("PutEvent", _a0)}
}

func (_c *MockDataReceiverServiceServer_PutEvent_Call) Run(run func(_a0 DataReceiverService_PutEventServer)) *MockDataReceiverServiceServer_PutEvent_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run(args[0].(DataReceiverService_PutEventServer))
	})
	return _c
}

func (_c *MockDataReceiverServiceServer_PutEvent_Call) Return(_a0 error) *MockDataReceiverServiceServer_PutEvent_Call {
	_c.Call.Return(_a0)
	return _c
}

// PutEvents provides a mock function with given fields: _a0, _a1
func (_m *MockDataReceiverServiceServer) PutEvents(_a0 context.Context, _a1 *Events) (*EventStatusResult, error) {
	ret := _m.Called(_a0, _a1)

	var r0 *EventStatusResult
	if rf, ok := ret.Get(0).(func(context.Context, *Events) *EventStatusResult); ok {
		r0 = rf(_a0, _a1)
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(*EventStatusResult)
		}
	}

	var r1 error
	if rf, ok := ret.Get(1).(func(context.Context, *Events) error); ok {
		r1 = rf(_a0, _a1)
	} else {
		r1 = ret.Error(1)
	}

	return r0, r1
}

// MockDataReceiverServiceServer_PutEvents_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'PutEvents'
type MockDataReceiverServiceServer_PutEvents_Call struct {
	*mock.Call
}

// PutEvents is a helper method to define mock.On call
//  - _a0 context.Context
//  - _a1 *Events
func (_e *MockDataReceiverServiceServer_Expecter) PutEvents(_a0 interface{}, _a1 interface{}) *MockDataReceiverServiceServer_PutEvents_Call {
	return &MockDataReceiverServiceServer_PutEvents_Call{Call: _e.mock.On("PutEvents", _a0, _a1)}
}

func (_c *MockDataReceiverServiceServer_PutEvents_Call) Run(run func(_a0 context.Context, _a1 *Events)) *MockDataReceiverServiceServer_PutEvents_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run(args[0].(context.Context), args[1].(*Events))
	})
	return _c
}

func (_c *MockDataReceiverServiceServer_PutEvents_Call) Return(_a0 *EventStatusResult, _a1 error) *MockDataReceiverServiceServer_PutEvents_Call {
	_c.Call.Return(_a0, _a1)
	return _c
}

// PutMetric provides a mock function with given fields: _a0
func (_m *MockDataReceiverServiceServer) PutMetric(_a0 DataReceiverService_PutMetricServer) error {
	ret := _m.Called(_a0)

	var r0 error
	if rf, ok := ret.Get(0).(func(DataReceiverService_PutMetricServer) error); ok {
		r0 = rf(_a0)
	} else {
		r0 = ret.Error(0)
	}

	return r0
}

// MockDataReceiverServiceServer_PutMetric_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'PutMetric'
type MockDataReceiverServiceServer_PutMetric_Call struct {
	*mock.Call
}

// PutMetric is a helper method to define mock.On call
//  - _a0 DataReceiverService_PutMetricServer
func (_e *MockDataReceiverServiceServer_Expecter) PutMetric(_a0 interface{}) *MockDataReceiverServiceServer_PutMetric_Call {
	return &MockDataReceiverServiceServer_PutMetric_Call{Call: _e.mock.On("PutMetric", _a0)}
}

func (_c *MockDataReceiverServiceServer_PutMetric_Call) Run(run func(_a0 DataReceiverService_PutMetricServer)) *MockDataReceiverServiceServer_PutMetric_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run(args[0].(DataReceiverService_PutMetricServer))
	})
	return _c
}

func (_c *MockDataReceiverServiceServer_PutMetric_Call) Return(_a0 error) *MockDataReceiverServiceServer_PutMetric_Call {
	_c.Call.Return(_a0)
	return _c
}

// PutMetrics provides a mock function with given fields: _a0, _a1
func (_m *MockDataReceiverServiceServer) PutMetrics(_a0 context.Context, _a1 *Metrics) (*StatusResult, error) {
	ret := _m.Called(_a0, _a1)

	var r0 *StatusResult
	if rf, ok := ret.Get(0).(func(context.Context, *Metrics) *StatusResult); ok {
		r0 = rf(_a0, _a1)
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(*StatusResult)
		}
	}

	var r1 error
	if rf, ok := ret.Get(1).(func(context.Context, *Metrics) error); ok {
		r1 = rf(_a0, _a1)
	} else {
		r1 = ret.Error(1)
	}

	return r0, r1
}

// MockDataReceiverServiceServer_PutMetrics_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'PutMetrics'
type MockDataReceiverServiceServer_PutMetrics_Call struct {
	*mock.Call
}

// PutMetrics is a helper method to define mock.On call
//  - _a0 context.Context
//  - _a1 *Metrics
func (_e *MockDataReceiverServiceServer_Expecter) PutMetrics(_a0 interface{}, _a1 interface{}) *MockDataReceiverServiceServer_PutMetrics_Call {
	return &MockDataReceiverServiceServer_PutMetrics_Call{Call: _e.mock.On("PutMetrics", _a0, _a1)}
}

func (_c *MockDataReceiverServiceServer_PutMetrics_Call) Run(run func(_a0 context.Context, _a1 *Metrics)) *MockDataReceiverServiceServer_PutMetrics_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run(args[0].(context.Context), args[1].(*Metrics))
	})
	return _c
}

func (_c *MockDataReceiverServiceServer_PutMetrics_Call) Return(_a0 *StatusResult, _a1 error) *MockDataReceiverServiceServer_PutMetrics_Call {
	_c.Call.Return(_a0, _a1)
	return _c
}

// PutModels provides a mock function with given fields: _a0, _a1
func (_m *MockDataReceiverServiceServer) PutModels(_a0 context.Context, _a1 *Models) (*ModelStatusResult, error) {
	ret := _m.Called(_a0, _a1)

	var r0 *ModelStatusResult
	if rf, ok := ret.Get(0).(func(context.Context, *Models) *ModelStatusResult); ok {
		r0 = rf(_a0, _a1)
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(*ModelStatusResult)
		}
	}

	var r1 error
	if rf, ok := ret.Get(1).(func(context.Context, *Models) error); ok {
		r1 = rf(_a0, _a1)
	} else {
		r1 = ret.Error(1)
	}

	return r0, r1
}

// MockDataReceiverServiceServer_PutModels_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'PutModels'
type MockDataReceiverServiceServer_PutModels_Call struct {
	*mock.Call
}

// PutModels is a helper method to define mock.On call
//  - _a0 context.Context
//  - _a1 *Models
func (_e *MockDataReceiverServiceServer_Expecter) PutModels(_a0 interface{}, _a1 interface{}) *MockDataReceiverServiceServer_PutModels_Call {
	return &MockDataReceiverServiceServer_PutModels_Call{Call: _e.mock.On("PutModels", _a0, _a1)}
}

func (_c *MockDataReceiverServiceServer_PutModels_Call) Run(run func(_a0 context.Context, _a1 *Models)) *MockDataReceiverServiceServer_PutModels_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run(args[0].(context.Context), args[1].(*Models))
	})
	return _c
}

func (_c *MockDataReceiverServiceServer_PutModels_Call) Return(_a0 *ModelStatusResult, _a1 error) *MockDataReceiverServiceServer_PutModels_Call {
	_c.Call.Return(_a0, _a1)
	return _c
}

// mustEmbedUnimplementedDataReceiverServiceServer provides a mock function with given fields:
func (_m *MockDataReceiverServiceServer) mustEmbedUnimplementedDataReceiverServiceServer() {
	_m.Called()
}

// MockDataReceiverServiceServer_mustEmbedUnimplementedDataReceiverServiceServer_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'mustEmbedUnimplementedDataReceiverServiceServer'
type MockDataReceiverServiceServer_mustEmbedUnimplementedDataReceiverServiceServer_Call struct {
	*mock.Call
}

// mustEmbedUnimplementedDataReceiverServiceServer is a helper method to define mock.On call
func (_e *MockDataReceiverServiceServer_Expecter) mustEmbedUnimplementedDataReceiverServiceServer() *MockDataReceiverServiceServer_mustEmbedUnimplementedDataReceiverServiceServer_Call {
	return &MockDataReceiverServiceServer_mustEmbedUnimplementedDataReceiverServiceServer_Call{Call: _e.mock.On("mustEmbedUnimplementedDataReceiverServiceServer")}
}

func (_c *MockDataReceiverServiceServer_mustEmbedUnimplementedDataReceiverServiceServer_Call) Run(run func()) *MockDataReceiverServiceServer_mustEmbedUnimplementedDataReceiverServiceServer_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockDataReceiverServiceServer_mustEmbedUnimplementedDataReceiverServiceServer_Call) Return() *MockDataReceiverServiceServer_mustEmbedUnimplementedDataReceiverServiceServer_Call {
	_c.Call.Return()
	return _c
}

type mockConstructorTestingTNewMockDataReceiverServiceServer interface {
	mock.TestingT
	Cleanup(func())
}

// NewMockDataReceiverServiceServer creates a new instance of MockDataReceiverServiceServer. It also registers a testing interface on the mock and a cleanup function to assert the mocks expectations.
func NewMockDataReceiverServiceServer(t mockConstructorTestingTNewMockDataReceiverServiceServer) *MockDataReceiverServiceServer {
	mock := &MockDataReceiverServiceServer{}
	mock.Mock.Test(t)

	t.Cleanup(func() { mock.AssertExpectations(t) })

	return mock
}
