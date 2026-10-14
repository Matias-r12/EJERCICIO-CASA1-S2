public class producto {
    public String nombre;
    public double precio;
    String categoria;
    boolean disponible;

    public void mostrarInformacion(){
        System.out.println("El Nombre es: "+nombre);
        System.out.println("La categoria es: "+categoria);
    }
    public void cambiarDisponibilidad(boolean nuevaDisponibilidad){
         this.disponible=nuevaDisponibilidad;
    }
    void mostrarPrecio(){
        System.out.println("El precio es: "+precio);
    }
    void mostrardisponibilidad(){
        System.out.println("El producto esta en "+disponible);
    }
}
