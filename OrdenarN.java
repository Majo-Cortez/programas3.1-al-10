 /********************************************
  * Nombre: Angulo Cortez Maria Jose         *
  * carrera: Analisis de Sistemas Nocturno   *
  * Asignatura: Visual II                    *
  * Nom.Profesor: Fernando Solis             *
  * Tema: Ordenar numenos de forma ascendente*
  * y descendente                            *
  * Fecha:09/07/2019                         *
  *******************************************/  
 public class OrdenarN{
    private int a;
    private int b;
    private int c;
    
 public OrdenarN(int a,int b,int c){
     this.a = a;
     this.b=b;
     this.c=c;
}
 public void setA(int a) {
    a=a;
 }
 public void setB(int b) {
   b=b;
}
 public void setC(int c) {
   c=c;
}
 public int getA() {
  return a;
}
 public int getB() {
        return c;
}
 public int getC() {
  return c;
}
public void ordenar() {
 if(a>b) {
  if(a>c) {
   if(b>c) {
  System.out.println("Orden Ascendente: " + c + " " + b + " " + a);
  System.out.println("Orden descendente: " + a + " " + b + " " + c);                 
}
  else {
  System.out.println("Orden Ascendente: " + a + " " + c + " " + b);
  System.out.println("Orden descendente: " + b + " " + c + " " + a);
}
}
  else {
  System.out.println("Orden Ascendente: " + b + " " + a + " " + c);
  System.out.println("Orden descendente: " + c + " " + a + " " + b);
}
}
  else {
  if(b>c) {
   if(a>c) {
  System.out.println("Orden Ascendente: " + c + " " + a + " " + b);
  System.out.println("Orden descendente: " + b + " " + a + " " + c);
}
  else {
  System.out.println("Orden Ascendente: " + a + " " + c + " " + b);
  System.out.println("Orden descendente: " + b + " " + c + " " + a);
}              
}
  else {
  System.out.println("Orden Ascendente: " + a + " " + b + " " + c);
  System.out.println("Orden descendente: " + c + " " + b + " " + a);
}
}
}
}