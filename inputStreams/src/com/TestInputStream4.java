package com;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TestInputStream4 {
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
        InputStream is = new FileInputStream(fichero);
        int numLines = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(is))){
            String line;
            while((line = br.readLine()) != null){
                numLines++;
                System.out.println("Line: " + line);
                System.out.println("numLines: " + numLines);
            }   
        }
                 
    }
}



