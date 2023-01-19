package com.example.shopMe.models;

import javax.persistence.*;

@Entity
@Table(name="cart_Items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
@ManyToOne
@JoinColumn(name="product_id")
    private com.example.shopMe.models.Product Product;
@ManyToOne
@JoinColumn(name="customer_id")
private Customer customer;
private int quantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public com.example.shopMe.models.Product getProduct() {
        return Product;
    }

    public void setProduct(com.example.shopMe.models.Product product) {
        Product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
