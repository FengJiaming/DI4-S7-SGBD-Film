package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CreateSceneView {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Create the application.
	 */
	public CreateSceneView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Créer une scène");
		frame.setBounds(100, 100, 594, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 240));
		panel.setBounds(6, 6, 582, 88);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Veuillez écrire la description de la nouvelle scène :");
		lblNewLabel.setBounds(26, 6, 340, 16);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 140, 0));
		
		textField = new JTextField();
		textField.setBounds(18, 34, 538, 41);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 235, 205));
		panel_1.setBounds(6, 95, 582, 83);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Veuillez choisir le code de théâtre pour << scènes à l'intérieur >> : ");
		lblNewLabel_1.setForeground(new Color(210, 105, 30));
		lblNewLabel_1.setBounds(28, 6, 444, 16);
		panel_1.add(lblNewLabel_1);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setForeground(new Color(210, 105, 30));
		radioButton.setBounds(28, 32, 87, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.setForeground(new Color(210, 105, 30));
		radioButton_1.setBounds(228, 32, 87, 23);
		panel_1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setForeground(new Color(210, 105, 30));
		radioButton_2.setBounds(394, 32, 141, 23);
		panel_1.add(radioButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(220, 20, 60));
		panel_2.setBackground(new Color(245, 222, 179));
		panel_2.setBounds(6, 178, 582, 224);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblVeuillezChoisirLe = new JLabel("Veuillez choisir le code du lieu pour << scènes en plein air >>  :");
		lblVeuillezChoisirLe.setForeground(new Color(160, 82, 45));
		lblVeuillezChoisirLe.setBounds(25, 6, 431, 16);
		panel_2.add(lblVeuillezChoisirLe);
		
		JRadioButton radioButton_3 = new JRadioButton("1");
		radioButton_3.setForeground(new Color(160, 82, 45));
		radioButton_3.setBounds(36, 34, 77, 23);
		panel_2.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("2");
		radioButton_4.setForeground(new Color(160, 82, 45));
		radioButton_4.setBounds(157, 34, 88, 23);
		panel_2.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("3");
		radioButton_5.setForeground(new Color(160, 82, 45));
		radioButton_5.setBounds(284, 34, 77, 23);
		panel_2.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("4");
		radioButton_6.setForeground(new Color(160, 82, 45));
		radioButton_6.setBounds(400, 34, 88, 23);
		panel_2.add(radioButton_6);
		DefaultTableModel model = new DefaultTableModel();
		JTable table = new JTable(model);
		Vector name = new Vector();
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(21, 76, 530, 128);
		panel_2.add(scrollPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(210, 180, 140));
		panel_3.setBounds(6, 403, 582, 52);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Ajouter des setups");
		btnNewButton.setBounds(20, 6, 162, 40);
		panel_3.add(btnNewButton);
		btnNewButton.setForeground(new Color(139, 0, 0));
		
		JButton btnJaiFini = new JButton("J'ai fini!");
		btnJaiFini.setBounds(212, 6, 162, 40);
		panel_3.add(btnJaiFini);
		btnJaiFini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		btnJaiFini.setForeground(new Color(220, 20, 60));
		
		JButton btnRetournerMenu = new JButton("Retourner à Menu");
		btnRetournerMenu.setForeground(new Color(0, 0, 0));
		btnRetournerMenu.setBounds(403, 6, 162, 40);
		panel_3.add(btnRetournerMenu);
		
		
		
		frame.setVisible(true);
	}
}
