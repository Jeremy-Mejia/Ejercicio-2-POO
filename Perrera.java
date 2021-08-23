/*************************************************************************************************************
Perrera.java
Autor: Jeremy Mejía
Fecha de Creación: Agosto de 2021
Última Modificación: Agosto de 2021

Ejercicio No. 2 Hogares temporales para canes
Perrera
*************************************************************************************************************/

/*************************************************************************************************************
Librerías
*************************************************************************************************************/

import java.util.Scanner;

/*************************************************************************************************************
Clase Perrera
*************************************************************************************************************/

class Perrera {

/*************************************************************************************************************
Propiedades 
*************************************************************************************************************/

    Scanner sca = new Scanner(System.in);

/*************************************************************************************************************
Variables globales
*************************************************************************************************************/

    private int sel = 0;

/*************************************************************************************************************
Métodos
*************************************************************************************************************/


    public void AgregarPerro(){
        Perro perr = new Perro();
        perr.agregarPerr();

    }

    public void AgregarFamilia(){
        Familia fam = new Familia();
        fam.agregarFam();
        fam.detallesFam();
        fam.Mascota();
    }

    public void BuscarPerro(){
        
    }

    public void BuscarFamilia(){
        Familia fam = new Familia();
        fam.buscarFam();
        
    }

    public void AsignarPerro(){
        
        do{
            System.out.println("\nMostraremos una lista de las familias ya inscritas:\n");
            String [] lista = { "Mejia", "Morales", "Portela\n"};
            for(int i=0; i<3; i++){
                System.out.println((i+1)+ ". " + lista[i]);
            }
            System.out.println("Elige a que familia le asignarás un perro");
            sel = sca.nextInt();

            if (sel > 3 || sel < 1){
                System.out.println("\nHaz marcado una opción inválida, intenta de nuevo\n");
            }
       
            if (sel == 1){
                System.out.println("\nA la familia " + lista[0] + " se le ha asigando un perro pequeño" +
                " ya que tienen niños menores de 10 años");
            }
            else if (sel == 2){
                System.out.println("\nA la familia " + lista[1] + " se le ha asigando un perro mediano" +
                " ya que tienen niños mayores a 10 años");
            }
            else if (sel == 3){
                System.out.println("\nA la familia " + lista[2] + " se le ha asigando un perro grande" +
                " ya que no tienen niños");
            }
        }while(sel > 3 || sel < 1);
        
    }

}
