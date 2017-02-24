/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lnarvaezr.a07;
import java.util.Scanner;
/**
 *
 * @author Eduardo
 */
public class SPP2LNarvaezRA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    long[]numeros = new long[10];
    int posicion;
    Scanner teclado = new Scanner(System.in);
    for(int i=0;i<numeros.length;i++){
        System.out.println("Introduce el numero de la posicion " +i);
        numeros[i]=teclado.nextLong();
    }
        System.out.println("Introduzca la posicion del numero que desea conocer");
        posicion = teclado.nextInt();
        if(posicion>9){
            System.out.println("Fuera de rango");
        }else{
        System.out.println("La posicion "+posicion+ "contiene el numero "
                +numeros[posicion]);
        }
    }
    
}
