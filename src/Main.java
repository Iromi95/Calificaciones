import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dig = new Scanner(System.in);
        Calificacion nota = new Calificacion();
        System.out.println("numero de notas: ");
        String[] notas = new String[dig.nextInt()];
        nota.calificacion(notas);
        for (String datos : notas) {
            System.out.println(datos);
        }
        String[] reprobados = nota.desaprobado(notas);
        System.out.println("Reprobados: ");
        for (String r : reprobados) {
            System.out.println(r);
        }
        String[] aprobados = nota.aprobado(notas);
        System.out.println("Aprobados: ");
        for (String r : aprobados) {
            System.out.println(r);
        }
        String[] excelente = nota.excelente(notas);
        System.out.println("Excelentes: ");
        for (String r : excelente) {
            System.out.println(r);
        }

    }
}