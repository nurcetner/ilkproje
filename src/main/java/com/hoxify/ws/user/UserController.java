package com.hoxify.ws.user;


import com.hoxify.ws.shared.GenericMessage;
import org.aspectj.bridge.IMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/api/v1/users")
    GenericMessage createUser(@RequestBody User user){
       userService.save(user);
        return new GenericMessage("message: User is created");
    }
}
