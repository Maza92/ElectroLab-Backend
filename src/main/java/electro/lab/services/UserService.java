package electro.lab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import electro.lab.models.user;
import electro.lab.models.dto.loginDto;
import electro.lab.repositories.UserRepository;

@Service
public class UserService {

  @Autowired
  UserRepository repository;

  public loginDto findUser(loginDto credentials) {
    user user = repository.findByUsername(credentials.getUsername());
    if (user == null) 
      return null;

    if (!user.getPassword().equals(credentials.getPassword())) 
      return new loginDto(credentials.getUsername(), null);

    return credentials;
  }
  
}
