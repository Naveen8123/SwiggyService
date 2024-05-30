package com._techsoft.microServiceSec.SwiggyService.controller;


import com._techsoft.microServiceSec.SwiggyService.dto.OrderResponseDto;
import com._techsoft.microServiceSec.SwiggyService.service.SwiggyAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swiggy")
public class SwiggyAppController {

    @Autowired
    private SwiggyAppService service;

    @GetMapping("/home")
    public String greetingMessage() {
        return service.greeting();
    }

    @GetMapping("/{orderId}")
    public OrderResponseDto checkOrderStatus(@PathVariable String orderId) {
        return service.checkOrderStatus(orderId);
    }
}


