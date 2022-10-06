package Java;


public class OOPs{
    public static void main(String args[]){
        
        //PEN Object

        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.setPoint("Ball");
        System.out.println(p1.point);

        // Student Object
        
        Student s1 = new Student();

        s1.setName("Monica");
        System.out.println("Student name: "+ s1.name);

        s1.Subjectname("Physics");
        System.out.println("Subject name: "+ s1.subject);
        
        s1.Rollno(43);
        System.out.println("Student Roll no.: "+ s1.rollno);
        
        s1.Marks(70);
        System.out.println("Physics marks: "+ s1.Submarks);
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


    class Student{
        String name;
        String subject;
        int rollno;
        int Submarks;

        void setName(String StuName){
            name = StuName;
        }

        void Subjectname(String Subname){
            subject = Subname;
        }
        void Rollno(int Roll_no){
            rollno = Roll_no;
        }

        void Marks(int marks){
            Submarks = marks; 
        }
    }




