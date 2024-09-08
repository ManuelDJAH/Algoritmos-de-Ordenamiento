import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random numerorandom = new Random();
        OrdenamientoDirecto ordenDirecto = new OrdenamientoDirecto();
        OrdenamientoIndirecto ordenIndirecto = new OrdenamientoIndirecto();

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numerorandom.nextInt(1000);
        }

        System.out.println("Arreglo desordenado: " + Arrays.toString(arr));

        System.out.println("Seleccione el tipo de ordenamiento:");
        System.out.println("1. Seleccion");
        System.out.println("2. Insercion");
        System.out.println("3. Shell");
        System.out.println("4. Quicksort");
        int opcion = s.nextInt();

        System.out.println("Seleccione el orden:");
        System.out.println("1. Ascendente");
        System.out.println("2. Descendente");
        int orden = s.nextInt();

        long tiempoInicio = System.nanoTime();

        switch (opcion) {
            case 1:
                if (orden == 1) {
                    ordenDirecto.seleccionAscendente(arr);
                } else {
                    ordenDirecto.seleccionDescendente(arr);
                }
                break;
            case 2:
                if (orden == 1) {
                    ordenDirecto.insercionAscendente(arr);
                } else {
                    ordenDirecto.insercionDescendente(arr);
                }
                break;
            case 3:
                if (orden == 1) {
                    ordenIndirecto.shellAscendente(arr);
                } else {
                    ordenIndirecto.shellDescendente(arr);
                }
                break;
            case 4:
                if (orden == 1) {
                    ordenIndirecto.quicksortAscendente(arr, 0, arr.length - 1);
                } else {
                    ordenIndirecto.quicksortDescendente(arr, 0, arr.length - 1);
                }
                break;
            default:
                System.out.println("Seleccione una opcion valida.");
                return;
        }

        long tiempoFinal = System.nanoTime();

        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));
        System.out.println("Tiempo de ejecucion: " + (tiempoFinal - tiempoInicio) + " nanosegundos");
    }
}
