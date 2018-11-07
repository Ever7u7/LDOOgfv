/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ObjetoSingleton {
    Date date = new Date();
   //Se crea un objeto de 
   private static ObjetoSingleton instance = new ObjetoSingleton();

   //make the constructor private so that this class cannot be
   //instantiated
   private ObjetoSingleton(){}

   //Get the only object available
   public static ObjetoSingleton getInstance(){
      return instance;
   }

   public void mostrarMensaje(){
       System.out.println("Este es un ejemplo de un Singleton");
       DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
       System.out.println("Fecha: "+dateFormat.format(date));
   }
}
