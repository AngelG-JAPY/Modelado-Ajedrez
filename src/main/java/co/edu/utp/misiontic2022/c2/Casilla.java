package co.edu.utp.misiontic2022.c2;

public class Casilla {

    private Color color;
    private Integer columna;
    private Integer fila;
    private Ficha ficha;

    public Casilla(){

    }

    public Casilla(Color color, Integer columna, Integer fila, Ficha ficha) {
        this.color = color;
        this.columna = columna;
        this.fila = fila;
        this.ficha = ficha;
    }

    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getColumna() {
        return columna;
    }

    public void setColumna(Integer columna) {
        this.columna = columna;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    //Metodos.

    public boolean ocupada(){
        return true;
    }


}
