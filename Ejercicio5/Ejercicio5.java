package Ejercicio5;
import java.util.*;
public class Ejercicio5 {
     public static void main(String[] args) {
        int a,b,h,k;
        int ac=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa primer numero");
        a=sc.nextInt();
        System.out.println("Ingresa segundo numero");
        b=sc.nextInt();

        if(b%2==0){
            ac=0;
            System.out.println("cero"+ ac);
        }else{
            ac=a;
        }
        while(b>=1){
            System.out.println("entro"+ ac);
            h=a*2;
            k=b/2;
            a=h;
            b=k;
            System.out.println("while"+ac);
    
        if(b%2==0){

        }else{
            ac=ac+a;
            System.out.println("acumulado"+ac);

        }
        System.out.println("resultado"+ac);
    }
}
}    

