import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame implements ActionListener 
	{
    private final Drawing drawPanel = new Drawing();
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
            blackButton.addActionListener(this);
        JButton redButton=new JButton ("Rouge");
            redButton.setBackground(Color.red);
            redButton.addActionListener(this);
        JButton greenButton=new JButton ("Vert");
            greenButton.setBackground(Color.green);
            greenButton.addActionListener(this);
        JButton blueButton=new JButton ("Bleu");
            blueButton.setBackground(Color.blue);
            blueButton.setForeground(Color.white);
            blueButton.addActionListener(this);
        JButton yellowButton=new JButton ("Jaune");
            yellowButton.setBackground(Color.yellow);
            yellowButton.addActionListener(this);
        JButton pinkButton=new JButton ("Rose");
            pinkButton.setBackground(Color.pink);
            pinkButton.addActionListener(this);
        JButton magentaButton=new JButton ("Magenta");
            magentaButton.setBackground(Color.magenta);
            magentaButton.addActionListener(this);
        JButton orangeButton=new JButton ("Orange");
            orangeButton.setBackground(Color.orange);
            orangeButton.addActionListener(this);
        JButton ellipseButton=new JButton ("Ellipse");
            ellipseButton.addActionListener(this);
        JButton circleButton=new JButton ("Cercle");
            circleButton.addActionListener(this);
        JButton rectangleButton=new JButton ("Rectangle");
            rectangleButton.addActionListener(this);
        JButton squareButton=new JButton ("Carre");
            squareButton.addActionListener(this);
      
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
                newMenuItem.addActionListener(this);
			JMenuItem openMenuItem= new JMenuItem("Ouvrir");
                openMenuItem.addActionListener(this);
			JMenuItem saveMenuItem= new JMenuItem("Sauvegarder");
                saveMenuItem.addActionListener(this);
			JMenuItem quitMenuItem= new JMenuItem("Quitter");
                quitMenuItem.addActionListener(this);
				file.add(newMenuItem);
                file.add(openMenuItem);
                file.add(saveMenuItem);
                file.add(quitMenuItem);
		
        JMenu extra= new JMenu("A propos");
			JMenuItem FAQMenuItem= new JMenuItem("FAQ");
                FAQMenuItem.addActionListener(this);
				extra.add(FAQMenuItem);
            JMenuItem CreatorItem= new JMenuItem("Createur");
                CreatorItem.addActionListener(this);
				extra.add(CreatorItem);
            
		JMenuBar menuBar=new JMenuBar();              
				menuBar.add(file);
				menuBar.add(extra);
				
		contentPanel.add(menuBar, BorderLayout.NORTH);
		
		this.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        
        switch (cmd) {
            case "Noir":
                System.out.println("vous avez sélectionné Noir");
                drawPanel.SetColor(Color.BLACK);
                break;
            case "Rouge":
                System.out.println("vous avez sélectionné Rouge");
                drawPanel.SetColor(Color.red);
                break;
            case "Bleu":
                System.out.println("vous avez sélectionné Bleu");
                drawPanel.SetColor(Color.blue);
                break;
            case "Vert":
                System.out.println("vous avez sélectionné Vert");
                drawPanel.SetColor(Color.green);
                break;
            case "Jaune":
                System.out.println("yellow has been selected");
                drawPanel.SetColor(Color.yellow);
                break;
            case "Rose":
                System.out.println("vous avez sélectionné Jaune");
                drawPanel.SetColor(Color.pink);
                break;
            case "Magenta":
                System.out.println("vous avez sélectionné Magenta");
                drawPanel.SetColor(Color.magenta);
                break;
            case "Orange":
                System.out.println("vous avez sélectionné Orange");
                drawPanel.SetColor(Color.orange);
                break;
            case "Ellipse":
                System.out.println("vous avez sélectionné Ellipse");
                drawPanel.setFigureName("Ellipse");
                break;
            case "Cercle":
                System.out.println("vous avez sélectionné Cercle");
                drawPanel.setFigureName("Cercle");
                break;
            case "Rectangle":
                System.out.println("Rectangle has been selected");
                drawPanel.setFigureName("Rectangle");
                break;
            case "Carre":
                System.out.println("Square has been selected");
                drawPanel.setFigureName("Carre");
                break;
            case "Nouveau":
                System.out.println("vous avez sélectionné Nouveau");
                break;
            case "Ouvrir":
                System.out.println("vous avez sélectionné Ouvrir");
                break;
            case "Sauvegarder":
                System.out.println("vous avez sélectionné Sauvegarder");
                //drawPanel.save();
                break;
            case "Quitter":
                System.out.println("vous avez sélectionné Quitter");
                System.exit(0);
                break;
            case "FAQ":
                System.out.println("vous avez sélectionné FAQ");
                break;
            case "Createur":
                System.out.println("vous avez sélectionné createur");
                JDialog creditDialogBox = new JDialog(this, "Createur");
                JLabel creditLabel1 = new JLabel("      Créateur : Vincent Rodriguez");
                creditDialogBox.add(creditLabel1);
                creditDialogBox.setSize(250, 150);
                creditDialogBox.setVisible(true);
                break;
        }
            
        }
        public static void main (String args[]){
            Window win= new Window("Paint",800,600);
       
        
    }

 }
 
