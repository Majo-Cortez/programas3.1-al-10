 /*******************************************
  * Nombre: Angulo Cortez Maria Jose        *
  * carrera: Analisis de Sistemas Nocturno  *
  * Asignatura: Visual II                   *
  * Nom.Profesor: Fernando Solis            *
  * Tema: Ingresar un rango de numeros que  *
  * tenga un inicio y un fin                *
  * Fecha:09/07/2019                        *
  *******************************************/ 
public class RangoN{
 private int inicio;
 private int fin;
 public RangoN(int inicio,int fin){
  this.inicio=inicio;
  this.fin=fin;
}
 public void setInicio(int inicio){
  inicio=inicio;
}
 public void setFin(int fin){
  fin=fin;
}
 public int getInicio(){
 return inicio;
}
 public int getFin(){
 return fin;
}
public void proceso() {
   for(int x = inicio; x <= fin; x++) {
    System.out.println(x);
}
}
}