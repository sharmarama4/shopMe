package com.example.shopMe;

import com.example.shopMe.models.CartItem;
import com.example.shopMe.models.Customer;
import com.example.shopMe.models.Product;
import com.example.shopMe.repository.CartRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class ShopMeApplicationTests {

	@Autowired
	private CartRepository cartRepository;
	@Autowired
	private TestEntityManager entityManager;

	@Test
	public void testAddOneCartItem() {
		Product product = entityManager.find(Product.class, 4);
		Customer customer = entityManager.find(Customer.class, 3);
		CartItem cartItem = new CartItem();
		cartItem.setCustomer(customer);
		cartItem.setProduct(product);
		cartItem.setQuantity(5);
		CartItem saveCartItem = cartRepository.save(cartItem);
		assertTrue(saveCartItem.getId() > 0);
	}

	@Test
	public void testGetCartItemsByCustomer() {
		Customer customer = new Customer();
		customer.setId(3);
 List<CartItem> cartItems=cartRepository.findByCustomer(customer);
 assertEquals(2,cartItems.size());
	}
}
