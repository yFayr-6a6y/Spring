package com.example.cart_service.controller; // Убедитесь, что пакет правильный

import com.example.cart_service.service.CartServiceImpl; // Убедитесь, что путь к сервису правильный
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // ВАЖНО: @RestController, а не @Controller
public class CartController {

    private final CartServiceImpl cartService;

    @Autowired
    public CartController(CartServiceImpl cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/order/add") // ВАЖНО: НЕ /store/order/add, т.к. /store уже в application.properties
    public void addItems(@RequestParam List<Integer> itemIds) { // ВАЖНО: @RequestParam List<Integer>
        cartService.addItems(itemIds);
        // Возвращаем 200 OK по умолчанию
    }

    @GetMapping("/order/get") // ВАЖНО: НЕ /store/order/get
    public List<Integer> getCartItems() {
        return cartService.getItems();
    }
}
