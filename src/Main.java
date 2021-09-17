import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JPanel{	
	Container c1;
	JPanel pnInicio;
	JButton btPlay, btExit;
	JLabel lbPerson, lbName, jlPrato;
	ImageIcon imgPlay, imgExit, imgName, imgPerson, imgPrato;
	
//	1. vc sai da mansão e o jogo acaba pq vc desistiu
//	2. vc ganha pq descobre quem é o assassino
//	3. vc perde pq o assassino te mata
	
	public Main(){
		game();
		definirEventos();
			
	}
	
	public void game(){

		setLayout(null);
				
		imgPerson = new ImageIcon("person.jpg");
		lbPerson = new JLabel(imgPerson);
		lbPerson.setBounds(800, 120, 250, 549);
		
		imgName = new ImageIcon("name.jpg");
		lbName = new JLabel(imgName);
		lbName.setBounds(150, 200, 402, 141);
		
		imgPlay = new ImageIcon("play.png");
		btPlay = new JButton(imgPlay);
		btPlay.setBorder(null);
		btPlay.setBounds(150, 500, 250, 85);
		
		imgExit = new ImageIcon("exit.jpg");
		btExit = new JButton(imgExit);
		btExit.setBorder(null);
		btExit.setBounds(1300, 20, 38, 37);
		
		pnInicio = new JPanel();
		pnInicio.setLayout(null);
		pnInicio.setBounds(0, 0, 2000, 2000);
		pnInicio.setBackground(Color.black);
		
		
		add(lbPerson);
		add(lbName);
		add(btPlay);
		add(btExit);
		
		add(pnInicio);
		
		imgPrato = new ImageIcon("pao.jpg");
		jlPrato = new JLabel(imgPrato);
		jlPrato.setBounds(0, 0, 600, 600);
		add(jlPrato);
		jlPrato.setVisible(false);
		
			
	}
	
	
	public void definirEventos(){
		btExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // Fecha
			}
		});
		btPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbPerson.setVisible(false);
				lbName.setVisible(false);
				btPlay.setVisible(false);
				btExit.setVisible(false);
				
				pnInicio.setVisible(false);
				jlPrato.setVisible(true);
				
				
			}
		});
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
	 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	frame.getContentPane().add(new Main());
	 	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	 	frame.setLocationRelativeTo(null); 
	 	frame.setUndecorated(true);
	 	frame.setResizable(false);
	 	frame.setVisible(true);
	 	
	}
	
	

}