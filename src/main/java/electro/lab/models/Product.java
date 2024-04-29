package electro.lab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_product", nullable = false)
  private Long id;

  @Column(name = "name_product", nullable = false, length = 100)
  private String name;

  @Column(nullable = false)
  private int stock;

  @ManyToOne
  @JoinColumn(name = "id_supplier")
  private Supplier supplier;
}
