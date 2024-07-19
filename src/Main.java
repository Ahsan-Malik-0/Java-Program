public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Output 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i < 10){
                System.out.print(", ");
            }
        }

        // Next Line
        System.out.println();


        // Output 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
        for (int i = 10; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(", "); 
            }
            
        }

        System.out.println();
    
<<<<<<< HEAD
    }
=======
        }    
>>>>>>> feature1
}