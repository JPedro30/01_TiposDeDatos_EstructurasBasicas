package _00_Ejercicios;

import java.util.Scanner;

public class EjerciciosRepaso {

    @SuppressWarnings({ "resource", "unused" })
    public EjerciciosRepaso(){

        // EJERCICIO 1: Introducir un número entero por teclado que se supone que es un mes del año.
        // Si es así, indicar cuántos días tiene el mes que le antecede.

            int mes;
            do {
                Scanner leer = new Scanner(System.in);
                System.out.print("Introduzca el mes que quiera comprobar (numero de mes) : ");
                mes = leer.nextInt(); 
                if (mes>13) {
                    System.out.println("El año no tiene mas de 12 meses");
                }               
            } while (mes>13);            

            switch (mes) {
                case 1,2,4,6,8,9,11:
                    System.out.println("El mes anterior tuvo 31 días.");
                    break;
                case 3:
                    System.out.println("El mes anterior tuvo 28 o 29 días, depende de si es año bisiesto."); 
                    break; 
                case 5,7,10,12:
                    System.out.println("El mes anterior tuvo 30 días.");          
                    break;
            }


        // EJERCICIO 2: Introducir un número entero por teclado que se supone que es un año. 
        // Indicar si es bisiesto o no y por qué motivo (P.e.: “Es bisiesto por ser múltiplo de 4 y no de 100”. 
        // P.e.: “Es bisiesto por ser múltiplo de 400”. P.e.: “No es bisiesto por ser múltiplo de 100”).

            int num;
            boolean esDivisible100, esDivisible4, esDivisible400;
            
            do {
                Scanner leer = new Scanner(System.in);
                System.out.print("Introduzca un año por teclado para saber si es bisiesto : ");
                num = leer.nextInt();
                if (num==0) {
                    System.out.println("No existe el año 0, pasa del año 1 a.C al año 1 d.C.");
                }            
            } while (num==0);        

            esDivisible100 = num%100==0;
            esDivisible4 = num%4==0;
            esDivisible400 = num%400==0;

            if (esDivisible4 && !esDivisible100) {
                System.out.println("Es bisiesto por ser multiplo de 4 pero no multiplo de 100.");
            }else if (esDivisible400){
                System.out.println("Es bisiesto por ser multiplo de 400.");
            }else if (esDivisible100) {
                System.out.println("No es bisiesto por se multiplo de 100.");
            }else if (!esDivisible4){
                System.out.println("No es bisiesto por no ser multiplo de 4.");
            }


        // EJERCICIO 3: Introducir un número entero que llamaremos <dia_semana>, y comprendido entre 0 y 6, de modo que el 0
        // corresponderá al Domingo, el 1 al Lunes,...y así sucesivamente, hasta el 6 que señalará al Sábado. Suponed que el 
        // 1º de Enero de un año cualquiera “cae” en el día que marca <dia_semana>. Tendréis que presentar en pantalla todos
        // los días del mes de Enero, cada uno en una línea, acompañado del nombre del día de la semana que le corresponde.

            int dia_semana;
            int contadorDia;

            contadorDia = 0;

            do {
            Scanner leer = new Scanner(System.in);
            System.out.println("DIAS DE LA SEMANA:");
            System.out.println("0. Domingo");
            System.out.println("1. Lunes");
            System.out.println("2. Martes");
            System.out.println("3. Miercoles");
            System.out.println("4. Jueves");
            System.out.println("5. Viernes");
            System.out.println("6. Sabado");
            System.out.println("-----------------");
            System.out.print("Introduzca un dia de la semana (numero que aparece) : ");
            dia_semana=leer.nextInt();                
            } while (dia_semana>6 || dia_semana<0);
            

            for (int dias = 1; contadorDia <= 31; dias++) {
                
                switch (dias) {
                    case 0:
                        System.out.printf("%2d de Enero es Domingo%n",contadorDia);
                        break;
                    case 1:
                        System.out.printf("%2d de Enero es Lunes%n",contadorDia);
                        break;
                    case 2:
                        System.out.printf("%2d de Enero es Martes%n",contadorDia);
                        break;
                    case 3:
                        System.out.printf("%2d de Enero es Miercoles%n",contadorDia);
                        break;
                    case 4:
                        System.out.printf("%2d de Enero es Jueves%n",contadorDia);
                        break;
                    case 5:
                        System.out.printf("%2d de Enero es Viernes%n",contadorDia);
                        break;
                    case 6:
                        System.out.printf("%2d de Enero es Sabado%n",contadorDia);
                        break;                                             
                }
                contadorDia++;
                if (dias>6) {
                    dias=0;
                }
            }
        
        // EJERCICIO 4: Leer 10 datos, compuesto cada uno de ellos por un nombre de persona y su sueldo neto mensual, y 
        // obtener y visualizar el nombre y sueldo de la persona que más cobra y de la que menos. Si hay varias con el 
        // mismo sueldo (máximo o mínimo) se presentará la primera que aparezca en la secuencia de entrada.

            String nombre, nombreMayorSueldo, nombreMenorSueldo, relleno;
            double sueldo, mayorSueldo, menorSueldo;
            int contador;

            mayorSueldo=0;
            menorSueldo=0;
            nombreMayorSueldo="";
            nombreMenorSueldo="";
            relleno="---------------------------------------------------";
            contador=1;

            do {

                Scanner leer = new Scanner(System.in);
                System.out.printf("%s%n",relleno);
                System.out.printf("Introduzca nombre del %dº empleado : ",contador);
                nombre = leer.nextLine();
                System.out.printf("Introduzca el sueldo de %s : ",nombre);
                sueldo = leer.nextDouble();
                leer.nextLine();

                if (contador==1) {
                mayorSueldo=sueldo;
                nombreMayorSueldo=nombre;
                menorSueldo=sueldo;
                nombreMenorSueldo=nombre; 
                }

                if (sueldo>mayorSueldo) {
                mayorSueldo=sueldo;
                nombreMayorSueldo=nombre;
                }
                if (sueldo<menorSueldo) {
                menorSueldo=sueldo;
                nombreMenorSueldo=nombre;
                }  

                contador++;

            } while (contador<=5);
            

            System.out.printf("%s%n",relleno);
            System.out.printf("El empleado %s tiene el mayor sueldo con un sueldo de %.2f euros.%n",nombreMayorSueldo,mayorSueldo);
            System.out.printf("El empleado %s tiene el menor sueldo con un sueldo de %.2f euros.%n",nombreMenorSueldo,menorSueldo);
            System.out.printf("%s%n",relleno);


        // EJERCICIO 5: Muestra los caracteres del código ascii , del 32 a 131, en 10 columnas mostrando el código y el carácter.
        // Formatea la salida con printf:

            int contadorASCII,contadorColumnas;
            char ASCII;

            ASCII=32;
            contadorColumnas=32;
            contadorASCII=32;

            for (contadorColumnas = 32; contadorASCII <= 131; contadorColumnas++) {
                ASCII=(char)contadorASCII;
                System.out.printf("%3d = %2c |",contadorASCII,ASCII);
                contadorASCII++;
                if (contadorColumnas>40) {
                    System.out.printf("%n");
                    contadorColumnas=31;
                }
            }

        
        // EJERCICIO 6: Realiza un ejercicio que me permita resolver ecuaciones de segundo grado del tipo ax2+bx+c=0.
        // Deberá de pedir los coeficientes a,b,c e indicar las soluciones. Si no tiene solución real deberá indicarlo.
        // -b +- (raiz cuadrada b cuadrado -(4 por a por c)) todo eso dividido entre 2 por a tiene dos soluciones la + y la - si la raiz cuadrada da negativo es insta negativo no pertenece a los numeros reales.

            double a, b, c, discriminante, resultadoSuma, resultadoResta, resultadoRaizCuadrada;
            String relleno2, espacio;

            relleno2 = "================================";
            espacio = " ";

            Scanner leer = new Scanner(System.in);
            System.out.printf("%s%n",relleno2);
            System.out.print("Introduce el coeficiente a : ");
            a = leer.nextDouble();
            System.out.print("Introduce el coeficiente b : ");
            b = leer.nextDouble();
            System.out.print("Introduce el coeficiente c : ");
            c = leer.nextDouble();

            discriminante = Math.pow(b,2) - (4 * a * c);

            if (discriminante>0) {
                resultadoRaizCuadrada = Math.sqrt(discriminante);
                resultadoSuma = (-b + resultadoRaizCuadrada ) / (2*a);
                resultadoResta = (-b - resultadoRaizCuadrada ) / (2*a);
                
                System.out.printf("%s%n",relleno2);
                System.out.println("Esta ecuacion tiene dos soluciones que son : ");
                System.out.printf("%10s x1 = %.2f%n",espacio,resultadoSuma);
                System.out.printf("%10s x2 = %.2f%n",espacio,resultadoResta);
                System.out.printf("%s%n",relleno2);
                
            }else if (discriminante==0) {
                resultadoRaizCuadrada = Math.sqrt(discriminante);
                resultadoSuma = (-b + resultadoRaizCuadrada ) / (2*a);
        
                System.out.printf("%s%n",relleno2);
                System.out.println("Esta ecuacion tiene una sola solución");
                System.out.printf("%10s x = %.2f%n",espacio,resultadoSuma);
                System.out.printf("%s%n",relleno2);
                
            }else if (discriminante<0) {

                System.out.printf("%s%n",relleno2);
                System.out.println("No tiene una solución real.");
                System.out.println("El discriminante tiene un valor de : "+discriminante);
            } 


        // 7. Dados dos números enteros positivos, hallar el mínimo común múltiplo.
        // Método a usar:
        // Se van hallando los sucesivos múltiplos del mayor de ellos hasta encontrar uno
        // que sea divisible por el más pequeño.

            String texto;
            int aux, contadorMultiplos;

            aux=0;
            
            leer = new Scanner(System.in);

            System.out.print("Introduzca el primer numero : ");
            texto = leer.nextLine();
            int numEntero1 = Integer.parseInt(texto);

            System.out.print("Introduzca el segundo numero : ");
            texto = leer.nextLine();
            int numEntero2 = Integer.parseInt(texto);

            if (numEntero2>numEntero1) {
                aux=numEntero2;
                numEntero2=numEntero1;
                numEntero1=aux;
            }         

            contadorMultiplos=0;

            do {
                contadorMultiplos++;
            } while ((numEntero1*contadorMultiplos)%numEntero2!=0);
            System.out.println("El mcm de "+numEntero1+" y de "+numEntero2+" es "+(numEntero1*contadorMultiplos));


        // 8. Calcular el producto de dos números enteros positivos mediante el denominado
        // "algoritmo ruso del producto": consiste en duplicar el primer factor y dividir 
        // (cociente entero) por 2 el segundo, obteniendo un producto equivalente, salvo 
        // si el segundo es impar, en cuyo caso es necesario acumular previamente el primero 
        // en donde se va a obtener el resultado. El proceso termina cuando el segundo factor 
        // se hace 0. 
        // Por ejemplo: 25 * 6

            String factores;
            int factor1, factor2, negativo1, negativo2, acumulado;

            acumulado=0;

            leer = new Scanner(System.in);

            do {
            System.out.print("Introduzca el primer factor (positivo) : ");
            factores = leer.nextLine();
            factor1 = Integer.parseInt(factores);
            negativo1 = Integer.signum(factor1);
            if (negativo1==-1) {
                System.out.println("Introduzca un numero positivo, por favor. ");
            }
            } while (negativo1==-1);

            boolean factor2par;

            do {
            System.out.print("Introduzca el segundo factor (positivo) : ");
            factores = leer.nextLine();
            factor2 = Integer.parseInt(factores);
            negativo2 = Integer.signum(factor2);
            if (negativo2==-1) {
                System.out.println("Introduzca un numero positivo, por favor. ");
            }
            } while (negativo2==-1);

            
            while (factor2!=0) {
            factor2par = factor2%2==0;
            if (!factor2par) {
                acumulado=acumulado+factor1;
            }    
            factor1*=2;  
            factor2/=2; 
            }
            System.out.println("El producto de la operacion es : "+acumulado);


        // 9. Introducir un número y desglosarlo de forma ideal en billetes y monedas de curso legal.

            String dinero,rellenoRayas1,rellenoRayas2,rellenoBordes,billetes,monedas,bill500,bill200,bill100,bill50,bill20,bill10,bill5,mon2,mon1,mon50,mon20,mon10,mon05,mon02,mon01;
            double dineroEur, dineroCents;
            int b500e,b200e,b100e,b50e,b20e,b10e,b5e,m2e,m1e,m50c,m20c,m10c,m5c,m2c,m1c;
            double cantb500e,cantb200e,cantb100e,cantb50e,cantb20e,cantb10e,cantb5e,cantm2e,cantm1e,cantm50c,cantm20c,cantm10c,cantm5c,cantm2c,cantm1c;

            rellenoRayas1 = "------------------------------------------------------------------------------";
            rellenoRayas2 = "-----------------------------------------------------------------------------------------";
            rellenoBordes = "|";
            billetes = "BILLETES";
            monedas = "MONEDAS";
            bill500 = "500 euros";
            bill200 = "200 euros";
            bill100 = "100 euros";
            bill50 = "50 euros";
            bill20 = "20 euros";
            bill10 = "10 euros";
            bill5 = "5 euros";
            mon2 = "2 euros";
            mon1 = "1 euros";
            mon50 = "0,50 euros";
            mon20 = "0,20 euros";
            mon10 = "0,10 euros";
            mon05 = "0,05 euros";
            mon02 = "0,02 euros";
            mon01 = "0,01 euros";


            cantb500e=0;
            cantb200e=0;
            cantb100e=0;
            cantb50e=0;
            cantb20e=0;
            cantb10e=0;
            cantb5e=0;
            cantm2e=0;
            cantm1e=0;
            cantm50c=0;
            cantm20c=0;
            cantm10c=0;
            cantm5c=0;
            cantm2c=0;
            cantm1c=0;

            m1c = 1;
            m2c = 2;
            m5c = 5;
            m10c = 10;
            m20c = 20;
            m50c = 50;
            m1e = 100;
            m2e = 200;
            b5e = 500;
            b10e = 1000;
            b20e = 2000;
            b50e = 5000;
            b100e = 10000;
            b200e = 20000;
            b500e = 50000;

            leer = new Scanner(System.in);

            do {
            System.out.print("Introduzca el dinero que poseas : ");
            dinero = leer.nextLine();
            dineroEur = Double.parseDouble(dinero);
            if (dineroEur<0) {
                System.out.println("Introduzca un numero positivo, por favor. ");
            }
            } while (dineroEur<0);

            dineroCents = (int) Math.round(dineroEur * 100);

            while (dineroCents>0) {
                if (dineroCents>=b500e) {
                    cantb500e=dineroCents/b500e;
                    cantb500e = Math.floor(cantb500e);
                    dineroCents%=b500e;
                }else if (dineroCents>=b200e) {
                    cantb200e=dineroCents/b200e;
                    cantb200e = Math.floor(cantb200e);
                    dineroCents%=b200e;
                }else if (dineroCents>=b100e) {
                    cantb100e=dineroCents/b100e;
                    cantb100e = Math.floor(cantb100e);
                    dineroCents%=b100e;
                }else if (dineroCents>=b50e) {
                    cantb50e=dineroCents/b50e;
                    cantb50e = Math.floor(cantb50e);
                    dineroCents%=b50e;
                }else if (dineroCents>=b20e) {
                    cantb20e=dineroCents/b20e;
                    cantb20e = Math.floor(cantb20e);
                    dineroCents%=b20e;
                }else if (dineroCents>=b10e) {
                    cantb10e=dineroCents/b10e;
                    cantb10e = Math.floor(cantb10e);
                    dineroCents%=b10e;
                }else if (dineroCents>=b5e) {
                    cantb5e=dineroCents/b5e;
                    cantb5e = Math.floor(cantb5e);
                    dineroCents%=b5e;
                }else if (dineroCents>=m2e) {
                    cantm2e=dineroCents/m2e;
                    cantm2e = Math.floor(cantm2e);
                    dineroCents%=m2e;
                }else if (dineroCents>=m1e) {
                    cantm1e=dineroCents/m1e;
                    cantm1e = Math.floor(cantm1e);
                    dineroCents%=m1e;
                }else if (dineroCents>=m50c) {
                    cantm50c=dineroCents/m50c;
                    cantm50c = Math.floor(cantm50c);
                    dineroCents%=m50c;
                }else if (dineroCents>=m20c) {
                    cantm20c=dineroCents/m20c;
                    cantm20c = Math.floor(cantm20c);
                    dineroCents%=m20c;
                }else if (dineroCents>=m10c) {
                    cantm10c=dineroCents/m10c;
                    cantm10c = Math.floor(cantm10c);
                    dineroCents%=m10c;
                }else if (dineroCents>=m5c) {
                    cantm5c=dineroCents/m5c;
                    cantm5c = Math.floor(cantm5c);
                    dineroCents%=m5c;
                }else if (dineroCents>=m2c) {
                    cantm2c=dineroCents/m2c;
                    cantm2c = Math.floor(cantm2c);
                    dineroCents%=m2c;
                }else if (dineroCents>=m1c) {
                    cantm1c=dineroCents/m1c;
                    cantm1c = Math.floor(cantm1c);
                    dineroCents%=m1c;
                }
            
            }
            System.out.printf("%s%n",rellenoRayas1);
            System.out.printf("%40s%n",billetes);
            System.out.printf("%s%n",rellenoRayas1);
            System.out.printf("%s%10s%s%10s%s%10s%s%10s%s%10s%s%10s%s%10s%s%n",rellenoBordes,bill500,rellenoBordes,bill200,rellenoBordes,bill100,rellenoBordes,bill50,rellenoBordes,bill20,rellenoBordes,bill10,rellenoBordes,bill5,rellenoBordes);
            System.out.printf("%s%n",rellenoRayas1);
            System.out.printf("%s%10.0f%s%10.0f%s%10.0f%s%10.0f%s%10.0f%s%10.0f%s%10.0f%s%n",rellenoBordes,cantb500e,rellenoBordes,cantb200e,rellenoBordes,cantb100e,rellenoBordes,cantb50e,rellenoBordes,cantb20e,rellenoBordes,cantb10e,rellenoBordes,cantb5e,rellenoBordes);
            System.out.printf("%s%n",rellenoRayas2);
            System.out.printf("%50s%n",monedas);
            System.out.printf("%s%n",rellenoRayas2);
            System.out.printf("%s%10s%s%10s%s%10s%s%10s%s%10s%s%10s%s%10s%s%10s%s%n",rellenoBordes,mon2,rellenoBordes,mon1,rellenoBordes,mon50,rellenoBordes,mon20,rellenoBordes,mon10,rellenoBordes,mon05,rellenoBordes,mon02,rellenoBordes,mon01,rellenoBordes);
            System.out.printf("%s%n",rellenoRayas2);
            System.out.printf("%s%10.0f%s%10.0f%s%10.0f%s%10.0f%s%10.0f%s%10.0f%s%10.0f%s%10.0f%s%n",rellenoBordes,cantm2e,rellenoBordes,cantm1e,rellenoBordes,cantm50c,rellenoBordes,cantm20c,rellenoBordes,cantm10c,rellenoBordes,cantm5c,rellenoBordes,cantm2c,rellenoBordes,cantm1c,rellenoBordes);
            System.out.printf("%s%n",rellenoRayas2);


        // 10. Muestra todos los números primos que hay entre dos dados. Indicar cuantos se han encontrado

            int num1, num2, auxiliar, contadorPrimo, resto;
            
            contadorPrimo = 0;

            leer = new Scanner(System.in);

            do {
                System.out.print("Introduzca el primer numero (positivo): ");
                num1 = leer.nextInt();
            } while (num1<0);

            do {
                System.out.print("Introduzca el segundo numero (positivo): ");
                num2 = leer.nextInt();
            } while (num2<0);

            if (num1>num2) {
                auxiliar=num1;
                num1=num2;
                num2=auxiliar;
            }

            boolean esPrimo=true;
            for (int numAhora = num1; numAhora <= num2; numAhora++) { // paso por todos los numeros entre num1 y num2
                
                for (int s = 2; s < numAhora-1; s++) { // compruebo que el numero en el que estoy sea primo

                    resto = numAhora%s;

                    if (resto==0) {
                        esPrimo=false;
                        break;
                    } 

                    if (resto!=0) {
                        esPrimo=true;
                    }   

                    if (esPrimo && s==numAhora-2) { // es primo mientras que resto sea distinto de 0 y el contador sea igual al numero en el que estoy menos 2 (unidad y el mismo)
                        System.out.println("El "+numAhora+" es primo"); // asi solo me lo devuelve una sola vez, cuando llegue al final del numero y lo compruebe completamente.
                        contadorPrimo++;
                    } 
                    
                }
            }
            System.out.println("El numero total de primos que hay entre "+num1+" y "+num2+" es "+contadorPrimo);
    
            

        // 11. Números perfectos
        // Un número es perfecto si la suma de sus divisores (sin contar él mismo) es igual al número.
        // Por ejemplo: 6 → 1 + 2 + 3 = 6.
        // Pide un número y determina si es perfecto.

            int numeroPerfecto,restoPerfecto,sumaPerfectos;

            sumaPerfectos = 0;

            leer = new Scanner(System.in);

            do {
                System.out.print("Introduzca el numero (positivo): ");
                numeroPerfecto = leer.nextInt();
            } while (numeroPerfecto<0);

            
            for (int j = 1; j < numeroPerfecto; j++) {
                restoPerfecto=numeroPerfecto%j;
                if (restoPerfecto==0) {
                    sumaPerfectos=sumaPerfectos+j;                
                }
            }
            if (sumaPerfectos==numeroPerfecto) {
                System.out.println(+numeroPerfecto+" es un numero perfecto");
            }else System.out.println(+numeroPerfecto+" no es un numero perfecto");


        // 14. Conversión a binario
        // Pide un número entero y muestra su representación en binario. Utilizando el algoritmo de la divison por 2
        // Ejemplo:
        // 13 → 1101.
        // Realiza la versión 2.0 y muestralo con 8 bits...........00001101

            int numeroBinarioDecimal, residuo;
            String numeroBinarioCorrecto;

            numeroBinarioCorrecto="";

            leer = new Scanner(System.in);

            do {
            System.out.print("Introduzca el numero (positivo): ");
            numeroBinarioDecimal = leer.nextInt();
            } while (numeroBinarioDecimal<0);

            while (numeroBinarioDecimal>0) {
            residuo=numeroBinarioDecimal%2;
            numeroBinarioDecimal/=2;
            numeroBinarioCorrecto=numeroBinarioCorrecto+residuo;
            }

            int longitudBinario = numeroBinarioCorrecto.length();
            String ceros="0";

            while (longitudBinario<8) {
            if (longitudBinario<8) {
            numeroBinarioCorrecto=ceros+numeroBinarioCorrecto;
            } 
            longitudBinario = numeroBinarioCorrecto.length();
            }

            System.out.println("El numero binario con el metodo .length es "+numeroBinarioCorrecto);
            System.out.println("El binario correcto con el metodo de conversion a binario es "+numeroBinarioCorrecto);

            

        // 15. Adivina el número
        // El programa genera un número aleatorio entre 1 y 100.
        // El usuario debe adivinarlo en el menor número de intentos posibles. Maximo intentos 5.
        // Después de cada intento, se le dirá si el número es mayor o menor.

            int numAleatorio, numMin, numMax, contraseñaIntro, contadorIntentos;

            numMin=1;
            numMax=100;
            contadorIntentos=4;

            numAleatorio = (int) (Math.random()* (numMax-numMin+1)+numMin);

            leer = new Scanner(System.in);


            do {
                System.out.println("---------------------------------------");
                System.out.print("Introduzca un numero entre 1 y 100 : ");
                contraseñaIntro=leer.nextInt();                
                if (contraseñaIntro!=numAleatorio) {
                    if (contraseñaIntro>numAleatorio) {
                        System.out.println("Friooo, bajale dos tonitos.");
                    }else System.out.println("Caliente, subeleee!.");
                    System.out.println("Intentos restantes : "+contadorIntentos);
                    contadorIntentos--;
                }
                if (contraseñaIntro==numAleatorio) {
                    System.out.println("Contraseña Correcta, felicidades.");
                    System.out.println("---------------------------------------");
                    break;
                }
            } while (numAleatorio!=contraseñaIntro && contadorIntentos>=0);

            if (numAleatorio!=contraseñaIntro && contadorIntentos<0){
                System.out.println("---------------------------------------");
                System.out.println("La contraseña era : "+numAleatorio); 
                System.out.println("---------------------------------------"); 
            }

            
        // 16. Calcular el MCD (Máximo Común Divisor)
        // Enunciado:
        // Pide dos números e imprime su MCD usando el algoritmo de Euclides.
        // “Aceptará dos números enteros positivos y obtendrá el resto de la división del mayor entre el menor. Si el resto se hace 0, el
        // M.C.D . será el menor. Si no es así, se dividirá el mayor entre el resto de la última división realizada hasta que uno de los
        // restos se haga nulo. El último divisor será el M.C.D”.
        // Ejemplo:
        // MCD(48, 18) = 6

            int dividendo,copiaDividendo,copiaDivisor, divisor, cociente, restoMCD, paso, temp;
            String sPaso, sDividendo, sDivisor, sCociente, sResto;

            paso = 1;

            sPaso = "Paso";
            sDividendo = "Dividendo";
            sDivisor = "Divisor";
            sCociente = "Cociente";
            sResto = "Resto";

            System.out.println("=============================================================="); // esto es para mostrar

            leer = new Scanner(System.in);

            do {
                System.out.print("Introduzca el primer numero del MCD (entero y positivo) : ");
                dividendo = leer.nextInt();
                if (dividendo<0) {
                    System.out.println("Por favor, solo numeros positivos.");
                }
            } while (dividendo<0); // validacion simple
            

            do {
                System.out.print("Introduzca el segundo numero del MCD (entero y positivo) : ");
                divisor = leer.nextInt();
                if (divisor<0) {
                    System.out.println("Por favor, solo numeros positivos.");
                }
            } while (divisor<0); // validacion simple
            

            if (divisor>dividendo) { // cambio de valor de variables si divisor es mayor que dividendo
                temp=divisor;
                divisor=dividendo;
                dividendo=temp;
            }

            copiaDividendo=dividendo; // esto es para mostrar
            copiaDivisor=divisor; // esto es para mostrar

            System.out.println("=============================================================="); // esto es para mostrar
            System.out.printf("%-12s%-12s%-12s%-12s%-12s%n",sPaso,sDividendo,sDivisor,sCociente,sResto); // esto es para mostrar

            do {
                restoMCD=dividendo%divisor; // calculo resto para mostrarlo
                cociente=dividendo/divisor; // calculo cociente para mostrarlo
                System.out.printf("%-12d%-12d%-12d%-12d%-12d%n",paso,dividendo,divisor,cociente,restoMCD); // aqui se va mostrando desglosado
                if (restoMCD!=0) { // si resto es distinto de 0
                    dividendo=divisor; // dividendo coge el valor de divisor
                    divisor=restoMCD; // divisor coge el valor de resto
                    paso++; // siguiente vuelta (esto es para mostrar)   
                }
            } while (restoMCD!=0); // seguir haciendo mientras resto sea distinto de 0

            System.out.println("=========================================================");
            System.out.println("MCD("+copiaDividendo+","+copiaDivisor+")="+divisor); // esto es para mostrar la cuenta sin desglosar
            System.out.println("=========================================================");



        // 17. Factorización en primos
        // Enunciado:
        // Pide un número entero y muestra su descomposición en factores primos.
        // Ejemplo:
        // 60 = 2 × 2 × 3 × 5 

            int numeroPrimos, contadorPrimos,comprobacionPrimos;

            leer = new Scanner(System.in);

            do {
                System.out.print("Introduzca el numero a factorizar (entero y positivo) : ");
                numeroPrimos = leer.nextInt();
                if (numeroPrimos<0) {
                    System.out.println("Por favor, solo numero positivo.");
                }

            } while (numeroPrimos<0);

            contadorPrimos=2;
            
            System.out.print(numeroPrimos+" = ");

            do {
                comprobacionPrimos=numeroPrimos%contadorPrimos;

                if (comprobacionPrimos==0) 
                {
                    System.out.print(contadorPrimos+" x ");
                    numeroPrimos/=contadorPrimos;
                }else if (comprobacionPrimos!=0) 
                {
                    contadorPrimos++;
                }
            } while (contadorPrimos<=numeroPrimos); // cambiar el do while por un for por que estoy usando un do while como un for y el if puedo hacer un while


        // 18. Número Armstrong
        // Enunciado:
        // Un número Armstrong es aquel que es igual a la suma de sus dígitos elevados al número de cifras que tiene.
        // Ejemplo:
        // 153 = 13 + 53 + 33
        // Extensión:
        // Mostrar todos los números Armstrong entre 10 y 10000.


            int numArm, copianumArm, copianumArm2, cantNum, ultDigArm, almaArm;

            cantNum=0;
            almaArm=0;
            ultDigArm=0;

            leer = new Scanner(System.in);

            /*
            do {
                System.out.print("Introduzca el numero a factorizar (entero y positivo) : ");
                numArm = leer.nextInt();
                if (numArm<0) {
                    System.out.println("Por favor, solo numero positivo.");
                }
            } while (numArm<0);
            */

            numArm=1;

            for (int k = 10; k <= 10000; k++) {
            
            copianumArm=k;
            copianumArm2=k;
                       

            while (copianumArm>0) { // detecto cantidad de digitos tiene el numero
                cantNum++;
                copianumArm/=10; // se usa una copia por que se destruye el numero
            }
            
            while (copianumArm2>0) { 
                ultDigArm=copianumArm2%10; // aqui saco el ultimo digito
                almaArm+= Math.pow(ultDigArm,cantNum); // acumulo cada digito elevado por la cantidad de digitos que tenia el numero original
                copianumArm2/=10; // voy quitandole la ultima cifra al numero, para volver a sacarle el nuevo ultimo digito
            }

            cantNum=0; // reseteo el contador de la cantidad para el siguiente numero

            if (almaArm==k) { // aqui comparo si el acumulado es igual al numero en el que estamos, que me diga que es un numero armstrong
                System.out.println(almaArm+" es un numero armstrong.");
            }

            almaArm=0; // reseteo el acumulado para el siguiente numero
            
            }



        // 20. Números Amigos
        // Crea un programa que pida dos números enteros y determine si son "números amigos". Dos números son
        // amigos si la suma de los divisores propios de uno es igual al otro número, y viceversa. El par de números
        // amigos más conocido es 220 y 284.

            
            int numAmigo1, numAmigo2, sumaDivisoresNumAmigo1, sumaDivisoresNumAmigo2;

            sumaDivisoresNumAmigo1=0;
            sumaDivisoresNumAmigo2=0;

            leer = new Scanner(System.in);

            do {
                System.out.print("Introduzca el primer numero (entero y positivo) : ");
                numAmigo1 = leer.nextInt();
                if (numAmigo1<0) {
                    System.out.println("Por favor, solo numero positivo.");
                }
            } while (numAmigo1<0);

            do {
                System.out.print("Introduzca el segundo numero (entero y positivo) : ");
                numAmigo2 = leer.nextInt();
                if (numAmigo2<0) {
                    System.out.println("Por favor, solo numero positivo.");
                }
            } while (numAmigo2<0);

            for (int l = 1; l < numAmigo1; l++) {
                if (numAmigo1%l==0) {
                    sumaDivisoresNumAmigo1+=l;
                }   
            }

            for (int j = 1; j < numAmigo2; j++) {
                if (numAmigo2%j==0) {
                    sumaDivisoresNumAmigo2+=j;
                }
            }

            if (sumaDivisoresNumAmigo1==numAmigo2 & sumaDivisoresNumAmigo2==numAmigo1) {
                    System.out.println("El "+numAmigo1+" y el "+numAmigo2+" son numeros amigos.");
                }


        // EJERCICIO 4 DEL EXAMEN NUMEROS PRIMOS SEXYS

        int nume1, nume2;
        int limInf, limSup;

        boolean esNumPrimo=true;

        limInf = 20;
        limSup = 100;
        nume1= 0;
        nume2= 0;

        // 1. VAMOS A SACAR LOS INTERVALOS ENTRE 20 Y 100.

            for (int x = limInf; x <= limSup-6; x++) {
                nume1=x;
                nume2=x+6;

                // 2.1 COMPRUEBO QUE EL PRIMERO SEA PRIMO
                esNumPrimo= primo(nume1);
                
                // 2.2 COMPRUEBO QUE EL SEGUNDO SEA PRIMO
                esNumPrimo=primo(nume2);
                

                // 3. SI AMBOS SON PRIMOS LOS MUESTRO
                boolean esPrimoNum1=esNumPrimo= primo(nume1);
                boolean esPrimoNum2=esNumPrimo= primo(nume2);

                if (esPrimoNum1 && esPrimoNum2) {
                    System.out.println(nume1+" - "+nume2);
                }
                
            }
           
    }

    private boolean primo(int num) {
        boolean esPrimo=true;
        for (int i= 2; i <= Math.sqrt(num); i++) {      
            if (num%i==0) {
                esPrimo=false;
            }
        }
        return esPrimo;
    }
}



