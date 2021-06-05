package lu.arnaud.moody.Repository;

import lu.arnaud.moody.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
