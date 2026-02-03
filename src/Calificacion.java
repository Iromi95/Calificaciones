import java.util.Random;

public class Calificacion {
    Random rand = new Random();
    int num= 0;
    String[] orden;
    //Metodo para crear el arreglo segun parametros enviados por el usuario
    public String[] calificacion(String[] calificacion){
        for (int i =0; i < calificacion.length; i++) {
            num = rand.nextInt(11);
            calificacion[i] = String.valueOf(num);
        }
        return calificacion;
    }
    //Arreglo para guardar los desaprodos
    public String[] desaprobado(String[] nota){
        int cont = 0;
        //condicional para encontrar el tamaño del nuevo arreglo, segun los numero que coincidan
        for (int i = 0; i < nota.length; i++) {
            if (Integer.parseInt(nota[i]) < 4) {
                cont++;
            }
        }
        //bucle para registrar los desaprobados
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
    public String[] aprobadoExc(String[] nota){
        int cont = 0;
        for (int i = 0; i < nota.length; i++) {
            if (Integer.parseInt(nota[i]) >= 4) {
                cont++;
            }
        }
        String[] aprobados =  new String[cont];
        int j = 0;
        for (int i =0; i < nota.length; i++) {
            if (Integer.parseInt(nota[i]) >= 4) {
               aprobados[j] = nota[i];
                j++;
            }
        }
        return aprobados;
    }
    public String[] aprobado(String[] nota){
        int cont = 0;
        for (int i = 0; i < nota.length; i++) {
            if (Integer.parseInt(nota[i]) >= 4 && Integer.parseInt(nota[i]) < 8) {
                cont++;
            }
        }
        String[] aprobados =  new String[cont];
        int j = 0;
        for (int i =0; i < nota.length; i++) {
            if (Integer.parseInt(nota[i]) >= 4 && Integer.parseInt(nota[i]) < 8) {
                aprobados[j] = nota[i];
                j++;
            }
        }
        return aprobados;
    }
    public String[] excelente(String[] nota){
        int cont = 0;
        for (int i = 0; i < nota.length; i++) {
            if (Integer.parseInt(nota[i]) > 7) {
                cont++;
            }
        }
        String[] excelente =  new String[cont];
        int j = 0;
        for (int i =0; i < nota.length; i++) {
            if (Integer.parseInt(nota[i]) > 7) {
                excelente[j] = nota[i];
                j++;
            }
        }
        return excelente;
    }
    //metodo para sacar el promedio de las notas.
    public double promedio(String[] nota){
        double suma = 0;
        for (int i = 0; i < nota.length; i++) {
            suma += Double.parseDouble(nota[i]);
        }
        return suma/ nota.length;
    }

}
