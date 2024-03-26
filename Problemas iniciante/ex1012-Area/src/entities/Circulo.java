package entities;

import entities.enums.FormaTipo;

public class Circulo extends Forma {
    private final double PI = 3.14159;
    private Double raio;
    private FormaTipo tipo = FormaTipo.CIRCULO;

    public Circulo(Double raio){
        this.raio = raio;
    }

    @Override
    public FormaTipo getTipo(){
        return tipo;
    }

    @Override
    public Double calcularArea() {
        return raio * raio * PI;
    }
}
