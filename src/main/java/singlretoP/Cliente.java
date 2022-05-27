package singlretoP;

import java.util.LinkedList;

public class Cliente {
    public static void main (String[] args){
   cabinaPago CabinaPago = new cabinaPago();
   Vehiculo v1=new Vehiculo( 13245 , "TOYOTA", "BLANCO", " menos ");
        Vehiculo v2=new Vehiculo( 13246 , "Yamaha", "BLANCO", " medio ");
        Vehiculo v3=new Vehiculo( 13248 , "TOYOTA", "Negro", " mucho ");
        Vehiculo v4=new Vehiculo( 13242 , "Zuzuki", "BLANCO", " menos ");
        Vehiculo v5=new Vehiculo( 132434 , "Torola", "AZUL", " mucho ");
        Vehiculo v6=new Vehiculo( 132451 , "TOYOTA", "BLANCO", " menos ");

        CabinaPago.chargeVehiculo(v1);
        CabinaPago.chargeVehiculo(v2);
        CabinaPago.chargeVehiculo(v3);
        CabinaPago.chargeVehiculo(v4);
        CabinaPago.chargeVehiculo(v5);
        CabinaPago.chargeVehiculo(v6);

        LinkedList<Vehiculo> list= CabinaPago.getRegistro();

    }

}
