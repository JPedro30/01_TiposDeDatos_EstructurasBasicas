package _00_EstudioDatos_Estructuras_Clases_Metodos;

import java.time.LocalDate;

public class EstudioMetodos {

    public EstudioMetodos(){

        System.out.println("Estudio metodos funciona");

        // los metodos se definen a nivel de clase, y tienen "ambito" (desde donde es accesible el metodo)
        // "valor" (que es lo que devuelve el metodo), "nombre" (nombre del metodo), "()" (dentro del parentesis estarán los parametros que reciba).
        // por ultimo { aqui se escribiría el cuerpo del metodo que se ejecutara cada vez que se llame al metodo }

        saludo(); // asi se llama a un metodo.

        // METODOS CON PARAMETROS Y SIN RETORNOS (VOID): Estos metodos reciben información (parametros), pero no devuelven ningun valor.
            
            String nombre1= "Marcos", nombre2="Arturo";
            saludarPersona(nombre1); // aqui pido que salude al nombre que introduzco por parametros
            saludarPersona(nombre2); // aqui pido que salude al nombre qeu itnroduzco por parametros

        // MISMO EJEMPLO PERO CON MAS PARAMETROS:
            
            int edad1= 19, edad2=18;
            String curso1= "DAWN", curso2= "DAW";
            mostrarDatosAlumnos(nombre1,edad1,curso1); // aqui pido que me muestre los datos del alumno 1, que datos nombre, edad y curso (pero por que asi lo tengo predefinido en el metodo)
            mostrarDatosAlumnos(nombre2,edad2,curso2); // aqui pido que me muestre los datos del alumno 2, que datos nombre, edad y curso (pero por que asi lo tengo predefinido en el metodo)


        // METODOS SIN PARAMETROS Y CON RETORNOS: Estos metodos no reciben información, pero devuelven un valor. Se debe de especificar
        // que valor se devuelve en vez de (void).

            String fechaHoy = obtenerFechaActual(); // aqui igualo la fecha de hoy que me genera el metodo a fechaHoy
            System.out.println("La fecha de hoy es : "+fechaHoy);


        // OTRO EJEMPLO:

            int numAleatorio = generarNumeroAleatorio(); // aqui igualo el numero aleatorio que me genera el metodo a numAleatorio
            System.out.println("El numero aleatorio (1 a 100) generado es : "+numAleatorio);


        // METODOS CON PARAMETROS Y CON RETORNOS: Estos metodos reciben informacion (parametros), y tambiend devuelven información. Se
        // debe de especificar que valor se devuelve en vez de (void).
        
            int num1=7, num2=5;
            int resultado = sumar(num1,num2); // el metodo me devuelve resultado que aqui igualo a resultado (no tiene por que coincidir el nombre de la variable)
            System.out.println("La suma es "+resultado);

        
        // OTRO EJEMPLO MAS COMPLEJO:

            double notaPractica=8, notaTeorica=7;
            double notaFinal = calcularNotaFinal(notaPractica,notaTeorica); // el metodo me devuelve media que aqui igualo a notaFinal (no tiene por que coincidir el nombre de la variable)
            System.out.println("La nota final es : "+notaFinal);
        
        


    }

    // METODOS

    private double calcularNotaFinal(double notaPractica, double notaTeorica) {
        double media = (notaPractica+notaTeorica)/2;
        return media;
    }

    private int generarNumeroAleatorio() {
        return (int)(Math.random()*100)+1;
    }

    private String obtenerFechaActual() {
        LocalDate fecha = LocalDate.now(); // Aqui declaro una variable tipo fecha llamada fecha, con el valor de la fecha de ahora.
        return fecha.toString(); // aqui digo que ese valor es lo que devuelve este metodo pero transformado a String.
    }

    private void mostrarDatosAlumnos(String nombre, int edad, String curso) {
        System.out.println("================");
        System.out.println("Nombre : "+nombre);
        System.out.println("Edad : "+edad);
        System.out.println("Curso : "+curso);
        System.out.println("================");
    }

    private void saludarPersona(String nombre) {
        System.out.println("Buenisimas tardes "+nombre+" sos un capo.");
    }

    private int sumar(int num3, int num5) {
        int resultado=num3+num5;
        return resultado;
    }

    private void saludo() {
        System.out.println("Bienvenido a la clase de estudio de metodos.");
    }



}
