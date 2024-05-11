package electro.lab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import electro.lab.models.Product;
import electro.lab.services.ProductService;

@RestController
public class ProductController {

  @Autowired
  ProductService service;

  @GetMapping("/managament/product/")
  public List<Product> allProducts() {
    return service.getAllProducts();
  }

  @PostMapping("/managament/product/")
  public void saveProduct(@RequestBody Product product) {
    service.saveProduct(product);
  }

  @DeleteMapping("/managament/product/{id}")
  public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
    try {
      service.removeProduct(id);
      return new ResponseEntity<>("eliminado", HttpStatus.OK);
    } catch (Exception e) {
        return new ResponseEntity<>("error", HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
