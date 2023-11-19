import java.util.Scanner;

public class practica4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu DNI completo:");

        String dniCompleto = sc.nextLine();

        String letradni=dniCompleto.substring(8);

        char dni[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        System.out.println("Introducir el numero de DNI para calcular la letra:");

        int numdni=sc.nextInt();

        char letra = dni[numdni % 23];

        System.out.println(letra);

        System.out.println(letradni);

        sc.close();

    }
}
