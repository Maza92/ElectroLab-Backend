package electro.lab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import electro.lab.models.Supplier;
import electro.lab.repositories.SupplierRepository;

@Service
public class SupplierService {
  
  @Autowired
  SupplierRepository repository;

  public List<Supplier> getAllSuppliers() {
    return repository.findAll();
  }

  public Supplier findSupplier(Long id) {
    return repository.getReferenceById(id);
  }

}
