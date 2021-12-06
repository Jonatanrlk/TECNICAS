package com.company;
import java.util.*;
public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        float Base,Orden ,Resta ,n,m,r , numeroCombinaciones;

        System.out.println("Combinatoria Cn,m ");

        System.out.print("ingresa n : ");
        n = input.nextFloat();
        System.out.print("Ingresa m : ");
        m = input.nextFloat();

        Base = Factorial(n);
        Orden = Factorial(m);
        r = n-m;
        Resta = Factorial(r);
        numeroCombinaciones = (Base / (Orden * Resta));

        System.out.println("las combinaciones de N elementos tomados de M en M es : "+numeroCombinaciones+" Combinaciones");
    }
    public static float Factorial(float Numero)
    {
        float iFactorial = 1;

        for(int x=2; x<=Numero ; x++)
        {
            iFactorial = iFactorial * x;
        }
        return iFactorial;
    }
}
