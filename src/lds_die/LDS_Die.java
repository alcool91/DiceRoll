package lds_die;
public class LDS_Die {
   public static void main(String[] args) {
      CreatePairOfDice.create();
   }
   private static class CreatePairOfDice {
      public static void create() {
         die d1 = new die();
         die d2 = new die();
         
         d1.set_value((int)Math.floor(Math.random()*6) + 1);
         d2.set_value((int)Math.floor(Math.random()*6) + 1);
         d1.print_die();
         d2.print_die();
      }
   }
   private static class die {
         private int value;
         public die() {
            value = -1;
         }

         
         public int get_value() {
            return value;
         }
         public void set_value(int value) {
            this.value = value;
         }
         public void print_die() {
            System.out.println(" _____");
            switch (value) {
               case (1):    
                  System.out.println("|     |");
                  System.out.println("|  *  |");
                  System.out.println("|     |");
                  break;
               case (2):
                  System.out.println("|    *|");
                  System.out.println("|     |");
                  System.out.println("|*    |");
                  break;
               case (3):
                  System.out.println("|*    |");
                  System.out.println("|  *  |");
                  System.out.println("|    *|");
                  break;
               case (4):
                  System.out.println("|*   *|");
                  System.out.println("|     |");
                  System.out.println("|*   *|");
                  break;
               case (5):
                  System.out.println("|*   *|");
                  System.out.println("|  *  |");
                  System.out.println("|*   *|");
                  break;
               case (6):
                  System.out.println("|*   *|");
                  System.out.println("|*   *|");
                  System.out.println("|*   *|");
                  break;
               default:
                  System.out.println("ERROR: No Value");
            }
            System.out.println(" \u203E\u203E\u203E\u203E\u203E");
         }
      }
}