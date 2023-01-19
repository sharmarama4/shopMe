package com.example.shopMe.repository;

import com.example.shopMe.models.CartItem;
import com.example.shopMe.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<CartItem,Integer> {
    public List<CartItem>findByCustomer(Customer customer);
}
