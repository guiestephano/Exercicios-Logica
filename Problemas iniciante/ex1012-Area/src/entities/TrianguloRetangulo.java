package entities;

import entities.enums.FormaTipo;

public class TrianguloRetangulo extends Forma {

    private Double base;
    private Double altura;
    private final FormaTipo tipo = FormaTipo.TRIANGULO;

    public TrianguloRetangulo(Double base, Double altura){
        this.base = base;
        this.altura = altura;
    }

    public FormaTipo getTipo(){
        return tipo;
    }
    @Override
    public Double calcularArea() {
        return base * altura / 2;
    }
}
