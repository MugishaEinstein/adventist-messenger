package adventist.adventist_messenger.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import adventist.adventist_messenger.Input.UserInput;
import adventist.adventist_messenger.Modal.User;
import adventist.adventist_messenger.Modal.Repository.UserRepository;

@Service
public class UserServices {
@Autowired private UserRepository userRepository;
public ResponseEntity<String> saveUser(UserInput userInput) {
    try {
        User user = new User(userInput);
        userRepository.save(user);
        return ResponseEntity.ok("User saved successfully");
    } catch (Exception e) {
        return ResponseEntity.status(500).body("Error saving user: " + e.getMessage());
    }
}
}
