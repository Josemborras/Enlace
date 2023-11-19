import java.util.Arrays;
import java.util.Random;


public class practica5 {
    public static void main(String[] args) {

        
        Random random = new Random();

        String bombo1[]={"Qatar","Brasil","Bélgica", "Francia", "Portugal", "Inglaterra", "Argentina", "España"};
        String bombo2[]={"PB","Alemania","Dinamarca", "Suiza", "Mexico", "EEUU", "Uruguay", "Croacia"};
        String bombo3[]={"Japon","Iran","Serbia", "Marruecos", "Corea del Sur", "Polonia", "Senegal", "Tunez"};
        String bombo4[]={"Camerun","Canada","Ecuador", "Arabia Saudi", "Ghana", "Escocia", "Australia", "Costa Rica"};
        
        
        
        String Sorteo[][]=new String[4][8];

        
        for (int j = 0; j < Sorteo[0].length; j++) {
            int contador;
            do {
                contador = random.nextInt(8);
            } while (bombo1[contador].equals(""));

            Sorteo[0][j] = bombo1[contador];
            bombo1[contador] = "";
        }
        
        
        for (int j = 0; j < Sorteo[1].length; j++) {
            int contador;
            do {
                contador = random.nextInt(8);
            } while (bombo2[contador].equals(""));

            Sorteo[1][j] = bombo2[contador];
            bombo2[contador] = "";
        }
        
        
        for (int j = 0; j < Sorteo[2].length; j++) {
            int contador;
            do {
                contador = random.nextInt(8);
            } while (bombo3[contador].equals(""));

            Sorteo[2][j] = bombo3[contador];
            bombo3[contador] = "";
        }
        
        
        for (int j = 0; j < Sorteo[3].length; j++) {
            int contador;
            do {
                contador = random.nextInt(8);
            } while (bombo4[contador].equals(""));

            Sorteo[3][j] = bombo4[contador];
            bombo4[contador] = "";
        }
        
        for (int i = 0; i < Sorteo.length; i++) {
            System.out.println(Arrays.toString(Sorteo[i]));
        }
        
    }
}
