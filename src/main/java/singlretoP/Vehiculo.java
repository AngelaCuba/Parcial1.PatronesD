package singlretoP;

public class Vehiculo {
    private int placa;
    private String modelo;
    private String color;
    private String tipo;

    public Vehiculo (int placa, String modelo, String color, String tipo){
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = tipo;
    }
}
