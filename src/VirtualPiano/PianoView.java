package VirtualPiano;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Soundbank;
import javax.sound.midi.Synthesizer;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import org.jfugue.player.Player;

public class PianoView {
	private int octave = 4;
	private JFrame frame;
	private String strNote;
	private String[] octavesC =  {"C1q", "C2q", "C3q", "C4q", "C5q", "C6q", "C7q"};
	private String[] octavesCC = {"C#1q", "C#2q", "C#3q", "C#4q", "C#5q", "C#6q", "C#7q"};
	private String[] octavesD =  {"D1q", "D2q", "D3q", "D4q", "D5q", "D6q", "D7q"};
	private String[] octavesDD = {"D#1q", "D#2q", "D#3q", "D#4q", "D#5q", "D#6q", "D#7q"};
	private String[] octavesE =  {"E1q", "E2q", "E3q", "E4q", "E5q", "E6q", "E7q"};
	private String[] octavesF =  {"F1q", "F2q", "F3q", "F4q", "F5q", "F6q", "F7q"};
	private String[] octavesFF=  {"F#1q", "F#2q", "F#3q", "F#4q", "F#5q", "F#6q", "F#7q"};
	private String[] octavesG =  {"G1q", "G2q", "G3q", "G4q", "G5q", "G6q", "G7q"};
	private String[] octavesGG = {"G#1q", "G#2q", "G#3q", "G#4q", "G#5q", "G#6q", "G#7q"};
	private String[] octavesA =  {"A1q", "A2q", "A3q", "A4q", "A5q", "A6q", "A7q"};
	private String[] octavesAA = {"A#1q", "A#2q", "A#3q", "A#4q", "A#5q", "A#6q", "A#7q"};
	private String[] octavesB =  {"B1q", "B2q", "B3q", "B4q", "B5q", "B6q", "B7q"};
	
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
	public PianoView() {
		initialize();
	}

