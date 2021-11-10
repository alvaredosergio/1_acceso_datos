import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) throws Exception {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Curso profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Curso profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Curso profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Curso profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Curso profesional de Escritura", 1.5f, 10, 300 ));


        //ejercicio1(cursos);
        //ejercicio2(cursos);
        //ejercicio3(cursos);
        //ejercicio4(cursos);
        //ejercicio5(cursos);
        //ejercicio6(cursos);
        //ejercicio7(cursos);
        //ejercicio8(cursos);
        /* ejercicio 9
        for (String c : ejercicio9(cursos)) {
            System.out.println(c);
        }*/

    }

    /*************************************************************/
    // NOMBRE de los cursos con una duración mayor a 5 horas.
    public static void ejercicio1Void(List<Curso> cursos){
        cursos.stream()
        .filter(x -> x.getDuracion() > 5)
        .forEach(y -> System.out.println(y.getTitulo()));
    }
    public static List<Curso> ejercicio1List(List<Curso> cursos){
        return cursos.stream()
        .filter(x -> x.getDuracion() > 5)
        .collect(Collectors.toList());
        // Este método necesita recorrer la lista 'cursos' con un foreach.
    }
    /**************************************************************/

    // CANTIDAD de los cursos con una duración menor de 2 horas.
    public static void ejercicio2Void(List<Curso> cursos){
        long count = cursos.stream()
        .filter(x -> x.getDuracion() < 2)
        .count();
        System.out.println("Numero de cursos con duración menor a 2 horas: " + count);
    }

    // Titulo de aquellos cursos con mas de 50 videos.
    public static void ejercicio3(List<Curso> cursos){
        cursos.stream()
        .filter(x -> x.getVideos() > 50)
        .forEach(y -> System.out.println(y.getTitulo()));
    }

    // Titulo de los 3 cursos con mayor duración.
    public static void ejercicio4(List<Curso> cursos){
        cursos.stream()
        .sorted(Comparator.comparing(Curso::getDuracion).reversed())
        .limit(3)
        .forEach(y -> System.out.println(y.getTitulo()));
    }

    // Duración total de todos los cursos.
    public static void ejercicio5(List<Curso> cursos){
        double sum = cursos.stream()
        .mapToDouble(x->x.getDuracion())
        .sum();
        System.out.println("La duración de todos los cursos juntos es de " + sum + " horas.");
    }

    // Cursos que superen la media de horas de todos los cursos.
    public static void ejercicio6(List<Curso> cursos){
        long count = cursos.stream().count();
        double media = cursos.stream()
        .mapToDouble(x->x.getDuracion())
        .sum()/count;
        cursos.stream()
        .filter(x -> x.getDuracion() > media)
        .forEach(y -> System.out.println(y.getTitulo()));
    }

    // Duración de los cursos con menos de 500 alumnos.
    public static void ejercicio7(List<Curso> cursos){
        cursos.stream()
        .filter(x -> x.getAlumnos() < 500)
        .forEach(y -> System.out.println("TITULO: " + y.getTitulo() + "\nDURACIÓN: " + y.getDuracion() + " horas\n"));
    }

    // Curso con mayor duración.
    public static void ejercicio8(List<Curso> cursos){
        cursos.stream()
        .sorted(Comparator.comparing(Curso::getDuracion).reversed())
        .limit(1)
        .forEach(y -> System.out.println(y.getTitulo()));
    }

    // Crear lista de Strings con todos los titulos.
    public static List<String> ejercicio9(List<Curso> cursos){
        List<String> titulos = new ArrayList<String>();
        cursos.stream()
        .forEach(y -> titulos.add(y.getTitulo()));
        return titulos;
    }
}
