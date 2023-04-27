package shitta.services;

import shitta.dto.Response.RegisterUserResponse;
import shitta.data.model.User;
import shitta.dto.request.RegisterUserRequest;

public interface UserService {
    RegisterUserResponse registerNewUser(RegisterUserRequest request);

    User findUser(int id);
}
