package pl.start.your.life.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.start.your.life.domain.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
