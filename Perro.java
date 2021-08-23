/*************************************************************************************************************
Perro.java
Autor: Jeremy Mejía
Fecha de Creación: Agosto de 2021
Última Modificación: Agosto de 2021

Ejercicio No. 2 Hogares temporales para canes
Perros
*************************************************************************************************************/

/*************************************************************************************************************
Librerías
*************************************************************************************************************/
import java.util.Scanner;

/*************************************************************************************************************
Clase Perro
*************************************************************************************************************/

class Perro {
/*************************************************************************************************************
Propiedades
*************************************************************************************************************/

    Scanner  s = new Scanner(System.in);

/*************************************************************************************************************
Variables globales
*************************************************************************************************************/
   
    private String nombrePerro = "";
    private int tamano = 0;
    private String Raza = "";
    private int edadProxima = 0;
    private String estadoSalud = "";
    private String color = "";

/*************************************************************************************************************
Métodos
*************************************************************************************************************/
   public void agregarPerr(){
       
        System.out.println("\nEscribe el nombre del perro:");
        nombrePerro = s.nextLine();

        do{
            System.out.println("\n¿Cuál es el tamaño del perro?\n" +
            "1. Pequeño\n" +
            "2. Mediano\n" +
            "3. Grande\n" + 
            "Elige un número:");
            tamano = s.nextInt();

            if (tamano > 3 || tamano < 1){
                System.out.println("\nAlgo salio mal intenta de nuevo");
            }
        }
        while(tamano > 3 || tamano < 1); 

        System.out.println("\nEscribe la raza del perro:");
        Raza = s.nextLine();

        System.out.println("\nEscribe la edad próxima del perro:");
        edadProxima = s.nextInt();

        System.out.println("\nEscribe el estado de salud del perro:");
        estadoSalud = s.nextLine();

        System.out.println("\nEscribe el color del perro:");
        color = s.nextLine();

        System.out.println("\nGracias por ingresar los datos del nuevo perro\n");


    }
    
    public void asignarPerroPequeño(){

        System.out.println("Lista de perros pequeños\n");
        String [] lista1 = { "Chihuahua", "Bichón Frisé", "Bichón Maltés", "Yorkshine Terrier", 
        "Shih Tzu", "Caniche", "Pomerania", "Australian Silky Terrier", "Papillón", "Pequinés" };

        for(int i=0; i<10; i++){
            System.out.println((i+1)+ ". " + lista1[i]);
        }

    }

    public void asignarPerroMediano(){

        System.out.println("\nLista de perros pequeños y medianos\n");
        String [] lista2 = { "Chihuahua", "Bichón Frisé", "Bichón Maltés", "Yorkshine Terrier", 
        "Shih Tzu", "Caniche", "Pomerania", "Australian Silky Terrier", "Papillón", "Pequinés", 
        "Airedale Terrier", "Basset Hound", "Beagle", "Border Collie", 
        "Braco Alemán", "Cazador de Mapaches", "Chow Chow", 
        "Cocker Spaniel", "Cocker Spaniel Inglés", "Dálmata" };

        for(int i=0; i<20; i++){
            System.out.println((i+1)+ ". " + lista2[i]);
        }

    }

    public void asignarPerroPeligroso(){

        System.out.println("\nLista de perros pequeños, medianos, grandes y peligrosos\n");
        String [] lista3 = { "Chihuahua", "Bichón Frisé", "Bichón Maltés", "Yorkshine Terrier", 
        "Shih Tzu", "Caniche", "Pomerania", "Australian Silky Terrier", "Papillón", "Pequinés",
        "Airedale Terrier", "Basset Hound", "Beagle", "Border Collie", 
        "Braco Alemán", "Cazador de Mapaches", "Chow Chow", 
        "Cocker Spaniel", "Cocker Spaniel Inglés", "Dálmata",
        "Pit Bull Terrier", "American Staffordshire", "Tosa Inu", "Dogo Argentino", 
        "Dogo Guatemalteco", "Fila Brasileño", "Presa Canario", "Dóberman", "Gran Perro Japonés",
        "Mastín Napolitano"};

        for(int i=0; i<30; i++){
            System.out.println((i+1)+ ". " + lista3[i]);
        }

    }



    
    

    
}
