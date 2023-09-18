package Ejercicio7;
import java.math.BigInteger;
import java.util.*;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        BigInteger n = sc.nextBigInteger();
        sc.close();
        BigInteger factorial = BigInteger.ONE;
        BigInteger numero = BigInteger.ONE;
        while (factorial.compareTo(n)<=0) {
            numero=numero.add(BigInteger.ONE);
            factorial=factorial.multiply(numero);
        }
        numero=numero.subtract(BigInteger.ONE);
        System.out.println("El mayor numero cuyo factorial es menor que " + n + "es: "+numero);
    }
}