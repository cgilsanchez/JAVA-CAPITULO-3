import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las horas trabajadas de este mes");
        int horas = sc.nextInt();
        double sueldo= horas*12;
        double sueldosemanal = sueldo/4;
        System.out.println("Su sueldo a recibir a la semana es: "+sueldosemanal);
        sc.close();
    }
}
