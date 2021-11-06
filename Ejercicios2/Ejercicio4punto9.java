import java.util.Scanner;
public class Ejercicio4punto9 {
   static Scanner sc = new Scanner(System.in);
  static void ClienteDeUnBanco(){
    //Definir variables
    int i=1, x;
    double porcent=0,  resultfinal=0, result=0, montorecibido=0;
    //Datos de entrada
    System.out.println("Ingrese el numero de años de ahorro en el Banco: ");
    x = sc.nextInt();
    //Proceso
    while(i<=x){
      for(int n=1; n<=12; n++){
    System.out.println("Ingrese el monto del mes "+n+":");
    montorecibido = sc.nextInt();

    result=result+montorecibido;
    }
    
    porcent=porcent+(result*10)/100;
    resultfinal=porcent+result;
    
    i++;

   
    System.out.println("El interes anual es de: "+porcent+"$");
    System.out.println("El total de la inversion final es de: "+resultfinal+"$");

  
    
    }
    
  
  }

  public static void main(String [] args){
     ClienteDeUnBanco();
  }
}