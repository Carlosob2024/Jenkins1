/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.puk;

/**
 *
 * @author carlo
 */
public class PUK {
    public static boolean dia_laboral(String dia) 
    {
        switch(dia)
        {
            case "Lunes":
                return true;
            case "Martes":
                return true;
            case "Miercoles":
                return true;
            case "Jueves":
                return true;
            case "Viernes":
                return true;
            case "Sabado":
                return false;
            case "Domingo":
                return false;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("hOLA!");
        if (dia_laboral("Lunes") == true)
        {
            System.out.println("Es dia laboral porq la funcion devuelve true");
        } 
        else
        {
            
            System.out.println("No es dia laboral porq la funcion devuelve false");
        }
    }
}
