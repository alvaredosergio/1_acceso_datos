package ejercicio3_181021;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
 
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("1111AAA", Modelo.BMW, 10000));
        vehiculos.add(new Vehiculo("2222BBB", Modelo.AUDI, 20000));
        vehiculos.add(new Vehiculo("3333CCC", Modelo.OPEL, 30000));
        vehiculos.add(new Vehiculo("4444DDD", Modelo.BMW, 100000));
        vehiculos.add(new Vehiculo("5555EEE", Modelo.AUDI, 200000));
        vehiculos.add(new Vehiculo("6666FFF", Modelo.OPEL, 300000));
        vehiculos.add(new Vehiculo("7777GGG", Modelo.CITROEN, 0));

        /*System.out.println("Kilometros de todos los vehiculos: ");
        System.out.println("-----------------------------------");
        vehPorMatri(vehiculos);*/

        /*System.out.println("Modificar kilometros * 2: ");
        System.out.println("-----------------------------------");
        modificarKilVeh(vehiculos);*/

        /*System.out.println("Filtar solo audis: ");
        System.out.println("-----------------------------------");
        filtroAudi(vehiculos);*/

        /*compararKilometros(vehiculos);
        listarMarcas(vehiculos);
        listarMarcas3resuls(vehiculos);
        listarMarcas3resulsSaltar2(vehiculos);*/

        listarMarcas3resuls(vehiculos);
        
    }

    public static void vehPorMatri(List<Vehiculo> vehiculos){
        vehiculos.stream()
        .forEach(v->System.out.println("Vehiculo: " + v.getModelo() + "\nMatricula: " + v.getMatricula() + "\nKilometros: " + v.getKilometros() + "\n"));
    }

    public static List<Vehiculo> modificarKilVeh(List<Vehiculo> vehiculos){
        vehiculos.stream()
        .map(v->{v.setKilometros(v.getKilometros()*2);return v;})
        .collect(Collectors.toList());
        return vehiculos;
    }

    public static List<Vehiculo> filtroAudi(List<Vehiculo> vehiculos){
        return vehiculos.stream()
        .filter(v->v.getModelo().equals(Modelo.AUDI))
        .collect(Collectors.toList());
    }

    public void imprimir(List <Vehiculo> vehiculos){
        vehiculos.stream()
        .forEach(v->System.out.println(v));
    }

    public static List <Vehiculo> ordenarKm(List <Vehiculo> vehiculos){
        return vehiculos.stream()
        .sorted(Comparator.comparing(Vehiculo::getKilometros))
        .collect(Collectors.toList());
    }

    public static void listarMarcas(List <Vehiculo> vehiculos){
        vehiculos.stream()
        .distinct()
        .forEach(v->System.out.println(v));
    }

    public static void listarMarcas3resuls(List <Vehiculo> vehiculos){
        vehiculos.stream()
        .distinct()
        .forEach(v->System.out.println(v.getModelo()));
    }

    public static void listarMarcas3resulsSaltar2(List <Vehiculo> vehiculos){
        vehiculos.stream()
        .distinct()
        .limit(3)
        .skip(2)
        .forEach(v->System.out.println(v));
    }
}
