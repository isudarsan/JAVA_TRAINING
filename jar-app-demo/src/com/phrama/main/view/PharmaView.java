package com.phrama.main.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.phrama.main.model.Pharma;
import com.phrama.main.service.PharmaService;
import com.phrama.main.service.PharmaServiceImpl;

public class PharmaView extends JFrame implements ActionListener {

	private JLabel title;
	private JLabel lblName;
	private JLabel lblPrice;
	private JLabel lblDate;

	private JTextField txtName;
	private JTextField txtPrice;
	private JTextField txtDate;

	private JTextArea list;

	private JButton submit;
	private JButton clear;
	private JButton report;

	public PharmaView() {

		setLayout(null);
		setSize(700, 700);
		title = new JLabel("Metro Pharma");
		title.setBounds(50, 20, 400, 60);
		title.setFont(new Font("Arial", Font.ITALIC, 40));
		title.setForeground(Color.RED);

		lblName = new JLabel("Enter Medicine Name : ");
		lblName.setBounds(50, 100, 150, 60);

		txtName = new JTextField();
		txtName.setBounds(200, 100, 100, 50);

		lblPrice = new JLabel("Enter Price");
		lblPrice.setBounds(50, 150, 150, 60);

		txtPrice = new JTextField();
		txtPrice.setBounds(200, 150, 100, 50);

		lblDate = new JLabel("Expiry Date");
		lblDate.setBounds(50, 200, 150, 50);

		txtDate = new JTextField();
		txtDate.setBounds(200, 200, 100, 50);

		submit = new JButton("Submit");
		submit.setBounds(400, 100, 80, 80);
		submit.addActionListener(this);

		clear = new JButton("Clear");
		clear.setBounds(500, 100, 80, 80);
		clear.addActionListener(this);

		report = new JButton("Report");
		report.setBounds(600, 100, 80, 80);
		report.addActionListener(this);

		list = new JTextArea();
		list.setBounds(200, 300, 550, 300);
		list.append("Medcine\tPrice\tExpiry Date\n");

		add(title);
		add(lblName);
		add(txtName);
		add(lblPrice);
		add(txtPrice);
		add(lblDate);
		add(txtDate);
		add(submit);
		add(clear);
		add(list);
		add(report);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		PharmaService pharmaService = new PharmaServiceImpl();

		if ("Clear".equalsIgnoreCase(command)) {
			// JOptionPane.showMessageDialog(this, "hello, clear");

			txtName.setText("");
			txtPrice.setText("");
			txtDate.setText("");

		}

		if ("Submit".equalsIgnoreCase(command)) {

			String name = txtName.getText();
			int price = Integer.parseInt(txtPrice.getText());
			String expiryDate = txtDate.getText();
			Date expDate = null;

			try {
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				expDate = dateFormat.parse(expiryDate);
			} catch (ParseException ex) {
				ex.printStackTrace();
			}

			Pharma pharma = new Pharma(name, price, expDate);

			list.append(pharma.getMedicineName() + "\t" + pharma.getPrice() + "\t" + pharma.getExpiryDate() + "\n");

			pharmaService.create(pharma);

		}

		if ("Report".equalsIgnoreCase(command)) {

			List<Pharma> pharmaList = pharmaService.getAll();

			StringBuilder builder = new StringBuilder();

			for (Pharma pharma : pharmaList) {
				builder.append(pharma.getMedicineName()).append("\t").append(pharma.getPrice()).append("\t")
						.append(pharma.getExpiryDate()).append("\n");
			}

			JOptionPane.showMessageDialog(this, builder.toString());

		}

	}

}
