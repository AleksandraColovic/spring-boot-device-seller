package com.sha.springbootjwtdemo.service;

import com.sha.springbootjwtdemo.model.Device;

import java.util.List;

public interface DeviceService {

    Device saveDevice(Device device);
    void deleteDevice(Long id);
    List<Device> findAllDevices();
}
