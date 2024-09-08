import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Generando arreglo de números aleatorios...");

        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(1000);
        }

        System.out.println("Arreglo desordenado: ");
        printArray(array);

        //Menu
        System.out.println("Seleccione un algoritmo de ordenamiento:");
        System.out.println("1. Selección");
        System.out.println("2. Inserción");
        System.out.println("3. Shell");
        System.out.println("4. Quicksort");
        int choice = scanner.nextInt();

        // Menu 2
        System.out.println("Seleccione el orden:");
        System.out.println("1. Ascendente");
        System.out.println("2. Descendente");
        int order = scanner.nextInt();

        long startTime, endTime;
        switch (choice) {
            case 1:
                OrdenamientoDirecto ordenDirecto = new OrdenamientoDirecto();
                if (order == 1) {
                    startTime = System.nanoTime();
                    ordenDirecto.seleccionAsc(array);
                    endTime = System.nanoTime();
                } else {
                    startTime = System.nanoTime();
                    ordenDirecto.seleccionDesc(array);
                    endTime = System.nanoTime();
                }
                break;
            case 2:
                OrdenamientoDirecto ordenDirecto2 = new OrdenamientoDirecto();
                if (order == 1) {
                    startTime = System.nanoTime();
                    ordenDirecto2.insercionAsc(array);
                    endTime = System.nanoTime();
                } else {
                    startTime = System.nanoTime();
                    ordenDirecto2.insercionDesc(array);
                    endTime = System.nanoTime();
                }
                break;
            case 3:
                OrdenamientoIndirecto ordenIndirecto = new OrdenamientoIndirecto();
                if (order == 1) {
                    startTime = System.nanoTime();
                    ordenIndirecto.shellAsc(array);
                    endTime = System.nanoTime();
                } else {
                    startTime = System.nanoTime();
                    ordenIndirecto.shellDesc(array);
                    endTime = System.nanoTime();
                }
                break;
            case 4:
                OrdenamientoIndirecto ordenIndirecto2 = new OrdenamientoIndirecto();
                if (order == 1) {
                    startTime = System.nanoTime();
                    ordenIndirecto2.quicksortAsc(array, 0, array.length - 1);
                    endTime = System.nanoTime();
                } else {
                    startTime = System.nanoTime();
                    ordenIndirecto2.quicksortDesc(array, 0, array.length - 1);
                    endTime = System.nanoTime();
                }
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        System.out.println("Arreglo ordenado: ");
        printArray(array);
        
        System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " nanosegundos");
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
