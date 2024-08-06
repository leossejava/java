class BoxTest
{
public static void main(String[] args)
{
   Box myBox = new Box();
   myBox.get();
   myBox.volume();
}
}
class Box
{
   double width;
   double height;
   double depth;
   void get()
{
   width = 10.5;
   height= 20.5;
   depth = 5.5;
}
void volume()
{
   double v= width*height*depth;
   System.out.print("volume of Box="+v);
}
}