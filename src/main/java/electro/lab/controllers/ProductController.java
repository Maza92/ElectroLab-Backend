package electro.lab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
  
}
