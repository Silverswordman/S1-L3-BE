package entities;

public class Rettangolo {
    //attr
    double height;
    double lenght;

    //costruttori

    public Rettangolo(double height, double lenght) {
        this.height = height;
        this.lenght = lenght;
    }

    // metodi
    public double getPerimeter() {
        return ((height + lenght) * 2);
    }

    public double getArea() {
        return (height * lenght);
    }
    public void stampaRettangolo (Rettangolo entities){

    }
}
