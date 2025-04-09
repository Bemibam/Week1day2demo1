public class Main {
    public static void main(String[] args) {
        String letters = "ABC \t abc \r\n 123!";
        System.out.println(letters);
        for(char c : letters.toCharArray()){
            int i = (int) c;
            System.out.print("'" + c + "'");
            System.out.print("=");
            System.out.print(i);
            System.out.print(" ");
            System.out.print(Integer.toString(i, 16));
            System.out.print(" ");
            System.out.print(Integer.toString(i, 2));
            System.out.print("\n");
        }
    }
}











