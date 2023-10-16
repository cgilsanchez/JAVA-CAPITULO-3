import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de euros que desea convertir a pesetas");
        int euros = sc.nextInt();
        double conversor=euros*167.48059;
        System.out.println( euros +" son "+ conversor + " pesetas.");
        sc.close();    
    }
}
