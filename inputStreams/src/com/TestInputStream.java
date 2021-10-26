package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class TestInputStream {
    public static void main(String[] args) {
        TestInputStream tis = new TestInputStream();                // Instanciamos el objeto.
        try {                                                       // Creamos un array de bytes, rellenandolo de los datos del archivo 'numeros.txt'
            byte[] readedData = tis.leerDatos("numeros.txt");
            System.out.println(Arrays.toString(readedData));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error en la I/O: " + e.getMessage());
        }
    }

    public byte [] leerDatos(String fichero) throws IOException {   // Es necesario implementar una Excepcion para evitar fallos.
        
        File archivo = new File(fichero);                           // Objeto para archivos, para poder hacer cosas con ellos, como leerlo.       
        int longitud = (int) archivo.length();                      // Devuelve la cantidad de bytes del archivo.
        InputStream is = new FileInputStream(fichero);              // 

        byte[] data = new byte[longitud];                           // Creamos un array para almacenar los bytes. Su tamaño será el mismo del tamaño del archivo.
        
        int leidos = 0;
        while(leidos < longitud){                                   // Bucle para continuar leyendo minetras leidos sea menor que longitud.
            int x = is.read(data, leidos, 1);                       
            if(x < 0){
                break;
            }
            else{
                leidos += x;
                System.out.println("Leidos: " + leidos);
            }
        }
        is.close();                                                 // Es necesario cerrar el InputStream para que deje de consumir memoria.
        return data;
    }
}

// Realizamos un bucle para que nos muestre la cantidad de caracteres que ha leido.
// En consola representa el archivo en binario tal cual lo tenemos escrito, con espacios, saltos de linea, caracteres especiales etc....
// (Ejemplo: el espacio representa el 32)

