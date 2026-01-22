package _00_TiposDatos_OperacionesBasicas;

public class EstudioClaseMath {

    public EstudioClaseMath(){
        
    // 1 - METODOS DE REDONDEO
    
        // Math.ceil() redondea hacia arriba al entero mas proximo.
        System.out.println("Math.ceil ============== ");
        System.out.println(Math.ceil(2.3)); // Muestra 3.0
        System.out.println(Math.ceil(0.895)); // Muestra 1.0
        System.out.println(Math.ceil(-1.87)); // Muestra -1.0
        System.out.println(Math.ceil(-0.9)); // Muestra 0.0

        // Math.floor() redondea hacia abajo al entero mas proximo.
        System.out.println("Math.floor ============== ");
        System.out.println(Math.floor(2.8)); // Muestra 2.0
        System.out.println(Math.floor(0.895)); // Muestra 0.0
        System.out.println(Math.floor(-1.87)); // Muestra -2.0
        System.out.println(Math.floor(-0.9)); // Muestra -1.0

        // Math.rint() redondea al entero mas proximo, si esta a mitad de camino redondea al par.
        System.out.println("Math.rint ============== ");
        System.out.println(Math.rint(0.891)); // muestra por consola 1.0
        System.out.println(Math.rint(6.5)); // muestra por consola 6 ***
        System.out.println(Math.rint(7.5)); // muestra por consola 8 **
        System.out.println(Math.rint(6.51)); // muestra por consola 7 // AQUI NO LO APLICA POR QUE NO ES .5 RINT SOLO APLICA POR QUE ES .5

        // Math.round() redondea al entero mas proximo, si esta a mitad de camino redondea hacia arriba.
        System.out.println("Math.round ============== ");
        System.out.println(Math.round(0.891)); // muestra por consola 1
        System.out.println(Math.round(6.5)); // muestra por consola 7


    // 2 - NUMEROS ALEATORIOS 

        // SI NO LIMITO LOS VALORES, DE BASE ES ENTRE 0.00000001 Y 0.999999999 
        System.out.println("Número aleatorio entre 0 y 1: " + Math.random()); // De base mete un numero decimal aleatorio de 0 a 1

        // AHORA VAMOS A MULTIPLICAR ESE VALOR POR 10 Y LO VAMOS A METER EN UN BUCLE PARA COMPROBARLO
        for (int i = 0; i < 20; i++){
            System.out.println("Número aleatorio entre 0 y 9: " + (int)(Math.random() * 10 )); // le hago casting para quitarle los decimales
        }

        // NUMERO ALEATORIO ENTRE DOS VALORES
        int min = 5;
        int max = 15;
        for (int i = 0; i < 10; i++) {
        System.out.println("Un numero aleatorio entre " + min + " y " + max + ": " + (int)(Math.random() * (max - min + 1) + min));
        } // ASEGURARME QUE SALEN TODOS LOS NUMEROS DEL INTERVALO, NI MAS NI MENOS.


    // 3 - POTENCIA Y RAICES
        
        System.out.println("2 elevado a 5 = " + Math.pow(2, 5)); // PRIMER NUMERO ES LA BASE , SEGUNDO NUMERO ES LA POTENCIA
        System.out.println("Raíz cuadrada de 49 = " + Math.sqrt(49)); // SIMPLEMENTE PONGO EL NUMERO, RECORDAR QUE LOS NUMEROS NEGATIVOS NO TIENEN RAIZ CUADRADA
        System.out.println("Raíz cubica de 27 = " + Math.cbrt(27)); // PONGO EL NUMERO AL QUE QUIERO HACER LA RAIZ CUBICA.
        System.out.println("Para cualquier otra raiz uso pow = " + Math.pow(2, 1/5.0)); // SIEMPRE TIENE QUE SER UN NUMERO DECIMAL PARA HACER LA DIVISION CORRECTAMENTE


    // 4 - TRIGONOMETRIA

        int angulo = 30;
        System.out.println(Math.sin(Math.toRadians(angulo))); // 
        System.out.printf("El seno de un angulo de %d grados es = %.1f %n",angulo, Math.sin(Math.toRadians(angulo)));
        double cosAngulo = 0.86;
        System.out.printf("Un coseno de %.2f corresponde a un angulo de %f %n",cosAngulo, Math.toDegrees(Math.acos(cosAngulo)));

    
    // 5 - OTRAS FUNCIONES MATEMATICAS

        System.out.println("\nValor absoluto de -10 = " + Math.abs(-10));
        System.out.println("Máximo entre 10 y 20 = " + Math.max(10, 20));
        System.out.println("Mínimo entre 10 y 20 = " + Math.min(10, 20));


    }

}
