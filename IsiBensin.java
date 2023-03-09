import java.util.Scanner;

public class IsiBensin {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int level;

      System.out.print("Masukkan presentase level baterai (0-100): ");
      level = input.nextInt();

      if (level >= 85) {
         System.out.println("Baterai penuh: " + level + "%");
      } else if (level >= 50) {
         System.out.println("Level baterai rendah: " + level + "%");   
      } else if (level >= 25) {
         System.out.println("Level baterai hampir habis: " + level + "%");
      } else{
        System.out.println("Level kosong: " + level + "%");
      }
   }
}