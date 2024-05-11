package electro.lab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import electro.lab.models.Supplier;
import electro.lab.services.SupplierService;

@RestController
public class SupplierController {
  
  @Autowired
  SupplierService service;

  @GetMapping("/entities/supplier/")
  public List<Supplier> getSuppliers() {
    return service.getAllSuppliers();
  }

  @GetMapping("/entities/supplier/{id}")
  public Supplier SearchSupplier(@PathVariable Long id) {
    return service.findSupplier(id);
  }
}
