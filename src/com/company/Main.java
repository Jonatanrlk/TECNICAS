package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner lector = new Scanner(System.in);

        int n, result=0, a,i;

        System.out.print("Digite el numero a elevar al cubo: ");
        n = lector.nextInt();

        int aux = n*(n-1)/2 + 1;

        for (i=0; i<n; i++)
        {
            a = (2*aux-1);
            result = result+a;
            ++aux;
        }

        System.out.println(n+" al cubo es : "+result);

    }
}
