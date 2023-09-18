package Ejercicio3;
import java.util.*;
public class Ejercicio3 {
    public static void main(String [] args) {

        int numero1=0;
        int numero2=1;
        int n;
        int numero=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("eliga el numero n");
        n=sc.nextInt();
        if (n==0){
            System.out.println("El numero de fibonacci es 0");
        }else if (n==1){
            System.out.println("El numero de fibonacci es 1");
        }

        for (int i=2 ; i<=n ; i++ ){
            numero = numero1 + numero2;
            numero1 = numero2;
            numero2 = numero;

        }
        System.out.println("El numero de fibonacci es: "+ numero1);

    }
}