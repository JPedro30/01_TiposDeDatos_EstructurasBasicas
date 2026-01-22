package _00_EstudioDatos_Estructuras_Clases_Metodos;

public class EstudioClasesEnvoltorios {

        public EstudioClasesEnvoltorios(){

            System.out.println("Clases envoltorio en Java");

            // INTEGER

            // 1. CONVERSION DE STRING A INT #MUY IMPORTANTE#

                String texto = "123";
                int numero = Integer.parseInt(texto);

                System.out.println(texto+numero); // no se suma por que es un String + int
                System.out.println(numero+numero); // se suman ya que son dos int + int


            // 2. CONVERSION DE INT A STRING #IMPORTANTE#

                String str = Integer.toString(456);

                System.out.println(texto+str); // no se suman ya que son String + String
                System.out.println(str+numero); // no se suman ya que son String + String


            // 3. VALORES MAXIMOS Y MINIMOS

                int max = Integer.MAX_VALUE; // 2147483647
                int min = Integer.MIN_VALUE; // -2147483648

                System.out.println(max);
                System.out.println(min);


            // 4. CONVERSION A OTRAS BASES

                System.out.println("1111 en base 2 = "+ Integer.parseInt("1111",2));
                System.out.println("123456 en hexadecimal = "+ Integer.toHexString(123456));
                System.out.println("135 en binario = "+ Integer.toBinaryString(135));
                System.out.println("365 en octal = "+ Integer.toOctalString(365));

            
            // DOUBLE

            // 1. CONVERSION DE STRING A DOUBLE #MUY IMPORTANTE#

                String textoD = "3.1416";
                double numeroD = Double.parseDouble(textoD);

                System.out.println(numeroD+numeroD); // se suman ya que son double + double
                System.out.println(numeroD+textoD); // no se suman ya que son double + string

            
            // 2. CONVERSION DE DOUBLE A STRING #IMPORTANTE#

                String strD = Double.toString(3.1416);

                System.out.println("String a double: "+ numeroD);
                System.out.println("double a String: "+ strD);

            
            // 3. VALORES MAXIMO Y MINIMO

                double maxD = Double.MAX_VALUE; // 1.7976931348623157E308
                double minD = Double.MIN_VALUE; // 4.9E-324

                System.out.println("Valor maximo de un double: "+maxD);
                System.out.println("Valor minimo de un double: "+minD);

            
            // CHARACTER

                char letra = 'a';
                Character caracter = letra; // autoboxing
                char letra2 = caracter; // unboxing
                
                System.out.println("Letra: "+letra+" , Caracter: "+caracter+" , Letra2: "+letra2); // esto no lo entiendo que se supone que hace

            
            // METODOS DE LA CLASE CHARACTER

                System.out.println("¿'a' es una letra ? "+ Character.isLetter('a'));
                System.out.println("¿'7' es un digito ? "+ Character.isDigit('7'));
                System.out.println("¿' ' es un espacio en blanco ? "+ Character.isWhitespace(' '));
                System.out.println("¿'A' es una letra mayuscula ? "+ Character.isUpperCase('A'));
                System.out.println("¿'a' es una letra minuscula ? "+ Character.isLowerCase('a'));
                System.out.println("Convertir 'a' en mayusculas: "+ Character.toUpperCase('a'));
                System.out.println("Convertir 'A' en minusculas: "+ Character.toLowerCase('A'));


            // BOOLEAN

                String textoB = "True"; // o "False"
                boolean valorB = Boolean.parseBoolean(textoB);

                System.out.println("String a boolean: "+ valorB);
                System.out.println("boolean a String: "+ Boolean.toString(valorB));

                Boolean boolObj = valorB; // autobixing
                boolean valorB2 = boolObj; // unboxing
                System.out.println("Valor booleano: "+valorB+" , Objeto Booleano: "+boolObj+" , Valor booleano 2: "+valorB2); // sigo sin entenderlo bien


        }

}
