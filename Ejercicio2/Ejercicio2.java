package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main( String [] args){
        int numero1;
        int numero2;
        int numero3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Eliga el primer número");
        numero1=sc.nextInt();

        System.out.println("Eliga el segundo número");
        numero2=sc.nextInt();

        System.out.println("Eliga el tercer numero");
        numero3=sc.nextInt();

        if (numero1 + numero2 > numero3 && numero1 + numero3 > numero2 && numero2 + numero3 > numero1){
            if (numero1 == numero2 && numero1 == numero3)
                System.out.println("El triangulo es equilatero");
             else if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3 )
             System.out.println("El triangulo es isosceles");
             else 
                System.out.println("El triangulo es escaleno");

        }else 
            System.out.println("No se puede formar ningun triangulo");

    }
}

