package tienda1.demo;
import java.util.ArrayList;
import java.util.List;

// Clase Usuario
public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String rol;
    private String direccionDespacho;

    // Constructor
    public Usuario(int id, String nombre, String email, String rol, String direccionDespacho) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
        this.direccionDespacho = direccionDespacho;
    }

    // Getters para acceder a los atributos
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getRol() {
        return rol;
    }

    public String getDireccionDespacho() {
        return direccionDespacho;
    }
}
