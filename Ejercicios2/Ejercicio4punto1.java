public class Ejercicio4punto1{
    
    static void SalarioDeunProfesor(){
    //Definir variables
      int i=1, x=10;
      float salario=1500; 
    //Proceso
      while(i<=6){
         salario=salario+(salario*10)/100;
         System.out.println("Con un incremento del "+x+"% -------> En el año "+i+" se obtuvo "+salario);
         i++;

      }
      //Datos de salida
        System.out.println("El salario al cabo de 6 años es:"+salario);
    }
    
    
public static void main(String [] args){
    SalarioDeunProfesor();
}

}