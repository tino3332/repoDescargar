import java.util.Arrays;

public class ordenamientoPorInsercion {
    public static void main(String[] args){
        // creando array unidimensional de integers
        int []misNumeros = {8,7,9};
        /* Igualmente con strings seria: String []misNumeros = {"uno","dos","tres"};
        ahora, cuando se abren las llaves a la siguiente linea ya estamos creando un array bidimensional, ejemplo:

        String [][]={
          {"uno","dos","tres"},
          {"cuatro","cinco","seis"},
        }
       */
        ordenamiento.ordenamientoInsercion(misNumeros);
    }
    public static class ordenamiento{
        public static void ordenamientoInsercion(int [] A){
            //A.length devuelve la cantidad de elementos que tenga el array, util al usarlo para un metodo
            //en el que no sabemos que tan grande sera el array.
            for(int i=1;i<A.length;i++){
                int valor = A[i];
                int j=i-1;
                while(j>=0 && A[j]>valor){
                    A[j+1] = A[j];
                    j--;
                }
                A[j+1]=valor;
            }
            // este print los muestra como string, si lo necesitaramos en integer seria mostrarlos con un for y la posicion del array.
            //System.out.println(Arrays.toString(A));

            //ahora con bucle para forma ascendiente
            System.out.println("forma ascendiente");
            for(int i=0;i<A.length;i++){
                System.out.print(A[i]+" ");
            }

            //ahora de forma descendiente
            System.out.println("\nforma descendiente");
            for(int i=A.length-1;i>=0;i--){
                System.out.print(A[i]+" ");
            }
        }
    }
}
