/**
 * Clase Ordenamientos
 * Contiene el objeto random que genera numeros alatorios y los metodos de ordenamiento bubblesort y qui¡icksort
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
 */
import java.util.Random;
public class MetodosSort {

    /**
       Metodo main donde se ejecutan los ordenamientos
       @param args los argumentos
       */
    public static void main(String[] args) {
        //metodo que genera numeros aleatoriamente
        Random rnd = new Random(); //objeto que crea numeros aleatorios
        int[] arr = new int[100000]; //primer arreglo con 100000 elementos
        int[] arr2 = new int[100000]; //segundo arreglo con 100000 elementos

        //Ordenamiento por BubbleSort
        System.out.println("numeros aleatorios: ");
        for (int i = 0; i < arr.length; i++) { //asignacion de los numeros aleatorios del primer arreglo
            arr[i] = rnd.nextInt(10000); //se define a longitud de los numeros aleatorios
        }
        for (int i = 0; i < arr.length; i++) { //se imprimen los valores aleatorios del primer arreglo
            System.out.print(arr[i] + ",");
        }
        System.out.println(" ");
        System.out.println("numeros ordenados de menor a mayor con BubbleSort: ");
        bubblesort(arr); //llamamos al metodo de ordenamiento bubblesort
        for (int i = 0; i < arr.length; i++) { //se imprimen los valores ordenados del primer arreglo
            System.out.print(arr[i] + ",");
        }
        //Ordenamiento por QuickSort
        System.out.println(" ");
        System.out.println("numeros aleatorios");
        for (int i = 0; i < arr2.length; i++) { //asignacion de los numeros aleatorios del segundo arreglo
            arr2[i] = rnd.nextInt(10000); //se define la longitud de los numeros aleatorios
        }
        for (int i = 0; i < arr.length; i++) { //se imprimen los valores aleatorios del segundo arreglo.
            System.out.print(arr2[i] + ",");
        }
        System.out.println(" ");
        System.out.println("numeros ordenados de menor a mayor con QuickSort: ");
        quicksort(arr2, 0, arr2.length - 1); //llamamos al metodo de ordenamiento Quicksort
        for (int i = 0; i < arr.length; i++) { //se imprimen los valores ordenados del segundo arreglo
            System.out.print(arr2[i] + ",");
        }

    }

    /**
       Metodo que permite ordenar un arreglo por Quicksort.
       @param arr2 segundo arreglo con numeros aleatorrios que se van a ordenar
       @param izq un indice a la izquierda del arreglo.
       @param der un indice a la derecha del arreglo.
       */
    public static void quicksort(int arr2[], int izq, int der) {

        int pivote = arr2[izq]; // el pivote va a ser el primer elemento
        int i = izq; // i realiza la busqueda de izquierda a derecha 
        int j = der; // j realiza la busqueda de derecha e izquierda
        int aux;

        while (i < j) { // mientras no se crucen las búsquedas                                  
            while (arr2[i] <= pivote && i < j) i++; // busca elementos mayores que el pivote
            while (arr2[j] > pivote) j--; // busca elementos menores que el pivote
            if (i < j) { // si no se han cruzado                      
                aux = arr2[i]; // los intercambia
                arr2[i] = arr2[j];
                arr2[j] = aux;
            }
        }

        arr2[izq] = arr2[j]; // se coloca el pivote en su lugar de forma que tendremos                                    
        arr2[j] = pivote; // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1)
            quicksort(arr2, izq, j - 1); // ordenamos subarray izquierdo
        if (j + 1 < der)
            quicksort(arr2, j + 1, der); // ordenamos subarray derecho

    }

    /**Metodo que ordena los valores de un arreglo por BubbleSort
     *@param arr primer arreglo con numeros aleatorios que se van a ordenar
     **/
    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) { //recorre todo el arreglo, hasta poner el mayor elemento al final
            for (int j = 0; j < arr.length - 1; j++) { //si un elemento es mayor que el siguiente, se intercambian
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }
}