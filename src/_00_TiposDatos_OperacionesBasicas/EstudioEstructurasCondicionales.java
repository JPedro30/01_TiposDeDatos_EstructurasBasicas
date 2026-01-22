package _00_TiposDatos_OperacionesBasicas;

import java.util.Scanner;

public class EstudioEstructurasCondicionales {

    @SuppressWarnings("resource")
    public EstudioEstructurasCondicionales(){

        System.out.println("Estudio de Estructuras Condicionales");

        // ESTRUCTURA IF //

        /* IF ( CONDICION VERDADERA O FALSA ){ LO QUE ESTE DENTRO DE LA LLAVE SE EJECUTA SI ES VERDADERO
         *  }ELSE {SI QUIERO EJECUTAR ALGO SI ES FALSO} LUEGO SIGUE EL CODIGO // CON ELSE IF AÑADIMOS UNA
         * SEGUNDA CONDICION DEBEN DE SER EXCLUYENTES */

        boolean bisiesto = true;
        if (bisiesto){
            System.out.println("El año es bisiesto, tiene 366 días");
        }
        else{
            System.out.println("El año no es bisiesto, tiene 365 días");
        }
        System.out.println("======================================");
        
        int mayorEdad;
        mayorEdad = 18;

        if(mayorEdad>=18){
            System.out.println("Puede acceder, usted es mayor de edad");
        }
        else{
            System.out.println("No puede acceder, usted es menor de edad");
        }

        int num;

        System.out.print("Introduzca un numero : ");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        leer = null;

        if(num>=0){
            System.out.println("El numero introducido es positivo");
        }
        else{
            System.out.println("El numero introducido es negativo");
        }


        int edadLuis = 1;
        int edadPedro = 2;

        if (edadLuis<18&&edadPedro<18) {
            System.out.println("Ambos son menores de edad y no pueden votar");
        }else if (edadLuis>=18&&edadPedro>=18) {
            System.out.println("Ambos son mayores de edad y pueden votar");            
        } else {
            System.out.println("Uno de los dos es menor por lo cual no puede votar");
        }

        //  ESTUDIO SWITCH //

        int mes = 5;
        
        switch(mes){

            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Ese mes no existe");
                break;
            
        }

        System.out.println("CALCULO DE AREAS");
        System.out.println("----------------");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        System.out.print("\n Eliga una el numero de la opcion que quiera calcular : ");

        leer = new Scanner(System.in);
        int opcion = leer.nextInt();

        double lado, base, altura, area;

        switch(opcion){
            case 1:
                System.out.print("Ingrese el lado del cuadrado : ");
                lado = leer.nextDouble();
                area = lado * lado;
                System.out.println("El area del cuadrado es: "+ area);
                break;
            
            case 2:
                System.out.print("Ingrese la base del rectangulo : ");
                base = leer.nextDouble();
                System.out.print("Ingrese la altura del rectangulo : ");
                altura = leer.nextDouble();
                area = base * altura;
                System.out.println("El area del rectangulo es: "+ area);
                break;

            case 3:
                System.out.println("Ingrese la base del triangulo : ");
                base = leer.nextDouble();
                System.out.println("Ingrese la altura del triangulo : ");
                altura = leer.nextDouble();
                area = (base * altura)/ 2;
                System.out.println("El area del triangulo es: "+ area);
                break;

            default:
                System.out.println("El valor introducido no es valido");
                break;

        }

    }

}
