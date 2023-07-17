import java.util.Scanner;

public class Menu {

    public static void showMenu(){

        int option = 0;

        System.out.println("Choisir une option");
        System.out.println("1. Emprunter un livre");
        System.out.println("2. Rendre un livre");
        Scanner sc = new Scanner(System.in);
        int response = sc.nextInt();

        do {
            switch (response){
                case 1:
                    System.out.println("Verifier disponibilité livre");
                    break;
                case 2:
                    System.out.printf("Recevoier le livre");
                 }
        } while (option !=0);
    }

    public static void main(String[] args) {
        showMenu();
    }
}
