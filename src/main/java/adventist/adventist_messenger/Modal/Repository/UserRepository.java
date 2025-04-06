package adventist.adventist_messenger.Modal.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import adventist.adventist_messenger.Modal.User;
@Repository
public interface UserRepository extends JpaRepository<User,UUID>{

}
