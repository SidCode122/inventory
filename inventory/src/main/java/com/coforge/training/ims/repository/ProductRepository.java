package com.coforge.training.ims.repository;

import java.util.List;

import com.coforge.training.ims.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

	/*
     * This interface has save(),findAll(),findById(),deleteById(),count()
    etc.. inbuilt methods of jpa repository for various database operations.
    This interface will be implemented by class automatically
*/
	
	// Custom finder method.The implementation is plugged in by spring data JPA automatically
	List<Product> findByMadeIn(String country);
}
