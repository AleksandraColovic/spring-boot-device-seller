package com.sha.springbootjwtdemo.controller;

import com.sha.springbootjwtdemo.model.Device;
import com.sha.springbootjwtdemo.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @PostMapping
    public ResponseEntity<?> saveDevice(@RequestBody Device device) {
        return new ResponseEntity<>(deviceService.saveDevice(device), HttpStatus.OK);
    }

    @DeleteMapping("{deviceId}")
    public ResponseEntity<?> deleteDevice(@PathVariable Long deviceId) {
        deviceService.deleteDevice(deviceId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllDevices() {
        return new ResponseEntity<>(deviceService.findAllDevices(), HttpStatus.OK);
    }
}
