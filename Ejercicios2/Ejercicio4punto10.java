import java.util.Scanner;
public class Ejercicio4punto10 {
static Scanner sc = new Scanner(System.in);

  static void edadpromedio(){
  //Datos de entrada
  int i=1, saloncant, x, edadalumnos, SumaDeEdades=0,PromediodeEdadesGeneral=0, Sumax=0;
  double PromediodeEdades=0.0;
  //Datos de entrada
  System.out.println("Ingrese la cantidad de salones: ");
  saloncant = sc.nextInt();
  //Proceso
  while(i<=saloncant){
  System.out.println("Ingrese la cantidad de alumnos del salón "+i+": ");
  x = sc.nextInt();
  
    for(int n=1; n<=x; n++){
      System.out.println("Ingrese la edad del alumno "+n+": ");
      edadalumnos=sc.nextInt();
      
    SumaDeEdades= SumaDeEdades+edadalumnos;
    
    }
     
    PromediodeEdades=SumaDeEdades/x;
     
    System.out.println("El promedio de las edades del salon "+i+" es: "+PromediodeEdades);
    
    Sumax=Sumax + x;
    PromediodeEdadesGeneral=SumaDeEdades/Sumax;

    
   i++;  

  }
    System.out.println("La edad promedio de toda la escuela es: "+PromediodeEdadesGeneral);

  }
public static void main(String [] args){
  edadpromedio();
}

}