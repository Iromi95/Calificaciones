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
        System.out.println("notas menores a 4: ");
        for (String r : reprobados) {
            System.out.println(r);
        }
    }
}