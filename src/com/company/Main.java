package com.company;
import java.util.*;
public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double Base,Orden ,Resta ,n,m,r , numeroCombinaciones;

        System.out.println("Combinatoria n/m ");

        System.out.print("ingresa n : ");
        n = input.nextDouble();
        System.out.print("Ingresa m : ");
        m = input.nextDouble();

        Base = Factorial(n);
        Orden = Factorial(m);
        r = n-m;
        Resta = Factorial(r);
        numeroCombinaciones = (Base / (Orden * Resta));

        System.out.println("las combinaciones de N elementos tomados de M en M es : "+numeroCombinaciones+" Combinaciones C "+n+","+m);
    }
    public static double Factorial(double Numero)
    {
        double iFactorial = 1f;

        for(int x=2; x<=Numero ; x++)
        {
            iFactorial = iFactorial * x;
        }
        return iFactorial;
    }
}
