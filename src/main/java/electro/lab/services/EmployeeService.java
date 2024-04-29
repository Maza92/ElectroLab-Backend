package electro.lab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import electro.lab.models.Employee;
import electro.lab.models.dto.loginDto;
import electro.lab.repositories.EmployeeRepository;

@Service
public class EmployeeService {

  @Autowired
  EmployeeRepository repository;

  public loginDto findUser(loginDto credentials) {
    Employee employee = repository.findByUsername(credentials.getUsername());
    if (employee == null) 
      return null;

    if (!employee.getPassword().equals(credentials.getPassword())) 
      return new loginDto(credentials.getUsername(), null);

    return credentials;
  }
  
}
