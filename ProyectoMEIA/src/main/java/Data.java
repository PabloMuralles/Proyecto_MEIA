/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */
public class Data {
    
        private String user;
        
        private String tempUser;
  
      private static  Data miUser = null;
      
      

      public  static Data getData() {

      if (miUser==null) {

      miUser=new Data();
      }
      return miUser;
      }

     public Data(){
         this.user = tempUser;
     }

     public String getUser() {
      return tempUser;
      }

     public void setUser(String user) {
      tempUser = user;
      }
 
    
    
}