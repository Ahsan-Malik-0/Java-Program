public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i < 10){
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(", "); 
            }
            
        }
    }
}