
package tienda1.demo;

// Clase Direccion
public class Direccion {
    private String calle;
    private String ciudad;
    private String codigoPostal;

    // Constructor
    public Direccion(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    // Getters para acceder a los atributos de la dirección
    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }
}

