package Java;


public class OOPs{
    public static void main(String args[]){
        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setPoint("Ball");
        System.out.println(p1.point);
    }

}

class Pen{
    String color;
    String point;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }

    void setPoint(String newPoint){
        point = newPoint;
    }
}



