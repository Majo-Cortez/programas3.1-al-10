 /*******************************************
  * Nombre: Angulo Cortez Maria Jose        *
  * carrera: Analisis de Sistemas Nocturno  *
  * Asignatura: Visual II                   *
  * Nom.Profesor: Fernando Solis            *
  * Tema: Generar los nombre de la fammilia *
  * Fecha:09/07/2019                        *
  *******************************************/
 public class Familia{
    private String papa;
    private String mama;
    private String hijo;
    
 public Familia(String papa, String mama,String hijo) {
     this.papa = papa;
     this.mama = mama;
     this.hijo = hijo;
}
 public void setMama(String mama) {
    mama=mama;
 }
 public void setPapa(String papa) {
    papa=papa;
}
 public void setHijo(String hijo) {
    hijo=hijo;
}
 public String getMama() {
  return mama;
}
 public String getPapa() {
        return papa;
}
 public String getHijo() {
  return hijo;
}
 public void mostrarDatos(){
  System.out.println("El nombre del papa es: "+papa);
  System.out.println("El nombre del mama es: "+mama);
  System.out.println("El nombre del hijo es: "+hijo);
}
}