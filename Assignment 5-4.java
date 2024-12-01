public class MilesToKilometers {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%n", "Miles", "Kilometeres");

        for (int mile = 1; mile <= 10; mile++) {
         double Kilometeres = mile * 1.609;
         System.out.printf("%-10d%-10.3f%n", mile, Kilometeres);
        }
    }
}

  

      

