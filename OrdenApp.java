 /********************************************
  * Nombre: Angulo Cortez Maria Jose         *
  * carrera: Analisis de Sistemas Nocturno   *
  * Asignatura: Visual II                    *
  * Nom.Profesor: Fernando Solis             *
  * Tema: Ordenar numenos de forma ascendente*
  * y descendente                            *
  * Fecha:09/07/2019                         *
  *******************************************/   
 import java.util.Scanner;
 public class OrdenApp{
   public static void main(String[] args) {
    int a,b,c;
    Scanner lee = new Scanner(System.in);
    System.out.println("Ingrese 3 numeros");
    System.out.print("Ingrese numero 1: ");
    a = lee.nextInt();
    System.out.print("Ingrese numero 2: ");
    b = lee.nextInt();
    System.out.print("Ingrese numero 3: ");
    c = lee.nextInt();     
    OrdenarN fc = new OrdenarN(1,2,3);
    fc.ordenar();
}
}

