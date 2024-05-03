package electro.lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import electro.lab.models.user;

@Repository
public interface UserRepository extends JpaRepository<user, Long> {
  user findByUsername(String username);
}
