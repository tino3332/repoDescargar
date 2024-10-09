import java.util.Scanner;
import java.util.Arrays;

public class parcial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de filas y columnas (el valor minimo es 3x2)");
        System.out.print("filas: ");
        int nUserFilas = sc.nextInt();
        System.out.print("columnas: ");
        int nUserColum = sc.nextInt();
        if (nUserFilas >= 3) {
            if (nUserColum >= 2) {
                System.out.println("valido");
            } else {
                System.out.println("Numero no valido");
                return;
            }
        } else {
            System.out.println("Numero no valido");
            return;
        }
        double[][] inception = new double[nUserFilas][nUserColum];
        relleno.rellenarColumnas(inception, nUserFilas, nUserColum);
    }

    //metodo que rellena y muestra por pantalla un array entregado por parametro con double
    public static class relleno {
        public static void rellenarColumnas(double[][] A, int filas, int columnas) {
            Scanner sc = new Scanner(System.in);
            //rellenando
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print("introduzca valor de fila " + i + " Columna " + j + ": ");
                    A[i][j] = sc.nextDouble();
                }
            }
            //mostrando lo rellenado (mostrando bidimensional)
            for (double[] randomName : A) {
                System.out.println(Arrays.toString(randomName)
                        .replace(",", " |")
                        .replace("[", "[ ")
                        .replace("]", " ]"));
            }
            //sumando
            double []ArrayDimensional = new double[filas];
            for(int i=0;i<filas;i++){
                double suma = 0;
                for(int j=0;j<columnas;j++){
                    suma+= A[i][j];
                }
                ArrayDimensional[i]=suma;
            }
            //mostrando lo sumado (mostrando una dimension)
            System.out.println("***SUMA DE LAS FILAS***\n");
                System.out.println(Arrays.toString(ArrayDimensional)
                        .replace(",", " |")
                        .replace("[", "[ ")
                        .replace("]", " ]"));

            int n = ArrayDimensional.length;
            for (int i = 1; i < n; ++i) {
                double key = ArrayDimensional[i];
                int j = i - 1;

                while (j >= 0 && ArrayDimensional[j] < key) {
                    ArrayDimensional[j + 1] = ArrayDimensional[j];
                    j = j - 1;
                }
                ArrayDimensional[j + 1] = key;
            }

            double [][]ocurrenciaNegativa= new double[filas][2];
            for(int i=0;i<filas;i++){
                ocurrenciaNegativa[i][0] = ArrayDimensional[i];
            }

            System.out.println("***PUNTO 5***\n");
            for (double[] randomName : ocurrenciaNegativa) {
                System.out.println(Arrays.toString(randomName)
                        .replace(",", " |")
                        .replace("[", "[ ")
                        .replace("]", " ]"));
            }

        }
    }
}
