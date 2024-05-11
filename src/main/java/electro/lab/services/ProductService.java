package electro.lab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import electro.lab.models.Product;
import electro.lab.repositories.ProductRepository;

@Service
public class ProductService {
  
  @Autowired
  ProductRepository repository;

  public List<Product> getAllProducts() {
    return repository.findAll();
  }

  public void saveProduct(Product product) {
    repository.save(product);
  }

  public void removeProduct(Long id) {
    repository.deleteById(id);
  }
}
