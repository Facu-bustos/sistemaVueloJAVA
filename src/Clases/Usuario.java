package Clases;

public abstract class Usuario {

    // ATRIBUTOS

    private String email;
    private String contrasenia;
    private String rol;

    public Usuario(String email, String contrasenia, String rol) {
        this.email = email;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    public Usuario() {

    }

    public Usuario(String email, String contrasenia) {
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }

}
