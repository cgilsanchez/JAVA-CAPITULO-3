import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero de la multiplicacion");
        int num1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero de la multiplicacion");
        int num2 = sc.nextInt();
        int multiplicacion = num1*num2;
        System.out.println("El resultado de la multiplicacion es "+ multiplicacion);
        sc.close();
    }
}