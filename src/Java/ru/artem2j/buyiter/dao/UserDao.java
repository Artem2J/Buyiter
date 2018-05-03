package ru.artem2j.buyiter.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.artem2j.buyiter.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
