package entities;

import entities.enums.FormaTipo;

public class Trapezio extends Forma {
    private Double baseA;
    private Double baseB;
    private Double altura;
    private FormaTipo tipo = FormaTipo.TRAPEZIO;

    public Trapezio(Double baseA, Double baseB, Double altura){
        this.baseA = baseA;
        this.baseB = baseB;
        this.altura = altura;
    }

    public FormaTipo getTipo(){
        return tipo;
    }
    @Override
    public Double calcularArea() {
        return (baseA + baseB) * altura / 2;
    }
}
