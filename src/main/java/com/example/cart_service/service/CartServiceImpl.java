package com.example.cart_service.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import com.example.cart_service.model.Cart;

import java.util.List;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CartServiceImpl {

    private final Cart cart;

    public CartServiceImpl() {
        this.cart = new Cart();
    }

    public void addItems(List<Integer> itemIds) {
        for (Integer id : itemIds) {
            if (id != null) {
                cart.addItem(id);
            }
        }
    }

    public List<Integer> getItems() {
        return cart.getItems();
    }
}

    public List<Integer> getItems() {
        return cart.getItems();
    }
}