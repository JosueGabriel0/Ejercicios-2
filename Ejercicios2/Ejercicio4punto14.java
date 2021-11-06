import java.util.Scanner;  
public class Ejercicio4punto14{
  static Scanner sc = new Scanner (System.in);

  static void notasAlumnos(){
    //Definir variables
    int i=1, numAlumnos=0, notasAlumno=0, desaprobado=0, aprobado=0;
    //Datos de entrada
    System.out.println("Ingrese el numero de alumnos: ");
    numAlumnos=sc.nextInt();
    //Proceso
    while(i<=numAlumnos){
      System.out.println("Ingrese la nota numero "+i+" : ");
      notasAlumno=sc.nextInt();

      if(notasAlumno<13 && notasAlumno>=1){

        desaprobado=desaprobado+1;
      }else if (notasAlumno>=13 && notasAlumno<=20){

        aprobado=aprobado+1;
      }else {
        System.out.println("¡Ingrese una nota valida!");
      }
     i++;
    }
    //Datos de salida
    System.out.println("El numero de alumnos DESAPROBADOS es: "+desaprobado);
    System.out.println("El numero de alumnos APROBADOS es: "+aprobado);


  }
public static void main(String [] args){
  notasAlumnos();
}

}
