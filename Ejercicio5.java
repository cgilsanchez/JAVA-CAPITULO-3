import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base del rectangulo");
        int base=sc.nextInt();
        System.out.println("Introduzca la altura del rectangulo");
        int altura=sc.nextInt();
        double area= base*altura;
        System.out.println("El area del rectagulo es de "+ area + "cm2");
        sc.close();
    }
}
