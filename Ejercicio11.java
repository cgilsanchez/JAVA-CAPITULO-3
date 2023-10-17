import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de Kb que desea convertir a Mb");
        int kb=sc.nextInt();
        long conversor = kb/1000;
        System.out.println(kb +" Kb son "+ conversor+ "Mb");
        sc.close();
    }
}
