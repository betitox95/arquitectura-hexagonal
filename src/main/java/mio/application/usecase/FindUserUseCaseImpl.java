package mio.application.usecase;

import mio.application.port.UserPort;
import mio.domain.usecases.FindUserUseCase;

public class FindUserUseCaseImpl implements FindUserUseCase {

    /**
     *
     *
     *
     *
     * */

    private final UserPort userPort;

    public FindUserUseCaseImpl(UserPort userPort) {
        this.userPort = userPort;
    }

    @Override
    public String findUser() {
        return userPort.findById(1L);
    }
}
