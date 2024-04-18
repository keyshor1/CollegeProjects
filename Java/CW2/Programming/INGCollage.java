import javax.swing.*;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.FlowLayout;
// making access modifier private
public class INGCollage {
    private ArrayList<Course> list = new ArrayList<>();
    private JFrame frame;
    private JPanel panel1, panel2;
    private JLabel lbP1CourseID; 
    private JLabel lbp1CourseName;
    private JLabel lbp1Duration;
    private JLabel lbp1NumberofAssessment; 
    private JLabel lbp1LecturareName;
    private JLabel lbp1CourseLeader;
    private JLabel lbp1Level;
    private JLabel lbp1Credit;
    private JLabel lbp1Course; 
    private JLabel lbp1StartDate;
    private JLabel lbp1CompletionDate;

    private JTextField txtP1CourseID;
    private JTextField txtp1CourseName;
    private JTextField txtp1Duration; 
    private JTextField txtp1NumberofAssessment;
    private JTextField txtp1LecturerName;
    private JTextField txtp1CourseLeader;
    private JTextField txtp1Level;
    private JTextField txtp1Credit;
    private JTextField txtp1Startdate;
    private JTextField txtp1CompletionDate;

    private  JLabel  lbP2CourseID; 
    private  JLabel lbp2CourseName;
    private  JLabel lbp2Duration;
    private JLabel lbp2Prerequisite; 
    private  JLabel lbp2Course;
    private  JLabel lbp2CourseLeader;
    private  JLabel lbp2InstructorName;
    private  JLabel lbp2Startdate;
    private  JLabel lbp2Completiondate;
    private  JLabel lbp2Examdate;

    private  JTextField txtP2CourseID;
    private  JTextField txtP2CourseIDCheck;
    private  JTextField txtp2CourseName;
    private  JTextField txtp2Duration; 
    private  JTextField txtp2Prerequisite;
    private  JTextField txtp2Course; 
    private  JTextField txtp2CourseLeader;
    private  JTextField txtp2InstructorName;
    private  JTextField txtp2StartDate;
    private  JTextField txtp2Completiondate;
    private  JTextField txtp2ExamDate;
    private JButton btn1AddAcademic, btn1DisplayAcademic, btn1RegisterAcademic, btn1ClearAcademic;
    private JButton btnAddNonAcademic, btnDisplayNonAcademic, btnRegisterNonAcademic, btnClearNonAcademic, btnRemoveNonAcademic;
    // creating frame a and b in jpannnel
    public INGCollage() {
        initialFrame();
        myFrameA();
        myFrameB();
    }
    // making access modifier public for attributes
    public String getCourseId(){
        return txtP1CourseID.getText();
    }

    public String getCourseName(){
        return txtp1CourseName.getText();
    }

    public int getDuration(){
        String duration = txtp1Duration.getText();
        int Duration = -1;
        try {
            Duration = Integer.parseInt(duration);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(frame, "Incorrect value for number of Duration.\nPlease add numeric value", "Invalid Input", 0);
        }
        return Duration;
    }

    public int getNumberOfAssessment(){
        String numberOfAssessment=txtp1NumberofAssessment.getText();
        int numberOfAssessmentNum=-1;
        try{
            numberOfAssessmentNum=Integer.parseInt(numberOfAssessment);
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(frame,"Please enter the numberic values for numberof assessment","Invalid Data",2);

        }
        return numberOfAssessmentNum;
    }
    //using gettter and settter method 
    public String getLevel(){
        return  txtp1Level.getText();
    }

    public String getCredit(){
        return txtp1Credit.getText();
    }

    public String getLecturerName() {
        return txtp1LecturerName.getText();
    }

    public String getCourseLeader(){
        return txtp1CourseLeader.getText();
    }

    public String getStartDate(){
        return txtp1Startdate.getText();
    }

    public String getCompletionDate(){
        return txtp1CompletionDate.getText();
    }

    public String getAcademicStartDate() {
        return txtp1Startdate.getText();
    }

    public String getNonAcademicCourseName() {
        return txtp2CourseName.getText();
    }

    public String getNonAcademicCourseID() {
        return txtP2CourseID.getText();
    }

