package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String [] args) {
        int numero1;
        int numero2;


        Scanner sc = new Scanner(System.in);
        System.out.println("Eliga el primer número");
        numero1=sc.nextInt();

        System.out.println("Eliga el segundo número");
        numero2=sc.nextInt();

        //La suma de los dos números  
        int suma = numero1 + numero2;
        System.out.println("La suma es : " + suma);

        //El producto de los dos números
        int producto = numero1 * numero2;
        System.out.println("El producto es :" + producto);

        //Obtener cual de los dos números es mayor o menor que el otro
        if (numero1>numero2){
            System.out.println("El primer número es mayor que el segundo");
         }
          else System.out.println("El segundo número es mayor que el primero");
        
        // Obtener si los dos números son iguales
        if (numero1==numero2){
            System.out.println("Los dos números son iguales");
        } 
        else System.out.println("Los números no son iguales");
        
        //Saber si el primer número es par o impar
        if (numero1%2==0){
            System.out.println("El primer número es par");
        } 
        else System.out.println("El primer número es impar");

        //Saber si el segundo número es par o impar
        if (numero2%2==0){
            System.out.println("El segundo número es par");
        }
        else System.out.println("El segundo número es impar");

        //Saber si el primer número es divisible o no con el segundo
        if ( numero1 % numero2 == 0){
            System.out.println(numero1  + " es divisible con" +   numero2);
        }
        else System.out.println(numero1  + "no es divisible con" +   numero2);

        //Obtener si el primer número esta en el intervalo de [1-10]
        if (numero1>=1 && numero1<=10){
            System.out.println("El primer numero esta en el intervalo de [1-10]");
        }
        else System.out.println("El primer numero no esta en el intervalo de [1-10]");

        //Obtener si los dos números estan en el intervalo de [1-10]
        if (numero1>=1 && numero1<=10 && numero2>=1 && numero2<=10){
            System.out.println("Los dos números estan en el intervalo de [1-10]");
        }
        else System.out.println("Los dos números no estan en el intervalo de [1-10]");

        //Obtener el incremento del primer número con el segundo
        numero1 += numero2;

            System.out.println("el  incremento del primero con el segundo es : " + numero1);

           
    
    }
    
}
