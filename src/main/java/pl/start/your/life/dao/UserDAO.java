package pl.start.your.life.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.start.your.life.domain.User;

import javax.persistence.EntityManager;

@Repository
public class UserDAO {
    @Autowired
    private EntityManager entityManager;

    public User getUser(Long id) {
        return entityManager.find(User.class, id);
    }

    public void saveUser(User user) {
        entityManager.persist(user);
    }
}
