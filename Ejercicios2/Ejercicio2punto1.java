 import java.util.Scanner;
public class pruebawhile {
    static Scanner sc = new Scanner(System.in);
    
    
    static void pruebaWhileintroducirIniciFinalAsendentemultiplicsuma(){
      //Definir variables
      int i, fi, num, multipli, resul=0;
      //Datos de entrada
      System.out.println("Ingrese el numero que empezara la multiplicacion Ascendente:");
      i=sc.nextInt();

      System.out.println("Ingrese el numero con el que se multiplicaran los numeros Asendentes:");
      num=sc.nextInt();

      System.out.println("Ingrese el numero de Final De los numeros ascendentes:");
      fi=sc.nextInt();
      //Proceso
      while(i<=fi){
        multipli=num*i;
        resul=multipli+resul;//resul=resul+multipli;
        System.out.println(num+"X"+i+
        "="+multipli);
        i++;
      }
      //Datos de salida
    System.out.println("La suma de los productos de los numeros ascendentes son :"+resul);
    
    }

    public static void main(String[] args) {
      pruebaWhileintroducirIniciFinalAsendentemultiplicsuma();
    }


}