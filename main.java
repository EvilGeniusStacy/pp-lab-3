public class main {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Point i inicjowanie jego wartości
        point point = new point(3.5, 2.0);

        // Wyświetlanie współrzędnych punktu
        System.out.println("Współrzędne punktu:");
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());
    }
}