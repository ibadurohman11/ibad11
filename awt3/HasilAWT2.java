package com.d3ti.pbolanjt.awt3;


import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HasilAWT2 extends Frame implements WindowListener{
	String nim;
	String nama;
	String jk;
	String alamat;
	String tmp_lahir;
	String tgl_lahir;
	
	JFrame frame = new JFrame("Tampilan Box Layout");
	JPanel panel = new JPanel();
	

	
	public HasilAWT2(String nim, String nama, String jk, String alamat, String tmp_lahir, String tgl_lahir) {
		
		
		this.nim = nim;
		this.nama = nama;
		this.jk = jk;
		this.alamat = alamat;
		this.tmp_lahir = tmp_lahir;
		this.tgl_lahir = tgl_lahir;
				
		JButton buttonFirst = new JButton (this.nim);
		JButton buttonSecond = new JButton (this.nama);
		JButton buttonThird = new JButton (this.jk);
		JButton buttonFourth = new JButton (this.alamat);
		JButton buttonFifth = new JButton (this.tmp_lahir);
		JButton buttonSixth = new JButton (this.tgl_lahir);
		
		panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
		panel.add(buttonFirst);
		panel.add(buttonSecond);
		panel.add(buttonThird);
		panel.add(buttonFourth);
		panel.add(buttonFifth);
		panel.add(buttonSixth);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

