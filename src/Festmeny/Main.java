package Festmeny;

public class Main {
    public static void main(String[] args) {
        Festmeny f1 = new Festmeny("Vénusz Születése", "Sandro Botticelli", "reneszánsz");

        System.out.println(f1);

        System.out.println(f1.getFesto());

        System.out.println(f1.getStilus());

        f1.licit();
        System.out.println(f1);

        f1.licit(50);
        System.out.println(f1);

    }
}
