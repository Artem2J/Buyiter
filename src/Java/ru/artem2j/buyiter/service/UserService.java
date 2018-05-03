package ru.artem2j.buyiter.service;


import ru.artem2j.buyiter.model.User;

/**
 * Service class for {@link ru.artem2j.buyiter.model.User}
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