    public String getNonAcademicCourseIDCheck() {
        return txtP2CourseIDCheck.getText();
    }

    public int getNonAcademicDuration() {
        String Duration=txtp2Duration.getText();
        int duration=-1;
        try{
            duration=Integer.parseInt(Duration);
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(frame,"please enter the numberic value for duration","Invalid Data",2);
        }
        return duration;
    }

    public String getNonAcademicStartDate() {
        return txtp2StartDate.getText();
    }

    public String getNonAcademicInstructorname() {
        return txtp2InstructorName.getText();
    }

    public String getNonAcademicCourseLeader() {
        return txtp2CourseLeader.getText();
    }

    public String getNonAcademicCompletiondate() {
        return txtp2Completiondate.getText();
    }

    public String getNonAcademicExamDate() {
        return txtp2ExamDate.getText();
    }

    public String getNonAcademicPrerequisite() {
        return txtp2Prerequisite.getText();
    }

    public void initialFrame() {
        // Arraylist<Academic>list = new Arraylist<>();
        frame = new JFrame("INGCOllage");
        frame.setLayout(null);
        frame.setSize(1250, 580);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        frame.add(panel1);
        panel1.setBounds(10, 70, 610, 600);
        panel1.setLayout(null);
        panel1.setBorder(BorderFactory.createTitledBorder("Academic Course"));

        panel2 = new JPanel();
        frame.add(panel2);
        panel2.setBounds(640, 70, 600, 600);
        panel2.setLayout(null);

        panel2.setBorder(BorderFactory.createTitledBorder("NonAcademic Course"));
    }

