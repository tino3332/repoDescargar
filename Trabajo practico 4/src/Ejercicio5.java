import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[][]maquinaExpendedora = {
                {"KitKat","32","10"},
                {"Chicles","2","50"},
                {"Caramelos de menta","2","50"},
                {"Huevo Kinder","25","10"},
                {"Chetoos","30","10"},
                {"Twix","26","10"},
                {"M&M's","35","10"},
                {"Papas Lays","40","20"},
                {"Milkybar","30","10"},
                {"Alfajor Tofi","20","15"},
                {"Lata Coca","50","20"},
                {"Chitos","45","10"},

        };
        /*  switch-case dentro de un while(true), al usar break salimos del switch-case pero volvemos al comienzo del while otra vez, en cambio
          si utilizamos return no solo salimos del switch-case sino que tambiendel while(true).
         */
        while(true) {
            System.out.println("**** Inicio ****");
            System.out.println("1. Pedir golosina");
            System.out.println("2. Mostrar golosinas");
            System.out.println("3. Rellenar golosinas");
            System.out.println("4. Apagar maquina");
            String userMenu = sc.nextLine();
            int restaStock = 0;
            boolean stockReview = true;
            switch (userMenu){
                case "1": {
                        System.out.println("1. KitKat\n2. Chicles\n3. Caramelos de mente\n4. Huevo Kinder\n5. Cheetos\n6. Twix\n7. M&M's\n8. Papas Lays\n9. Milkybar\n10. Alfajor Tofi\n11. Lata Coca\n12. Chitos");
                        System.out.println("Seleccione la golosina");
                        int userSelect = sc.nextInt() - 1;
                        if(Integer.parseInt(maquinaExpendedora[userSelect][2])<=0) {
                            stockReview=false;
                        }

                            if(stockReview=true) {
                                //mostrando el stock antes de la extraccion
                                System.out.println("stock antes de la extraccion: " + maquinaExpendedora[userSelect][2]);
                                restaStock = Integer.parseInt(maquinaExpendedora[userSelect][2]) - 1;
                                maquinaExpendedora[userSelect][2] = String.valueOf(restaStock);
                                //revision del stock
                                System.out.println("stock luego de la extraccion: " + maquinaExpendedora[userSelect][2]);
                            }else{
                                System.out.println("No hay stock de ese producto, elija otro porfavor.");
                            }
                    break;
                }
                //lo hice arriba por no leer asique basicamente voy a copiar y pegar, despus de eso lo modifico
                case "2": {
                    System.out.println("**** Stock actual de los productos ****");
                    System.out.println("KitKat: "+maquinaExpendedora[0][2]+"\nChicles: "+maquinaExpendedora[0][2]+"\n3Caramelos de mente: "+maquinaExpendedora[0][2]+"\nHuevo Kinder: "+maquinaExpendedora[0][2]+"\nCheetos: "+maquinaExpendedora[0][2]+"\nTwix: "+maquinaExpendedora[0][2]+"\nM&M's: "+maquinaExpendedora[0][2]+"\nPapas Lays: "+maquinaExpendedora[0][2]+"\nMilkybar: "+maquinaExpendedora[0][2]+"\nAlfajor Tofi: "+maquinaExpendedora[0][2]+"\nLata Coca: "+maquinaExpendedora[0][2]+"\nChitos: "+maquinaExpendedora[0][2]+"");
                    break;
                }
                case "3": {

                    break;
                }
                case "4": {
                    System.out.println("Saliendo...");
                    return;
                }
                default: {
                    System.out.println("Opcion invalida, porfavor intente de nuevo.");
                    break;
                }
            }
        }
    }
}
