import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el primer numero");
        int num1=sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        int num2=sc.nextInt();
        int suma = num1+num2;
        int resta= num1-num2;
        float multiplicacion= num1*num2;
        float division = num1/num2;
        System.out.println("La suma de los dos numeros es: "+ suma);
        System.out.println("La resta de los dos numeros es: "+ resta);
        System.out.println("La multiplicacion de los dos numeros es: "+ multiplicacion);
        System.out.println("La division de los dos numeros es: "+ division);
        sc.close();
    }
}
