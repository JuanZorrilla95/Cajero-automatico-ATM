package cajeroautomatico;
import java.util.Scanner;

public class CajeroAutomatico {

     public static void main(String[] args) {
        // TODO code application logic here
        int balance = 100000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Cajero automatico");
            System.out.println("Elija 1 para retirar");
            System.out.println("Elija 2 para depositar");
            System.out.println("Elija 3 para consultas/balance");
            System.out.println("Elija 4 para SALIR");
            System.out.print("Elija la operacion que desea realizar:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
            System.out.print("Ingrese el dinero a retirar:");
            withdraw = sc.nextInt();
            if (balance >= withdraw)
            {
            balance = balance - withdraw;
            System.out.println("Retire su dinero por favor");
            }    
            else 
            {
                System.out.println("Balance insuficiente");
            }
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Ingrese el dinero a depositar:");
                    deposit= sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Tu dinero fue depositado exitosamente");
            System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}