package com.sha.springbootjwtdemo.service;

import com.sha.springbootjwtdemo.model.Purchase;
import com.sha.springbootjwtdemo.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {

    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemOfUser(Long userId);
}
