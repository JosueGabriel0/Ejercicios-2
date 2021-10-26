import java.util.Scanner;
public class Ejercicio4punto2 {
    static Scanner sc = new Scanner(System.in);

    static void tiendaDeHamburguesas(){
        //Definir variables
        int i=1, cantidad, tipo, pago;
        double montototal=0;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de hamburguesas que desee adquirir: ");
        cantidad= sc.nextInt(); 
         
        //Proceso
        while(i<=cantidad){
           
            System.out.println("Ingrese el tipo de la hamburguesa "+i+" que desee: 1=sencillo 20$, 2=doble 25$, 3=triple 28$");
            tipo = sc.nextInt(); 
            if(tipo==1){
                montototal = montototal+20;

            }else if(tipo==2){
                montototal = montototal+25;

            }else if(tipo==3){
                montototal= montototal+28;
            }else {System.out.println("Error");
            }
             i++;
        }
        System.out.println("¿Como desea pagar?:  1=Sin tarjeta 2=Con tarjeta ");
        pago= sc.nextInt();
        if(pago==1){
                montototal=montototal;

            }else if(pago==2){
                montototal =montototal+(montototal*5)/100;
            
            } else if(pago<1 || pago>2){System.out.println("Ingrese un metodo de pago correcto");
            }
        //datos de salida
          System.out.println("El monto total es de: "+montototal+"$");
    }
    
    public static void main(String [] args){
      tiendaDeHamburguesas();
    }

}