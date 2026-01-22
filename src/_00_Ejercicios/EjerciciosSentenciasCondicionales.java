package _00_Ejercicios;

import java.util.Scanner;

public class EjerciciosSentenciasCondicionales {

    public EjerciciosSentenciasCondicionales(){

        boolean ejercicioValido;
    // SELECTOR DE EJERCICIOS //
        do {
            System.out.println("|---------------------------------------------|");
            System.out.println("|         SELECTOR   DE   EJERCICIOS          |");
            System.out.println("|---------------------------------------------|");
            System.out.println("|  1. Te dice que toca a primera.             |");
            System.out.println("|  2. Reloj.                                  |");
            System.out.println("|  3. Detector horas extras y calculadora.    |");
            System.out.println("|  4. Horoscopo.                              |");
            System.out.println("|  5. Temporizador segundos hasta medianoche. |");
            System.out.println("|  6. Organizador 3 cifras dadas.             |");
            System.out.println("|  7. Detector de la ultima cifra.            |");
            System.out.println("|  8. Detector de la primera cifra (max 5).   |");
            System.out.println("|  9. Dectector de longitud numero (max 5).   |");
            System.out.println("| 10. Dectector capicua.                      |");
            System.out.println("| 11. Factura (PROMO / IVA).                  |");
            System.out.println("| 12. Nomina (Vacaciones / IRPF).             |");
            System.out.println("|---------------------------------------------|");
            System.out.print("Introduce el codigo del ejercicio que quieres realizar :  ");

            int selector;
            Scanner leer = new Scanner(System.in);
            selector = leer.nextInt();
            ejercicioValido=selector<=12 && selector>=1;
            if (ejercicioValido) {
                
            switch (selector) {
                case 1:

                // EJERCICIO 1: Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a 
                // primera hora ese día.

                    int semana;

                    System.out.println("-----------------");
                    System.out.println("DIAS DE LA SEMANA");
                    System.out.println("-----------------");
                    System.out.println("1. Lunes");
                    System.out.println("2. Martes");
                    System.out.println("3. Miercoles");
                    System.out.println("4. Jueves");
                    System.out.println("5. Viernes");
                    System.out.println("6. Sabado");
                    System.out.println("7. Domingo");
                    System.out.println("-----------------");

                    leer = new Scanner(System.in);
                    System.out.print("\n Introduce el valor del dia de la semana, que quieras saber que asignatura toca a priemra hora : ");
                    semana = leer.nextInt();

                    switch(semana){
                        case 1:
                            System.out.println("A primera hora toca IPE");
                            break;
                        case 2:
                            System.out.println("A primera hora toca Bases de Datos");
                            break;
                        case 3:
                            System.out.println("A primera hora toca Lenguaje de Marca");
                            break;
                        case 4:
                            System.out.println("A primera hora toca IPE");
                            break;
                        case 5:
                            System.out.println("A primera hora toca Bases de Datos");
                            break;
                        case 6:
                        // al no poner nada en el caso 6, sabado pasa al 7 domingo y como el resultado es el mismo muestran lo mismo
                        case 7:
                            System.out.println("Es fin de semana y no hay clases");
                            break;
                        default:
                            System.out.println("El dia introducido no es valido");
                            break;
                    }
                    
                    break;

                case 2:

                // EJERCICIO 2: Realiza un programa que pida una hora por teclado y que muestre luego buenos días,
                // buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y 
                // de 21 a 5 respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir
                // por teclado.

                    int hora;
                    
                    leer = new Scanner(System.in);
                    System.out.print("Introduzca la hora sin minutos : ");
                    hora = leer.nextInt();

                    if (hora>=6 && hora<=12) {

                        System.out.println("Buenos dias");
                        
                    }else if (hora>=13 && hora<=20) {

                        System.out.println("Buenas tardes");
                        
                    }else if(hora>=21 && hora<=24) {

                        System.out.println("Buenas noches");
                        
                    }else if (hora>=0 && hora<=5) {

                        System.out.println("Buenas noches");
                        
                    }else {

                        System.out.println("El dia solo tiene 24 horas");

                    }
                    
                    break;
                    
                case 3:

                // EJERCICIO 3: Escribe un programa que calcule el salario semanal de un trabajador teniendo en 
                // cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
                // A partir de la hora 41, se pagan a 16 euros la hora.

                    double horasTrabajadas;
                    double salTotal, salExtras, salNormal;
                    final int precioExtras, precioNormal;
                    final int horasPermitidas;

                    horasPermitidas = 40;
                    precioExtras = 16;
                    precioNormal = 12;

                    leer = new Scanner(System.in);
                    System.out.print("Introduzca el total de horas trabajadas esta semana : ");
                    horasTrabajadas = leer.nextDouble();

                    if (horasTrabajadas>horasPermitidas) {

                        salExtras = (horasTrabajadas - horasPermitidas)* precioExtras;
                        salNormal = horasPermitidas * precioNormal;
                        salTotal = salExtras + salNormal;

                        System.out.println("El sueldo total del trabajador es : "+ salTotal);
                    
                    }else if ((horasTrabajadas<=horasPermitidas) && (horasTrabajadas>=0)) {

                        salTotal = horasTrabajadas * precioNormal;

                        System.out.println("El sueldo del trabajador es : "+ salTotal);

                    }else {

                        System.out.println("Introduzca un valor valido");

                    }
                    
                    break;

                case 4:

                // EJERCICIO 4: Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.

                    int mes;
                    int dia;

                    System.out.println("MESES DEL AÑO");
                    System.out.println("-------------");
                    System.out.println("1. Enero");
                    System.out.println("2. Febrero");
                    System.out.println("3. Marzo");
                    System.out.println("4. Abril");
                    System.out.println("5. Mayo");
                    System.out.println("6. Junio");
                    System.out.println("7. Julio");
                    System.out.println("8. Agosto");
                    System.out.println("9. Septiembre");
                    System.out.println("10. Octubre");
                    System.out.println("11. Noviembre");
                    System.out.println("12. Diciembre");
                    System.out.println("-------------");
                    
                    leer = new Scanner(System.in);
                    System.out.print("Introduce el numero correspondiente a su mes de nacimiento : ");
                    mes = leer.nextInt();
                
                    System.out.print("Introduce el dia en que nacio : ");
                    dia = leer.nextInt();
                
                    switch (mes) {
                        case 1:
                            if (dia>=1 && dia<=19) {
                
                                System.out.println("Tu horoscopo es Capricornio");
                                
                            }else if (dia>=20 && dia<=31) {
                
                                System.out.println("Tu horoscopo es Acuario");
                                
                            } else {
                
                                System.out.println("Dia de nacimiento no valido");
                                
                            }
                            break;
                        
                        case 2:
                            if (dia>=1 && dia<=18) {
                
                                System.out.println("Tu horoscopo es Acuario");
                                
                            }else if (dia>=19 && dia<=28) {
                
                                System.out.println("Tu horoscopo es Piscis");
                                
                            } else {
                
                                System.out.println("Dia de nacimiento no valido");
                                
                            }
                            break;
                
                        case 3:
                            if (dia>=1 && dia<=20) {
                
                                System.out.println("Tu horoscopo es Piscis");
                                
                            }else if (dia>=21 && dia<=31) {
                
                                System.out.println("Tu horoscopo es Aries");
                                
                            } else {
                
                                System.out.println("Dia de nacimiento no valido");
                                
                            }
                            break;
                
                        case 4:
                            if (dia>=1 && dia<=19) {
                
                                System.out.println("Tu horoscopo es Aries");
                                
                            }else if (dia>=20 && dia<=30) {
                
                                System.out.println("Tu horoscopo es Tauro");
                                
                            } else {
                
                                System.out.println("Dia de nacimiento no valido");
                                
                            }
                            break;
                
                        case 5:
                            if (dia>=1 && dia<=20) {
                
                                System.out.println("Tu horoscopo es Tauro");
                                
                            }else if (dia>=21 && dia<=31) {
                
                                System.out.println("Tu horoscopo es Geminis");
                                
                            } else {
                
                                System.out.println("Dia de nacimiento no valido");
                                
                            }
                            break;
                        
                        case 6:
                            if (dia>=1 && dia<=20) {
                
                                System.out.println("Tu horoscopo es Geminis");
                                
                            }else if (dia>=21 && dia<=30) {
                
                                System.out.println("Tu horoscopo es Cancer");
                                
                            } else {
                
                                System.out.println("Dia de nacimiento no valido");
                                
                            }
                            break;
                
                        case 7:
                            if (dia>=1 && dia<=22) {
                
                                System.out.println("Tu horoscopo es Cancer");
                                
                            }else if (dia>=23 && dia<=31) {
                
                                System.out.println("Tu horoscopo es Leo");
                                
                            } else {
                
                                System.out.println("Dia de nacimiento no valido");
                                
                            }
                            break;
                
                
                        case 8:
                            if (dia>=1 && dia<=22) {
                
                                System.out.println("Tu horoscopo es Leo");
                                
                            }else if (dia>=23 && dia<=31) {
                
                                System.out.println("Tu horoscopo es Virgo");
                                
                            } else {
                
                                System.out.println("Dia de nacimiento no valido");
                                
                            }
                            break;
                
                        case 9:
                            if (dia>=1 && dia<=22) {
                
                                System.out.println("Tu horoscopo es Virgo");
                                
                            }else if (dia>=23 && dia<=30) {
                
                                System.out.println("Tu horoscopo es Libra");
                                
                            } else {
                
                                System.out.println("Dia de nacimiento no valido");
                                
                            }
                            break;
                
                        case 10:
                            if (dia>=1 && dia<=22) {
                
                                System.out.println("Tu horoscopo es Libra");
                                
                            }else if (dia>=23 && dia<=31) {
                
                                System.out.println("Tu horoscopo es Escorpio");
                                
                            } else {
                
                                System.out.println("Dia de nacimiento no valido");
                                
                            }
                            break;
                
                        case 11:
                            if (dia>=1 && dia<=21) {
                
                                System.out.println("Tu horoscopo es Escorpio");
                                
                            }else if (dia>=22 && dia<=30) {
                
                                System.out.println("Tu horoscopo es Sagitario");
                                
                            } else {
                
                                System.out.println("Dia de nacimiento no valido");
                                
                            }
                            break;
                
                        case 12:
                            if (dia>=1 && dia<=21) {
                
                                System.out.println("Tu horoscopo es Sagitario");
                                
                            }else if (dia>=22 && dia<=31) {
                
                                System.out.println("Tu horoscopo es Capricornio");
                                
                            } else {
                
                                System.out.println("Dia de nacimiento no valido");
                                
                            }
                            break;
                
                        default:
                            System.out.println("El mes introducido no es valido");
                            break;
                    }
                    
                    break;

                case 5:

                // EJERCICIO 5: Escribe un programa que dada una hora determinada (horas y minutos), calcule
                // los segundos que faltan para llegar a la medianoche.
    
                    final int horaDia, minHora, segMin, segDia;
                    int horaActual, minActual;
                    int segHoraActual, segMinActual, segDiaActual, temporizador;

                    horaDia = 24;
                    minHora = 60;
                    segMin = 60;
                    segDia = (horaDia * minHora)* segMin;

                    leer = new Scanner(System.in);
                    System.out.print("Introduzca la hora actual sin minutos : ");
                    horaActual = leer.nextInt();

                    System.out.print("Introduzca ahora los minutos : ");
                    minActual = leer.nextInt();

                    if (horaActual<24) {

                        segHoraActual = (horaActual * minHora)* segMin;
                        segMinActual = minActual * segMin;
                        segDiaActual = segHoraActual + segMinActual;
                        temporizador = segDia - segDiaActual;
                        System.out.println("Quedan "+ temporizador +" segundos para la media noche");

                    } else if (minActual>59) { 

                        System.out.println("Introduzca los minutos correctamente");
                        
                    } else {

                        System.out.println("Introduzca la hora correctamente");

                    }
                    
                    break;

                case 6:

                // EJERCICIO 6: Escribe un programa que ordene tres numeros enteros introducidos por teclado
    
                    int num1, num2, num3, aux;

                    leer = new Scanner(System.in);
                    System.out.print("Introduce el primer numero : ");
                    num1 = leer.nextInt();
                    
                    System.out.print("Introduce el segundo numero : ");
                    num2 = leer.nextInt();
                    
                    System.out.print("Introduce el tercer numero : ");
                    num3 = leer.nextInt();

                    
                    if (num1 > num2) {
                        aux = num1;
                        num1 = num2;
                        num2 = aux;         
                            } 
                    
                    if (num2 > num3) {
                        aux = num2;
                        num2 = num3;
                        num3 = aux;         
                            } 
                    
                    if (num1 > num2) {
                        aux = num1;
                        num1 = num2;
                        num2 = aux;         
                            } 
    
                    System.out.println("El orden sería : "+num1+" -> "+num2+" -> "+num3);
                    
                    break;

                case 7:

                // EJERCICIO 7: Escribe un programa que diga cual es la ultima cifra de un numero entero
                // introducido por teclado.

                    int num, ultimaCifra;
                    
                    leer = new Scanner(System.in);
                    System.out.print("Introduzca un numero por teclado y devolvere el ultimo digito del numero : ");
                    num = leer.nextInt();

                    if (num>=0){
                        ultimaCifra = num%10;
                        System.out.println("La ultima cifra del numero introducido es : "+ ultimaCifra);

                    }else if (num<0){
                        ultimaCifra = (num%10)*-1;
                        System.out.println("La ultima cifra del numero introducido es : "+ ultimaCifra);
                    }
                    
                    break;

                case 8:

                // EJERCICIO 8: Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado.
                // Se permiten números de hasta 5 cifras.

                    int numCifra, cifraPrimera;

                    leer = new Scanner(System.in);
                    System.out.print("Introduce un numero entero y devolvere el primer digito del numero (max 5 digitos) : ");
                    numCifra = leer.nextInt();

                    if (numCifra>=10000 && numCifra<=99999 || numCifra>=-99999 && numCifra<=-10000) {
                        if (numCifra>=10000 && numCifra<=99999 ) {
                            cifraPrimera = numCifra / 10000;
                            System.out.println("La primera cifra es : "+cifraPrimera);
                            
                        }else {
                            cifraPrimera = (numCifra / 10000)*-1;
                            System.out.println("La primera cifra es : "+cifraPrimera);
                        }       
                        
                    } else if (numCifra>=1000 && numCifra<=9999 || numCifra>=-9999 && numCifra<=-1000) {
                        if (numCifra>=1000 && numCifra<=9999 ) {
                            cifraPrimera = numCifra / 1000;
                            System.out.println("La primera cifra es : "+cifraPrimera);
                            
                        }else {
                            cifraPrimera = (numCifra / 1000)*-1;
                            System.out.println("La primera cifra es : "+cifraPrimera);
                        } 
                    } else if (numCifra>=100 && numCifra<=999 || numCifra>=-999 && numCifra<=-100) {
                        if (numCifra>=100 && numCifra<=999 ) {
                            cifraPrimera = numCifra / 100;
                            System.out.println("La primera cifra es : "+cifraPrimera);
                            
                        }else {
                            cifraPrimera = (numCifra / 100)*-1;
                            System.out.println("La primera cifra es : "+cifraPrimera);
                        } 
                    } else if (numCifra>=10 && numCifra<=99 || numCifra>=-99 && numCifra<=-10) {
                        if (numCifra>=10 && numCifra<=99 ) {
                            cifraPrimera = numCifra / 10;
                            System.out.println("La primera cifra es : "+cifraPrimera);
                            
                        }else {
                            cifraPrimera = (numCifra / 10)*-1;
                            System.out.println("La primera cifra es : "+cifraPrimera);
                        } 
                    } else if (numCifra>=1 && numCifra<=9 || numCifra>=-9 && numCifra<=-1) {
                        if (numCifra>=1 && numCifra<=9 ) {
                            cifraPrimera = numCifra / 1;
                            System.out.println("La primera cifra es : "+cifraPrimera);
                            
                        }else {
                            cifraPrimera = (numCifra / 1)*-1;
                            System.out.println("La primera cifra es : "+cifraPrimera);
                        } 
                    } else { 
                    
                        System.out.println("Introduzca un valor valido");
                        
                    }
                    
                    break;

                case 9:

                // EJERCICIO 9: Escribe un programa que nos diga cuantos digitos tiene un numero entero que puede ser positivo o negativo.
                // Se permiten numeros de hasta 5 digitos.


                    int numLong;

                    leer = new Scanner(System.in);
                    System.out.print("Introduce un numero para saber cuantos digitos tiene (max 5 digitos): ");
                    numLong = leer.nextInt();

                    if (numLong>=10000 && numLong<=99999 || numLong>=-99999 && numLong<=-10000) {

                        System.out.println("Tu numero tiene 5 cifras");            
                        
                    } else if (numLong>=1000 && numLong<=9999 || numLong>=-9999 && numLong<=-1000) {

                        System.out.println("Tu numero tiene 4 cifras");
                        
                    } else if (numLong>=100 && numLong<=999 || numLong>=-999 && numLong<=-100) {

                        System.out.println("Tu numero tiene 3 cifras");
                        
                    } else if (numLong>=10 && numLong<=99 || numLong>=-99 && numLong<=-10) {

                        System.out.println("Tu numero tiene 2 cifras");
                        
                    } else if (numLong>=1 && numLong<=9 || numLong>=-9 && numLong<=-1) {

                        System.out.println("Tu numero tiene 1 cifra");
                        
                    } else {

                        System.out.println("Introduce un numero valido");            
                        
                    }
                    
                    break;

                case 10:

                // EJERCICIO 10: Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa.
                // Se permiten números de hasta 5 cifras.

                    int numTeclado, cifra1, cifra2, cifra3, cifra4, cifra5, cifra1y2, cifra3y4, cifra4y5;

                    leer = new Scanner(System.in);
                    System.out.print("Introduzca un numero entero positivo para saber si es capicua (max 5 digitos) : ");
                    numTeclado = leer.nextInt();

                    if (numTeclado>=10000 && numTeclado<=99999 || numTeclado>=-99999 && numTeclado<=-10000) {
                        cifra4y5 = numTeclado%100;
                        cifra1y2 = numTeclado/1000;
                        cifra1 = cifra1y2/10;
                        cifra2 = cifra1y2%10;
                        cifra4 = cifra4y5/10;
                        cifra5 = cifra4y5%10;
                        if (cifra1==cifra5 && cifra2==cifra4) {
                            System.out.println(numTeclado+" es capicua");
                        }else System.out.println(numTeclado+" no es capicua");                     
                        
                    } else if (numTeclado>=1000 && numTeclado<=9999 || numTeclado>=-9999 && numTeclado<=-1000) {
                        cifra3y4 = numTeclado%100;
                        cifra1y2 = numTeclado/100;
                        cifra1 = cifra1y2/10;
                        cifra2 = cifra1y2%10;
                        cifra3 = cifra3y4/10;
                        cifra4 = cifra3y4%10;
                        if (cifra1==cifra4 && cifra2==cifra3) {
                            System.out.println(numTeclado+" es capicua");
                        }else System.out.println(numTeclado+" no es capicua");

                    } else if (numTeclado>=100 && numTeclado<=999 || numTeclado>=-999 && numTeclado<=-100) {
                        cifra1 = numTeclado%10;
                        cifra2 = numTeclado/100;
                        if (cifra1==cifra2) {
                            System.out.println(numTeclado+" es capicua");
                        }else System.out.println(numTeclado+" no es capicua");
                            
                    } else if (numTeclado>=10 && numTeclado<=99 || numTeclado>=-99 && numTeclado<=-10) {
                        cifra1 = numTeclado%10;
                        cifra2 = numTeclado/10;
                        if (cifra1==cifra2) {
                            System.out.println(numTeclado+" es capicua");
                        }else System.out.println(numTeclado+" no es capicua");
                        
                    } else if (numTeclado>=1 && numTeclado<=9 || numTeclado>=-9 && numTeclado<=-1) {

                        System.out.println(numTeclado+" es capicua");
                        
                    } else {

                        System.out.println("Introduce un valor valido");            
                        
                    }
                    
                    break;

                case 11:

                    // EJERCICIO 11: Escribe un programa que calcule el precio final de un producto según su base imponible 
                    // (precio antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el código 
                    // promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente.
                    // Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan respectivamente que no 
                    // se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%. El 
                    // ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados.


                    double baseImponible, promo, baseImponiblePROMO, valorIVA, totalFactura, IVA;
                    String codPromo;
                    String tipoIVA;

                    IVA = 0;
                    promo = 0;
                    
                    leer = new Scanner(System.in);
                    System.out.print("Introduzca la base imponible : ");
                    baseImponible = leer.nextDouble();
                    leer.nextLine();

                    System.out.print("Introduzca si tiene algun codigo promocional (nopro, mitad, menos5, 5porc) : ");
                    codPromo = leer.nextLine();

                    System.out.print("Introduzca el IVA aplicable a su factura (general, reducido o superreducido) : ");
                    tipoIVA = leer.nextLine();

                    switch (codPromo) {
                        case "nopro":
                            promo = 0;
                            break;

                        case "mitad":
                            promo = baseImponible * 0.5;
                            break;
                            
                        case "menos5":
                            promo = 5;
                            break;

                        case "5porc":
                            promo = baseImponible * 0.05;
                            break;
                
                        default:
                            System.out.println("Introduce un codigo de promocion valido.");
                            break;
                    }
                    switch (tipoIVA) {
                        case "general":
                            IVA = 0.21;                         
                            break;

                        case "reducido":
                            IVA = 0.10;
                            break;

                        case "superreducido":
                            IVA = 0.04;
                            break;

                        default:
                            System.out.println("Introduzca un tipo de IVA valido.");
                            break;
                    }

                    baseImponiblePROMO = baseImponible - promo;
                    valorIVA = baseImponiblePROMO * IVA;
                    totalFactura = baseImponiblePROMO + valorIVA;
                    System.out.println("---------------------------------");
                    System.out.println("Base Imponible : "+baseImponible);  
                    System.out.println("Codigo promocional "+codPromo+" : "+promo);  
                    System.out.println("---------------------------------");  
                    System.out.println("Base Imponible : "+baseImponiblePROMO);  
                    System.out.println("IVA (21%) : "+valorIVA);     
                    System.out.println("---------------------------------");    
                    System.out.println("Total Factura : "+totalFactura);      
                    System.out.println("---------------------------------");
                    
                    break;

                case 12:
                    
                    // EJERCICIO 12: Escribe un programa que genere la nomina (bien desglosada) de un empleado según las siguientes 
                    // condiciones: Se pregunta el cargo del empleado (1- Prog. junior, 2- Prog. senior, 3- Jefe proyecto), los dias
                    // que ha estado de viaje y su estado civil. El sueldo base según el cargo es de 950, 1200 y 1600 euros según si 
                    // se trata de un prog. junior, un prog. senior o un jefe de proyecto respectivamente. Por cada día de viaje 
                    // visitando clientes se pagan 30 euros extras en concepto de dietas. Al sueldo neto hay que restarle el IRPF, 
                    // que será de un 25% en caso de estar soltero y un 20% en caso de estar casado.
                
                
                    int diasVacaciones, puesto, estadoCivil;
                    double dietas, sueldoBase, sueldoBruto, sueldoNeto, valorIRPF, IRPF;

                    final double precioDietas = 30;

                    sueldoBase = 0;
                    IRPF = 0;

                    System.out.println("|-----------------------|");
                    System.out.println("|    EMPLEOS EMPRESA    |");
                    System.out.println("|-----------------------|");
                    System.out.println("| 1. Programador Junior |");
                    System.out.println("| 2. Programador Senior |");
                    System.out.println("| 3. Jefe de proyecto   |");
                    System.out.println("|-----------------------|");

                    leer = new Scanner(System.in);
                    System.out.print("Introduzca el cargo del empleado (1-3) : ");
                    puesto = leer.nextInt();

                    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? : ");
                    diasVacaciones = leer.nextInt();

                    System.out.print("Introduzca su estado civil (1. Soltero / 2. Casado ) : ");
                    estadoCivil = leer.nextInt();

                    switch (puesto) {
                        case 1:
                            sueldoBase = 950;
                            break;
                        case 2:
                            sueldoBase = 1200;
                            break;

                        case 3:
                            sueldoBase = 1600;
                            break;

                        default:
                            System.out.println("Introduzca un cargo de empleado valido.");
                            break;
                    }
                    if (estadoCivil == 1) {
                        IRPF = 0.25;                      
                    }else if (estadoCivil == 2) {
                        IRPF = 0.20;                        
                    } else {
                        System.out.println("Introduzca un estado civil valido.");
                    }

                    dietas = diasVacaciones * precioDietas;
                    sueldoBruto = sueldoBase + dietas;
                    valorIRPF = sueldoBruto * IRPF;
                    sueldoNeto = sueldoBruto - valorIRPF;
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("| Sueldo base : "+ sueldoBase);
                    System.out.println("| Dietas ( "+ diasVacaciones +" viajes ) : "+ dietas);
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("| Sueldo Bruto : "+ sueldoBruto);
                    System.out.println("| Retención IRPF "+(int)IRPF*100+" : "+ valorIRPF);
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("| Sueldo Neto : "+ sueldoNeto);
                    System.out.println("|-------------------------------------------------------|");   
                break;

            }
        }else System.out.println("Vuelva a introducir un ejercicio valido.");
        } while (!ejercicioValido);
        

        }
    
    }

