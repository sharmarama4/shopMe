package com.example.shopMe.services;

import com.example.shopMe.models.CartItem;
import com.example.shopMe.models.Customer;
import com.example.shopMe.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {
    @Autowired
    private CartRepository cartRepository;
    public List<CartItem>cartItemList(Customer customer){
        return cartRepository.findByCustomer(customer);
    }
}
