import javax.swing.*;
import java.awt.*;


public class Window extends JFrame
	{
	public Window(String Title,int x,int y)
		{
		super(Title);
		this.setSize(x,y);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPanel = this.getContentPane() ;	

		JMenuBar m= new JMenuBar();
		JMenu menu1= new JMenu("File");
		JMenuItem open = new JMenuItem("Open") ;
		menu1.add(open);
		m.add(menu1);

//initialisation of the buttons
		JButton blackButton=new JButton ("Noir");
		blackButton.setBackground(Color.BLACK);
		blackButton.setForeground(Color.white);
        //darkButton.addActionListener(this);
        JButton redButton=new JButton ("Rouge");
        redButton.setBackground(Color.red);
        //redButton.addActionListener(this);
        JButton greenButton=new JButton ("Vert");
        greenButton.setBackground(Color.green);
        //greenButton.addActionListener(this);
        JButton blueButton=new JButton ("Bleu");
        blueButton.setBackground(Color.blue);
        blueButton.setForeground(Color.white);
        //blueButton.addActionListener(this);
        JButton yellowButton=new JButton ("Jaune");
        yellowButton.setBackground(Color.yellow);
        //yellowButton.addActionListener(this);
        JButton pinkButton=new JButton ("Rose");
        pinkButton.setBackground(Color.pink);
        //pinkButton.addActionListener(this);
        JButton magentaButton=new JButton ("Magenta");
        magentaButton.setBackground(Color.magenta);
        //magentaButton.addActionListener(this);
        JButton orangeButton=new JButton ("Orange");
        orangeButton.setBackground(Color.orange);
        //orangeButton.addActionListener(this);
        JButton ellipseButton=new JButton ("Ellipse");
        //ellipseButton.addActionListener(this);
        JButton circleButton=new JButton ("Cercle");
        //circleButton.addActionListener(this);
        JButton rectangleButton=new JButton ("Rectangle");
       // rectangleButton.addActionListener(this);
        JButton squareButton=new JButton ("Carre");
      //  squareButton.addActionListener(this);
      
		JPanel buttonPanel=new JPanel();
        buttonPanel.setLayout(new GridLayout(2,8));
        
        buttonPanel.add(blackButton);
        buttonPanel.add(magentaButton);
        buttonPanel.add(orangeButton);
        buttonPanel.add(redButton);
        buttonPanel.add(rectangleButton);
        buttonPanel.add(ellipseButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(pinkButton);
        buttonPanel.add(circleButton);
        buttonPanel.add(squareButton);
        
		contentPanel.add(buttonPanel, BorderLayout.SOUTH);
		
		//Initialisation menus

		JMenu file= new JMenu("File");
			JMenuItem newMenuItem= new JMenuItem("Nouveau");
			JMenuItem openMenuItem= new JMenuItem("Ouvrir");
			JMenuItem saveMenuItem= new JMenuItem("Sauvegarder");
			JMenuItem quitMenuItem= new JMenuItem("Quitter");
				file.add(newMenuItem);
                file.add(openMenuItem);
                file.add(saveMenuItem);
                file.add(quitMenuItem);
		
        JMenu extra= new JMenu("A propos");
			JMenuItem FAQMenuItem= new JMenuItem("FAQ");
				extra.add(FAQMenuItem);
            
		JMenuBar menuBar=new JMenuBar();              
				menuBar.add(file);
				menuBar.add(extra);
				
		contentPanel.add(menuBar, BorderLayout.NORTH);
		
		this.setVisible(true);
		
 }

 public static void main (String args[]){
 Window win = new Window("Paint it black",800,600);
 }

}
