/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;


public class App {

    public static void main(String[] args) {

        System.out.println(Calcular_saldo(2000000, 500000, 1000000));
        System.out.println(Calcular_saldo(1500000, 500000, 1000000));

    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */

    public static int Calcular_saldo(int dinero_t, int recaudos, int retiros) {
       
    
        try {

            int saldo_t = 0;
            final int base = 2000000;

            if (dinero_t == base) 
                saldo_t = dinero_t + recaudos - retiros;
             else 
                return -1;


        return saldo_t;    
        } 
        
        catch (Exception er) {
            return -1;
        }
    
        
    }


    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */

     public static String Calcular_tip(float consumo) {
        try {
            if (consumo <= 0) {
                return "Error calculando consumo";
            }
    
            float propina = consumo * 0.10f;
            float impoconsumo = consumo * 0.08f;
            float total = consumo + propina + impoconsumo;
    
            return String.format( "valor comida: $%.2f - valor propina $%.2f - valor impoconsumo $%.2f - total a pagar $%.2f",
                    consumo, propina, impoconsumo, total);
        } catch (Exception e) {
            return "Error en la función Calcular_tip";
        }
    }

    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */

     public int Obtener_puntos(int ganados, int perdidos, int empatados) {
        try {
            // Verificar que los partidos sean mayores o iguales a 0
            if (ganados < 0 || perdidos < 0 || empatados < 0) {
                throw new Exception("Partidos negativos");
            }

            // Calcular los puntos totales
            int puntosTotales = ganados * 3 + empatados;

            return puntosTotales;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return -1;
        }
    }


    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */

     public static float Calcular_definitiva(float nota1, float nota2, float nota3, float nota4, float nota5,
     float porcentaje1, float porcentaje2, float porcentaje3, float porcentaje4, float porcentaje5) {
      try {
        // Verificar que las notas estén entre 0 y 5
       if (nota1 < 0 || nota1 > 5 || nota2 < 0 || nota2 > 5 || nota3 < 0 || nota3 > 5 ||
          nota4 < 0 || nota4 > 5 || nota5 < 0 || nota5 > 5) {
          return -1;
        }

       // Verificar que los porcentajes estén entre 0 y 1 y que sumen 1
        if (porcentaje1 < 0 || porcentaje1 > 1 || porcentaje2 < 0 || porcentaje2 > 1 || porcentaje3 < 0 || porcentaje3 > 1 ||
         porcentaje4 < 0 || porcentaje4 > 1 || porcentaje5 < 0 || porcentaje5 > 1) {
         return -1;
         }

        if (porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5 != 1) {
         return -1;
        }

     // Calcular la nota definitiva
     float notaDefinitiva = nota1 * porcentaje1 + nota2 * porcentaje2 + nota3 * porcentaje3 + nota4 * porcentaje4 + nota5 * porcentaje5;

     return notaDefinitiva;
     } catch (Exception e) {
  
      return -1;
     }    
     }

    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_para_ganar(float p1, float p2, float p3, float p4, float p5, float n1, float n2, float n3, float n4) {
        try {
            if (p1 + p2 + p3 + p4 + p5 != 1 || p1 < 0 || p1 > 1 || p2 < 0 || p2 > 1 || p3 < 0 || p3 > 1 || p4 < 0 || p4 > 1 || p5 < 0 || p5 > 1) {
                throw new Exception("Los porcentajes deben sumar 1 y estar entre 0 y 1");
            }
            if (n1 < 0 || n1 > 5 || n2 < 0 || n2 > 5 || n3 < 0 || n3 > 5 || n4 < 0 || n4 > 5) {
                throw new Exception("Las notas deben estar entre 0 y 5");
            }
            float sum = n1 * p1 + n2 * p2 + n3 * p3 + n4 * p4;
            float min_note = (3 - sum) / p5;
            return min_note;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
    
    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */

     public static float Calcular_salario(int horasNormales, int horasExtrasDiurnas, int horasExtrasNocturnas, float valorHoraNormal) {
        try {
            if (valorHoraNormal <= 0) {
                return -1; // Valor de la hora normal no válido
            }
    
            float salarioNormales = horasNormales * valorHoraNormal;
            float salarioExtrasDiurnas = horasExtrasDiurnas * valorHoraNormal * 0.15f;
            float salarioExtrasNocturnas = horasExtrasNocturnas * valorHoraNormal * 0.35f;
    
            float salarioTotal = salarioNormales + salarioExtrasDiurnas + salarioExtrasNocturnas;
            return salarioTotal;
    
        } catch (Exception e) {
            return -1; // Error en la función
        }
    }

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_triangulo(float base, float altura) {
        try {
            if (base <= 0 || altura <= 0) {
                return -1; // Base o altura no válidos
            }
    
            float area = (float) (0.5 * base * altura);
            return area;
    
        } catch (Exception e) {
            return -1; // Error en la función
        }
    }
    

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */

     public static float Calcular_perimetro_cuadrado(float lado_cuadro){

        try {

            final float n_lados = 4;
            float perimetro =0;

            if (lado_cuadro<=0) {
             return -1;}



        perimetro = lado_cuadro* n_lados;

        return perimetro;


        
            
        } catch (Exception e) {
            return-1;
        }

        


     }


    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

     public static float Calcular_volumen_cilindro(float radio, float altura) {
        try {
            final float PI = 3.1415927f; // Constante pi con precisión de 7 decimales
    
            if (radio <= 0 || altura <= 0) {
                return -1; // Radio o altura no válidos
            }
    
            float volumen = (float) (PI * Math.pow(radio, 2) * altura);
            return volumen;
    
        } catch (Exception e) {
            return -1; // Error en la función
        }
    }
       

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_area_circulo(float radio_c){
        try {

            final float pi_ =3.1415927f;

            if (radio_c <= 0) {
                return -1;
            }

           float area_circulo =(float) (pi_* Math.pow(radio_c, 2));

           return area_circulo;

            
        } 
        
        
        catch (Exception e) {
            return -1;
        }
    }




}
