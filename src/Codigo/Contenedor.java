
package Codigo;

public class Contenedor {
    private String ruta;
    private String nombre;

    public Contenedor() {
    }

    public Contenedor(String ruta,  String nombre) {
        this.ruta = ruta;
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
