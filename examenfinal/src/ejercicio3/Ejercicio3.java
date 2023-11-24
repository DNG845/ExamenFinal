/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pablonoguera
 */
public class Ejercicio3 {
       public static void calcularValorInventario() {
          System.out.println("");
          System.out.println("Ejercicio 3");
          System.out.println("");
          System.out.println("Escribe un programa en Java que lea un archivo de texto llamado \"datos.txt\" \nque contiene información sobre productos (nombre, precio y cantidad en stock). \nCalcula el valor total del inventario y guarda el resultado en un nuevo archivo llamado \"inventario.txt\".\n");
        // Implementa la lógica del ejercicio 3 aquí
    }
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


public static void TextoLeer(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;           
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
 System.out.println("Introduce el nombre del archivo de texto");
 TextoLeer("datos.txt");
}
}
