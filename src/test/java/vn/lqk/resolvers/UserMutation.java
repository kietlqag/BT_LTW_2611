package vn.lqk.resolvers;

import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import vn.lqk.entities.User;
import vn.lqk.repositories.UserRepository;

@Controller
public class UserMutation {

    private final UserRepository userRepository;

    public UserMutation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @MutationMapping
    public User createUser(String fullname, String email, String password, String phone) {
        User user = new User();
        user.setFullname(fullname);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhone(phone);
        return userRepository.save(user);
    }

    @MutationMapping
    public User updateUser(Long id, String fullname, String email, String password, String phone) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        if (fullname != null) user.setFullname(fullname);
        if (email != null) user.setEmail(email);
        if (password != null) user.setPassword(password);
        if (phone != null) user.setPhone(phone);
        return userRepository.save(user);
    }

    @MutationMapping
    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "User deleted successfully!";
    }
}

