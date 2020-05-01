package com.d3ti.pbolanjt.awt;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class HasilAWT extends Frame implements WindowListener{
	String nim;
	String nama;
	String jk;
	String alamat;
	String tmp_lahir;
	String tgl_lahir;
	
	public HasilAWT(String nim, String nama, String jk, String alamat, String tmp_lahir, String tgl_lahir) {
		Panel z = new Panel();
		add(z);
		z.setLayout(new GridLayout(7, 2));
		
		this.nim = nim;
		this.nama = nama;
		this.jk = jk;
		this.alamat = alamat;
		this.tmp_lahir = tmp_lahir;
		this.tgl_lahir = tgl_lahir;
		
		z.add( new Label("nim :"));
		z.add( new Label(this.nim));
		
		z.add( new Label("nama :"));
		z.add( new Label(this.nama));
		
		z.add( new Label("jk :"));
		z.add( new Label(this.jk));
		
		z.add( new Label("alamat :"));
		z.add( new Label(this.alamat));
		
		z.add( new Label("tmp_lahir :"));
		z.add( new Label(this.tmp_lahir));
		
		z.add( new Label("tgl_lahir :"));
		z.add( new Label(this.tgl_lahir));
		
		setSize(250,300);
		setVisible(true);
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
