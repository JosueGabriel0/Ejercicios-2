import java.util.Scanner;
public class Ejercicio4punto2 {
  static Scanner sc = new Scanner(System.in);

    static void tiendaDeHamburguesas(){
      //Definir variables
      int i, tipo, metodopago;
      double total=0;
      //Datos de entrada 
      System.out.println("Ingrese el numero de hamburguesas: ");
       i = sc.nextInt();
       
      //Proceso
      while(i>=1){
        System.out.println("Ingrese Un tipo de hamburguesa: (1) = sencilla 20$, (2) = doble 25$, (3) = triple 28$");
        tipo= sc.nextInt();
        if(tipo==1){
          total=total+20;

        }else if(tipo==2){
          total=total+25;


        }else if(tipo==3){
          total=total+28;
        }
        i--;
      }
      System.out.println("Ingresa el tipo como desea pagar: 1=Sin tarjeta, 2=Con tarjeta");
      metodopago=sc.nextInt();
      if(metodopago==1){
        total=total;
      }
        if(metodopago==2){
          total=total+(total*5)/100;
        }
      
      //Datos de salida
      System.out.println("El monto total a pagar es de: "+total+"$");
    }
  public static void main(String [] args){
      tiendaDeHamburguesas();
    }
}