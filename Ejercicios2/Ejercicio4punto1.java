public class Ejercicio4punto1 {

    static void SalarioDeunProfesor(){
      //Declarar variables
      float salario=1500;
      //Proceso
      for(int años=1; años<=6; años++){
       salario=salario+(salario*10)/100;
       System.out.println("En el año "+ años +" se recibió: "+salario+"$");

      }
      //Datos de Salida
       System.out.println("El salario al cabo de 6 años es: "+salario);
    }
    
public static void main(String [] args){
  SalarioDeunProfesor();
}

}