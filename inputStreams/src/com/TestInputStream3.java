package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestInputStream3 {
    public static void main(String[] args) {
        TestInputStream2 tis = new TestInputStream2();              
        try {                                                       
            byte[] readedData = tis.leerDatos("numeros.txt");
            System.out.println(Arrays.toString(readedData));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error en la I/O: " + e.getMessage());
        }
    }

    public void leerDatos(String fichero) throws IOException {       
        FileInputStream fis = new FileInputStream(fichero);
        int i ;
        while((i=fis.read()) != 0){
            System.out.println(i);
        }
        fis.close();              
    }
}



