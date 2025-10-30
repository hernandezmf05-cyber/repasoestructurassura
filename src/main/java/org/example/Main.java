package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //System.out.println("Comienza aca: ");

        //Diseñar un ALGORITMO que permita el ingreso de un usuario con correo
        // y con contraseña
        //se permitiran 3 intentos antes de bloquearlo

        //ENTRADAS DEL ALGORITMO 1
        Scanner leerTeclado= new Scanner(System.in); // Las clases siempre empizan en mayuscula
        String colorVerde="\u001B[32m"; //conversion de colores
        String colorNegro ="\u001B[30m";
        String colorRojo="\u001B[31m";
        String colorAmarillo ="\u001B[33m";
        String colorAzul ="\u001B[34m";
        String colorMorado ="\u001B[35m";

        String correoDigitadoUsuario;
        String contraseñaDigitadaUsuario;
        String correoGuardadaBaseDatos="hernandez15@gmail.com";
        String contraseñaGuardadaBaseDatos="Liam";


        //PROCESO
        System.out.println(colorMorado + "***************************");
        System.out.println("💌GESTOR APP by MFH 2025💌");
        System.out.println(colorMorado + "***************************");









        //Diseñar un ALGORITMNO que permita mostrar un menu de opciones
        // si el usuario se autentico con exito, el menu sera el siguiente:
        //1. Registrar venta
        //2. Mostrar ventas del dia
        //3.SALIR
        //NOTA: Una venta se considera en el sistema como una variable con los sgtes datos:
        //id--> entero
        //fecha-->LocalDate
        //Descripcion--> Cadena
        //Lista de productos--> Lista
        //total-->doble

        //NOTA2: Un producto tiene:
        //id
        //precioUnitario
        //fotografia
        //cantidad

    }
}