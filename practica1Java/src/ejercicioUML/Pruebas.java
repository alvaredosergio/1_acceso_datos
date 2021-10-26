package ejercicioUML;

import java.util.ArrayList;
import java.util.List;

public class Pruebas {
    public static void main(String[] args) {
        Directivo directivo1 = new Directivo("Sergio","Logística");
        Directivo directivo2 = new Directivo("Raul","Financiero");

        Tecnico tecnico1 = new Tecnico("Maria","15");
        Tecnico tecnico2 = new Tecnico("Juan","93");

        Oficial oficial1 = new Oficial("Ramón","34","Superior");
        Oficial oficial2 = new Oficial("Julia","53","Medio");

        Operario operario1 = new Operario("Sofía","15","Fresadora");
        Operario operario2 = new Operario("Mario","23","Apiladora");

        List <Empleado> empleados = new ArrayList <Empleado>();
            empleados.add(directivo1);
            empleados.add(directivo2);
            empleados.add(tecnico1);
            empleados.add(tecnico2);
            empleados.add(oficial1);
            empleados.add(oficial2);
            empleados.add(operario1);
            empleados.add(operario2);

            for(Empleado employer:empleados){
                System.out.println(employer.getNombre() + " " + employer.toString());
            }   
    }
}
