import entities.Rettangolo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        Rettangolo primo = new Rettangolo(10.5, 5.5);
        Rettangolo secondo = new Rettangolo(12.5, 9);
        stampaRettangolo(primo);
        stampaRettangolo(secondo);


    }

    public static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("Perimetro" + rettangolo.getPerimeter());
        System.out.println("Area" + rettangolo.getArea());

    }

}