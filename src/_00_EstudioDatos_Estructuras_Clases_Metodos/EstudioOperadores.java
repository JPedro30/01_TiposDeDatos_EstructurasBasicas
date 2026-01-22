package _00_EstudioDatos_Estructuras_Clases_Metodos;

import java.util.Scanner;

public class EstudioOperadores {
    @SuppressWarnings("resource")
    public EstudioOperadores(){
        System.out.println("Estudio de Operadores");

        // SUMAS Y MULTIPLICACIONES //

        int suma, c=-5,d=3,e=2,multi;
        double sumaDouble,num1=5.5,num2=2.3;
        suma=c+d;
        multi=c*d;
        System.out.println("la suma es "+ suma);
        System.out.println("la multiplicacion es "+ multi);
        int op=c+(d*e);
        System.out.println("la operacion es "+ op);
        sumaDouble= num1 + num2;
        System.out.println("La suma de double es "+ sumaDouble);
        //suma=num1+num2;// no se puede por que no cabe en memoria
        suma=(int)(num1+num2);//aqui si se podria por que estaria casteando a enteros pero perderiamos decimales
        System.out.println("Suma casteo a enteros es "+ suma);
        sumaDouble= d + e;
        System.out.println("La sumadouble de int es "+ sumaDouble);


        // DIVISIONES Y MOD O RESTO //

        int divEntera, divid = 7, div = 3;
        double divReal, div2 = 3;
        divEntera = divid / div;
        System.out.println("La division entera es "+ divEntera);
        divReal = divid / div; // aqui la division final es real pero al haberse dividido entre dos numeros enteros se pierde informacion
        System.out.println("La division real entre dos numeros enteros es "+ divReal);
        divReal = divid / div2; // para que la division real no se pierda informacion o divisor o dividendo debe ser real, double, o hacer casting
        System.out.println("La division real es "+ divReal);
        divReal = divid /(double) div; // para que la division real no se pierda informacion se debe hacer casting (double) en dividendo o divisor
        System.out.println("La division real haciendo casting es "+ divReal);

        int resto;
        divid = 8;
        div= 5; // puedes ir cambiando este numero para ir mirando el resultado e ir mirando si te sale un entero o un resto
        resto = divid % div;
        System.out.println("El resto de la division es "+ resto);

        /* CONTADORES:
         * FORMA ANTIGUA:
         * c = c + 1; c = c + 5; c = c - 1; c = c * 2; c = c / 2;
         * 
         * FORMA ACTUAL:
         * c++; c+ = 1; c+ = 5; c- = 1; c* = 2; c/ = 2;
         */

        c= 0;
        c++;c++;c++;
        System.out.println("c vale = "+ c);
        c+=2;c+=2;c+=2;
        System.out.println("ahora c vale = "+ c);
        c*=5;
        System.out.println("despues de multiplicar c vale = "+ c);
        c/=10;
        System.out.println("ahora habiendo dividido c vale = "+ c);
        c-=4;
        System.out.println("finalmente despues de restar c vale = "+ c);
        
        int x=5; // x valia 5
        x++; // x pasa a vale 6
        System.out.println("X vale = "+ x);
        ++x; // x pasa a vale 7
        System.out.println("x ahora vale = "+ x);

        int z= x++; // al tener el signo despues primero z se asocia entonces z=7 y luego x pasa a valer de 7 a 8
        System.out.println("El valor de z es "+ z);
        z= ++x; // y aqui primero se hace el valor x pasa de 8 a 9 y luego z se asocia a x por lo cual z=9 y x=9
        System.out.println("Ahora el valor de z es "+ z);


        // ACUMULADOR //
        /*
         * Esto se usa para no declara infinitas variables y poder acumular el valor de las mismas
         */

        int acu = 0;
        int nota = 5;
        acu+=nota;
        System.out.println("Acumulador = "+ acu);
        nota= 5;
        acu+=nota;
        System.out.println("Acumulador = "+ acu);


        // OPERACIONES RELACIONALES //
        
        /* > MAYOR
         * < MENOR
         * >= MAYOR O IGUAL
         * <= MENOR O IGUAL
         * == IGUAL
         * != DISTINTO */
        
        boolean sw = false, sw1, sw2;
        int n = 3, r = 4;

        sw = n == r; // Preguntamos si n es igual a r
        System.out.println(sw);
        sw = n != r; // Preguntamos si n es dintito a r
        System.out.println(sw);
        sw = n >= r; // Preguntamos si n es mayor o igual a r
        System.out.println(sw);


        // OPERADOR TERNARIO //
        int resultado = (n > r) ? n : r;
        int notaNumerica = 6;
        String notaCadena = notaNumerica < 5 ? "Suspenso" : "Aprobado";

        System.out.println("El mayor es : "+ resultado);
        System.out.println("Resultado del examen : "+ notaCadena);


        // OPERADORES LOGICOS //
        
         /* Los operadores logicos hacen comparaciones entre booleanos
         * NOT = ! : Operador de inversion o de complemento
         * AND = && Tambien llamado operador Y o llamado operador multiplicador logica
         * OR = || Tambien se llama operador O o llamado operador de suma logica
         * XOR = Es verdad cuando los valores es distinto */
         


        sw1 = true;
        sw2 = true;

        System.out.println(!sw1); // Devuelve lo contrario de sw1
        System.out.println(sw1 || sw2); // Devuelve true si al menos uno es verdadero
        System.out.println(sw1 && sw2); // Devuelve true solo cuando los dos son verdaderos
        System.out.println(sw1 ^ sw2); // Devuelve true solo si uno de los operandos es true

        sw1 = false;

        System.out.println(!sw1); // Devuelve lo contrario de sw1
        System.out.println(sw1 || sw2); // Devuelve true si al menos uno es verdadero
        System.out.println(sw1 && sw2); // Devuelve true solo cuando los dos son verdaderos
        System.out.println(sw1 ^ sw2); // Devuelve true solo si uno de los operandos es true

        boolean a = true;

        System.out.println("a || (6 > 10) = "+ (a || (6 > 10)));

        
         /* Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la
         * de la asignatura de **PROGRAMACION** para obtener la media deseada. Hay que tener en
         * en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%. */
    

        Scanner leer = new Scanner(System.in);
        System.out.print("¿Cuanto sacaste en el primer examen? ");
        double nota1 = leer.nextDouble();
        leer = null;

        leer = new Scanner(System.in);
        System.out.print("¿Que media quieres sacar? ");
        double media = leer.nextDouble();
        leer = null;

        double nota2 = 0;
        double porc1 = 0.4;
        double porc2 = 0.6;
        
        nota2 = (media -(nota1 * porc1)) / porc2;
        String notaAsequible = media >= 10 ? "No es posible" : "Es posible";

        System.out.println("Teniendo un "+ nota1 +" en el primer examen");
        System.out.println("Necesitas sacar un "+ nota2 +(" en el segundo examen"));
        System.out.println("Para tener una media de "+ media);
        System.out.println("¿Es posible sacar esa media? "+ notaAsequible);


        
    
    }
}