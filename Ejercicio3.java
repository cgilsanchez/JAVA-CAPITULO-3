import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de pesetas que desea convertir a euros");
        int pesetas = sc.nextInt();
        double conversor=pesetas*0.0060;
        System.out.println( pesetas +" son "+ conversor + " pesetas.");
        sc.close();    
    }
}
