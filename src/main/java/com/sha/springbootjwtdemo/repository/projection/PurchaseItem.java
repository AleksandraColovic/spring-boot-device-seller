package com.sha.springbootjwtdemo.repository.projection;

import com.sha.springbootjwtdemo.model.DeviceType;

import java.time.LocalDateTime;

public interface PurchaseItem {
    String getName();
    DeviceType getType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();
}

