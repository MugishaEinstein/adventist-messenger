package adventist.adventist_messenger.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import adventist.adventist_messenger.Input.UserInput;
import adventist.adventist_messenger.Service.UserServices;
@RestController
@RequestMapping("/api")
public class UserController {
@Autowired private UserServices userServices;
@PostMapping("/user/create")
public ResponseEntity<String> createUser(@RequestBody UserInput user){
    return userServices.saveUser(user);
}
@PostMapping("/upload")
public ResponseEntity<String> upload(@RequestParam MultipartFile file){
    return ResponseEntity.ok("File uploaded successfully");
}
@GetMapping()
public ResponseEntity<String> getIndexPage(){
    return ResponseEntity.ok("Hello");
}
}
