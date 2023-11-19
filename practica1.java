import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char abc []= new char[26];

        for (int i = 0; i < abc.length; i++) {
            abc[i]=(char)('A'+i);
        }

        StringBuilder mensaje = new StringBuilder(); 


        System.out.println("Introduzca indices del abecedario para crear un mensaje e imprimirlo por pantalla.");
          
        
        int indice = 0;

        while (indice<27) {
            System.out.println("Introduzca el numero de la posicion del caracter:(Cuando haya acabado introduzca cualquier numero mayor de 26)");

            indice = sc.nextInt();

            if (indice>-1 && indice<26) {
                mensaje.append(abc[indice]);
            }else{
                break;
            }


        }

        System.out.println("Mensaje resultante: " + mensaje.toString());
        sc.close();

    }
}
