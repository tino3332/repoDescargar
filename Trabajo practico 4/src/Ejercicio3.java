import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero mayor o igual a 3 y menor o igual que 10");
        int num = sc.nextInt();
        if(num <= 10){
            if(num >= 3){
                int [][]vector= new int[num][num];
                for(int i =0;i < num; i++){
                    for(int j=0;j<num;j++){
                        System.out.println("introduzca valor de fila "+ i+" Columna "+j);
                        vector[i][j] = sc.nextInt();
                    }
                }
                for(int i=0;i<num;i++){
                    for(int j=0;j<num;j++){
                        System.out.println("mostrando valor de fila "+ i+" Columna "+j+" = "+ vector[i][j]);
                    }
                }
                int []vectorSuma = new int[num];
                for(int j=0;j<num;j++){
                    int suma = 0;
                    for(int i=0;i<num;i++){
                        suma+= vector[i][j];
                    }
                    vectorSuma[j]=suma;
                }
                for(int i=0;i<num;i++){
                    System.out.println("Resultado: "+vectorSuma[i]);
                }

            }else{
                System.out.println("El numero es menor o igual que 10 pero no mayor o igual que 3");
            }
        }else{
            System.out.println("El numero no es menor o igual que 10");
        }

    }
}