	//Initialize the contents of the frame.
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(178, 34, 34));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//jfugue player	
	    Player player = new Player();

		
		//C
		JButton btn1 = new JButton("");
		btn1.setBackground(Color.white);
		btn1.setOpaque(true);
		btn1.setBorderPainted(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesC[octave - 1];
				 player.play(strNote); 
			}
		});
		btn1.setVerticalAlignment(SwingConstants.BOTTOM);
		btn1.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn1.setBounds(5, 107, 50, 165);
		frame.getContentPane().add(btn1);
		
		
		//C#/Db
		JButton btn2 = new JButton("");
	    btn2.setBackground(Color.black);
		btn2.setOpaque(true);
		btn2.setBorderPainted(false);
	    btn2.setFocusPainted(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesCC[octave - 1];
				 player.play(strNote);
			}
		});
		btn2.setVerticalAlignment(SwingConstants.BOTTOM);
		btn2.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn2.setBounds(36, 6, 50, 96);
		frame.getContentPane().add(btn2);
		
		
		//D
		JButton btn3 = new JButton("");
		btn3.setBackground(Color.white);
		btn3.setOpaque(true);
		btn3.setBorderPainted(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesD[octave - 1];
				 player.play(strNote); 
			}
		});
		btn3.setVerticalAlignment(SwingConstants.BOTTOM);
		btn3.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn3.setBounds(60, 107, 50, 165);
		frame.getContentPane().add(btn3);
		
		
		//D#/Eb
		JButton btn4 = new JButton("");
		  btn4.setBackground(Color.black);
		    btn4.setOpaque(true);
		    btn4.setBorderPainted(false);
		    btn4.setFocusPainted(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesDD[octave - 1];
				 player.play(strNote); 
			}
		});
		btn4.setVerticalAlignment(SwingConstants.BOTTOM);
		btn4.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn4.setBounds(98, 6, 50, 96);
		frame.getContentPane().add(btn4);
		
	
		//E
		JButton btn5 = new JButton("");
		btn5.setBackground(Color.white);
		btn5.setOpaque(true);
		btn5.setBorderPainted(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesE[octave - 1];
				 player.play(strNote); 
			}
		});
		btn5.setVerticalAlignment(SwingConstants.BOTTOM);
		btn5.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn5.setBounds(115, 107, 50, 165);
		frame.getContentPane().add(btn5);
		
		
		//F
		JButton btn6 = new JButton("");
		btn6.setBackground(Color.white);
		btn6.setOpaque(true);
		btn6.setBorderPainted(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesF[octave - 1];
				 player.play(strNote); 
			}
		});
		btn6.setVerticalAlignment(SwingConstants.BOTTOM);
		btn6.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn6.setBounds(170, 107, 50, 165);
		frame.getContentPane().add(btn6);
		
		
		//F#/Gb
		JButton btn7 = new JButton("");
		btn7.setBackground(Color.black);
		btn7.setOpaque(true);
		btn7.setBorderPainted(false);
	    btn7.setFocusPainted(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesFF[octave - 1];
				 player.play(strNote); 
			}
		});
		btn7.setVerticalAlignment(SwingConstants.BOTTOM);
		btn7.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn7.setBounds(203, 6, 50, 96);
		frame.getContentPane().add(btn7);
		
		
		//G
		JButton btn8 = new JButton("");
		btn8.setBackground(Color.white);
		btn8.setOpaque(true);
		btn8.setBorderPainted(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesG[octave - 1];
				 player.play(strNote); 
			}
		});
		btn8.setVerticalAlignment(SwingConstants.BOTTOM);
		btn8.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn8.setBounds(225, 107, 50, 165);
		frame.getContentPane().add(btn8);
		
		
		//G#/Ab
		JButton btn9 = new JButton("");
		btn9.setBackground(Color.black);
		btn9.setOpaque(true);
		btn9.setBorderPainted(false);
	    btn9.setFocusPainted(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesGG[octave - 1];
				 player.play(strNote); 
			}
		});
		btn9.setVerticalAlignment(SwingConstants.BOTTOM);
		btn9.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn9.setBounds(258, 6, 50, 96);
		frame.getContentPane().add(btn9);
		
		
		//A
		JButton btn10 = new JButton("");
		btn10.setBackground(Color.white);
		btn10.setOpaque(true);
		btn10.setBorderPainted(false);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesA[octave - 1];
				 player.play(strNote); 
			}
		});
		btn10.setVerticalAlignment(SwingConstants.BOTTOM);
		btn10.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn10.setBounds(280, 107, 50, 165);
		frame.getContentPane().add(btn10);
		
		
		//A#/Bb
		JButton btn11 = new JButton("");
		btn11.setBackground(Color.black);
		btn11.setOpaque(true);
		btn11.setBorderPainted(false);
	    btn11.setFocusPainted(false);
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesAA[octave - 1];
				 player.play(strNote); 
			}
		});
		btn11.setVerticalAlignment(SwingConstants.BOTTOM);
		btn11.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn11.setBounds(312, 6, 50, 96);
		frame.getContentPane().add(btn11);
		
		
		//B
		JButton btn12 = new JButton("");
		btn12.setBackground(Color.white);
		btn12.setOpaque(true);
		btn12.setBorderPainted(false);
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesB[octave - 1];
				 player.play(strNote); 
			}
		});
		btn12.setVerticalAlignment(SwingConstants.BOTTOM);
		btn12.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn12.setBounds(335, 107, 50, 165);
		frame.getContentPane().add(btn12);
		
		
		//C
		JButton btn13 = new JButton("");
		btn13.setBackground(Color.white);
		btn13.setOpaque(true);
		btn13.setBorderPainted(false);
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strNote = octavesC[octave];
				 player.play(strNote); 
			}
		});
		btn13.setVerticalAlignment(SwingConstants.BOTTOM);
		btn13.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn13.setBounds(390, 107, 50, 165);
		frame.getContentPane().add(btn13);
		
		
		//Octave up
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(octave < 6)
					octave++;
			}
		});
		btnNewButton.setBounds(410, 40, 30, 30);
		frame.getContentPane().add(btnNewButton);
		
		
		//Octave down
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(octave > 2)
					octave--;
			}
		});
		button.setBounds(374, 40, 30, 30);
		frame.getContentPane().add(button);
		
	}
}

//add functionality for using keyboard to play piano and +-
//fix glitchy audio