//creating class course and making access modifier private
public class Course{
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;
// creating constructor
   public Course(String courseID, String courseName, int duration){ // initializeing the  variable in constructor
    this.courseID = courseID;
    this.courseName = courseName;
    this.courseLeader = " ";
    this.duration = duration;
}
//Applying gettter and settter method
    public String getCourseID(){ // creating getter method
        return courseID;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseLeader(){
        return courseLeader;
    }
    public int getDuration(){
        return duration;
    
    }
    public void setCourseLeader(String courseLeader){//creating setter method
        this.courseLeader = courseLeader;

    }
// creating display method and printing outpot
public void display(){//creating a method
    System.out.println("courseID:" +courseID);
    System.out.println("courseName:" +courseName);
    System.out.println("Duration:" + duration);
    System.out.println("courseLeader:" +courseLeader);

    
    
    
    
    
}
}
