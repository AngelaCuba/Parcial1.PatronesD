package prototypeP;

public class Serial {
    private String serial;
     public Serial(String serial){
         if (serial.length() == 100 ){
             this.serial= serial;

         }else{
             this.serial= "000";
         }
     }
    // public String getID(){
     //    return serial;
  //   }
}
