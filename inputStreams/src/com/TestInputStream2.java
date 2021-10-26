package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class TestInputStream2 {
    public static void main(String[] args) {
        TestInputStream2 tis = new TestInputStream2();              // Instanciamos el objeto.
        try {                                                       // Creamos un array de bytes, rellenandolo de los datos del archivo 'numeros.txt'
            byte[] readedData = tis.leerDatos("numeros.txt");
            System.out.println(Arrays.toString(readedData));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error en la I/O: " + e.getMessage());
        }
    }

    public byte [] leerDatos(String fichero) throws IOException {   // Es necesario implementar una Excepcion para evitar fallos.      
        InputStream is = new FileInputStream(fichero);              

        if(is.available() > 0){
            byte[] data = new byte[is.available()];
            is.read(data);
            return data; 
        }
        is.close();
        return new byte[]{};
    }
}

// Realizamos un bucle para que nos muestre la cantidad de caracteres que ha leido.
// En consola representa el archivo en binario tal cual lo tenemos escrito, con espacios, saltos de linea, caracteres especiales etc....
// (Ejemplo: el espacio representa el 32)

