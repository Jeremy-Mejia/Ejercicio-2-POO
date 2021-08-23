/*************************************************************************************************************
Familia.java
Autor: Jeremy Mejía
Fecha de Creación: Agosto de 2021
Última Modificación: Agosto de 2021

Ejercicio No. 2 Hogares temporales para canes
Familia
*************************************************************************************************************/

/*************************************************************************************************************
Librerias
*************************************************************************************************************/
import java.util.Scanner;


/*************************************************************************************************************
Clase Familia
*************************************************************************************************************/

class Familia {

/*************************************************************************************************************
Propiedades
*************************************************************************************************************/

    Scanner sc = new Scanner(System.in);

/*************************************************************************************************************
Variables globales
*************************************************************************************************************/
   
    private String apellido = "";
    private int integrantes = 0;
    private int edad = 0;
    private int mascota = 0;
    private int cantMascota = 0;
    private String Datofam = "";
    private int Cant = 4;
    private int cant = 0;
    private int elec = 0;
    
    

/*************************************************************************************************************
Arrays 
*************************************************************************************************************/



    public void buscarFam(){
        System.out.println("Ingresa el nombre de la familia que deseas  buscar: \n");
        String[] apellido = new String[1];
        for(int i=0; i<1; i++){
            //System.out.println((i+1) + ". " + apellido);
            apellido[i] = sc.next();
        }

        System.out.println("\nListado de familias: \n");
        for(int i=0; i<1; i++){
            System.out.println(apellido[i] + "");
        }

    }
    


/*************************************************************************************************************
Métodos
*************************************************************************************************************/

