package entities;

import entities.enums.FormaTipo;

public abstract class Forma {
    private FormaTipo tipo;

    public abstract Double calcularArea();
    public abstract FormaTipo getTipo();
}
