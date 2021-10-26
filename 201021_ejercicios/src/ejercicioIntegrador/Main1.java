package ejercicioIntegrador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main1 {
    public static String nomR(String array[]){
        Random r = new Random();
        int e = r.nextInt(array.length);
        return array[e];
    }

    public static int numRand(int n1, int n2){
        Random rnd = new Random();
        int e = rnd.nextInt(n2-n1+1)+n1;
        return e;
    }

    public static List<Liquidacion> nomina(List <Empleado> empleados){
        List <Liquidacion> liquidacion = new ArrayList<Liquidacion>(); 
        float monto;   
        for (Empleado e : empleados) {
            monto = 0;
            float porcentaje = (e.getCategoria() / 100)+1;
            for (Jornales j : e.getListaJornales()) {
                float calculo = j.getHorasTrabajadas()*15.50f*j.getDiasTrabajados()*porcentaje;
                monto = calculo;
            }
            liquidacion.add(monto);
        }
        return liquidacion;
    }

    public static List <Liquidacion> ordenarDecreciente(List <Liquidacion> lista){
        return lista.stream()
        .sorted(Comparator.comparing(Liquidacion::getCobro))
        .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List <Jornales> jornales = new ArrayList<Jornales>();
        List <Empleado> empleados = new ArrayList<Empleado>();
        
        for (int i = 0; i < 10; i++) {
            jornales = new ArrayList<>();
            for (int j = 0; j < 12; j++) {
                jornales.add(new Jornales(numRand(4,8), numRand(15,30)));
            }
            String nomb = nomR(Nombres.lista);
            empleados.add(new Empleado(nomb,nomb.toLowerCase() + "@gmail.com",numRand(1,10),jornales));
        }



        
    }


    
    
}
