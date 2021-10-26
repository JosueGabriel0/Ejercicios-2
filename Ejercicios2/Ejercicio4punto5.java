import java.math.BigInteger;
public class Ejercicio4punto5{
  
  
  static void AhorroDeUnaPersonaEnUnAño(){    
    //Definir Variables
    int dia;   
    BigInteger multiplic = new BigInteger("1"); //long multiplic=1;
    //Proceso
    for(int i=1; i<=365; i++){     
      multiplic = multiplic.multiply(new BigInteger(Integer.toString(3))); 
      //multiplic=multiplic*3;
      System.out.println("El dia "+i+" se ahorró: "+multiplic+"$");
    }

  }
  public static void main(String [] args){
    AhorroDeUnaPersonaEnUnAño();
  }
} 