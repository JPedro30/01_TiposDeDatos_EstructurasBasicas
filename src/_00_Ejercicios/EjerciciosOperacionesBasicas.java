package _00_Ejercicios;

import java.util.Scanner;

public class EjerciciosOperacionesBasicas {

    @SuppressWarnings("resource") // esto es para que no me pida cerrar scanner
    public EjerciciosOperacionesBasicas(){

            boolean ejercicioValido;
    // SELECTOR DE EJERCICIOS //
        do {
            System.out.println("|---------------------------------------------|");
            System.out.println("|         SELECTOR   DE   EJERCICIOS          |");
            System.out.println("|---------------------------------------------|");
            System.out.println("|  1. Suma, resta, multi y divi.              |");
            System.out.println("|  2. Conversor euros a pesetas.              |");
            System.out.println("|  3. Conversor pesetas a euros.              |");
            System.out.println("|  4. Factura.                                |");
            System.out.println("|  5. Calculadora area triangulo.             |");
            System.out.println("|  6. Calculadora salario.                    |");
            System.out.println("|  7. Calculo de nota para media.             |");
            System.out.println("|---------------------------------------------|");
            System.out.print("Introduce el codigo del ejercicio que quieres realizar :  ");

            int selector;
            Scanner leer = new Scanner(System.in);
            selector = leer.nextInt();
            ejercicioValido=selector<=7 && selector>=1;

            if (ejercicioValido) {
                switch (selector) {
                    case 1:
                    // Ejercicio 1 : Escribe un programa en el que se declaren las variables enteras x e y. Asignales 
                    // los valores 144 y 999 respectivamente. A continuación, muestra por pantalla el valor 
                    // de cada variable, la suma, la resta, la división y la multiplicación.

                        int x, y, suma, resta, multi, divEntera;
                        double divReal;

                        x = 144;
                        y = 999;

                        suma = x + y;
                        resta = x - y;
                        multi = x * y;
                        divEntera = x / y;
                        divReal = x / (double) y;

                        System.out.println(x +" + "+ y +" = "+ suma);
                        System.out.println(x +" - "+ y +" = "+ resta);
                        System.out.println(x +" x "+ y +" = "+ multi);
                        System.out.println(x +" / "+ y +" = "+ divEntera +" (perdiendo los decimales)");
                        System.out.println(x +" / "+ y +" = "+ divReal +" (sin perder los decimales)"); 
                        
                        break;
                    case 2:
                    // Ejercicio 2 : Realiza un conversor de euros a pesetas.

                        double eurosCambiar;
                        double cambioEuros;
                        final double tipoCambioPesetas;

                        System.out.print("Cuantos Euros quieres cambiar a Pesetas: ");
                        eurosCambiar = leer.nextDouble();

                        tipoCambioPesetas = 166.386;

                        cambioEuros = eurosCambiar * tipoCambioPesetas;

                        System.out.println(eurosCambiar +" euros serían "+ cambioEuros +" de pesetas");
                        
                        break;
                    case 3:
                    // Ejercicio 3 : Realiza un conversor de pesetas a euros.

                        double ptsCambiar;
                        double tipoEuro;
                        final double cambioPTS;

                        System.out.print("Introduce la cantidad de Pesetas que quieres cambiar a Euro: ");

                        ptsCambiar = leer.nextDouble();

                        tipoEuro = 0.006;

                        cambioPTS = ptsCambiar * tipoEuro;

                        System.out.println(ptsCambiar+ " pesetas serían "+ cambioPTS+ " euros");    

                        break;
                    case 4:
                    // Ejercicio 4 : Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin IVA).
                    // Pide los datos por teclado.

                        double baseImponible;
                        double totalFacturanormal;
                        double IVA;

                        System.out.print("Introduzca la base imponible de su factura : ");
                        baseImponible = leer.nextDouble();

                        System.out.print("Introduzca el IVA que quiere aplica : ");
                        IVA = leer.nextDouble();

                        if (IVA == 21){

                        totalFacturanormal = baseImponible + (baseImponible * (IVA / 100));

                        System.out.println(baseImponible+ " euros + IVA al "+(int) IVA +"% = "+ totalFacturanormal +" euros");

                        }else if (IVA == 10){

                        totalFacturanormal = baseImponible + (baseImponible * (IVA / 100));

                        System.out.println(baseImponible+ " euros + IVA al "+(int) IVA +"% = "+ totalFacturanormal +" euros");

                        }else if (IVA == 4){

                        totalFacturanormal = baseImponible + (baseImponible * (IVA / 100));

                        System.out.println(baseImponible+ " euros + IVA al "+(int) IVA +"% = "+ totalFacturanormal +" euros");

                        }else {

                        System.out.println("El IVA introducido no es valido");

                        }  

                        break;
                    case 5:
                    // Ejercicio 5 : Escribe un programa que calcule el área de un triangulo.

                        double area;
                        double base;
                        double altura;

                        System.out.print("Introduzca la base de su triangulo : ");
                        base = leer.nextDouble();

                        System.out.print("Introduzca la altura de su triangulo : ");
                        altura = leer.nextDouble();

                        area = (base * altura)/ 2;

                        System.out.println("El area de un triangulo con base "+ base +" y altura "+ altura +" es "+ area);
   
                        break;
                    case 6:
                    // Ejercicio 6 : Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, 
                    // a razón de 12 euros la hora.

                        double horasTrabajadas;
                        double salSemanal;
                        double precioHora;

                        precioHora = 12;

                        System.out.print("Introduzca la cantidad de horas trabajadas esta semana : ");
                        horasTrabajadas = leer.nextDouble();

                        salSemanal = horasTrabajadas * precioHora;

                        System.out.println("El salario semanal del empleado habiendo trabajado "+ horasTrabajadas +" horas esta semana es de "+ salSemanal +" euros");
    
                        break;
                    case 7:
                    // Ejercicio 7 : Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura
                    // Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer examen cuenta el
                    // 40% y la delsegundo examen un 60%.

                        double mediaDeseada;
                        double nota2;
                        double nota1;
                        double porc1;
                        double porc2;

                        porc1 = 0.4;
                        porc2 = 0.6;

                        System.out.print("Introduzca la media deseada : ");
                        mediaDeseada = leer.nextDouble();

                        System.out.print("Introduzca la nota del primer examen : ");
                        nota1 = leer.nextDouble();

                        nota2 = (mediaDeseada - (nota1 * porc1)) / porc2;

                        System.out.println("La nota que debe de sacar en el segundo examen para sacar una media de "+ mediaDeseada +" es de "+ nota2);
    
                        break;
                }
                
            }else System.out.println("Vuelve a introducir un codigo de ejercicio valido.");
            
        } while (!ejercicioValido);


    }

    

}
