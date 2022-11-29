package mio.infrastructure.asd;

import mio.domain.usecases.FindUserUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final FindUserUseCase findUserUseCase;


    public UserController(FindUserUseCase findUserUseCase){
        this.findUserUseCase = findUserUseCase;
    }

    @GetMapping("/users")
    public UserDto retrieveUser(){
        UserDto userDto = new UserDto();
        userDto.setName(this.findUserUseCase.findUser());
        return userDto;
    }
}
