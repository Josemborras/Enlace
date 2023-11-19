import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char dni[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        System.out.println("Introducir el numero de DNI para calcular la letra:");

        int numdni=sc.nextInt();

        char letra = dni[numdni % 23];

        System.out.println(letra);
        sc.close();
    }
}
