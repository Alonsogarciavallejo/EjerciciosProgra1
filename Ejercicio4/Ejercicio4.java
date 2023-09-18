package Ejercicio4;
import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("La altura del triangulo");
        n=sc.nextInt();
        for (int i=n;i>0;i--){
            for (int j=0;j!=i && j<n;j++){
                System.out.print("-");
            }
            System.out.println("*");
        }
        for (int i=n;i>0;i--){
            for (int j=1;j!=i && j<n;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        for (int i=1;i>n;i++){
            for (int j=0;i!=j;j++){
                System.out.println("-");
            }
            System.out.println("*");
        }
        for (int i=1;i>n;i++){
            for (int j=1;i!=j;j++){
                System.out.println("*");
            } 
            System.out.println("*");
        }

    }
}
