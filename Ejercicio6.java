import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base del triangulo");
        int base=sc.nextInt();
        System.out.println("Introduzca la altura del triangulo");
        int altura=sc.nextInt();
        double area= (base*altura)/2;
        System.out.println("El area del triangulo es de "+ area + "cm2");
        sc.close();
    }
}
