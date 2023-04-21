public class Ejercicio3 {

 public static void main(String[]args){

     String texto = "";
             String [] nombres = {"Elian", "Andres", "Victoria", "Gladys", "Hugo"};

     for ( int i = 0; i < nombres.length; i++){
         if (i < (nombres.length - 1)){
             texto = texto + nombres[i] + ", ";
         }else texto = texto + "y " + nombres[i] + " se fueron de viaje";


     }
     System.out.println(texto);
 }
}