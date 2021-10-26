import java.util.Scanner;
public class Ejercicio4punto3{
 static Scanner sc = new Scanner(System.in);

  static void DeterminarEnFuncionDe0(){
    //Definir variables
    int i=1, cantidad, totalcero=0, totalmenores=0, totalmayores=0;
    double x;
    //Datos de entrada
    System.out.println("Ingrese la cantidad de numeros: ");
    cantidad=sc.nextInt();
    //Proceso
    while(i<=cantidad){
      System.out.println("Ingrese un numero: ");
      x = sc.nextDouble();
      if(x==0){
        totalcero=totalcero+1;
      }else if(x<0){
        totalmenores=totalmenores+1;
      }else if(x>0){
        totalmayores=totalmayores+1;
      } 

      i++;
    }

    System.out.println("El numero de ceros es: "+totalcero);
    System.out.println("El numero de menores de cero es: "+totalmenores);
    System.out.println("El numero de mayores de cero es: "+totalmayores);
  }
  public static void main(String [] args){
    DeterminarEnFuncionDe0();
  } 

}