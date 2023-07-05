import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
/*
        boolean verificar = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese un número real: ");
                double numero = sc.nextDouble();
                System.out.println("El número ingresado es: " + numero);
                verificar=false;
            } catch (InputMismatchException e) {
                System.out.println("El número ingresado no poee el formato correcto ");
                //e.printStackTrace();
            }
        }while (verificar);
 */
        boolean verificar = true;

       do {
           try {
               Scanner sc = new Scanner(System.in);
               System.out.println("Ingrese el número de elementos que desea ingresar: ");
               int m = sc.nextInt();
               int[] arreglo = new int[10];
               for (int i = 0; i < m; i++) {
                   arreglo[i] = i;
                   System.out.println(arreglo[i]);
               }
               verificar=false;
           } catch (IndexOutOfBoundsException e) {
               System.out.println("Sobrepaso el limite de elementos en el arreglo");
           } catch (InputMismatchException e) {
               System.out.println("El númer ingresado no es un entero");
           } finally {
               System.out.println("se termina el programa");
           }
       }while (verificar);


    }
}