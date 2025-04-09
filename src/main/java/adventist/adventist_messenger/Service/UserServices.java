package adventist.adventist_messenger.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
        return ResponseEntity.ok(user.getFirstName()+" "+user.getMiddleName()+" "+user.getLastName());
    } catch (Exception e) {
        if(e instanceof DataIntegrityViolationException){
            return ResponseEntity.status(400).body("User with this email already exists");
        }
        return ResponseEntity.status(500).body("Error saving user: " + e.getMessage());
    }
}
}
