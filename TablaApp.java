/*******************************************
  * Nombre: Angulo Cortez Maria Jose        *
  * carrera: Analisis de Sistemas Nocturno  *
  * Asignatura: Visual II                   *
  * Nom.Profesor: Fernando Solis            *
  * Tema: Tabla de Multiplicar del 2 y del 3*
  * Fecha:09/07/2019                        *
  *******************************************/ 
  import java.util.Scanner;
  public class TablaApp{
  public static void main(String[] args) {
     int tabla1,tabla2;  
  Scanner teclado = new Scanner(System.in);
  System.out.print("Ingrese rango inicial: ");
  tabla1= teclado.nextInt();
  System.out.print("Ingrese rango final: ");
  tabla2= teclado.nextInt();
  TablaMulti fc = new TablaMulti(2,3);
  fc.proceso();
}
}