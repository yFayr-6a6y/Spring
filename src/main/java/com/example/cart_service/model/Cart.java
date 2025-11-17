package com.example.cart_service.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Integer itemId) {
        if (itemId != null) { // Убедимся, что ID не null перед добавлением
            this.items.add(itemId);
        }
    }

    public List<Integer> getItems() {
        return new ArrayList<>(this.items); // Возвращаем копию для безопасности
    }
}