package entities;

import entities.enums.FormaTipo;

public class Quadrado extends Forma {
    private Double lado;
    private FormaTipo tipo = FormaTipo.QUADRADO;

    public Quadrado(Double lado){
        this.lado = lado;
    }
    public FormaTipo getTipo(){
        return tipo;
    }

    @Override
    public Double calcularArea(){
        return lado * lado;
    }

}
