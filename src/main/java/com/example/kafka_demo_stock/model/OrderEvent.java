package com.example.kafka_demo_stock.model;

import lombok.Data;

@Data
public class OrderEvent {
    private int orderId;
    private String status;
    private int qty;
}