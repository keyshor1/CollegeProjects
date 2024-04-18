public class Area extends Shape
{
 
 int area;
 int areaOfSquare;
 Double areaOfCircle;
     void rectangleArea(int length, int breadth){
         area=length*breadth;
         System.out.println("The area of rectange is:"+area);

    }
   
     void squareArea(int side){
        areaOfSquare=side*side;
        System.out.println("The area of square is:"+areaOfSquare);
     }
   
     void circleArea(double radius){
         areaOfCircle=3.14*(radius*radius);
         System.out.println("The area of circle is:"+areaOfCircle);
     }
   
}