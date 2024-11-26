package vn.lqk.resolvers;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import vn.lqk.entities.User;
import vn.lqk.repositories.UserRepository;

@Controller
public class UserResolver {

    private final UserRepository userRepository;

    public UserResolver(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @QueryMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

