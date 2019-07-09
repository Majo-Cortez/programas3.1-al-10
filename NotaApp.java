 /*******************************************
  * Nombre: Angulo Cortez Maria Jose        *
  * carrera: Analisis de Sistemas Nocturno  *
  * Asignatura: Visual II                   *
  * Nom.Profesor: Fernando Solis            *
  * Tema: Ingresar notas de un estudiante y *
  * sacar el promedio                       *
  * Fecha:09/07/2019                        *
  *******************************************/
  import java.util.Scanner;
 public class NotaApp{
  public static void main(String[] args) {
   float nota1, nota2, nota3;
   float acu1, acu2, acu3, def;
    Scanner lee= new Scanner(System.in);
    System.out.println("Ingrese las notas del estudiante");
    System.out.print("Ingrese nota 1: ");
    nota1 = lee.nextFloat();
    System.out.print("Ingrese nota 2: ");
    nota2 = lee.nextFloat();
    System.out.print("Ingrese nota 3: ");
    nota3 = lee.nextFloat();
    Nota fc = new Nota(9,8,8);
    fc.CalculoNotas();
    fc.MostrarResultados();
}
}