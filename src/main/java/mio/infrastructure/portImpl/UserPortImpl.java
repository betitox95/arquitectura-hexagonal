package mio.infrastructure.portImpl;


import mio.application.port.UserPort;
import org.springframework.stereotype.Component;

@Component
public class UserPortImpl implements UserPort {

    /**
     * Reemplaza al serviceImplement en MVC
     *
     * Es un component que se puede conectar a otro component
     * Que puede hacer una tarea en particular (Teniendo en cuenta la funcionalidad)
     * */

    @Override
    public String findById(Long Id) {
        return "RETORNO";
    }
}
