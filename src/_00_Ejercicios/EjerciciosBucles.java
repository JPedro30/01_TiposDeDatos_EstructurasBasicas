package _00_Ejercicios;

import java.util.Scanner;

public class EjerciciosBucles {
    @SuppressWarnings("resource")
    public EjerciciosBucles(){

    // EJERCICIO 1 : Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.,while y do while.

        int multiplicador, resultado;
        
        multiplicador = 5;
        System.out.println("BUCLE FOR");
        for (int multiplos = 0; multiplos < 101; multiplos++) {
            resultado = multiplos * multiplicador;
            System.out.println(multiplos+" x "+multiplicador+" = "+resultado);
        }
        
        System.out.println("BUCLE WHILE");
        int multiplo = 0;
        while (multiplo<100) {
            multiplo++;
            resultado = multiplo * multiplicador;
            System.out.println(multiplo+" x "+multiplicador+" = "+resultado);
        }

        System.out.println("BUCLE DO WHILE");
        int c = 0;
        do {
            c++;
            resultado = multiplicador * c;    
            System.out.println(c+" x "+multiplicador+" = "+resultado);        
        } while (c<100);

    // EJERCICIO 2 : Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.

        int numero, x;
        numero = 340;
        x=0;
        
        while (numero>160) {
            x = 20;
            numero = numero - x;
            System.out.println(numero);
        }

    // EJERCICIO 3 : Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. 
    // El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, 
    // esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
    // Tendremos cuatro oportunidades para abrir la caja fuerte.

        int pass, intentos, numeroPass;
        boolean acertado;
        intentos=4;
        pass=1234;

        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("introduce una contraseña, tiene "+intentos+" intentos : ");
            numeroPass = leer.nextInt();
            intentos--;
            acertado = pass == numeroPass;
            if (!acertado) {
                System.out.println("Contraseña incorrecta");
            }
            
        } while (intentos>0 && !acertado);
            if (acertado) {
                System.out.println("Contraseña correcta, ha abierto la caja fuerte.");
            }else System.out.println("Lo siento, lo ha intentado demasiadas veces, intentelo de nuevo mas tarde.");
        
    
    // EJERCICIO 4 : Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. 
    // Este ejercicio es equivalente a otro realizado anteriormente, con la salvedad de que el anterior estaba 
    // limitado a números de 5 dígitos como máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles;
    // de esta manera, la única limitación en el número de dígitos la establece el tipo de dato que se utilice (int o long).

        int numeroTeclado, i;

        i = 0;

        Scanner leer = new Scanner(System.in);
        System.out.print("Escribe un numero para calcular cuantos digitos tiene el numero introducido : ");
        numeroTeclado = leer.nextInt();
        if (numeroTeclado<0) {
            numeroTeclado*=-1;
        }
        do {
            i++;
            numeroTeclado/=10;
        } while (numeroTeclado>0);
        System.out.println("Tiene "+i+" digitos.");

    // EJERCICIO 5 : Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado.
    // A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir 
    // los datos cuando meta un número negativo.

        double numeroIntroducido, sumaNumeros, m, media;
        m = 0;
        sumaNumeros = 0;
        media = 0;

        do {
            leer = new Scanner(System.in);
            System.out.print("Introduce numeros para realizar la media (Cuando quiera parar, añada un numero negativo) : ");
            numeroIntroducido = leer.nextDouble();            
                                     
            if (numeroIntroducido>0) {
                m++;
                sumaNumeros+= numeroIntroducido;
                media = sumaNumeros / m;
            }
                        
        } while (numeroIntroducido>0);
        System.out.println("La media de "+sumaNumeros+" entre "+m+" es igual a "+media);
        


    // EJERCICIO 6 : Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de
    // la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos
    // que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.

        int n, fibo1, fibo2, suma;

        fibo1=0;
        fibo2=1;
        suma=0;

        leer = new Scanner(System.in);
        System.out.print("Escribe cuantos numeros de la serie de fibonacci deseas recibir : ");
        n = leer.nextInt();
        
        for (int k = 0; k < n; k++) { // creo contador k
            System.out.print(fibo1+" ");  
            suma = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = suma;            
        }


    // EJERCICIO 7 : Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es 
    // aquel que sólo es divisible entre él mismo y la unidad.

        int q, numeroPrimo, comprobacionPrimo;
        boolean esPrimo = true;

        comprobacionPrimo=0;

        leer = new Scanner(System.in);
        System.out.print("Introduzca el numero que quiera saber si es primo : ");
        numeroPrimo = leer.nextInt();

