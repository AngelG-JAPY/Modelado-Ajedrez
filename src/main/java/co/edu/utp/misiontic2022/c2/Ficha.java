package co.edu.utp.misiontic2022.c2;

public abstract class Ficha {
    
    private Color color;

    public Ficha(Color color) {
        this.color = color;
    }

    //Getter and Setters.
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //Métodos.

    public abstract boolean comer();

    public abstract boolean mover();
}
