
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class Principal {

    public static void main(String[] args) {
        //int numero = 10;
        int cant = 0;
        float suma = 0;
        float promedio = 0;
        float flotante = 9.3f;
        //double doble = 23e2d;
        //String palabra = "Hola";
        //System.out.println("El numero entero es " + numero + " , el numero flotante es " + flotante + " , el doble es " + doble + " y la palabra es " + palabra);
        
        //Declaro ArrayList de flotantes
        ArrayList<Float> numFlotante = new ArrayList<>();
        
        //Agregar elementos al Array
        numFlotante.add(1.1f);
        numFlotante.add(1.2f);
        numFlotante.add(1.3f);
        numFlotante.add(1.4f);
        
        System.out.println("Lista de flotantes: " + numFlotante);
        
for(Float f : numFlotante){
    suma = f + suma;
    cant++;
}
promedio = suma/cant;

        System.out.println("El promedio de los numeros flotantes del arreglo son " + promedio);
    }                                                                   
}

//REPASAR DESDE CREAR UN ARRAY
