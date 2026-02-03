import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dig = new Scanner(System.in);
        Calificacion nota = new Calificacion();

        //Elegir el numero de notas a guardar
        System.out.println("numero de notas: ");
        String[] notas = new String[dig.nextInt()];

        //almacenando las notas en el arreglo
        nota.calificacion(notas);
        for (String datos : notas) {
            System.out.print("["+datos+"]");
        }
        System.out.println("");
        String[] reprobados = nota.desaprobado(notas);
        Double repro = nota.promedio(reprobados);
        System.out.println("Reprobados: " + reprobados.length+ " Promedio: " + repro);
        for (String r : reprobados) {
            System.out.print("["+r+"]");
        }
        System.out.println("");
        String[] aprobadosexcel = nota.aprobado(notas);
        Double aprobexcel = nota.promedio(aprobadosexcel);
        System.out.println("aprobados menores a 8: " + aprobadosexcel.length + " Promedio: " + aprobexcel);
        for (String r : aprobadosexcel) {
            System.out.print("["+r+"]");
        }
        System.out.println("");
        String[] excelente = nota.excelente(notas);
        Double excel = nota.promedio(excelente);
        System.out.println("Excelentes: " + excelente.length+ " Promedio: " + excel);
        for (String r : excelente) {
            System.out.print("["+r+"]");
        }
        System.out.println("");
        String[] aprobados = nota.aprobadoExc(notas);
        Double aprob = nota.promedio(aprobados);
        System.out.println("todos los aprobados: " + aprobados.length + " Promedio: " + aprob);
        for (String r : aprobados) {
            System.out.print("["+r+"]");
        }
    }
}