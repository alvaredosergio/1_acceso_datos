package restaurantes;

public class Muestra {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado ("Raul",Restaurantes.KFC);
        Empleado empleado2 = new Empleado ("José",Restaurantes.GINOS);
        Empleado empleado3 = new Empleado ("María",Restaurantes.MCDONALDS);
        Empleado empleado4 = new Empleado ("Dolores",Restaurantes.VIPS);

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
    }
}
