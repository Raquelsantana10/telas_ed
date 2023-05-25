package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class telas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField cad_id;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telas frame = new telas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public telas() {
		setTitle("Sistema TCC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 35, 476, 393);
		contentPane.add(tabbedPane);
		
		JPanel Alunos = new JPanel();
		tabbedPane.addTab("Aluno", null, Alunos, "Cadastro de alunos");
		Alunos.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do aluno");
		lblNewLabel.setBounds(10, 41, 97, 14);
		Alunos.add(lblNewLabel);
		
		JLabel lblRa = new JLabel("RA");
		lblRa.setBounds(10, 81, 80, 14);
		Alunos.add(lblRa);
		
		textField = new JTextField();
		textField.setBounds(111, 38, 283, 20);
		Alunos.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(111, 78, 283, 20);
		Alunos.add(textField_1);
		
		JButton btnNewButton = new JButton("Gravar");
		btnNewButton.setBackground(new Color(216, 250, 220));
		btnNewButton.setBounds(130, 162, 89, 23);
		Alunos.add(btnNewButton);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBackground(new Color(253, 216, 200));
		btnExcluir.setBounds(240, 162, 89, 23);
		Alunos.add(btnExcluir);
		
		JPanel grupos = new JPanel();
		tabbedPane.addTab("Grupo", null, grupos, "Cadastro de grupos");
		grupos.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID grupo");
		lblNewLabel_1.setBounds(21, 42, 81, 14);
		grupos.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Área do trabalho");
		lblNewLabel_2.setBounds(21, 77, 112, 14);
		grupos.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tema");
		lblNewLabel_3.setBounds(21, 118, 46, 14);
		grupos.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Orientador");
		lblNewLabel_4.setBounds(21, 157, 81, 14);
		grupos.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Integrantes do grupo:");
		lblNewLabel_5.setBounds(21, 182, 146, 14);
		grupos.add(lblNewLabel_5);
		
		cad_id = new JTextField();
		cad_id.setBounds(131, 39, 317, 20);
		grupos.add(cad_id);
		cad_id.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(131, 74, 317, 20);
		grupos.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(131, 115, 317, 20);
		grupos.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(131, 154, 317, 20);
		grupos.add(textField_6);
		
		JButton btnNewButton_1 = new JButton("Gravar");
		btnNewButton_1.setBackground(new Color(216, 250, 220));
		btnNewButton_1.setBounds(136, 320, 89, 23);
		grupos.add(btnNewButton_1);
		
		JButton btnExcluir_1 = new JButton("Excluir");
		btnExcluir_1.setBackground(new Color(253, 216, 200));
		btnExcluir_1.setBounds(246, 320, 89, 23);
		grupos.add(btnExcluir_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(128, 205, 320, 104);
		grupos.add(textArea);
		
		JPanel consultagp = new JPanel();
		tabbedPane.addTab("Consulta grupo", null, consultagp, "Consultar grupo por código");
		consultagp.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Consultar grupo por código");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_6.setBounds(10, 42, 223, 19);
		consultagp.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID Grupo");
		lblNewLabel_1_1.setBounds(10, 86, 85, 14);
		consultagp.add(lblNewLabel_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(87, 83, 357, 20);
		consultagp.add(textField_7);
		
		JButton btnNewButton_2 = new JButton("Consultar");
		btnNewButton_2.setBackground(new Color(227, 252, 209));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(209, 115, 89, 23);
		consultagp.add(btnNewButton_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Informações do grupo:");
		lblNewLabel_2_1.setBounds(10, 147, 125, 14);
		consultagp.add(lblNewLabel_2_1);
		
		JList list = new JList();
		list.setBackground(Color.WHITE);
		list.setBounds(10, 172, 434, 144);
		consultagp.add(list);
		
		JPanel sub = new JPanel();
		tabbedPane.addTab("Subárea", null, sub, "Consultar grupos em uma subárea específica");
		sub.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(10, 39, 446, 295);
		sub.add(contentPane_1);
		
		JLabel lblNewLabel_7 = new JLabel("Consultar grupos por subárea");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_7.setBounds(10, 22, 243, 19);
		contentPane_1.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(147, 76, 289, 22);
		contentPane_1.add(comboBox);
		
		JLabel lblNewLabel_1_2 = new JLabel("Selecione a subárea:");
		lblNewLabel_1_2.setBounds(10, 80, 127, 14);
		contentPane_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Grupos:");
		lblNewLabel_2_2.setBounds(10, 149, 46, 14);
		contentPane_1.add(lblNewLabel_2_2);
		
		JList list_1 = new JList();
		list_1.setBounds(120, 210, 111, -50);
		contentPane_1.add(list_1);
		
		JList list_1_2 = new JList();
		list_1_2.setBounds(120, 148, 316, 136);
		contentPane_1.add(list_1_2);
		
		JButton btnNewButton_2_1 = new JButton("Consultar");
		btnNewButton_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1.setBackground(new Color(227, 252, 209));
		btnNewButton_2_1.setBounds(213, 114, 89, 23);
		contentPane_1.add(btnNewButton_2_1);
		
		JPanel orient = new JPanel();
		tabbedPane.addTab("Orientação", null, orient, "inserir orientação para um grupo");
		orient.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Cadastrar orientação");
		lblNewLabel_8.setBounds(26, 33, 141, 14);
		orient.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("ID grupo:");
		lblNewLabel_8_1.setBounds(26, 72, 141, 14);
		orient.add(lblNewLabel_8_1);
		
		JComboBox rec_id1 = new JComboBox();
		rec_id1.setBounds(110, 68, 320, 22);
		orient.add(rec_id1);
		
		JLabel lblNewLabel_9 = new JLabel("Digite sua orientação");
		lblNewLabel_9.setBounds(26, 116, 141, 14);
		orient.add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(110, 141, 320, 152);
		orient.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_2_2 = new JButton("Gravar");
		btnNewButton_2_2.setForeground(Color.BLACK);
		btnNewButton_2_2.setBackground(new Color(227, 252, 209));
		btnNewButton_2_2.setBounds(230, 304, 89, 23);
		orient.add(btnNewButton_2_2);
		
		JPanel cons_orient = new JPanel();
		tabbedPane.addTab("Última orientação", null, cons_orient, "consultar última orientação dada a um grupo");
		cons_orient.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Consultar última orientação");
		lblNewLabel_10.setBounds(23, 38, 313, 14);
		cons_orient.add(lblNewLabel_10);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("ID grupo:");
		lblNewLabel_8_1_1.setBounds(23, 67, 141, 14);
		cons_orient.add(lblNewLabel_8_1_1);
		
		
		JComboBox rec_id2 = new JComboBox();
		rec_id2.setModel(new DefaultComboBoxModel(new String[] {"AQUI"}));
		rec_id2.setBounds(107, 63, 320, 22);
		cons_orient.add(rec_id2);
		
		JLabel lblNewLabel_8_1_1_1 = new JLabel("Última orientação passada:");
		lblNewLabel_8_1_1_1.setBounds(23, 122, 177, 14);
		cons_orient.add(lblNewLabel_8_1_1_1);
		
		JList list_2 = new JList();
		list_2.setBounds(107, 134, 1, 1);
		cons_orient.add(list_2);
		
		JList list_3 = new JList();
		list_3.setBounds(107, 146, 320, 192);
		cons_orient.add(list_3);
		
		JButton btnNewButton_2_1_1 = new JButton("Consultar");
		btnNewButton_2_1_1.setForeground(Color.BLACK);
		btnNewButton_2_1_1.setBackground(new Color(227, 252, 209));
		btnNewButton_2_1_1.setBounds(216, 96, 89, 23);
		cons_orient.add(btnNewButton_2_1_1);
	}
}
