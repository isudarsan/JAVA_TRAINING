package com.phrama.main;

import javax.swing.JFrame;

import com.phrama.main.view.PharmaView;

public class AppMain {

	public static void main(String[] args) {

		
		PharmaView pharmaView = new PharmaView();
		pharmaView.setVisible(true);
		pharmaView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
