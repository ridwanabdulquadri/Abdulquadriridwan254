package shitta.services;

import shitta.dto.Response.RegisterUserResponse;
import shitta.data.model.User;
import shitta.data.Repository.UserImply;
import shitta.data.Repository.UserRepository;
import shitta.dto.request.RegisterUserRequest;
import shitta.utils.Mapper;


public class UserServiceImpl implements UserService {
    UserRepository userRepository = new UserImply();
    public RegisterUserResponse registerNewUser(RegisterUserRequest request){
        User mappedUser = Mapper.map(request);
        userRepository.save(mappedUser);
        return Mapper.map(mappedUser);
    }

    @Override
    public User findUser(int id) {
        return userRepository.findById(id);
    }

}