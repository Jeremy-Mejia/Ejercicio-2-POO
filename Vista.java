/*************************************************************************************************************
Vista.java
Autor: Jeremy Mejía
Fecha de Creación: Agosto de 2021
Última Modificación: Agosto de 2021

Ejercicio No. 2 Hogares temporales para canes
Vista
*************************************************************************************************************/

/*************************************************************************************************************
Librerías
*************************************************************************************************************/

import java.util.Scanner;

/*************************************************************************************************************
Clase Vista
*************************************************************************************************************/
class Vista {

/*************************************************************************************************************
Propiedades
*************************************************************************************************************/

    Scanner scan = new Scanner(System.in);
/*************************************************************************************************************
Variables globales
*************************************************************************************************************/
int parte = 0;
int opcion = 0;

/*************************************************************************************************************
Constructor
*************************************************************************************************************/

    public void vista(){

        do{
            System.out.println(
                "\n******************** Bienvenido al programa *Hogares Temporales para Canes (HTC)* ******************** \n" +
                "Ha habido un desastre natural en la ciudad y muchos perritos han quedado sin hogar en las calles \n" +
                "\nCada familia puede tener como máximo 4 perros" +
                "\n¿Te gustaria ser parte de esta buena causa?\n" +
                "Elige una opción: \n" +
                "1. Si \n" +
                "2. No" );
                parte = scan.nextInt();

                if (parte > 2 || parte < 1){
                    System.out.println("\nHaz marcado una opción inválida, intenta de nuevo");
                }   

        }while(parte > 2 || parte < 1);

        if (parte == 1){
            do{
                System.out.println(
                    "\nElige una opción: \n" +
                    "1. Nueva familia \n" +
                    "2. Familia existente \n" +
                    "3. Agregar un nuevo perro \n" +
                    "4. Asignar perro a familia \n" +
                    "5. Salir");
                    opcion = scan.nextInt();
    
                    if (opcion > 5 || opcion < 1){
                        System.out.println("\nHaz marcado una opción inválida, intenta de nuevo");
                    }   
            }
            while(opcion > 5 || opcion < 1); 
    
            if (opcion == 1){
                Perrera per = new Perrera();
                per.AgregarFamilia();


            }
            else if (opcion == 2){
                Perrera per = new Perrera();
                per.BuscarFamilia();
            }
            else if (opcion == 3){
                Perrera per = new Perrera();
                per.AgregarPerro();
            }
            else if (opcion == 4){
                Perrera per = new Perrera();
                per.AsignarPerro();
            }
            else if (opcion == 5){
                System.out.println("Gracias por ayudarnos\n");
            }
            
        }
        else if (parte == 2){
            System.out.println("Nos vemos pronto");
        }
    }
        
}
