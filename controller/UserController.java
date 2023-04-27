package shitta.controller;

import org.springframework.web.bind.annotation.*;
import shitta.services.UserService;
import shitta.services.UserServiceImpl;
import shitta.dto.Response.RegisterUserResponse;
import shitta.dto.request.RegisterUserRequest;
import shitta.data.model.User;

@RestController
public class UserController {
    private final UserService userService = new UserServiceImpl();
    @PostMapping("/user")
    public RegisterUserResponse registerNewUser (@RequestBody RegisterUserRequest user){
        return  userService.registerNewUser(user);
    }
    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable int id){
        return  userService.findUser(id);
    }
}
//MongoDb Compass
//Postman
