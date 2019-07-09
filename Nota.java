 /*******************************************
  * Nombre: Angulo Cortez Maria Jose        *
  * carrera: Analisis de Sistemas Nocturno  *
  * Asignatura: Visual II                   *
  * Nom.Profesor: Fernando Solis            *
  * Tema: Ingresar notas de un estudiante y *
  * sacar el promedio                       *
  * Fecha:09/07/2019                        *
  *******************************************/ 
 public class Nota{
 private float nota1;
 private float nota2;
 private float nota3;
 double acu1, acu2, acu3,def;
 public Nota(float nota1, float nota2, float nota3){
   this.nota1=nota1;
   this.nota2=nota2;
   this.nota3=nota3;
}
 public void setNota1(float nota1) {
    nota1=nota1;
 }
 public void setNota2(float nota2) {
    nota2=nota3;
}
 public void setNota3(float nota3) {
    nota3=nota3;
}
 public float getNota1() {
  return nota1;
}
 public float getNota2() {
  return nota2;
}
 public float getnota3() {
  return nota3;
}
 public void CalculoNotas() {
        acu1 = nota1*0.35;
        acu2 = nota2*0.35;
        acu3 = nota3*0.30;
        def = acu1+acu2+acu3;
}
public void MostrarResultados() {
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota promedio: " + def);
}
}