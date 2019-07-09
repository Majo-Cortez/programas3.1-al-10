 /*******************************************
  * Nombre: Angulo Cortez Maria Jose        *
  * carrera: Analisis de Sistemas Nocturno  *
  * Asignatura: Visual II                   *
  * Nom.Profesor: Fernando Solis            *
  * Tema: Ingresar un rango de numeros que  *
  * tenga un inicio y un fin                *
  * Fecha:09/07/2019                        *
  *******************************************/ 
 import java.util.Scanner;
  public class RanNApp{
   public static void main(String[] args) {
     int inicio,fin;
    Scanner lee = new Scanner(System.in);
    System.out.println("Por favor ingrese los valores del rango");
    System.out.print("Ingrese el valor en que inicia el rango: ");
    inicio = lee.nextInt();
    System.out.print("Ingrese el valor en que finaliza el rango: ");
    fin = lee.nextInt();       
    RangoN fc = new RangoN(1,50);
    fc.proceso();
}
}
