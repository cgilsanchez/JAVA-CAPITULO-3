import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la altura del cono");
        int h = sc.nextInt();
        System.out.println("Introduzca el valor del radio del cono");
        int r = sc.nextInt();
        double volumen = (3.14*r*r*h)/3;
        System.out.println("El volumen del cono es de: "+ volumen+ "cm al cubo");
        sc.close();
    }
}
