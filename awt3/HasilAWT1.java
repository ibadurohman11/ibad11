package com.d3ti.pbolanjt.awt3;


import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HasilAWT1 extends Frame implements WindowListener{
	String nim;
	String nama;
	String jk;
	String alamat;
	String tmp_lahir;
	String tgl_lahir;
	
	JFrame frame = new JFrame("Tampilan Border Layout");
	

	
	public HasilAWT1(String nim, String nama, String jk, String alamat, String tmp_lahir, String tgl_lahir) {
		
		
		this.nim = nim;
		this.nama = nama;
		this.jk = jk;
		this.alamat = alamat;
		this.tmp_lahir = tmp_lahir;
		this.tgl_lahir = tgl_lahir;
				
		JButton btn0	=	new JButton(this.nim);
		JButton btn1	=	new JButton(this.nama);
		JButton btn2	=	new JButton(this.jk);
		JButton btn3	=	new JButton(this.tmp_lahir+" "+this.tgl_lahir);
		JButton btn4	=	new JButton(this.alamat);
		
		
		frame.setLayout(new BorderLayout());
		frame.add(btn0,BorderLayout.WEST);
		frame.add(btn1,BorderLayout.NORTH);
		frame.add(btn2,BorderLayout.EAST);
		frame.add(btn3,BorderLayout.CENTER);
		frame.add(btn4,BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);

	
		addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(1);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}

