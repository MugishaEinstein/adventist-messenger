package adventist.adventist_messenger.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import adventist.adventist_messenger.Input.UserInput;
import adventist.adventist_messenger.Service.UserServices;

@RequestMapping(value = "/user")
public class UserController {
@Autowired private UserServices userServices;
@PostMapping("/create")
public ResponseEntity<String> createUser(@RequestBody UserInput user){
    return userServices.saveUser(user);
}
}
