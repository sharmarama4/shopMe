package com.example.shopMe.controller;

import com.example.shopMe.models.CartItem;
import com.example.shopMe.models.Customer;
import com.example.shopMe.services.CustomerService;
import com.example.shopMe.services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;
    @Autowired
    private CustomerService customerService;
    @GetMapping("/cart")
    public String showShoppingCart(Model model){
        Customer customer=new Customer();
        List<CartItem>cartItems=shoppingCartService.cartItemList(customer);
        model.addAttribute("cartItems",cartItems);
        model.addAttribute("page Title","Shopping Cart");
       return"shopping_cart" ;
    }
}
