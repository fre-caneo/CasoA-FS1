package tienda1.demo;
import java.util.ArrayList;
import java.util.List;

// Clase UsuarioController
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    // Lista de usuarios (simulación de una base de datos)
    private List<Usuario> usuarios = new ArrayList<>();

    // Constructor para inicializar algunos usuarios de ejemplo
    public UsuarioController() {
        usuarios.add(new Usuario(1, "usuario1", "usuario1@gmail.com", "Cliente", "Calle hibiscos 3"));

        usuarios.add(new Usuario(2, "usuario2", "usuario2@gmail.com", "Administrador", "Calle Laureles 56"));
    }
    

    // Método para obtener un usuario por su ID
    @GetMapping("/usuarios/id/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null; // Usuario no encontrado
    }

    // Método para obtener un usuario por su nombre
    @GetMapping("/usuarios/nombre/{nombre}")
    public Usuario obtenerUsuarioPorNombre(@PathVariable String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null; // Usuario no encontrado
    }

    // Método para obtener un usuario por su correo electrónico
 // Endpoint para obtener todos los usuarios
 @GetMapping("/usuarios")
 public List<Usuario> obtenerTodosLosUsuarios() {
     return usuarios;
 }

 // Endpoint para obtener el ID de un usuario por su ID
 @GetMapping("/usuarios/id/{id}/id")
 public int obtenerIdUsuarioPorId(@PathVariable int id) {
     Usuario usuario = buscarUsuarioPorId(id);
     return usuario != null ? usuario.getId() : -1; // Devolver -1 si el usuario no se encuentra
 }

 // Endpoint para obtener el nombre de un usuario por su ID
 @GetMapping("/usuarios/id/{id}/nombre")
 public String obtenerNombreUsuarioPorId(@PathVariable int id) {
     Usuario usuario = buscarUsuarioPorId(id);
     return usuario != null ? usuario.getNombre() : "Usuario no encontrado";
 }

 // Endpoint para obtener el correo electrónico de un usuario por su ID
 @GetMapping("/usuarios/id/{id}/email")
 public String obtenerEmailUsuarioPorId(@PathVariable int id) {
     Usuario usuario = buscarUsuarioPorId(id);
     return usuario != null ? usuario.getEmail() : "Usuario no encontrado";
 }

 // Endpoint para obtener el rol de un usuario por su ID

 

 // Método para buscar un usuario por su ID
 private Usuario buscarUsuarioPorId(int id) {
     for (Usuario usuario : usuarios) {
         if (usuario.getId() == id) {
             return usuario;
         }
     }
     return null; // Usuario no encontrado
 }
}

