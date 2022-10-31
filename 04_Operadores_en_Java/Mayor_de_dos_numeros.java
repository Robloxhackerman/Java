import java.util.Scanner;

public class Mayor_de_dos_numeros {
    public static void main(String args[]){
        Scanner tilin = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        String v1 = tilin.nextLine();
        int num1 = Integer.parseInt(v1);

        System.out.println("Ingrese otro numero:");
        String v2 = tilin.nextLine();
        int num2 = Integer.parseInt(v2);
        if (num2 < num1){
            System.out.println("El primero es mayor");
        } else if (num1 < num2) {
            System.out.println("El segundo es mayor");
        } else if (num1 == num2) {
            System.out.println("son iguales");
        }
    }
}