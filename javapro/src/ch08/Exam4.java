package ch08;

class Rectangle2
{
   int width, height, serialNo;
   static int sno;
   int area()
   {
      return width*height;
   }
   int length()
   {
      return (width+height)*2;
   }
   @Override
   public String toString() {
      return serialNo + "번사격형 : (" + width 
         + "," + height +") => 면적:" + area() +
         ",  둘레:" + length();
   }
   
}

public class Exam4 
{
   public static void main(String[] args) {
      Rectangle2[] arr = new Rectangle2[3];
      int totalArea = 0;
      int totalLength = 0;
      for (int i = 0; i < arr.length; i++) {
         arr[i] = new Rectangle2();
         arr[i].width = i * 5 + 10;
         arr[i].height = i * 5 + 20;
         arr[i].serialNo = ++Rectangle2.sno;
         System.out.println(arr[i]);
         totalArea += arr[i].area();
         totalLength += arr[i].length();
      }
      System.out.println("전체 사격형 면적의 합 : "+totalArea);
      System.out.println("전체 사격형 둘레의 합 : "+totalLength);
   }
}