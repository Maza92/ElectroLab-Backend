package electro.lab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_employee", nullable = false)
  private Long id;

  @Column(name = "[name]", nullable = false, length = 50)
  private String name;
  
  @Column(name = "lastname", nullable = false, length = 50)
  private String lastName;

  @Column(nullable = false)
  private double salary;
}
