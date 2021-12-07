package com.company;
import java.util.*;
public class Main
{

    public static void main(String[] args)
    {
        System.out.println();
        Scanner lector = new Scanner (System.in);

        int a,n, i, result = 0;

        System.out.print("Digite el numero a elevar al cuadrado: ");
        n = lector.nextInt();

        for (i=1; i<=n; i++)
        {
            a = (2*i-1);
            result = result+a;
        }

        System.out.println(n+" al cuadrado es : "+result);
    }
}
