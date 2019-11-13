package Assignment;

/**
 *
 * @author KIRAN PARMAR
 */
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

 class FirstPage 
	extends JFrame 
	implements ActionListener { 

	// Components of the Form 
	private Container c; 
	private JLabel title; 
	private JLabel name; 
	private JTextField tname; 
	private JLabel mno; 
	private JTextField tmno; 
	private JLabel gender; 
	private JRadioButton male; 
	private JRadioButton female; 
	private ButtonGroup gengp; 
	private JLabel dob; 
	private JComboBox date; 
	private JComboBox month; 
	private JComboBox year; 
	private JLabel add; 
	private JTextArea tadd; 
	private JCheckBox term; 
	private JButton sub; 
	private JButton reset; 
	private JTextArea tout; 
	private JLabel res; 
	private JTextArea resadd; 


	// constructor, to initialize the components 
	// with default values. 
	public FirstPage() 
	{ 
		setTitle("Login"); 
		setBounds(300, 90, 900, 600); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setResizable(true); 

		c = getContentPane(); 
		c.setLayout(null); 

		title = new JLabel("Dayananda Sagar College of Engineering"); 
		title.setFont(new Font("Arial", Font.PLAIN, 30)); 
		title.setSize(1000, 35); 
		title.setLocation(30, 30); 
		c.add(title); 

		
		
                
                name = new JLabel("AN AUTONOMOUS INSTITUTE AFFILIATED TO VTU, APPROVED BY\n AICTE & UGC, ACCREDITED BY NAAC WITH 'A' GRADE.\n" +
"AUTOMOBILE ENGINEERING,\n BIOTECHNOLOGY, COMPUTER SCIENCE & ENGINEERING, ELECTRICAL & ELECTRONICS ENGINEERING, ELECTRONICS & INSTRUMENTATION ENGINEERING, ELECTRONICS & TELECOMMUNICATION ENGINEERING, INDUSTRIAL ENGINEERING & MANAGEMENT, MEDICAL ELECTRONICS, MECHANICAL ENGINEERING, AERONAUTICAL ENGINEERING, CHEMICAL ENGINEERING, CIVIL ENGINEERING, ELECTRONICS & COMMUNICATION ENGINEERING AND INFORMATION SCIENCE & ENGINEERING ACCREDITED BY NBA"); 
		name.setFont(new Font("Arial", Font.PLAIN, 11)); 
		name.setSize(1000, 20); 
		name.setLocation(50, 200); 
		c.add(name); 
                
                
		name = new JLabel("Computer Science Engneering"); 
		name.setFont(new Font("Arial", Font.PLAIN, 25)); 
		name.setSize(1000, 40); 
		name.setLocation(100, 100); 
		c.add(name); 
		
		
		
		
		sub = new JButton("register"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(800, 30); 
        sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				dispose();
				new RegistrationForm();
			}
		});
        
        c.add(sub); 
        JButton reg = new JButton("login"); 
        reg.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reg.setSize(100, 20); 
        reg.setLocation(700,30); 
        reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				dispose();
				new Login();
			}
		});
        
        c.add(reg); 
		setVisible(true); 
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	} 

	// method actionPerformed() 
	// to get the action performed 
	// by the user and act accordingly 
	
} 

class plain { 

	public static void main(String[] args) throws Exception 
	{ 
		FirstPage f2 = new FirstPage(); 
	} 
} 

