//Keira Naomi González Sánchez - 18 de Octubre del 20323 - Calcular el promedio de 8 calificaciones

package practica8;

import java.util.Scanner;

public class Practica8 {

    public static void main(String[] args) {
      double suma=0;
      double promedio=0;
      Scanner Scanner=new Scanner (System.in);
      for (int i = 1; i<= 8; i++){
        System.out.println("ingrese la calificación " +i +":");  
        double cal=Scanner.nextDouble();
        suma=suma+cal;
        promedio=suma/8;
      }
      System.out.println("El promedio de las calificaciones es: " +promedio);
    }
}
