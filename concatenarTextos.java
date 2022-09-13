package com.Java.estructurasControl.repeticion;

public class concatenarTextos {

    public static void main(String[] args) {

        String nombre1 = "Juan";
        String nombre2 = "Jorge";
        String nombre3 = "Candela";
        String nombre4 = "Andrea";


        String[] nombres = {"Juan " + " Jorge " + " Candela " + " Andrea"};
        for(int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);

        }


    }
}
