package electro.lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import electro.lab.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
  
}
