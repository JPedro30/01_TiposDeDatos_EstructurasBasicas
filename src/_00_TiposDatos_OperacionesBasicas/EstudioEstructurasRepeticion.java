package _00_TiposDatos_OperacionesBasicas;

import java.util.Scanner;

public class EstudioEstructurasRepeticion {

    @SuppressWarnings("resource")
    public EstudioEstructurasRepeticion(){

        System.out.println("Estudio de Estructuras de Repetición");

        // ESTUDIO FOR //

        /* El bucle for tiene tres partes, una variable que va a servir de contador y la tenemos que inicializar, luego la condicion de
         * salida (siempre tiene que existir) y por ultimo el contador. */

        /* EL BUCLE PUEDE HACER FALTA PARA CONTROLAR LAS VUELTAS QUE DAMOS O PARA CREAR UNA VARIABLE Y USARLA */

            System.out.println("Cuenta hacia adelante :");
            for (int i = 1; i < 11 ; i++) { // CUENTA HACIA ADELANTE
                System.out.println(i); // Este bucle ha dado 10 vueltas y hemos usado variable i
            }
            System.out.println("Cuenta hacia atras :");
            for (int i = -1; i > -11 ; i--) { // CUENTA HACIA ATRAS
                System.out.println(i);
            }
            System.out.println("Generacion numeros pares :");
           for (int i = 0; i < 11 ; i+=2) { // VOY A GENERAR NUMEROS PARES
                System.out.println(i); 
            }
            /*
            for (int i = 0; i > -11 ; i+=2) { // VOY A GENERAR UN BUCLE INFINITO
                System.out.println(i); 
            }
            */
        
        // ESTUDIO DO {} WHILE() //

        /* El bucle do while se ejecuta al menos una vez, se hace el do, luego se analiza el
         * while, si es verdadera la condición entonces se vuelve a ejecutar el do, hasta que sea
         * falsa la condición, una vez que sea falsa, el codigo sigue. */

        /* 
         *  do {
         *      ESTO SE EJECUTARIA UNA VEZ COMO MINIMO
         *      SI VERDADERA SE VOLVERIA A EJECUTAR EL DO HASTA QUE LA CONDICION SEA FALSA
         *  } while (CONDICION VERDADERA / FALSA)
         *      SI FALSA SE SIGUE EJECUTANDO ESTE CODIGO
         */ 

        // WHILE (){} //

        /* El bucle while solo, se ejecuta solo mientras sea verdadera, una vez que sea falsa no
         * se ejecuta, asi que la diferencia es que en el do siempre entra al menos una vez, mientas
         * que en el while puede no entrar nunca. */

         /* 
         *  while (CONDICION VERDADERA / FALSA) {
         *      SI VERDADERA SE EJECUTA ESTE CODIGO
         *      SI FALSA NO SE EJECUTA NADA Y SIGUE ADELANTE 
         *  }
         */ 
            
            System.out.println("Bucle While :");       

            int i = 1;   

            while (i < 11) { // Estamos simulando un bucle for con un while
                System.out.println(i);
                i++;
            }
            System.out.println("Bucle do while :");
            i = 1;
            do {
                System.out.println(i);
                i++;
            } while (i < 16);

    

    // Programa pida num par o impar si el num es par pedir otro num asi sucesivamente, si es impar
    // programa termina.

        Scanner leer = new Scanner(System.in);
        
        int numero;
        boolean par;
        do {
            System.out.print("Introduzca un numero : ");
            numero = leer.nextInt();
            par=numero%2==0;
            if (par) { // aqui compruebo si es par
                System.out.println("El numero introducido es par.");                
            }else System.out.println("El numero introducido es impar."); // esto se ejecuta si es impar
        } while (par); // aqui se vuelve a ejecutar el codigo mientras el numero introducido siga siendo par

        
        
        
    }


}
