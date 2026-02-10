public class test1 {
   public int d = 40;
   private int b = 20;
   protected int c = 90;
   int y = 30;   

   void display(){
      System.out.println(d);
      System.out.println(b);
      System.out.println(c);
      System.out.println(y);
   }

   public static void main(String args[]){
      test1 obj = new test1();
      obj.display();
   }
}
