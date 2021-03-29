package ada.edu.project.Library.repositiries;

import ada.edu.project.Library.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);
}
