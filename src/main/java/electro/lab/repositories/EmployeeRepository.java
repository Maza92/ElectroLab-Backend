package electro.lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import electro.lab.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  Employee findByUsername(String username);
}
