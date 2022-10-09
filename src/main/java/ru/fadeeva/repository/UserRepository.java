package ru.fadeeva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.fadeeva.model.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, String> {

    User findByUsername(String username);
}