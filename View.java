import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.io.File;
import java.io.Serializable;

import javax.swing.*;

public class View extends JFrame{
	private JPanel panel;
	private JFileChooser fchooser;
	public JTextArea ta;
	public JTextField tf;
	private User user;
	private MyKeyListener mkl;
	private JScrollPane jsp;
	
	public View(User user){
		this.user=user;
		this.mkl=new MyKeyListener(user);
		panel=new JPanel(new FlowLayout());
		ta=new JTextArea(20,50);
		ta.setBackground(Color.black);
		ta.setForeground(Color.white);
		ta.setText("Start Game");
		ta.setEnabled(false);
		ta.setLineWrap(true);
		jsp=new JScrollPane(ta);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		tf=new JTextField(50);
		tf.setBackground(Color.black);
		tf.setForeground(Color.white);
		add(panel);
		panel.add(jsp);
		panel.add(tf);
		tf.addKeyListener(mkl);
		tf.setFocusTraversalKeysEnabled(false);
		tf.setFocusable(true);
        tf.requestFocusInWindow();
		fchooser=new JFileChooser();
		
		//panel.setBackground(Color.BLACK);
		setMinimumSize(new Dimension(600,400));
		//setResizable(false);
		setTitle("Texitscha");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public File showSaveFileChooser(){
		int result = fchooser.showSaveDialog(this);
		if(result == JFileChooser.APPROVE_OPTION){
			return fchooser.getSelectedFile();
		}else{
			return null;
		}
	}
	
	public File showLoadFileChooser(){
		int result = fchooser.showOpenDialog(this);
		if(result == JFileChooser.APPROVE_OPTION){
			return fchooser.getSelectedFile();
		}else{
			return null;
		}
		
	}
	public void addText(String text){
		ta.setText(ta.getText()+"\n"+text);
	}
}
