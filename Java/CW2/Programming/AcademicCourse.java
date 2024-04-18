
//creating child class Academic course and making access modifier private
public class AcademicCourse extends Course{
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean Registered;
    //creating constructor of class academic course
    public AcademicCourse(String courseID, String courseName,int duration,String level, String credit, int numberOfAssessments){
        //initializing instance variable in the Constructor
        super(courseID, courseName, duration);
        this.lecturerName = "";
        this.startingDate = ""; 
        this.completionDate = "";
        this.Registered = false;
    }
    // using gettter and settter method
    public String getLecturerName(){
        return lecturerName;
    }

    public String getLevel(){
        return level;         
    }

    public String getCredit(){
        return credit;
    }

    public String getStartingDate(){
        return startingDate; 
    }

    public String getCompletionDate(){
        return completionDate;
    }

    public int getNumberOfAssessments(){
        return numberOfAssessments; 
    }

    public boolean getRegistered(){
        return Registered;
    }

    public void setLecturerName( String lecturerName){
        this.lecturerName = lecturerName;   
    }

    public void setNumberOfAssessments( int numberOfAssessments){
        this.numberOfAssessments = numberOfAssessments;
    }
    //creating method name register
    public void register( String courseLeader, String lectureName, String startingDate, String completionDate){
        if(Registered==true){
            System.out.println("The course is already registered. ");
            System.out.println("The lecturer name is "+ lecturerName);
            System.out.println("The starting Date is "+ startingDate);
            System.out.println("The completion date is "+ completionDate);

        }
        else{
            super.setCourseLeader(courseLeader);
            this.lecturerName = lecturerName;
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            Registered = true;

        }

    }
    //creating method name display and using super keyword to call parent class attributes
    public void display(){
        super.display();
        if(Registered==true){
            System.out.println("The lecturer name is " + lecturerName);
            System.out.println("The level is " + level);
            System.out.println("The credit is " + credit);
            System.out.println("The starting date is " + startingDate);
            System.out.println("The completion date is" + completionDate);
            System.out.println("The number of assessments is " + numberOfAssessments);
        }
    }

}   
