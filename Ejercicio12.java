import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen:");
        int n1 = sc.nextInt();
        System.out.print("¿Qué nota quieres sacar en el trimestre?");
        double nota = sc.nextDouble();
        double n2 = n1*0.40;
        double notanecesaria = (nota-n2)*0.60;
        System.out.println("Para tener un "+ nota+  " en el trimestre necesitas sacar un" +notanecesaria +" en el segundo examen.");
        sc.close();
    }
}
