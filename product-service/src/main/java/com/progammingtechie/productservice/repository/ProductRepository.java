/**
 * 
 */
package com.progammingtechie.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.progammingtechie.productservice.model.Product;

/**
 * 
 */
public interface ProductRepository extends MongoRepository<Product, String>{

}
