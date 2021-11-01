import java.util.Scanner;
  
public class Ejercicio4punto6{

  static Scanner sc = new Scanner(System.in);

  static void CompraDeArticulos(){
    //Definir variables
    int i=1, cantidad, x, result15=0, result12=0, result10=0,  porcent;
    double resultotal=0, resultsimple15=0, resultsimple12=0, resultsimple10=0;
    //Datos de entrada
    System.out.println("Ingrese la cantidad de articulos a comprar: ");
    cantidad=sc.nextInt();
    //Proceso
    while (i<=cantidad){
      System.out.println("Ingrese el precio del articulo "+i+" :");
      x=sc.nextInt();
      if(x>=200){
        resultsimple15=x-(x*15)/100;
        result15=result15+x-(x*15)/100;
        porcent=15;
        System.out.println("El precio total del articulo "+i+" es: "+resultsimple15+"$"+" ----------> Con un descuento del: "+porcent+" %");

      }else if(x>100 && x<200){
        resultsimple12=x-(x*12)/100;
        result12=result12+x-(x*12)/100;
        porcent=12;
        System.out.println("El precio total del articulo "+i+" es: "+resultsimple12+"$"+" ----------> Con un descuento del: "+porcent+" %");

      }else if(x<=100){
        resultsimple10=x-(x*10)/100;
        result10=result10+x-(x*10)/100;
        porcent=10;
        System.out.println("El precio total del articulo "+i+" es: "+resultsimple10+"$"+" ----------> Con un descuento del: "+porcent+" %");
      }
      resultotal=result15+result12+result10;

      
     
      i++;
    }
    //Datos de salida
    System.out.println("El monto total de todos los articulos es de: "+resultotal+"$");
  }
public static void main(String [] args){
  CompraDeArticulos();
}

}