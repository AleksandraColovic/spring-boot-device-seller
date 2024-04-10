package com.sha.springbootjwtdemo.repository;

import com.sha.springbootjwtdemo.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
