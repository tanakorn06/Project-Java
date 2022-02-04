package nvc.it.projectjava.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.projectjava.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
    public List<Product> findByNameContaining(String name);
}
