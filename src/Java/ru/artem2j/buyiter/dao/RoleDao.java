package ru.artem2j.buyiter.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.artem2j.buyiter.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
