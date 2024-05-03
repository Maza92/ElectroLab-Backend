package electro.lab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import electro.lab.models.dto.loginDto;
import electro.lab.services.UserService;

@RestController
public class UserController {

  @Autowired
  UserService service;

  @PostMapping("/api/login")
  public HttpStatus auth(@RequestBody loginDto credentials) {
    
    loginDto verify = service.findUser(credentials);

    if (verify == null) 
      return HttpStatus.NOT_FOUND;
      
    if (verify.getPassword() == null) 
      return HttpStatus.UNAUTHORIZED;
    
    return HttpStatus.OK;
  }
}
