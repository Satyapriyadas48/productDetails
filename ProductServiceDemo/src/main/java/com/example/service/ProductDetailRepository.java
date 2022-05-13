package com.example.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.ProductDetails;

@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetails, String>{
	static Optional<ProductDetails> findByUsername(String username) {
		ProductDetails result=new ProductDetails();
		
		return Optional.ofNullable(result);
	}
}
