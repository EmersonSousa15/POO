public class App {
    public static void main(String[] args) throws Exception {
        String str1 = "abcdefghij", str2 = "";
        char[] letters = str1.toCharArray();
        boolean isFirst = true;
        for (char letter : letters) {
            str2 += isFirst ? " " + ((int) letter) :  " ." + ((int) letter); 
            isFirst = !isFirst;
        }
        System.out.println(str2);
    }
}
