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

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
