package com.fetch.receipt;

import com.fetch.model.Receipt;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class ReceiptService {

    private final Map<String, Integer> receiptPoints = new HashMap<>();

    public String processReceipt(Receipt receipt) {
        int points = calculatePoints(receipt);
        String id = UUID.randomUUID().toString();
        receiptPoints.put(id, points);
        return id;
    }

    public int getPoints(String id) {
        return receiptPoints.getOrDefault(id, 0);
    }

    private int calculatePoints(Receipt receipt) {
        // Sample logic: count alphanumeric characters in retailer name
        return receipt.getRetailer().replaceAll("[^a-zA-Z0-9]", "").length();
    }
}
