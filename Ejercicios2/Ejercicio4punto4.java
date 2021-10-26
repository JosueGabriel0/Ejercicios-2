import java.util.Scanner;
public class Ejercicio4punto4 {
static Scanner sc = new Scanner(System.in);


static void FocosDeColores (){ 
  //Definir variables
  int numfocos, x, totalverde=0, totalblanco=0, totalrojo=0;
  //Datos de entrada
  System.out.println("Ingrese el numero de focos: ");
  numfocos=sc.nextInt();
  //Proceso
  for(int i=1; i<=numfocos; i++){
    System.out.println("Elija el color del foco: 1=verde, 2=blanco, 3=rojo");
    x=sc.nextInt();
    if(x==1){
      totalverde=totalverde+1;
    }else if(x==2){
      totalblanco=totalblanco+1;
    }else if(x==3){
      totalrojo=totalrojo+1;
    }

  }
  //Datos de salida
  System.out.println("El numero total de focos verdes es: "+totalverde);
  System.out.println("El numero total de focos blancos es: "+totalblanco);
  System.out.println("El numero total de focos rojos es: "+totalrojo);


}
public static void main(String [] args){
FocosDeColores(); 
}
}
