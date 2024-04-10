package com.sha.springbootjwtdemo.service;

import com.sha.springbootjwtdemo.model.Purchase;
import com.sha.springbootjwtdemo.repository.PurchaseRepository;
import com.sha.springbootjwtdemo.repository.projection.PurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    public PurchaseRepository purchaseRepository;

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());

        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemOfUser(Long userId) {
        return purchaseRepository.findAllPurchasesOfUserId(userId);
    }
}
