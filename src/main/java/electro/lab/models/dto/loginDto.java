package electro.lab.models.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class loginDto {
  private String username;
  private String password;

  public loginDto(String username, String password) {
    this.password = password;
    this.username = username;
  }
}
