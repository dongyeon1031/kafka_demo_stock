package com.example.kafka_demo_stock.service;

import com.example.kafka_demo_order.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StockConsumer {
    int stock = 10;
    @KafkaListener(topics = "order.events", groupId = "stock-service")
    public void consume(OrderEvent event) {
        System.out.println("[Stock Service] Received order event: " + event.getOrderId());
        System.out.println("Reducing stock for the order...");
        stock -= event.getQty();
        System.out.println("Current Stock : "+stock);
    }
}