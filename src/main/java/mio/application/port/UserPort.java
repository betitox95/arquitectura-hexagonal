package mio.application.port;

public interface UserPort {

    /**
     * Reemplaza al Service en MVC
     * Aca se declaran los metodos a usar del servicio
     * public User findById(Long Id);
     * */

    public String findById(Long Id);

}
