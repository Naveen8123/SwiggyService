package com._techsoft.microServiceSec.SwiggyService.client;

import com._techsoft.microServiceSec.SwiggyService.dto.OrderResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestrauntServiceClient {
    @Autowired
    private RestTemplate template;

    public OrderResponseDto fetchOrderStatus(String orderId) {
        return template.getForObject("http://RESTAURANT-SERVICE/restaurant/orders/status/" + orderId, OrderResponseDto.class);
    }
}

