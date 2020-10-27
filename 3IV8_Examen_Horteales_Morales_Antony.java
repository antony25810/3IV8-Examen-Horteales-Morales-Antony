import java.util.Scanner;
//Importa el objeto Scanner

class pokedex{

    public static void main(String[] args);
    Scanner entrada = new Scanner (System.in);

    int opcion, id, fuerza, defensa, vida, ataque1, ataque2, opcion2, pelea1, pelea2, pelea3;
    String pokemon1, pokemon2;
    char letra;
   
    do{

        System.out.println("3IV8_Horteales_Morales_Antony");

        System.out.println("Bienvenido a la pokedex");
        System.out.println("Elige una opción: ");
        opcion = entrada.nextInt();
        System.out.println("1.- Charmander");
        System.out.println("2.- Bulbasoar");
        System.out.println("3.- Squirtle");
        System.out.println("4.- Batalla Pokemon");
        System.out.println("5.- Salir");

    switch(opción){
        case 1:
            do{
                System.out.println("Charmander");
                id = 004
                System.out.println("id: " + id);
                fuerza = 4
                System.out.println("Fuerza: " + fuerza);
                defensa = 3
                System.out.println("Defensa: " + defensa);
                vida = 3
                System.out.println("Vida:" + vida);
                System.out.println("Ataque especial: ascuas");
                System.out.println("Ataque secundario: arañazo");

                System.out.println("¿Desea regresar al menu principal? presione la letra s");
                letra = entrada.next().charAt(0);
            }while(letra == 's');
        break;

        case 2:
            do{
                System.out.println("Bulbasoar");
                id = 001
                System.out.println("id: " + id);
                fuerza = 3
                System.out.println("Fuerza: " + fuerza);
                defensa = 3
                System.out.println("Defensa: " + defensa);
                vida = 3
                System.out.println("Vida:" + vida);
                System.out.println("Ataque especial: drenadoras");
                System.out.println("Ataque secundario: Latigazo");

                System.out.println("¿Desea regresar al menu principal? presione la letra s");
                letra = entrada.next().charAt(0);
            }while(letra == 's');
         break;
        
        case 3:
        
            System.out.println("Squirtle");
                id = 007
                System.out.println("id: " + id);
                fuerza = 3
                System.out.println("Fuerza: " + fuerza);
                defensa = 4
                System.out.println("Defensa: " + defensa);
                vida = 3
                System.out.println("Vida:" + vida);
                System.out.println("Ataque especial: Burbuja");
                System.out.println("Ataque secundario: Placaje");

                System.out.println("¿Desea regresar al menu principal? presione la letra s");
                letra = entrada.next().charAt(0);
            }while(letra == 's');
         break;

        case 4:
            do{
            System.out.println("Elija a su pokemon");
            opción2 = entrada.nextInt();
            System.out.println("1.- Bulbasour"); 
            System.out.println("2.- Charmander"); 
            System.out.println("3.- Squirtle");
            
            switch(opción2){

                case1:

                     System.out.println("Elija al rival");
                     pelea1 = entrada.nextInt();
                     System.out.println("1.- Charmander"); 
                     System.out.println("2.- Squirtle");

                     switch(pelea1){

                         System.out.println("Bulbasoar yo te elijo");
                         System.out.println("Fuerza:3");
                         System.out.println("Defensa:3");
                        

                         
                     }

            } 

    }

}