    public void myFrameA() {
        JLabel lbRegistration = new JLabel("Registration form");
        lbRegistration.setBounds(590, 30, 120, 25);
        frame.add(lbRegistration);

        ArrayList<Course> CourseName = new ArrayList<Course>();

        lbP1CourseID = new JLabel("Course ID:");
        panel1.add(lbP1CourseID);
        lbP1CourseID.setBounds(15, 30, 75, 25);

        txtP1CourseID = new JTextField();
        panel1.add(txtP1CourseID);
        txtP1CourseID.setBounds(100, 30, 150, 25);
        Border border = BorderFactory.createLineBorder(Color.RED, 5);
        //.setBorder(BorderFactory.createLineBorder(Color.BLUE,5));

        lbp1Duration = new JLabel("Duration:");
        panel1.add(lbp1Duration);
        lbp1Duration.setBounds(15, 80, 75, 25);

        txtp1Duration = new JTextField();
        panel1.add(txtp1Duration);
        txtp1Duration.setBounds(100, 80, 150, 25);

        lbp1CourseName = new JLabel("CourseName:");
        panel1.add(lbp1CourseName);
        lbp1CourseName.setBounds(280, 30, 100, 25);

        txtp1CourseName = new JTextField();
        panel1.add(txtp1CourseName);
        txtp1CourseName.setBounds(430, 30, 150, 25);

        lbp1NumberofAssessment = new JLabel("NumberofAssessment:");
        panel1.add(lbp1NumberofAssessment);
        lbp1NumberofAssessment.setBounds(280, 80, 150, 25);

        txtp1NumberofAssessment = new JTextField();
        panel1.add(txtp1NumberofAssessment);
        txtp1NumberofAssessment.setBounds(430, 80, 150, 25);

        lbp1Level = new JLabel("Level :");
        panel1.add(lbp1Level);
        lbp1Level.setBounds(15, 130, 150, 25);

        txtp1Level = new JTextField();
        panel1.add(txtp1Level);
        txtp1Level.setBounds(100, 130, 150, 25);

        lbp1Credit = new JLabel("Credit :");
        panel1.add(lbp1Credit);
        lbp1Credit.setBounds(280, 130, 150, 25);

        txtp1Credit = new JTextField();
        panel1.add(txtp1Credit);
        txtp1Credit.setBounds(430, 130, 150, 25);

        btn1AddAcademic = new JButton("Add");
        btn1AddAcademic.setBounds(280, 170, 95, 30);
        panel1.add(btn1AddAcademic);

        btn1AddAcademic.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    addAcademicCourse();
                }
            });

        // btnAdd.addActionListener(new ActionListener(){
        // public void actionPerformed(ActionEvent ae){
        // String courseID = txtP1CourseID.getText();

        // String courseName = txtp1CourseName.getText();
        // int duration = txtp1Duration.getText();
        // String numberofAssessment = txtp1NumberofAssessment.getText();
        // String level = txtp1Level.getText();
        // String Credit = txtp1Credit.getText();

        // Empty text Field, Repeated courseId,duration -> int
        // AcademicCourse.add(new AcademicCourse(courseID,courseName,
        // duration,level,Credit,numberofassessment ));
        // JOptionPane.showMessageDialog(frame,"Data added successfully");;
        // }
        // });
        // JButton button = new JButton("Add");
        // panel1.add(button);
        // button.setBounds(250,130,95,30);
        // button.addActionlistener(new ActionListener(){
        // public void actionperform(ActionEvent ae){
        // add(Course);
        // };
        // });

        lbp1CompletionDate = new JLabel("Completion date:");
        panel1.add(lbp1CompletionDate);
        lbp1CompletionDate.setBounds(15, 230, 150, 25);

        txtp1CompletionDate = new JTextField();
        panel1.add(txtp1CompletionDate);
        txtp1CompletionDate.setBounds(130, 230, 150, 25);

        lbp1LecturareName = new JLabel("LecturerName:");
        panel1.add(lbp1LecturareName);
        lbp1LecturareName.setBounds(15, 280, 150, 25);

        txtp1LecturerName = new JTextField();
        panel1.add(txtp1LecturerName);
        txtp1LecturerName.setBounds(130, 280, 150, 25);

        lbp1CourseLeader = new JLabel("CourseLeader :");
        panel1.add(lbp1CourseLeader);
        lbp1CourseLeader.setBounds(330, 230, 150, 25);

        txtp1CourseLeader = new JTextField();
        panel1.add(txtp1CourseLeader);
        txtp1CourseLeader.setBounds(430, 230, 150, 25);

        lbp1StartDate = new JLabel("Start Date:");
        panel1.add(lbp1StartDate);
        lbp1StartDate.setBounds(330, 270, 150, 25);

        txtp1Startdate = new JTextField();
        panel1.add(txtp1Startdate);
        txtp1Startdate.setBounds(430, 270, 150, 25);

        btn1DisplayAcademic = new JButton("Display");
        panel1.add(btn1DisplayAcademic);
        btn1DisplayAcademic.setBounds(50, 340, 95, 30);

        btn1DisplayAcademic.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    displayAcademicCourse();
                }
            });

        btn1ClearAcademic = new JButton("Clear");
        panel1.add(btn1ClearAcademic);
        btn1ClearAcademic.setBounds(480, 340, 95, 30);

        btn1ClearAcademic.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    clearAcademicCourse();
                }
            });

        JButton Register = new JButton("Register ");
        panel1.add(Register);
        Register.setBounds(280, 320, 95, 30);
        Register.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    registerAcademicCourse();
                }
            });

    }

    public void myFrameB() {

        lbP2CourseID = new JLabel("CourseID");
        panel2.add(lbP2CourseID);
        lbP2CourseID.setBounds(15, 30, 75, 25);

        txtP2CourseID = new JTextField();
        panel2.add(txtP2CourseID);
        txtP2CourseID.setBounds(100, 30, 150, 25);

        lbp2CourseName = new JLabel("CourseName:");
        panel2.add(lbp2CourseName);
        lbp2CourseName.setBounds(300, 30, 100, 25);

        txtp2CourseName = new JTextField();
        panel2.add(txtp2CourseName);
        txtp2CourseName.setBounds(390, 30, 150, 25);

        lbp2Duration = new JLabel("Duration:");
        panel2.add(lbp2Duration);
        lbp2Duration.setBounds(15, 80, 75, 25);

        txtp2Duration = new JTextField();
        panel2.add(txtp2Duration);
        txtp2Duration.setBounds(100, 80, 150, 25);

        lbp2Prerequisite = new JLabel("prerequisite:");
        panel2.add(lbp2Prerequisite);
        lbp2Prerequisite.setBounds(300, 80, 75, 25);

        txtp2Prerequisite = new JTextField();
        panel2.add(txtp2Prerequisite);
        txtp2Prerequisite.setBounds(390, 80, 150, 25);

        btnAddNonAcademic = new JButton("Add");
        btnAddNonAcademic.setBounds(250, 130, 95, 30);
        panel2.add(btnAddNonAcademic);

        btnAddNonAcademic.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    addNonAcademicCourse();
                }
            });

        lbP2CourseID = new JLabel("CourseID:");
        panel2.add(lbP2CourseID);
        lbP2CourseID.setBounds(15, 200, 150, 25);

        txtP2CourseID = new JTextField();
        panel2.add(txtP2CourseID);
        txtP2CourseID.setBounds(120, 200, 150, 25);

        lbp2CourseLeader = new JLabel("CourseLeader :");
        panel2.add(lbp2CourseLeader);
        lbp2CourseLeader.setBounds(290, 200, 150, 25);

        txtp2CourseLeader = new JTextField();
        panel2.add(txtp2CourseLeader);
        txtp2CourseLeader.setBounds(390, 200, 150, 25);

        lbp2InstructorName = new JLabel("InstructorName");
        panel2.add(lbp2InstructorName);
        lbp2InstructorName.setBounds(15, 240, 100, 25);

        txtp2InstructorName = new JTextField();
        panel2.add(txtp2InstructorName);
        txtp2InstructorName.setBounds(120, 240, 150, 25);

        lbp2Startdate = new JLabel("Start Date:");
        panel2.add(lbp2Startdate);
        lbp2Startdate.setBounds(290, 240, 150, 25);

        txtp2StartDate = new JTextField();
        panel2.add(txtp2StartDate);
        txtp2StartDate.setBounds(390, 240, 150, 25);

        lbp2Examdate = new JLabel("Exam Date:");
        panel2.add(lbp2Examdate);
        lbp2Examdate.setBounds(290, 280, 150, 25);

        txtp2ExamDate = new JTextField();
        panel2.add(txtp2ExamDate);
        txtp2ExamDate.setBounds(390, 280, 150, 25);

        lbp2Completiondate = new JLabel("Completion Date");
        panel2.add(lbp2Completiondate);
        lbp2Completiondate.setBounds(15, 280, 100, 25);

        txtp2Completiondate = new JTextField();
        panel2.add(txtp2Completiondate);
        txtp2Completiondate.setBounds(120, 280, 150, 25);

        JButton Register = new JButton("Register ");
        panel2.add(Register);
        Register.setBounds(250, 330, 95, 30);

        Register.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    registerNonAcademicCourse();
                }
            });
        btnRemoveNonAcademic = new JButton("Remove");
        panel2.add(btnRemoveNonAcademic);
        btnRemoveNonAcademic.setBounds(250, 430, 95, 30);

        btnRemoveNonAcademic.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    RemovedNonAcademicCourse();
                }
            });

        btnDisplayNonAcademic = new JButton("Display");
        panel2.add(btnDisplayNonAcademic);
        btnDisplayNonAcademic.setBounds(50, 400, 95, 30);

        btnDisplayNonAcademic.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    displayNonAcademicCourse();
                }
            });

        btnClearNonAcademic = new JButton("Clear");
        panel2.add( btnClearNonAcademic);
        btnClearNonAcademic.setBounds(430, 400, 95, 30);

        btnClearNonAcademic.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    clearNonAcademicCourse();
                }
            });

    }
    // using 'this' keyword inside academic course
    public void addAcademicCourse(){
        String courseID=this.getCourseId();
        String courseName=this.getCourseName();
        int duration=this.getDuration();
        int numberofAssessments=this.getNumberOfAssessment();
        String level=this.getLevel();
        String credit=this.getCredit();
        boolean flag=false;
        // usinf if and else condition and printing value
        if(courseID.equals("")||courseName.equals("")||duration==-1||numberofAssessments==-1||level.equals("")||credit.equals("")){
            JOptionPane.showMessageDialog(frame,"Enter the value in every text field.","Empty Data",2);
            return;
        }else{
            if(list.isEmpty()){
                flag=true;
            } else {
                for (Course dep : list) {
                    if (dep.getCourseID().equals(courseID)) {
                        JOptionPane.showMessageDialog(frame, "The course is already added.", "add", 1);
                        return;
                    } else {
                        flag = true;
                    }
                }
            }
            if(flag==true){
                list.add(new AcademicCourse(courseID,courseName,duration,level,credit, numberofAssessments));
                String message = "CourseID : " + courseID + "\nCourseName : " + courseName + "\nDuration : "+ duration + "\nLevel : " + level + "\nCredit:" + credit + "\nNumberofassessment:" + numberofAssessments;
                JOptionPane.showMessageDialog(frame, message, "Data Added", 1);

            }
        }
    }

    public void registerAcademicCourse() {
        String courseID = this.getCourseId();
        String lectureName = this.getLecturerName();
        String courseLeader = this.getLecturerName();
        String startingDate = this.getStartDate();
        String completionDate = this.getCompletionDate();
        boolean flag = false;

        if (courseID.equals("") || courseLeader.equals("") || lectureName.equals("") || startingDate.equals("")
        || completionDate.equals("")) {
            JOptionPane.showMessageDialog(frame, "The fields are empty.\nPlease fill the required data", "Empty Field",
                2);
            return;
        } else {
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "The courseIDdoesnot exists.\nPlease add the courseID data",
                    "Incorrect Input", 2);
                return;
            } else {
                for (Course cou : list) { // Course obj : arrayList / AcademicCourse & NonAcademicCourse XX
                    if (cou instanceof AcademicCourse) {
                        if (cou.getCourseID().equals(courseID)) { // Java Python
                            AcademicCourse ac = (AcademicCourse) cou;
                            if (ac.getRegistered() == true) {
                                JOptionPane.showMessageDialog(frame, "The course is already register.", "register",1);
                                return;
                            } else {
                                ac.register(courseLeader,lectureName,startingDate,completionDate);
                                String message = "CourseID : " + courseID + "\nCourseLeader : " + courseLeader
                                    + "\nLeactureName : " + lectureName + "\nStartingDate : " + startingDate
                                    + "\nCompletionDate" + completionDate;
                                JOptionPane.showMessageDialog(frame, message, "Data Added", 1);
                                return;
                            }

                        }
                    }
                }
                JOptionPane.showMessageDialog(frame, "The coursedoesnot exists.\nPlease add the  data",
                    "No platform", 2);
            }
        }
    }

    public void clearAcademicCourse(){
        txtP1CourseID.setText("");
        txtp1CourseName.setText("");
        txtp1Duration.setText("");
        txtp1Level.setText("");
        txtp1Credit.setText("");
        txtp1LecturerName.setText("");
        txtp1Startdate.setText("");
        txtp1CompletionDate.setText("");
        txtp1NumberofAssessment.setText("");
        txtp1CourseLeader.setText("");

    }

    public void displayAcademicCourse() {
        for (Course dev : list) {
            if (dev instanceof AcademicCourse) {
                AcademicCourse AC = (AcademicCourse) dev;
                AC.display();
            }
        }
    }

    public void addNonAcademicCourse(){
        String courseID=this.getNonAcademicCourseID();
        String courseName=this.getNonAcademicCourseName();
        int duration=this.getNonAcademicDuration();
        //int numberofAssessments=this.getNumberOfAssessment();
        //String level=this.getLevel();
        String prerequisite =this.getNonAcademicPrerequisite();
        boolean flag=false;
        if(courseID.equals("")||courseName.equals("")||duration==-1||prerequisite.equals("")){
            JOptionPane.showMessageDialog(frame,"Enter the value in every text field.","Empty Data",2);
            return;
        }else{
            if(list.isEmpty()){
                flag=true;
            } else {
                for (Course dep : list) {
                    if (dep.getCourseID().equals(courseID)) {
                        JOptionPane.showMessageDialog(frame, "The course is already added.", "add", 1);
                        return;
                    } else {
                        flag = true;
                    }
                }
            }
        }
        if(flag==true){
            list.add(new NonAcademicCourse(courseID,courseName,duration,prerequisite));
            String message = "CourseID : " + courseID + "\nCourseName : " + courseName + "\nDuration : "+ duration + "\nPrerequisite: " + prerequisite;
            JOptionPane.showMessageDialog(frame, message, "Data Added", 1);

        }

    }

    public void registerNonAcademicCourse() {
        String courseID = this.getNonAcademicCourseID();
        String instructorName = this.getNonAcademicInstructorname();
        String courseLeader = this.getNonAcademicCourseLeader();
        String startingDate = this.getNonAcademicStartDate();
        String completionDate = this.getNonAcademicCompletiondate();
        String examDate = this.getNonAcademicExamDate();
        boolean flag = false;

        if (courseID.equals("") || courseLeader.equals("") || instructorName.equals("") || startingDate.equals("")
        || completionDate.equals("")||examDate.equals("")) {
            JOptionPane.showMessageDialog(frame, "The fields are empty.\nPlease fill the required data", "Empty Field",
                2);
            return;
        } else {
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "The courseIDdoesnot exists.\nPlease add the courseID data",
                    "Incorrect Input", 2);
                return;
            } else {
                for (Course cou : list) { // Course obj : arrayList / AcademicCourse & NonAcademicCourse XX
                    if (cou instanceof NonAcademicCourse) {
                        if (cou.getCourseID().equals(courseID)) { // Java Python
                            NonAcademicCourse ac = (NonAcademicCourse) cou;
                            if (ac.getRegistered() == true) {
                                JOptionPane.showMessageDialog(frame, "The course is already register.", "register",1);
                                return;
                            } else {
                                ac.register(courseLeader,instructorName,startingDate,completionDate,examDate);
                                String message = "CourseID : " + courseID + "\nCourseLeader : " + courseLeader
                                    + "\nInstructorName : " + instructorName + "\nStartingDate : " + startingDate
                                    + "\nCompletionDate" + completionDate+"\nExamDate :"+examDate;
                                JOptionPane.showMessageDialog(frame, message, "Data Added", 1);
                                return;
                            }

                        }
                    }
                }
                JOptionPane.showMessageDialog(frame, "The CourseID doesnot exists.\nPlease add the Course data",
                    "No CourseID", 2);
            }
        }
    }
    // public void clearAcademicCourse(){
    // txtP1CourseID.setText("");
    // }

    public void displayNonAcademicCourse() {
        for (Course dev : list) {
            if (dev instanceof NonAcademicCourse) {
                NonAcademicCourse AB = (NonAcademicCourse) dev;
                AB.display();
            }
        }
    }

    public void clearNonAcademicCourse(){
        txtP2CourseID.setText("");
        txtp2CourseName.setText("");
        txtp2InstructorName.setText("");
        txtP2CourseID.setText("");
        txtp2Duration.setText("");
        txtp2Prerequisite.setText("");
        txtp2CourseLeader.setText("");
        txtp2StartDate.setText("");
        txtp2Completiondate.setText("");
        txtp2ExamDate.setText("");

    }
    
    public void RemovedNonAcademicCourse() {
         String id = this.getNonAcademicCourseID();
            if(id.equals("")){
                JOptionPane.showMessageDialog(frame,"Please add ID for  which you want course to be removed.","Remove",1);
                return;
            }else{
                if(list.isEmpty()){
                    JOptionPane.showMessageDialog(frame," Please Add and register the course inorder to removed.","Warning",1);
                    return;
                }else{
                    for(Course cou:list){
                        if(cou.getCourseID().equals(id)){
                            if(cou instanceof NonAcademicCourse){
                                NonAcademicCourse nac = (NonAcademicCourse) cou;
                                if(nac.getRemoved() == false){
                                    nac.Remove();
                                    JOptionPane.showMessageDialog(frame," remove sucessfull","remove",1);
                                }else{
                                    JOptionPane.showMessageDialog(frame,"already remove","remove",1);
                                    return;
                                }
                            }
                        }else{
                            JOptionPane.showMessageDialog(frame,"it does not exist.","remove",1);
                            return;
                        }
                    }
                }
            }
        
        }
    //creating main method
    public static void main(String[] args) {
        new INGCollage().frame.setVisible(true);
    }
}
