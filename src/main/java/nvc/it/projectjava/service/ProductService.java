package nvc.it.projectjava.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.it.projectjava.model.Product;
import nvc.it.projectjava.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }
        

    public Optional<Product> findById(String id){
        return productRepository.findById(id);
    }
    public List<Product> findByProductName(String name){
        return productRepository.findByNameContaining(name);
    }
}
