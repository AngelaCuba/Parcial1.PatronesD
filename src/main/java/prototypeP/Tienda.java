package prototypeP;

public class Tienda {

    public static void main(String[] args){
        TV tv1 = new TV();
        Serial serial1 = new Serial("1234");
        tv1.setSerial(serial1);
        tv1.setOpSystem("Android");
        tv1.setVersion("7");


        TV tv2 = (TV) tv1.clone();
        Serial serial2 = new Serial("246");
        tv2.setSerial(serial2);


    }
}
