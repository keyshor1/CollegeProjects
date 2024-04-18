import javax.swing.JRadioButton;
import javax.swing.*;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class GUI6
{
    private JFrame frame;
    private JPanel panel1;
    private JLabel firstname;
    private JLabel street1;
    private JLabel lastname;
 private JLabel street2;
    private JLabel City;
    private JLabel Country;
    private JLabel ZipCode;
    private JLabel gender;
    private JRadioButton maleButton;
    private JRadioButton femaleButton;
    
    private JTextField txtfirstname;
    private JTextField txtlastname;
    private JTextField txtstreet1;
private JTextField txtCity;
    private JTextField txtZipCode;
    private JTextField txtCountry;
    private ButtonGroup btngroup;
    private JTextField txtstreet2;
    
    private JComboBox  country;
    private JButton btnOk;
    private JButton Cancel;
    private JButton Register;

    public GUI6(){
        initialFrame();
        myFrameA();

    }

    public void initialFrame(){
        frame = new JFrame("Registration form");
        frame.setLayout(null);
        frame.setSize(700,700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        frame.add(panel1);
        panel1.setBounds(0,0,700,700);
        panel1.setLayout(null);
        panel1.setBackground(Color.white);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLUE));

    }

    public void myFrameA(){
        firstname = new JLabel("First Name");
        panel1.add(firstname);
        firstname.setBounds(15,30,75,25);

        txtfirstname = new JTextField();
        panel1.add(txtfirstname);
        txtfirstname.setBounds(80,30,150,25);

        lastname = new JLabel("Last Name");
        panel1.add(lastname);
        lastname.setBounds(15,70,75,25);

        txtfirstname = new JTextField();
        panel1.add(txtfirstname);
        txtfirstname.setBounds(80,70,150,25);

        gender = new JLabel("Gender");
        panel1.add(gender);
        gender.setBounds(15,110,75,25);

        maleButton = new JRadioButton("male",true);
        maleButton.setBounds(80,110,75,25);
        panel1.add(maleButton);
        femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(150,110,75,25);
        panel1.add(femaleButton);

        btngroup = new ButtonGroup();
        btngroup.add(maleButton);
        btngroup.add(femaleButton);

        
        //ButtonGroup group = new ButtonGroup();
        // group.add(maleButton);
        //maleButton =new JRadioButton("male",true);
        street1 = new JLabel("Street 1");
        panel1.add(street1);
        street1.setBounds(15,150,75,25);

        txtstreet1 = new JTextField();
        panel1.add(txtstreet1);
        txtstreet1.setBounds(80,150,150,25);

        street2 = new JLabel("Street 2");
        panel1.add(street2);
        street2.setBounds(15,190,75,25);

        txtstreet2 = new JTextField();
        panel1.add(txtstreet2);
        txtstreet2.setBounds(80,190,150,25);

        City= new JLabel("city");
        panel1.add(City);
        City.setBounds(15,230,75,25);

        txtCity= new JTextField();
        panel1.add(txtCity);
        txtCity.setBounds(80,230,150,25);

        ZipCode= new JLabel("Zip Code");
        panel1.add(ZipCode);
        ZipCode.setBounds(250,230,75,25);

        txtZipCode= new JTextField();
        panel1.add(txtZipCode);
        txtZipCode.setBounds(320,230,80,25);

        Country= new JLabel("Country");
        panel1.add(Country);
        Country.setBounds(15,270,75,25);
        
        String countries[] ={"Item","Nepal","srilanka","india","America","Tokyo", "china","austrila"};
        country = new JComboBox(countries);
        country.setBounds(80,270,100,25);
        panel1.add(country);
        
        btnOk = new JButton("Ok");
        btnOk.setBounds(70, 300, 70, 30);
        panel1.add(btnOk);
        
         Cancel = new JButton("Cancel");
        Cancel.setBounds(170, 300, 150, 40);
        panel1.add(Cancel);
        
        Register= new JButton("Register me later");
        Register.setBounds(330, 300, 190, 20);
        panel1.add(Register);
        


    }
    public static void main(String [] args){
        new GUI6().frame.setVisible(true);
    }
}