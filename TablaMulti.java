 public class TablaMulti{
 private int tabla1;
 private int tabla2;
 /*******************************************
  * Nombre: Angulo Cortez Maria Jose        *
  * carrera: Analisis de Sistemas Nocturno  *
  * Asignatura: Visual II                   *
  * Nom.Profesor: Fernando Solis            *
  * Tema: Tabla de Multiplicar del 2 y del 3*
  * Fecha:09/07/2019                        *
  *******************************************/

 public TablaMulti(int tabla1,int tabla2) {
     this.tabla1=tabla1;
     this.tabla2=tabla2;
}
 public void setTabla1(int tabla1) {
    tabla1=tabla1;
}
 public void setTabla2(int tabla2) {
    tabla2=tabla2;
}
 public int getTabla1() {
  return tabla1;
}
 public int getTabla2() {
  return tabla2;
}
 public void proceso(){
 for(int i = tabla1; i <=tabla2; i++) {
  System.out.println("----TABLA DEL " + i + "-----");
  for(int j = 1; j <= 5; j++) {
  System.out.println(i + " x " + j + " = " + (i*j));
}
 System.out.println();
}
}
}
