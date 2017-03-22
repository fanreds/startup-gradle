package pl.start.your.life.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.start.your.life.domain.User;
import pl.start.your.life.repository.UserRepository;

import javax.annotation.PostConstruct;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void onInit() {
        User testUser = new User();
        testUser.setLogin("admin");
        testUser.setPassword("admin");
        userRepository.save(testUser);
    }

    public User getUser(Long id) {
        return userRepository.findOne(id);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
