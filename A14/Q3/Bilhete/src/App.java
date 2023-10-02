public class App {
    public static void main(String[] args) throws Exception {
        Bilhete b1 = new Bilhete("Olá, mundo!", 29, 9, 2023);
        Bilhete b2 = new Bilhete("Olá, mundo!", 29, 9, 2023);
        System.out.println(b1.toString());
        System.out.println(b1.equals(b2));
    }
}
