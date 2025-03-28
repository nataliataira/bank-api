package dio.me.bank_api.domain.repository;

import dio.me.bank_api.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
