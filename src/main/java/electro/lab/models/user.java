package electro.lab.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
public class user {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id", nullable = false)
  private Long id;
  
  @Column(name = "[name]", nullable = false, length = 100)
  private String name;

  @Column(name = "lastname", nullable = false, length = 100)
  private String lastname;

  @Column(name = "register_date", nullable = false)
  private Date registerDate;

  private int phone;

  private String address;

  @Column(nullable = false, length = 50)
  private String username;
  
  @Column(name = "[password]", nullable = false, length = 50)
  private String password;
}
