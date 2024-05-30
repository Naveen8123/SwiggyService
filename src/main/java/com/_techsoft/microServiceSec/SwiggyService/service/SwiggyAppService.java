package com._techsoft.microServiceSec.SwiggyService.service;

import com._techsoft.microServiceSec.SwiggyService.client.RestrauntServiceClient;

import com._techsoft.microServiceSec.SwiggyService.dto.OrderResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SwiggyAppService {

    @Autowired
    private RestrauntServiceClient restaurantServiceClient;

    public String greeting() {
        return "Welcome to Swiggy App Service";
    }

    public OrderResponseDto checkOrderStatus(String orderId) {
        return restaurantServiceClient.fetchOrderStatus(orderId);
    }
}
