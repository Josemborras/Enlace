import java.util.Random;
import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduce el tamaño del arrays que llenaremos de numeros aleatorios del 1 al 20:");

        int lista[]= new int[sc.nextInt()];
        int numbusca;

        for (int i = 0; i < lista.length; i++) {
            lista[i]= random.nextInt(1,21);
        }

        System.out.println();
        System.out.println("Dinos en que numero acaba los numeros que tenemos que buscar:");

        numbusca = sc.nextInt();
        int contador = 0;
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 10 == numbusca) {  
                contador++;   
            }
        }
        int lista2[]=new int[contador];
        
        for (int i = 0, j=0; i < lista.length; i++) {
            if (lista[i] % 10 == numbusca) {  
                lista2[j]=lista[i];  
                j++; 
            }
        }
        
        for (int i = 0; i < contador; i++) {
            System.out.println(lista2[i]);
        } 
        sc.close();
    }
}
