public class cylinder3
{
    //Default value of 10
    private float radius=10;
    private float height=10;

    public float volume()
    {
        float PI=22/7;

        float volume= PI* (radius*radius)/height;
        return volume;

    }

    public void setheight(float height)
    {
        if(height>=0){

            this.height = height;

        }
        else{
            System.out.print("The given value is negative so its default value is using as variable");
        }
    } 

    public void setradius(float radius){
        if (radius >=0){

            this.radius = radius;

        }
        else {
            System.out.print("The given value is negative so its default value is using as variable");
        }
    }

    public float getradius()
    {

        return radius;
    }

    public float getheight()
    {
        return height;
    }

    public static void main(String[] args){
        cylinder3 obj= new cylinder3();
        obj.setheight(15);
        obj.setradius(14);
        System.out.println();
        System.out.println("Volume of the cylinder3 :" + obj.volume());
    }

}