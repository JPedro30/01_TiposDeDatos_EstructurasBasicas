package _00_EstudioDatos_Estructuras_Clases_Metodos;

import java.util.Scanner;

public class EstudioPrintf {

    @SuppressWarnings("resource")
    public EstudioPrintf(){

        String relleno = "----------------------------------------";
        String espacio = " ";

        System.out.printf("%s%n",relleno);
        System.out.println("Estudio de formateo de Printf");
        System.out.printf("%s%n",relleno);
        

        // EJERCICIO 1: SALIDA FORMATEADA BASICA:
            System.out.printf("%14sEjercicio 1%n",espacio);
            System.out.printf("%s%n",relleno);
            String nombre = "Juan";
            int edad = 21;
            double altura = 1.823;

            System.out.printf("Nombre: %s%n",nombre);
            System.out.printf("Edad: %d%n",edad);
            System.out.printf("Altura: %.2f%n",altura);

            System.out.printf("%s%n",relleno);
        // EJERCICIO 2: TABLA DE PRODUCTOS:
            System.out.printf("%14sEjercicio 2%n",espacio);
            System.out.printf("%s%n",relleno);

            String producto = "Producto", precio = "Precio" , cantidad = "Cantidad", total = "Total";
            String manzana = "Manzana", platano = "Platano", pera = "Pera";
            double precioMan = 0.75, totalMan = 3, precioPla = 0.50, totalPla = 3, precioPer = 1.20, totalPer = 2.4;
            int cantidadMan = 4, cantidadPla = 6, cantidadPer = 2;

            System.out.printf("%-11s%10s%10s%8s%n",producto,precio,cantidad,total);
            System.out.printf("%s%n",relleno);
            System.out.printf("%-10s%10.2f%7d%12.2f%n",manzana,precioMan,cantidadMan,totalMan);
            System.out.printf("%-10s%10.2f%7d%12.2f%n",platano,precioPla,cantidadPla,totalPla);
            System.out.printf("%-10s%10.2f%7d%12.2f%n",pera,precioPer,cantidadPer,totalPer);


            System.out.printf("%s%n",relleno);
        // EJERCICIO 3: PIDE POR TECLADO EL NOMBRE Y NOTA DE TRES ALUMNOS Y MUESTRA EL RESULTADO.
            System.out.printf("%14sEjercicio 3%n",espacio);
            System.out.printf("%s%n",relleno);
            
            String nombre1, nombre2, nombre3, alumno, nota;
            double nota1, nota2, nota3;

            alumno = "Alumno";
            nota = "Nota";

            Scanner leer = new Scanner(System.in);
            System.out.print("Introduzca el nombre del primer alumno : ");
            nombre1 = leer.nextLine();
            System.out.print("Introduzca la nota del primer alumno : ");
            nota1 = leer.nextDouble();
            leer.nextLine();
            System.out.printf("%s%n",relleno);

            System.out.print("Introduzca el nombre del segundo alumno : ");
            nombre2 = leer.nextLine();
            System.out.print("Introduzca la nota del segundo alumno : ");
            nota2 = leer.nextDouble();
            leer.nextLine();
            System.out.printf("%s%n",relleno);

            System.out.print("Introduzca el nombre del tercer alumno : ");
            nombre3 = leer.nextLine();
            System.out.print("Introduzca la nota del tercer alumno : ");
            nota3 = leer.nextDouble();
            leer.nextLine();

            System.out.printf("%s%n",relleno);

            System.out.printf("%-15s%15s%n",alumno,nota);
            System.out.printf("%s%n",relleno);
            System.out.printf("%-15s%15.2f%n",nombre1,nota1);
            System.out.printf("%-15s%15.2f%n",nombre2,nota2);
            System.out.printf("%-15s%15.2f%n",nombre3,nota3);
            System.out.printf("%s%n",relleno);

            
            // EJERCICIO 4: RETO FINAL FACTURA
            System.out.printf("%14sEjercicio 4%n",espacio);

            String titulofactura = "FACTURA SUPERMERCADO", unid = "Unid", totalPagar = "TOTAL A PAGAR";
            String pan = "Pan", leche = "Leche", huevos = "Huevos";
            int unidPan = 2, unidLeche = 3, unidHuevos = 1;
            double precioPan = 1.20, precioLeche = 0.95, precioHuevos = 2.50;
            double totalPan = 2.40, totalLeche = 2.85, totalHuevos = 2.50;
            double totalFactura = 7.75;

            System.out.printf("%s%n",relleno);
            System.out.printf("%10s%s%n",espacio,titulofactura);
            System.out.printf("%s%n",relleno);
            System.out.printf("%-10s%10s%10s%10s%n",producto,precio,unid,total);
            System.out.printf("%-10s%10.2f%10d%10.2f%n",pan,precioPan,unidPan,totalPan);
            System.out.printf("%-10s%10.2f%10d%10.2f%n",leche,precioLeche,unidLeche,totalLeche);
            System.out.printf("%-10s%10.2f%10d%10.2f%n",huevos,precioHuevos,unidHuevos,totalHuevos);
            System.out.printf("%s%n",relleno);
            System.out.printf("%-30s%10.2f%n",totalPagar,totalFactura);
            System.out.printf("%s%n",relleno);

    }

}
