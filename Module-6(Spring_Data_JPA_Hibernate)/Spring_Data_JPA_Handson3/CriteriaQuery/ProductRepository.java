package com.cognizant.ormlearn.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.ormlearn.model.Product;
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
