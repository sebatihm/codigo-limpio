public class Main {
    public static void main(String[] args) {
        Rectangle test = new Rectangle(4,4,3);
        System.out.println("Antes del redimensionamiento:\n" + test);
        test.resizeX(3);
        System.out.println("\n\n-- Redimensionamiento por factor de 3 --");
        System.out.println("\n\nDespues del redimensionamiento:\n" + test);
    }
}
