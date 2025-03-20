package com.example.kafka_demo_consumer2.model;

import lombok.Data;

@Data
public class OrderEvent {
    private int orderId;
    private String status;
    private int qty;
}