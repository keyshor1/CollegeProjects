//creating child class Non Academic course and making access modifier private
public class NonAcademicCourse extends Course{
    private String  InstructorName;
    private String  StartDate;
    private String  CompletionDate;
    private String  ExamDate;
    private String  prerequisite;
    private boolean Registered;
    private boolean Removed;
    //creating constructor of class Non academic course
    public NonAcademicCourse(String courseID, String courseName, int duration,  String Prerequisite){
        //initializing instance variable in the Constructor
        super (courseID, courseName, duration);
        StartDate = "";
        CompletionDate = "";
        ExamDate = "";
        Registered = false;
        Removed = false;
    }
    //creating getter and setter method
    public String getInstructorName(){
        return InstructorName;
    }

    public String getStartDate(){
        return StartDate;
    }

    public String getCompletionDate(){
        return CompletionDate;
    }

    public String getExamDate(){
        return ExamDate;
    }

    public String getPrerequisite(){
        return  prerequisite;
    }

    public boolean getRemoved(){
        return Removed;
    }

    public boolean getRegistered(){
        return Registered;
    }

    public void setInstructorName( String instructorName){
        this.InstructorName = instructorName;   
    }
    //creating method name register
    public void register( String courseLeader, String InstructorName, String startingDate, String completionDate, String ExamDate){
        if(Registered==true){
            System.out.println("The course is already registered. ");
            System.out.println("The lecturer name is "+ InstructorName);
            System.out.println("The starting Date is "+ startingDate);
            System.out.println("The completion date is "+ completionDate);
            System.out.println("The exam date is "+ ExamDate);

        }
        else{
            super.setCourseLeader(courseLeader);
            this.InstructorName = InstructorName;
            this.StartDate = startingDate;
            this.CompletionDate = completionDate;                      
            this.ExamDate = ExamDate;
            Registered = true;

        }
    }
    //creating method name display
    public void display(){
        if(Registered== true){
            System.out.println("The InstructorName is " + InstructorName);
            System.out.println("The Start Date is " + StartDate);
            System.out.println("The Completion date is " + CompletionDate);
            System.out.println("The Exam date is" + ExamDate);
            System.out.println("The prerequisite is " + prerequisite);
        }
    }    
    //creating remove method to remove above value
    public void Remove(){
        if(Removed==true){
            System.out.println("The instructor for this module is Removed" );

        }

        else{
            super.setCourseLeader("");
            this.InstructorName = InstructorName;
            this.StartDate = "";
            this.CompletionDate = "";                      
            this.ExamDate = "";
            Removed= true;

        }
    }
    //creating display method and printing value inside it
    public void Display(){
        if(Removed==true){
            System.out.println("The courseID is " + getCourseID());
            System.out.println("The courseName is " + getCourseName());
            System.out.println("The Duration is " + getDuration());

        }
    }
}