    public void agregarFam(){

        System.out.println("\nEscribe el apellido de tu familia:");
        apellido = sc.nextLine();

        System.out.println("\nEscribe la cantidad de integrantes de la familia: (En números)");
        integrantes = sc.nextInt();
        
       do{
            System.out.println("\n¿Hay niños menores de 10 años en tu familia? \n" + 
            "1. Si\n" + 
            "2. No\n" +
            "3. No hay niños\n" +
            "Elige un número:");
            edad = sc.nextInt();

            if (edad > 3 || edad < 1){
                System.out.println("\nAlgo salio mal intenta de nuevo");
            }

       } while (edad > 3 || edad < 1);
         
        if (edad == 1){
            System.out.println("\n*Solo podemos darte perros pequeños o labradores*");
        }
        else if (edad == 2){
            System.out.println("\n*Solo podemos darte perros pequeños o medianos*");
        }
        else if (edad == 3){
            System.out.println("\n*Podemos darte cualquier tipo de perro*");
        }

        do{
            System.out.println("\n¿Tienen mascotas en tu familia? \n" + 
            "1. Si\n" +
            "2. No\n" +
            "Elige un número:");
            mascota = sc.nextInt();
            
            if (mascota > 2 || mascota < 1){
                System.out.println("\nAlgo salio mal intenta de nuevo");
            }

        } while (mascota > 2 || mascota < 1);

        if (mascota == 1){
            System.out.println("\n¿Cuántas mascotas tienes? (En números)");
            cantMascota = sc.nextInt();
            System.out.println("\nGracias por brindarnos tus datos, en un momento te asiganaremos un perro\n"); 
        }
        else if (mascota == 2){
            System.out.println("\nGracias por brindarnos tus datos, en un momento te asiganaremos un perro\n");
        }
        cant = Cant - cantMascota; 
           
    
    }
    public void detallesFam(){
        System.out.println("En resumen: \n" +
        "La familia " + apellido + " cuenta con " + integrantes + " integrantes en su familia. ");

        if (edad == 1){
            System.out.println("*Como hay niños menores de 10 años, solo podemos darle perros pequeños o labradores*");
        }
        else if (edad == 2){
            System.out.println("*Como hay niños mayores de 10 años, solo podemos darle perros pequeños o medianos*");
        }
        else if (edad == 3){
            System.out.println("*Como no hay niños, podemos darle cualquier tipo de perro*");
        }
        if (mascota == 1 && cantMascota <  4){
            System.out.println("Podemos darle " + cant + " Perro/s ya que cuenta con " + cantMascota + " perro/s\n ");
        }
        else if (mascota == 1 && cantMascota >= 4){
            System.out.println("No podemos darte más perros\n ");
        }
        else if (mascota == 2){
            System.out.println("Como no tienes mascotas, podemos darte hasta 4 perros\n");
        }

    }
    public void Mascota(){
        
        if (edad == 1 && cantMascota < 4){
            Perro Pe = new Perro();
            Pe.asignarPerroPequeño();
            System.out.println("Elige " + cant + " Perro/s, uno a la vez \n" +
            "Elige un número: ");
            elec = sc.nextInt();

            System.out.println("¿Tienes la capacidad se asignarte otro? \n" +
            "1. Si\n" +
            "2. No" );
            elec = sc.nextInt();

            if (elec == 1){
                Perro e = new Perro();
                e.asignarPerroPequeño();
                System.out.println("Elige un número: ");
                elec = sc.nextInt();  
                System.out.println("\nGracias\n");  
            }
            if (elec > 10 || elec < 1){
                System.out.println("\nAlgo salio mal, intenta de nuevo\n");
            }
        }

        
        
        
        else if (edad == 2 && cantMascota < 4){
            Perro Pe = new Perro();
            Pe.asignarPerroMediano();
            System.out.println("Elige " + cant + " Perro/s a la vez\n" +
            "Elige un número: ");
            elec = sc.nextInt();
            if (cant < 5){
                System.out.println("¿Tienes la capacidad se asignarte otro? \n" +
                "1. Si\n" +
                "2. No" );
                elec = sc.nextInt();
            }

            if (elec == 1 && cant < 5){
                System.out.println("¿Tienes la capacidad se asignarte otro? \n" +
                "1. Si\n" +
                "2. No" );
                elec = sc.nextInt();

                Perro e = new Perro();
                e.asignarPerroMediano();
                System.out.println("Elige un número: ");
                elec = sc.nextInt();  
                System.out.println("\nGracias\n");  
            }

            if (elec > 20 || elec < 1){
                System.out.println("\nAlgo salio mal, intenta de nuevo\n");
            }
        }

  
        
        
        else if (edad == 3 && cantMascota < 4){
            Perro Pe = new Perro();
            Pe.asignarPerroPeligroso();
            System.out.println("Elige " + cant + " Perro/s a la vez\n" +
            "Elige un número: ");
            elec = sc.nextInt();

            System.out.println("¿Tienes la capacidad se asignarte otro? \n" +
            "1. Si\n" +
            "2. No" );
            elec = sc.nextInt();

            if (elec == 1){
                Perro e = new Perro();
                e.asignarPerroPeligroso();
                System.out.println("Elige un número: ");
                elec = sc.nextInt();  
                System.out.println("\nGracias\n");  
            }

            if (elec > 30 || elec < 1){
                System.out.println("\nAlgo salio mal, intenta de nuevo\n");
            }
        }


        if (edad == 1 && cantMascota >= 4){
            System.out.println("No podemos mostrarte la lista de perros pequeños porque ya tienes 4 o más de 4\n" +
            "Gracias por ayudarnos, nos vemos\n");
        }
        else if (edad == 2 && cantMascota >= 4){
            System.out.println("No podemos mostrarte la lista de perros pequeños y medianos porque ya tienes 4 o más de 4\n" +
            "Gracias por ayudarnos, nos vemos\n");
        }
        else if (edad == 3 && cantMascota >= 4){
            System.out.println("No podemos mostrarte la lista de perros pequeños, medianos y grandes porque ya tienes 4 o más de 4\n" +
            "Gracias por ayudarnos, nos vemos\n");
        }
        
    }

    
}


