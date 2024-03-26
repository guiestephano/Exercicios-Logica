package entities;

import entities.enums.FormaTipo;

public class Retangulo extends Forma {

    private Double base;
    private Double altura;
    private final FormaTipo tipo = FormaTipo.RETANGULO;

    public Retangulo(Double base, Double altura){
        this.base = base;
        this.altura = altura;
    }

    public FormaTipo getTipo(){
        return tipo;
    }
    @Override
    public Double calcularArea() {
        return base * altura;
    }
}
