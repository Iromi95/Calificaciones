import java.util.Random;

public class Calificacion {
    Random rand = new Random();
    int num= 0;
    String[] orden;

    public String[] calificacion(String[] calificacion){
        for (int i =0; i < calificacion.length; i++) {
            num = rand.nextInt(11);
            calificacion[i] = String.valueOf(num);
        }
        return calificacion;
    }
    public String[] desaprobado(String[] nota){
        int cont = 0;
        for (int i = 0; i < nota.length; i++) {
            if (Integer.parseInt(nota[i]) < 4) {
                cont++;
            }
        }
       String[] desaprobados =  new String[cont];
        int j = 0;
        for (int i =0; i < nota.length; i++) {
            if (Integer.parseInt(nota[i]) < 4) {
                desaprobados[j] = nota[i];
                j++;
            }
        }
        return desaprobados;
    }


}
