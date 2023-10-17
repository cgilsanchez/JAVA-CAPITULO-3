import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de Mb que desea convertir a Kb");
        int mb=sc.nextInt();
        long conversor = mb*1000;
        System.out.println(mb +" Mb son "+ conversor+ "Kb");
        sc.close();
    }
}
