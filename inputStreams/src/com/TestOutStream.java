package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestOutStream {
    public static void main(String[] args) {
        TestOutStream tos = new TestOutStream();
        try {
            tos.leerFichero("miFichero","uno","");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*TestOutStream tos = new TestOutStream();
        String txt = "Este mensaje secreto dejó de ser secreto.";
        try {
            tos.escribirFichero("miFichero",txt);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    // Método para escribir en un fichero. Parametros: nombre del fichero, contenido del fichero.
    public void escribirFichero(String nombreFichero, String contenido) throws IOException{

        // Objeto File
        File fichero = new File(nombreFichero);
        FileOutputStream fos = new FileOutputStream(fichero);

        //Si el fichero no existe, crealo.
        if(!fichero.exists()){
            File.createTempFile(nombreFichero, ".txt");
        }

        //Escribe en el fichero.
        byte [] contenidoBytes = contenido.getBytes();
        fos.write(contenidoBytes);
        fos.flush();
        fos.close();
        System.out.println("Hecho.");
    }

    public void leerFichero(String fichero, String nombreArchivo, String contenido) throws IOException{
        FileReader fr = new FileReader(fichero);
        BufferedReader br = new BufferedReader(fr);
        String fila;
        fila = br.readLine();
        String palabras[];
        palabras = fila.split(" ");
        List <String> palabrasConA = new ArrayList <String>();
        List <String> palabrasSinA = new ArrayList <String>();

        for(String palabra:palabras){
            if(palabra.charAt(0) == 'A' || palabra.charAt(0) == 'a'){
                palabrasConA.add(palabra);
            }
            else{
                palabrasSinA.add(palabra);
            }
        }

        File archivo = new File(nombreArchivo);
        FileOutputStream fos = new FileOutputStream(archivo);

        if(!archivo.exists()){
            File.createTempFile(nombreArchivo, ".txt");
        }

        for(String palabra:palabras){
            byte [] contenidoBytes = palabra.getBytes();
            fos.write(contenidoBytes);
        }

        fos.flush();
        fos.close();
        System.out.println("Hecho.");
    }
}
