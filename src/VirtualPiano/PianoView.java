package VirtualPiano;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.sound.midi.MidiUnavailableException;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import org.jfugue.realtime.RealtimePlayer;
import java.awt.event.KeyAdapter;

public class PianoView {
	private int octave = 4;
	private JFrame frame;
	private String strNote;
	private String[] octavesC =  {"C1", "C2", "C3", "C4", "C5", "C6", "C7"};
	private String[] octavesCC = {"C#1", "C#2", "C#3", "C#4", "C#5", "C#6", "C#7"};
	private String[] octavesD =  {"D1", "D2", "D3", "D4", "D5", "D6", "D7"};
	private String[] octavesDD = {"D#1", "D#2", "D#3", "D#4", "D#5", "D#6", "D#7"};
	private String[] octavesE =  {"E1", "E2", "E3", "E4", "E5", "E6", "E7"};
	private String[] octavesF =  {"F1", "F2", "F3", "F4", "F5", "F6", "F7"};
	private String[] octavesFF=  {"F#1", "F#2", "F#3", "F#4", "F#5", "F#6", "F#7"};
	private String[] octavesG =  {"G1", "G2", "G3", "G4", "G5", "G6", "G7"};
	private String[] octavesGG = {"G#1", "G#2", "G#3", "G#4", "G#5", "G#6", "G#7"};
	private String[] octavesA =  {"A1", "A2", "A3", "A4", "A5", "A6", "A7"};
	private String[] octavesAA = {"A#1", "A#2", "A#3", "A#4", "A#5", "A#6", "A#7"};
	private String[] octavesB =  {"B1", "B2", "B3", "B4", "B5", "B6", "B7"};
	
	//Launch the application. 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PianoView window = new PianoView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Create the application.
	public PianoView() throws MidiUnavailableException {
		initialize();
	}

