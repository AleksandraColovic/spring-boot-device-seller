package com.sha.springbootjwtdemo.controller;

import com.sha.springbootjwtdemo.model.Purchase;
import com.sha.springbootjwtdemo.security.UserPrincipal;
import com.sha.springbootjwtdemo.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return ResponseEntity.ok((purchaseService.findPurchaseItemOfUser(userPrincipal.getId())));
    }
}
