package Ejercicio6;
import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0, b=1, c, n;
        int i=0;
        System.out.println("ingresa un numero");
        n=sc.nextInt();
        System.out.println("Estos son los numeros de fibonacci inferiores a este numero");
        for ( ; a<n; ){
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
            i=i+1;

        }
        System.out.println();
        System.out.println("El numero que has elegido es de orden"+i);

   }
}
