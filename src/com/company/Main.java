package com.company;

import java.util.*;
public class Main
{

    public static void main(String[] args)
    {

    }
    public static int ConvertirdorDeRadianes(double numero )
    {
        Scanner input = new Scanner(System.in);
        int opcion, resultado;
        int grado = ConvertirdorDeRadianes(4.3993);


        System.out.print("¿es fraccion o numero decimal ? , Escribe '1'(fraccion) ó '2'(Entero o decimal) : ");
        opcion = input.nextInt();
        if(opcion ==1 )
        {
            double numerador=0, denominador=0 ;
            double division=0;

            System.out.println("Escribe primero el numerador (ENTER), despues ingresa el denominador por ultimo (ENTER)");

            System.out.print("Resultado : "+(numerador = input.nextInt())+"/"+(denominador= input.nextInt()));
            division = (double) (numerador / denominador);
            resultado = (int)(division*Math.PI);

            System.out.print(" = "+resultado+"°");

        }else
        {

            System.out.print("Ingresar Numero : ");
            numero = input.nextInt();
            resultado = (int)((numero*Math.PI)/180);
            System.out.println("Resultado : "+resultado+" π rad");
        }
        return resultado;
    }
}
