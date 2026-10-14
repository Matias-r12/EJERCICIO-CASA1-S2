public class Main {
    public static void main(){
        producto producto1= new producto();
        producto producto2= new producto();
        producto producto3= new producto();

        producto1.nombre="Audífonos Bluetooth";
        producto1.categoria="Tecnologia";
        System.out.println("---PRODUCTO 1---");
        producto1.mostrarInformacion();
        producto1.precio=32.50;
        producto1.mostrarPrecio();
        producto1.disponible=true;
        producto1.mostrardisponibilidad();


        producto2.nombre="Teclado led";
        producto2.categoria="Teclados";
        System.out.println("---PRODUCTO 2---");
        producto2.mostrarInformacion();
        producto2.precio=20.75;
        producto2.mostrarPrecio();
        producto2.disponible=false;
        producto2.mostrardisponibilidad();


        producto3.nombre="Ryzen 7";
        producto3.categoria="Procesador";
        System.out.println("---PRODUCTO 3---");
        producto3.mostrarInformacion();
        producto3.precio=300;
        producto3.mostrarPrecio();
        producto3.disponible=true;
        producto3.mostrardisponibilidad();

        System.out.println("Cambiando disponibilidad a false al producto 1...");
        producto1.cambiarDisponibilidad(false);

        System.out.println("---Estado de cambio---");
        producto1.mostrardisponibilidad();
    }

}