	//Initialize the contents of the frame.
	private void initialize() throws MidiUnavailableException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(178, 34, 34));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//jfugue player	
	    RealtimePlayer player = new RealtimePlayer();
	    player.changeInstrument(0);
	    
	    
		//Buttons
		//C
		JButton btn1 = new JButton("");
		btn1.setBackground(Color.white);
		btn1.setOpaque(true);
		btn1.setBorderPainted(false);
		btn1.setVerticalAlignment(SwingConstants.BOTTOM);
		btn1.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn1.setBounds(5, 107, 50, 165);
		frame.getContentPane().add(btn1);

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesC[octave - 1];
				 player.play(strNote); 
			}
		});
		
		
		//C#/Db
		JButton btn2 = new JButton("");
	    btn2.setBackground(Color.black);
		btn2.setOpaque(true);
		btn2.setBorderPainted(false);
	    btn2.setFocusPainted(false);
		btn2.setVerticalAlignment(SwingConstants.BOTTOM);
		btn2.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn2.setBounds(36, 6, 50, 96);
		frame.getContentPane().add(btn2);

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesCC[octave - 1];
				 player.play(strNote);
			}
		});
		
		
		//D
		JButton btn3 = new JButton("");
		btn3.setBackground(Color.white);
		btn3.setOpaque(true);
		btn3.setBorderPainted(false);
		btn3.setVerticalAlignment(SwingConstants.BOTTOM);
		btn3.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn3.setBounds(60, 107, 50, 165);
		frame.getContentPane().add(btn3);
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesD[octave - 1];
				 player.play(strNote); 
			}
		});
		
		
		//D#/Eb
		JButton btn4 = new JButton("");
		btn4.setBackground(Color.black);
	    btn4.setOpaque(true);
		btn4.setBorderPainted(false);
		btn4.setFocusPainted(false);
		btn4.setVerticalAlignment(SwingConstants.BOTTOM);
		btn4.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn4.setBounds(98, 6, 50, 96);
		frame.getContentPane().add(btn4);

		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesDD[octave - 1];
				 player.play(strNote); 
			}
		});
		
	
		//E
		JButton btn5 = new JButton("");
		btn5.setBackground(Color.white);
		btn5.setOpaque(true);
		btn5.setBorderPainted(false);
		btn5.setVerticalAlignment(SwingConstants.BOTTOM);
		btn5.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn5.setBounds(115, 107, 50, 165);
		frame.getContentPane().add(btn5);

		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesE[octave - 1];
				 player.play(strNote); 
			}
		});
		
		
		//F
		JButton btn6 = new JButton("");
		btn6.setBackground(Color.white);
		btn6.setOpaque(true);
		btn6.setBorderPainted(false);
		btn6.setVerticalAlignment(SwingConstants.BOTTOM);
		btn6.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn6.setBounds(170, 107, 50, 165);
		frame.getContentPane().add(btn6);
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesF[octave - 1];
				 player.play(strNote); 
			}
		});
		
		
		//F#/Gb
		JButton btn7 = new JButton("");
		btn7.setBackground(Color.black);
		btn7.setOpaque(true);
		btn7.setBorderPainted(false);
	    btn7.setFocusPainted(false);
		btn7.setVerticalAlignment(SwingConstants.BOTTOM);
		btn7.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn7.setBounds(203, 6, 50, 96);
		frame.getContentPane().add(btn7);

		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesFF[octave - 1];
				 player.play(strNote); 
			}
		});
		
		
		//G
		JButton btn8 = new JButton("");
		btn8.setBackground(Color.white);
		btn8.setOpaque(true);
		btn8.setBorderPainted(false);
		btn8.setVerticalAlignment(SwingConstants.BOTTOM);
		btn8.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn8.setBounds(225, 107, 50, 165);
		frame.getContentPane().add(btn8);
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesG[octave - 1];
				 player.play(strNote); 
			}
		});
		
		
		//G#/Ab
		JButton btn9 = new JButton("");
		btn9.setBackground(Color.black);
		btn9.setOpaque(true);
		btn9.setBorderPainted(false);
	    btn9.setFocusPainted(false);
		btn9.setVerticalAlignment(SwingConstants.BOTTOM);
		btn9.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn9.setBounds(258, 6, 50, 96);
		frame.getContentPane().add(btn9);
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesGG[octave - 1];
				 player.play(strNote); 
			}
		});
		
		
		//A
		JButton btn10 = new JButton("");
		btn10.setBackground(Color.white);
		btn10.setOpaque(true);
		btn10.setBorderPainted(false);
		btn10.setVerticalAlignment(SwingConstants.BOTTOM);
		btn10.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn10.setBounds(280, 107, 50, 165);
		frame.getContentPane().add(btn10);
		
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesA[octave - 1];
				 player.play(strNote); 
			}
		});
		
		
		//A#/Bb
		JButton btn11 = new JButton("");
		btn11.setBackground(Color.black);
		btn11.setOpaque(true);
		btn11.setBorderPainted(false);
	    btn11.setFocusPainted(false);
		btn11.setVerticalAlignment(SwingConstants.BOTTOM);
		btn11.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn11.setBounds(312, 6, 50, 96);
		frame.getContentPane().add(btn11);
	
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesAA[octave - 1];
				 player.play(strNote); 
			}
		});
		
		
		//B
		JButton btn12 = new JButton("");
		btn12.setBackground(Color.white);
		btn12.setOpaque(true);
		btn12.setBorderPainted(false);
		btn12.setVerticalAlignment(SwingConstants.BOTTOM);
		btn12.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn12.setBounds(335, 107, 50, 165);
		frame.getContentPane().add(btn12);
		
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesB[octave - 1];
				 player.play(strNote); 
			}
		});
		
		
		//C
		JButton btn13 = new JButton("");
		btn13.setBackground(Color.white);
		btn13.setOpaque(true);
		btn13.setBorderPainted(false);
		btn13.setVerticalAlignment(SwingConstants.BOTTOM);
		btn13.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn13.setBounds(390, 107, 50, 165);
		frame.getContentPane().add(btn13);
		
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesC[octave];
				 player.play(strNote); 
			}
		});
		
		
		//Octave up
		JButton btnOctUp = new JButton("+");
		btnOctUp.setBounds(410, 40, 30, 30);
		frame.getContentPane().add(btnOctUp);
		
		btnOctUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(octave < 6)
					octave++;
			}
		});
		
		
		//Octave down
		JButton btnOctDown = new JButton("-");
		btnOctDown.setBounds(374, 40, 30, 30);
		frame.getContentPane().add(btnOctDown);
		
		btnOctDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(octave > 2)
					octave--;
			}
		});
	}
}

//add functionality for using keyboard to play piano and +-key bindings)
