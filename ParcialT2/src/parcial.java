import java.util.Scanner;
import java.util.Arrays;

public class parcial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas y la cantidad de columnas del array");
        System.out.print("Filas: ");
        int userFilas = sc.nextInt();
        System.out.println("Columnas: ");
        int userColumnas = sc.nextInt();
        if(userFilas>=3){
            if(userColumnas>=2){
                System.out.println("valido");
            }else{
                System.out.println("cantidad no valida");
                return;
            }
        }else{
            System.out.println("cantidad no valida");
            return;
        }
        double [][]inception = new double[userFilas][userColumnas];
        metodo.metodoDream(inception,userFilas,userColumnas);
    }

    public class metodo{
        public static void metodoDream(double [][]A,int filas,int columnas){
            //introduciendo valores de filas y columnas
            Scanner sc=new Scanner(System.in);
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print("introduzca valor de fila " + i + " Columna " + j + ": ");
                    A[i][j] = sc.nextDouble();
                }
            }
            //mostrando valores del array
            System.out.println("este es su array:");
            for (double[] randomName : A) {
                System.out.println(Arrays.toString(randomName)
                        .replace(",", " |")
                        .replace("[", "[ ")
                        .replace("]", " ]"));
            }

            //generando matriz de suma de costado
            double [][]ArrayDimensional = new double[filas][1];
            int []posicionesOriginales = new int[filas];
            for(int i=0;i<filas;i++){
                double suma = 0;
                for(int j=0;j<A[i].length;j++){
                    suma+= A[i][j];
                }
                ArrayDimensional[i][0]=suma;
                posicionesOriginales[i]=i;
            }
            //mostrando la suma
            System.out.println("array de suma:");
            for (double[] randomName : ArrayDimensional) {
                System.out.println(Arrays.toString(randomName)
                        .replace(",", " |")
                        .replace("[", "[ ")
                        .replace("]", " ]"));
            }

            //ordenando (> = ordenado ascendente, < = ordenado descendiente)
            int n = ArrayDimensional.length;
            for (int i = 1; i < n; ++i) {
                double key = ArrayDimensional[i][0];
                int j = i - 1;

                while (j >= 0 && ArrayDimensional[j][0] > key) {
                    ArrayDimensional[j + 1] = new double[]{ArrayDimensional[j][0]};
                    j = j - 1;
                }
                ArrayDimensional[j + 1][0] = key;
            }
            //pasando valores ordenados a array noOcurrencia
            double [][]noOcurrencia=new double[filas][2];
            for(int i=0;i<filas;i++){
                noOcurrencia[i][0] = ArrayDimensional[i][0];
            }
            for(int i=0;i<filas;i++){
                noOcurrencia[i][1]=posicionesOriginales[i]+1;
            }
            //mostrando valores sumados y posiciones
            System.out.println("***PUNTO 5***\n");
            for (double[] randomName : noOcurrencia) {
                System.out.println(Arrays.toString(randomName)
                        .replace(",", " |")
                        .replace("[", "[ ")
                        .replace("]", " ]"));
            }
            //rellenando suma final de los numeros previamente sumados
            double sumaFinal=0;
            for(int i=0;i<filas;i++){
                sumaFinal+=noOcurrencia[i][0];
            }
            System.out.println("La suma final es: "+sumaFinal);
        }
    }
}
