package client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import factory.AbstractFactory;
import graphics.Listener;
import graphics.Panel;

public class SimCity implements ActionListener
{
	
	private JFrame frame;
	private JButton house;
	private JButton palace;
	private JButton tree;
	Panel p;
	
	private String title;
	private int width, height;
	
	public SimCity(String title, int width, int height,AbstractFactory f){
		this.title = title;
		this.width = width;
		this.height = height;
		p=new Panel(f);
		
		createDisplay();
	}
	
	private void createDisplay(){
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		tree=new JButton("tree");
		house=new JButton("house");
		palace=new JButton("palace");
		tree.addActionListener(this);
		house.addActionListener(this);
		palace.addActionListener(this);
		
		p.add(tree);
		p.add(house);
		p.add(palace);
		frame.getContentPane().add(p);
		
		frame.setContentPane(p);
		frame.pack();
		
		while(true)
		lissen();
	}
	
	public void lissen()
	{
		
	}

public Panel getPanel(){
		return p;
	}
	
	public JFrame getFrame(){
		return frame;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand()=="tree")
			p.setTipo(0);
	}
	
	
}
