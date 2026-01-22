package _00_EstudioDatos_Estructuras_Clases_Metodos;

import java.util.Scanner; // al crear la clase scanner automaticamente se importa la utilidad de java que permite que funcione scanner

public class EstudioTiposDatos {
     //Esto es a nivel de metodo y es un constructor llamado TiposDatos

    @SuppressWarnings("resource")
    public EstudioTiposDatos(){
        //Constructor

        System.out.println("Si muestra esto, ha funcionado TiposDatos");

        
        // Tipos de Datos primitivos en JAVA //


        // BYTE //
        byte tipoByte = 0;
        tipoByte = 24;
        // el signo + sirve para CONCATENAR cosas
        System.out.println("tipoByte ="+ tipoByte);


        // INT O ENTEROS //
        int x; // Declara la variable x como entera
        x = 5; // Asigna el valor 5 a la variable x
        // Muestra el valor de x
        System.out.println("El valor actual de x es de "+ x);
        x = 7; // Asigna un nuevo valor a x
        // Muestra el nuevo valor de x
        System.out.println("El nuevo valor de x es de "+ x);


        // LONG //
        long tipoLong = 22222222222L; // si no pongo la L no detecta que es long
        // long tipoLong = 2222222222222222; no seria variable long hasta que le pusiera la L al final, lo cual no me permitiria poner ese valor ya que supera el maximo de tamaño de los int
        System.out.println("El valor de tipoLong con L al final es de "+ tipoLong);


        // CHAR //
        char tipoChar = 'a'; // asignamos una variable Char a tipoChar con valor a minuscula!!
        char letra = 'b';
        System.out.println("tipoChar = "+ tipoChar + " letra = " + letra);
        char c = 'A';
        int codigoASCII = c; // aqui vemos que las letras pueden tener valor numero gracias al codigo ascii eso es muy importante para la variable char
        System.out.println("Este es el codigoASCII = "+ codigoASCII + " de la letra = " + c);
        c=66;
        System.out.println("Esta es la letra asignada al codigo ASCII 66 = " + c);
        // IMPORTANTE!! DUALIDAD CHAR: LOS CARACTERES TIENEN VALOR DE LETRAS PERO TAMBIEN VALOR
        // ASCII ENTONCES TAMBIEN TIENEN VALOR NUMERO ASIGNABLE Y UTILIZABLE.


        // FLOAT //
        float tipoFloat;
        tipoFloat = (float) 23.4; // Para que los float funcionen hay que hacer un casting (float)
        System.out.println("Actualmente tipoFloat es = "+ tipoFloat);
        tipoFloat = 25.4F; // Asi tambien funcionan los float
        System.out.println("Y ahora el nuevo valor de tipoFloat es = "+ tipoFloat);


        // DOUBLE //
        double a; // Se declaran las variables x e y
        double b; // de tal forma que puedan almacenar decimales
        a = 7;
        b = 25.01;
        System.out.println("a vale = "+ a);
        System.out.println("b vale = "+ b);


        // CONSTANTES //
        final double PI = 3.14; // Al haber puesto final antes de la variable, le fijo el valor, se debe de poner en mayusculas
        // PI = 3.20; no podria poner esta linea de codigo por que al haber puesto la anterior
        System.out.println("El numero PI vale = "+ PI);


        // CONVERSION DE TIPOS ... CASTING //
        double div; // PREGUNTAR POR QUE DEBO DE CASTEAR SI AQUI YA HE DECLARADO QUE LA VARIABLE ES DOUBLE OSEA DECIMAL, PERO SI NO CASTEO ME LA SACA COMO INT, YA QUE LA OPERACION SE HACE CON NUMEROS ENTEROS
        int dividendo, divisor;
        dividendo = 7;
        divisor = 3;
        div = dividendo / (double) divisor; // aqui hago casting en el divisor, aunque puedo castear el dividendo, al hacerlo el resultado, me lo da en decimal
        System.out.println("La division de "+ dividendo +" / "+ divisor +" = "+ div); // PARA QUE UNA DIVISION SEA REAL O EL DIVIDENDO O EL DIVISOR TIENE QUE SER REAL HACIENDO CASTING SE PUEDE PASAR UN INT A DOUBLE


        // BOOLEAN O BOOLEANOS //
        boolean sw = false; // tipico verdadero o falso, aqui iniciamos el booleano en su estado default que es falso.
        sw = true; // y lo cambiamos a verdadero, si no sabemos como podemos llamar a la variable podemos usar sw de switch (interruptor)
        System.out.println("La pregunta es "+ sw);


        // CADENAS //
        String miPalabra = "movil";
        String miFrase = "¿Donde esta mi movil?";
        System.out.println("Una palabra que uso con frecuencia es "+ miPalabra);
        System.out.println("Una frase que digo a veces es "+ miFrase);


        // PEDIR POR TECLADO //
        Scanner leer = new Scanner(System.in); // aqui iniciamos la clase Scanner que permite leer lo que se escribe en el terminal
        System.out.print("Introduce tu nombre "); // esto hace que se muestre pero sin hacer un salto a la linea siguiente como println
        String nombre = leer.nextLine(); // este codigo es el que lee lo que se escribe en este caso String y nextLine determina que sera texto
        System.out.println(nombre); // aqui lo podemos mostrar, para darle a debugger para probarlo por si ha habido algun error
        leer = null; // Si apuntamos a null, osea la desinstanciamos, nos salta aviso de que no esta cerrado aqui pero si cerramos deberiamos de abrirlo y no se se reabrir
        
        
        leer = new Scanner(System.in); // esto me crea conflicto no se si es una linea de codigo valida si cierro arriba el leer.close();
        System.out.print("Introduce tu edad ");
        int edad = leer.nextInt(); // este codigo es el que lee lo que se escribe en este caso int y nextInt determina que sera numero y entero
        System.out.println(edad); // exactamente igual que arriba para probarlo con el debugger
        //leer.close(); // aqui cerramos leer
        leer = null; // aqui apuntamos a null la ultima entrada del usuario
        

        System.out.println("Tu nombre es "+ nombre +" y tienes "+ edad +" años");
        

        // TIPOS ENUMERADOS //
         enum Dias {Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo}; // Esto se debe de hacer antes del metodo y del constructor, a nivel de clase, se usa para enumerar una serie de datos
         Dias diaActual = Dias.Martes; // nombras a la serie, le das un nombre a la variable y le asignas un dato dentro de la serie
         Dias diaSiguiente = Dias.Miercoles; // idem de lo anterior
         System.out.println("Hoy es : "+ diaActual); 
         System.out.println("Mañana es : "+ diaSiguiente);

    
    

    } // aqui cerramos el constructor 
// end class
} // aqui cerramos la clase end class
