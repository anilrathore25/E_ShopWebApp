package com.yash.eshop.repository;

import java.util.List;

import com.yash.eshop.model.ProductOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer> {

	List<ProductOrder> findByUserId(Integer userId);

	ProductOrder findByOrderId(String orderId);

	Page<ProductOrder> findBySellerEmail(String sellerEmail, Pageable pageable);

}
