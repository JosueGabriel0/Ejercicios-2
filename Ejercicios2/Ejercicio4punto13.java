import java.util.Scanner;  
public class Ejercicio4punto13{
  static Scanner sc = new Scanner (System.in);

  static void vendedor(){
    //Datos de entrada
    int i=1, montoventa=0, numventa=0, montodiezmil=0, montoveintemil=0, sumamonto10=0, sumamonto20=0, sumamontogeneral=0;
    //Datos de entrada
    System.out.println("Ingrese el numero de ventas realizadas: ");
    numventa=sc.nextInt();
    //Proceso
    while(i<=numventa){
    System.out.println("Ingrese el monto de la venta numero "+i+": ");  
    montoventa=sc.nextInt();
    if(montoventa<=10000 && montoventa>=1){

      montodiezmil=montodiezmil+1;
      sumamonto10=sumamonto10+montoventa;

    }else if (montoventa>10000 && montoventa<20000){

      montoveintemil=montoveintemil+1;
      sumamonto20=sumamonto20+montoventa;
    }  

    sumamontogeneral=sumamonto10+sumamonto20;
      
      
    i++;
    }
    //Datos de Salida
    System.out.println("El numero de ventas de 10.000 o menos es: "+montodiezmil);

    System.out.println("El monto total de las ventas de 10.000 o menos es: "+sumamonto10);

    System.out.println("El numero de ventas por más de 10.000 pero por menos de 20.000 es: "+montoveintemil);

    System.out.println("El monto total de las ventas por mas de 10.000 pero menos de 20.000 es: "+sumamonto20);

    System.out.println("El monto global de las ventas es de: "+sumamontogeneral);

  }
public static void main(String [] args){
  vendedor();
}

}
