/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import static examenfinal.ExamenFinal.menu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.nio.file.Files.delete;
import static javax.swing.text.html.HTML.Tag.I;

/**
 *
 * @author UCR
 */
public class RegistroClientes {
   
public static void menu (){ /*5*/
    int opcion = 0; 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String Datos = null;
    String Cuenta = null;
for (int i= 0 ; i<= 0 ; i++){
switch (opcion) {
            case 1:
               System.out.println("Coloque sus datos (Nombe, Numero de cliente,)");
               System.out.println("Coloque su saldo actual");
               int saldo = 0; 
                break;


            case 2:
               System.out.println ("Eliminar usuario (YES / NO)");
               String eleccion = null;
               if (eleccion == "YES"){
               Datos[i] == Cuenta;
               }
           
                break;

                
            case 3:
                System.out.println ("Ver saldo total de los usuarios");
                String eleccion2 = null;
                saldo = saldo + i;
                if (eleccion2 == "YES"){
                System.out.println("El saldo total de los lientes es de" + saldo);
                }
                break;
/*Los bytes totales son de 15*/
}
}
}
}