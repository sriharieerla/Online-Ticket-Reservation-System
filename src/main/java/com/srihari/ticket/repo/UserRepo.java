package com.srihari.ticket.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.srihari.ticket.entity.User;
import java.util.Optional;
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