        for (q = 2; q < numeroPrimo-1; q++) {
            comprobacionPrimo = numeroPrimo % q;
            if (comprobacionPrimo==0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            System.out.println("Es un numero primo");
        }else System.out.println("No es un numero primo");


    // EJERCICIO 8 : Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos 
    // por teclado y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir
    // incrementando de 7 en 7.

        int w, num1, num2, aux;

        leer = new Scanner(System.in);

        do {
            System.out.print("Introduzca por el que quiera empezar : ");
            num1 = leer.nextInt();
            System.out.print("Introduzca el numero hasta el que quiera llegar : ");
            num2 = leer.nextInt();
            if (num1==num2) {
                System.out.println("Los numeros son iguales, por favor introduzca numeros distintos.");
            }
        } while (num1==num2); // aqui estoy validando que los dos numeros no sean iguales
        
        if (num2<num1) { // aqui cambio el valor de los numeros si el segundo es mas pequeño que el primero
            aux=num1;
            num1=num2;
            num2=aux;
        }
        if (num1!=num2){ // con lo cual este siempre sera verdadero
        for (w = num1; w <= num2; w+=7) { // y esta lista siempre sera de menor a mayor
            System.out.print(w+" - ");
        }
        }

    // EJERCICIO 9 : Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos 
    // diga cuantos números se han introducido, la media de los impares y el mayor de los pares. El número negativo 
    // sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.

        double mediaImpares, e, r, numeroEscrito, sumaImpares, mayorPAR;

        e=0;
        r=0;
        sumaImpares=0;
        mayorPAR=0;

        do {
            leer = new Scanner(System.in);
            System.out.print("Introduzca un número (para dejar de introducir datos, introduzca un número negativo) : ");
            numeroEscrito = leer.nextDouble();

            if (numeroEscrito>0) {
                r++;
            if (numeroEscrito%2!=0) {
                if (numeroEscrito>0) {
                e++;
                sumaImpares+= numeroEscrito;
                }                
            }else if (numeroEscrito%2==0) {
                if (numeroEscrito>mayorPAR) {
                    mayorPAR = numeroEscrito;  
                }                
            }                
            }
            
        } while (numeroEscrito>0);
        mediaImpares = sumaImpares / e;
        System.out.println("El mayor par es "+mayorPAR);
        System.out.println("La cantidad de numeros introducidos es de "+r);
        System.out.println("La media de los impares es de "+mediaImpares);

    // EJERCICIO 10 : Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.

        int ultimaCifra, num, numAlreves;

        leer = new Scanner(System.in);
        System.out.print("Introduzca un numero, para devolverlo al reves : ");
        num = leer.nextInt();
        numAlreves=0;

        System.out.print("El numero al reves es ");
        do {
            ultimaCifra = num % 10; // estoy quitando la ultima crifra
            numAlreves = numAlreves*10+ultimaCifra; // en cada vuelta la ultima cifra la multiplico por 10 y le sumo la cifra ultima siguiente
            num = num/10; // aqui acorto el numero
        } while (num>0);
        System.out.print(numAlreves);

    // EJERCICIO 11 : Realiza un programa que pida primero un número y a continuación un dígito. El programa nos debe
    // dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.
        
        int numTeclado, digitoTeclado, ultCifra, numeroReversa, contDigitosRepetidos;
        boolean seRepite=false;

        contDigitosRepetidos=1;
        numeroReversa=0;
        
        leer = new Scanner(System.in);
        System.out.print("Introduce un numero : ");
        numTeclado = leer.nextInt();
        System.out.print("Introduce el digito que deseas analizar : ");
        digitoTeclado = leer.nextInt();

        if (numTeclado<0) {
            numTeclado*=-1;
        }
        if (digitoTeclado<0) {
            digitoTeclado*=-1;
        }
        do {
            ultCifra = numTeclado%10;
            numeroReversa = numeroReversa*10+ultCifra;
            numTeclado/=10;
        } while (numTeclado>0);
        do {
            if (digitoTeclado==numeroReversa%10) {
            System.out.println("El digito "+digitoTeclado+" se repite en la posicion "+contDigitosRepetidos+" ");
            seRepite=true;
            }
            contDigitosRepetidos++;
            numeroReversa/=10;
        } while (numeroReversa>0);
        if (!seRepite) {
            System.out.println("El digito "+digitoTeclado+" no se repite ninguna vez.");
        }

    // EJERCICIO 12 : Escribe un programa que calcule el factorial de un número entero leído por teclado.
    // Ejemplo:
    // Por favor, introduzca un número entero: 6
    // 6! = 720

        int numEntero, factorial;

        factorial=1;
        
        leer = new Scanner(System.in);
        

        do {
            System.out.print("Introduzca el numero que desea saber su factorial : ");
            numEntero = leer.nextInt();
            if (numEntero<0) {
                System.out.println("Numero invalido, los numeros negativos no se pueden hacer factorial.");
            }
        } while (numEntero<0);
    
        for (int t = 1; t <= numEntero; t++){
            factorial*=t;
        }
        System.out.println(numEntero+"! = "+factorial);

    // EJERCICIO 13 : HACER EL CAPICUA PERO NO SE SABE CUANTOS NUMEROS SE TIENE.

        int numCapicua, numCapicuaCopiaOriginal, numCapicuaCopia, numCapicuaInversa, ultimaCifraNumCapicua;
        boolean esCapicua=true;

        numCapicuaInversa = 0;
        
        leer = new Scanner(System.in);
        System.out.print("Introduce un numero para comprobar si es capicua : ");
        numCapicua = leer.nextInt();

        numCapicuaCopiaOriginal = numCapicua;

        if (numCapicua<0) {
            numCapicua*=-1;
        }

        numCapicuaCopia = numCapicua;

        do {
            ultimaCifraNumCapicua=numCapicua%10;
            numCapicuaInversa=numCapicuaInversa*10+ultimaCifraNumCapicua;
            numCapicua/=10;
        } while (numCapicua>0);
        
        do {
            if ((numCapicuaCopia%10)!=(numCapicuaInversa%10)) {
                esCapicua = false;
                break;
            }
            numCapicuaCopia/=10;
            numCapicuaInversa/=10;
        } while (numCapicuaCopia>10);
        
        if (!esCapicua) {
            System.out.println(numCapicuaCopiaOriginal+" no es un numero capicua.");
        }else System.out.println(numCapicuaCopiaOriginal+" es un numero capicua.");
        

    }
}
