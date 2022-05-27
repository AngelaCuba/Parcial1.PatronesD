package singlretoP;
import java.util.LinkedList;
public class cabinaPago {
    private static final cabinaPago CabinaPago = new cabinaPago();
    private LinkedList<Vehiculo> registro = new LinkedList<>();
    private int b;
     public static cabinaPago getcabinaPago(){
         return CabinaPago;
     }
     public void chargeVehiculo (Vehiculo vehiculo){
         b += getV(vehiculo);
         registroVehiculo(vehiculo);

     }
     private void registroVehiculo(Vehiculo vehiculo){
         registro.add(vehiculo);
     }
     private int getV (Vehiculo vehiculo){
         int V;
         switch (vehiculo.getTipo()){
             case " menos" -> V=1;
             case "medio" -> V=3;
             case " mucho" -> V=5;
             default -> V =10;
         }
         return V;
     }

    public int getB() {
        return b;
    }
    public LinkedList<Vehiculo> getRegistro(){
         return  registro;
    }
}

