package shitta.utils;

import shitta.dto.Response.RegisterUserResponse;
import shitta.dto.request.RegisterUserRequest;
import shitta.data.model.User;

public class Mapper {


    public static User map(RegisterUserRequest request) {
        User newUser = new User();
        newUser.setFirstName(request.getFirstName());
        newUser.setLastName(request.getLastName());
        newUser.setEmail(request.getEmail());
        newUser.setPhoneNumber(request.getPhoneNumber());
        newUser.setAddress(request.getAddress());
        return newUser;
    }

    public static RegisterUserResponse map(User mappedUser) {
        RegisterUserResponse registerUserResponse = new RegisterUserResponse();
        registerUserResponse.setId(mappedUser.getId());
        registerUserResponse.setFirstName(mappedUser.getFirstName());
        registerUserResponse.setLastName(mappedUser.getLastName());
        registerUserResponse.setAddress(mappedUser.getAddress());
        registerUserResponse.setEmail(mappedUser.getEmail());
        registerUserResponse.setPhoneNumber(mappedUser.getPhoneNumber());
        return registerUserResponse;
    }
}
