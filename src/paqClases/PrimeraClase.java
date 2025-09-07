/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqClases;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class PrimeraClase {

    String unaCadena;
    int unEntero;

    //METODO DE INSTANCIA
    public void mostrar() {
        System.out.println("Cadena: " + unaCadena + " Entero: " + unEntero);
    }

    public static void main(String[] args) {

        //CREACION DE OBJETOS
        PrimeraClase unObjeto1 = new PrimeraClase();
        PrimeraClase unObjeto2 = new PrimeraClase();
        PrimeraClase unObjeto3 = new PrimeraClase();
        PrimeraClase unObjeto4 = new PrimeraClase();
        PrimeraClase unObjeto5 = new PrimeraClase();

        //DAR VALOR A OBJETOS
        unObjeto1.unaCadena = "RTX 3060";
        unObjeto1.unEntero = 5;
        unObjeto2.unaCadena = "RYZEN 7 5600";
        unObjeto2.unEntero = 10;
        unObjeto3.unaCadena = "Ram";
        unObjeto3.unEntero = 15;
        unObjeto4.unaCadena = "Teclado";
        unObjeto4.unEntero = 20;
        unObjeto5.unaCadena = "Mouse";
        unObjeto5.unEntero = 25;

        //LLAMAR AL METODO DESDE LAS INSTANCIAS
        //unObjeto1.mostrar();
        //unObjeto2.mostrar();
        //unObjeto3.mostrar();
        //unObjeto4.mostrar();
        //unObjeto5.mostrar();

        ArrayList<PrimeraClase> objetos = new ArrayList<>();
        objetos.add(unObjeto1);
        objetos.add(unObjeto2);
        objetos.add(unObjeto3);
        objetos.add(unObjeto4);
        objetos.add(unObjeto5);

        for (PrimeraClase obj : objetos) {
            obj.mostrar();
        }
    }
}
