package main;

import java.awt.BorderLayout;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bean.Alergias;
import bean.Cliente;
import bean.Consulta;
import bean.Pet;
import bean.Vacinas;
import bean.Veterinario;
import dao.AlergiaDAO;
import dao.ClienteDAO;
import dao.ConsultaDAO;
import dao.PetDAO;
import dao.VacinaDAO;
import dao.VeterinarioDAO;

import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.JTable;
import javax.swing.ComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;

public class PetShop extends JFrame {

	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel log_pet;
	private JPanel last_con;
	private JPanel log_VET;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JLabel lblIdade;
	private JLabel lblPeso;
	private JTextField textField_col;
	private JTextField textField_idpet;
	private JTextField textField_nopet;
	private JTextField textField_peso;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JButton btnNewButton_2;
	private JPanel log_consulta;
	private JTextField textField_11;
	private JLabel lblNewLabel_13;
	private JTextField textField_12;
	private JLabel lblNewLabel_14;
	private JTextField textField_13;
	private JLabel lblNewLabel_15;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JTextField textField_21;
	private JTextField textField_22;
	private JMenu mnCliente;
	private JTextField textField_26;
	private JTextField textField_23;
	private JTextField textField_24;
	private JComboBox comboBox_1;
	private JPanel alt_vet;
	private JPanel vis_vet;
	private JPanel alt_pet;
	private JPanel exc_pet;
	private JPanel vis_pet;
	private JPanel vis_consulta;
	private JPanel exc_consulta;
	private JPanel exc_vet;
	private JMenuItem Alteracao;
	private JMenuItem mntmNewMenuItem_9;
	private JMenuItem mntmNewMenuItem_10;
	private JPanel log_cli;
	private JButton btnNewButton_6;
	private JTextField textField_28;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_28;
	private JTextField textField_31;
	private JTextField textFieldC_Nome;
	private JTextField textField_33;
	private JTextField textField_34;
	private JPanel alt_cli;
	private JPanel exc_cli;
	private JPanel vis_cli;
	private JButton btnNewButton;
	private JComboBox comboBox_2;
	private JTable table_vet;
	private JButton btnNewButton_10;
	private JTextField textField_nome;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textField_dataent;
	private JTextField textField_email;
	private JTextField textField_datanasc;
	private JComboBox comboBox_3;
	private JButton btnNewButton_11;
	private JComboBox comboBox_4;
	private JButton btnNewButton_12;
	private JComboBox comboBox_pet_col;
	private JTextField textField_newage;
	private JTextField textField_newpeso;
	private JTextField textField_29;
	private JTable table_petdata;
	private JComboBox comboBox_9;
	private JComboBox comboBox_10;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_29;
	private JPanel alt_consulta;
	private JButton btnNewButton_18;
	private JTextField textField_30;
	private JTextField textField_35;
	private JComboBox comboBox_12;
	private JLabel lblNewLabel_30;
	private JLabel lblNewLabel_31;
	private JComboBox comboBox_14;
	private JComboBox comboBox_15;
	private JComboBox comboBox_16;
	private JButton btnNewButton_3;
	private JTable table_3;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_11;
	private JComboBox comboBox_11;
	private JComboBox comboBox_13;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTable table_5;
	private JPanel log_ale;
	private JPanel vis_vac;
	private JPanel vis_aler;
	private JPanel log_vac;
	private JTable tabela_clidata;
	private JComboBox comboBox_cpf_d;
	private JScrollPane scrollPane_1;
	private JTextField textField;
	private JScrollPane scrollPane_2;
	private JComboBox comboBox;
	private JLabel lblNewLabel_38;
	private JLabel lblNewLabel_39;
	private JLabel lblNewLabel_40;
	private JLabel lblNewLabel_41;
	private JLabel lblNewLabel_42;
	private JComboBox comboBox_18;
	private JComboBox comboBox_17;
	private JComboBox comboBox_petvac;
	private JComboBox comboBox_cpfvac;
	private JScrollPane scrollPane_5;
	private JTable table;
	private JMenuItem mntmNewMenuItem_16;
	private JTable table_1;
	private JMenuItem mntmNewMenuItem_17;
	private JMenuItem mntmNewMenuItem_18;
	private JScrollPane scrollPane_6;
	private JButton btnNewButton_24;
	private JTable table_2;
	private JScrollPane scrollPane_7;
	private JLabel lblNewLabel_43;
	private JLabel lblNewLabel_44;
	private JMenuItem mntmNewMenuItem_19;
	private JMenuItem menuItem;
	private JPanel Pets;
	private JPanel veterans;
	private JTable table_4;
	private JTable table_6;
	private JLabel lblNewLabel_45;
	private JScrollPane scrollPane_8;
	private JTable table_7;
	private JButton btnNewButton_25;
	private JScrollPane scrollPane_9;
	private JScrollPane scrollPane_10;
	private JLabel lblNewLabel_46;
	private JTable table_8;
	private JScrollPane scrollPane_11;
	private JButton btnNewButton_8;
	private JLabel lblNewLabel_50;
	private JLabel lblNewLabel_51;
	private JLabel lblNewLabel_52;
	private JLabel lblNewLabel_53;
	private JLabel lblNewLabel_54;
	private JComboBox comboBox_colpets;
	private JComboBox comboBox_esp;
	private JLabel lblNewLabel_55;
	private JLabel lblNewLabel_56;
	private JComboBox comboBox_data1;
	private JComboBox comboBox_data2;
	private JComboBox comboBox_data2_1;
	private JComboBox comboBox_data3;
	private JComboBox comboBox_hora;
	private JComboBox comboBox_data;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PetShop frame = new PetShop();
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
	public PetShop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Adicionar");
		mntmNewMenuItem_1.setIcon(new ImageIcon(PetShop.class.getResource("/images/icons8-add-new-16.png")));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(log_cli);
			}
		});
		mnCliente.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Alterara\u00E7\u00E3o");
		mntmNewMenuItem_2.setIcon(new ImageIcon(PetShop.class.getResource("/images/refresh.png")));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(alt_cli);
			}
		});
		mnCliente.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exclus\u00E3o");
		mntmNewMenuItem_3.setIcon(new ImageIcon(PetShop.class.getResource("/images/trash.png")));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(exc_cli);
			}
		});
		mnCliente.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Visualiza\u00E7\u00E3o");
		mntmNewMenuItem_4.setIcon(new ImageIcon(PetShop.class.getResource("/images/search-alt.png")));
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(vis_cli);
			}
		});
		mnCliente.add(mntmNewMenuItem_4);

		JMenu Pet = new JMenu("Pet");
		menuBar.add(Pet);

		JMenuItem Adicionar = new JMenuItem("Adicionar");
		Adicionar.setIcon(new ImageIcon(PetShop.class.getResource("/images/icons8-add-new-16.png")));
		Pet.add(Adicionar);

		Alteracao = new JMenuItem("Altera\u00E7\u00E3o");
		Alteracao.setIcon(new ImageIcon(PetShop.class.getResource("/images/refresh.png")));
		Alteracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(alt_pet);
			}
		});
		Pet.add(Alteracao);

		mntmNewMenuItem_9 = new JMenuItem("Exclus\u00E3o");
		mntmNewMenuItem_9.setIcon(new ImageIcon(PetShop.class.getResource("/images/trash.png")));
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(exc_pet);
			}
		});
		Pet.add(mntmNewMenuItem_9);

		mntmNewMenuItem_10 = new JMenuItem("Visualiza\u00E7\u00E3o");
		mntmNewMenuItem_10.setIcon(new ImageIcon(PetShop.class.getResource("/images/search-alt.png")));
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(vis_pet);
			}
		});
		Pet.add(mntmNewMenuItem_10);
		Adicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(log_pet);
			}
		});

		mnNewMenu = new JMenu("Veterin\u00E1rio");
		menuBar.add(mnNewMenu);

		JMenuItem Veterinarios = new JMenuItem("Adicionar");
		Veterinarios.setIcon(new ImageIcon(PetShop.class.getResource("/images/icons8-add-new-16.png")));
		Veterinarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(log_VET);
			}
		});
		mnNewMenu.add(Veterinarios);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Altera\u00E7\u00E3o");
		mntmNewMenuItem_5.setIcon(new ImageIcon(PetShop.class.getResource("/images/refresh.png")));
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(alt_vet);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Exclus\u00E3o");
		mntmNewMenuItem_6.setIcon(new ImageIcon(PetShop.class.getResource("/images/trash.png")));
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(exc_vet);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_6);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Visualiza\u00E7\u00E3o");
		mntmNewMenuItem_7.setIcon(new ImageIcon(PetShop.class.getResource("/images/search-alt.png")));
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(vis_vet);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_7);

		JMenu mnNewMenu_2 = new JMenu("Consultas");
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem = new JMenuItem("Adicionar");
		mntmNewMenuItem.setIcon(new ImageIcon(PetShop.class.getResource("/images/icons8-add-new-16.png")));
		mnNewMenu_2.add(mntmNewMenuItem);

		JMenuItem Consultas = new JMenuItem("Altera\u00E7\u00E3o");
		Consultas.setIcon(new ImageIcon(PetShop.class.getResource("/images/refresh.png")));
		mnNewMenu_2.add(Consultas);

		mntmNewMenuItem_8 = new JMenuItem("Exclus\u00E3o");
		mntmNewMenuItem_8.setIcon(new ImageIcon(PetShop.class.getResource("/images/trash.png")));
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(exc_consulta);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_8);

		mntmNewMenuItem_11 = new JMenuItem("Visualiza\u00E7\u00E3o");
		mntmNewMenuItem_11.setIcon(new ImageIcon(PetShop.class.getResource("/images/search-alt.png")));
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(vis_consulta);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_11);

		JMenu mnNewMenu_1 = new JMenu("Alergias");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Adicionar");
		mntmNewMenuItem_12.setIcon(new ImageIcon(PetShop.class.getResource("/images/icons8-add-new-16.png")));
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(log_ale);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_12);
		
				JMenuItem mntmNewMenuItem_15 = new JMenuItem("Visualiza\u00E7\u00E3o");
				mnNewMenu_1.add(mntmNewMenuItem_15);
				mntmNewMenuItem_15.setIcon(new ImageIcon(PetShop.class.getResource("/images/search-alt.png")));
				mntmNewMenuItem_15.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Switch_screen(vis_aler);
					}
				});

		JMenu mnNewMenu_3 = new JMenu("Vacinas");
		menuBar.add(mnNewMenu_3);

		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Adicionar");
		mntmNewMenuItem_14.setIcon(new ImageIcon(PetShop.class.getResource("/images/icons8-add-new-16.png")));
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(log_vac);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_14);
		
				JMenuItem mntmNewMenuItem_13 = new JMenuItem("Visualiza\u00E7\u00E3o");
				mnNewMenu_3.add(mntmNewMenuItem_13);
				mntmNewMenuItem_13.setIcon(new ImageIcon(PetShop.class.getResource("/images/search-alt.png")));
				mntmNewMenuItem_13.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Switch_screen(vis_vac);
					}
				});
		
		JMenu mnNewMenu_4 = new JMenu("Rel\u00E1torios");
		menuBar.add(mnNewMenu_4);
		
		mntmNewMenuItem_17 = new JMenuItem("Cronograma de consultas");
		mntmNewMenuItem_17.setIcon(new ImageIcon(PetShop.class.getResource("/images/icons8-calendar-16.png")));
		mntmNewMenuItem_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(last_con);
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_17);
		
		mntmNewMenuItem_18 = new JMenuItem("Veterin\u00E1rios livres");
		mntmNewMenuItem_18.setIcon(new ImageIcon(PetShop.class.getResource("/images/icons8-veterinary-16.png")));
		mntmNewMenuItem_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(veterans);
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_18);
		
		mntmNewMenuItem_19 = new JMenuItem("Pets e vacina\u00E7\u00E3o");
		mntmNewMenuItem_19.setIcon(new ImageIcon(PetShop.class.getResource("/images/icons8-pets-16.png")));
		mntmNewMenuItem_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(Pets);
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_19);
		Consultas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(alt_consulta);
			}
		});
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(log_consulta);
			}
		});
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 11, 564, 317);
		contentPane.add(layeredPane);

		ArrayList<String> lcli = new ArrayList<>();
		ClienteDAO cdao = new ClienteDAO();
		lcli = cdao.getCPFs();
		System.out.println(lcli);
		String[] listacliente = new String[100];
		// lista[0]=lpet.get(0);
		for (int i = 0; i < lcli.size(); i++) {
			listacliente[i] = lcli.get(i);
		}

		ArrayList<String> lpet = new ArrayList<>();
		PetDAO pdao = new PetDAO();
		lpet = pdao.getColeiras();
		System.out.println(lpet);
		String[] listapet = new String[100];
		// lista[0]=lpet.get(0);
		for (int i = 0; i < lpet.size(); i++) {
			listapet[i] = lpet.get(i);
		}
		
		ArrayList<String> lvet = new ArrayList<>();
		VeterinarioDAO vdao = new VeterinarioDAO();
		lvet = vdao.getCRMVs();
		System.out.println(lvet);
		String[] listavet = new String[100];
		// lista[0]=lpet.get(0);
		for (int i = 0; i < lvet.size(); i++) {
			listavet[i] = lvet.get(i);
		}
		
		ArrayList<String> lesp = new ArrayList<>();
		lesp = vdao.getESPs();
		System.out.println(lesp);
		String[] listaesp = new String[100];
		// lista[0]=lpet.get(0);
		for (int i = 0; i < lesp.size(); i++) {
			listaesp[i] = lesp.get(i);
		}
		
		ArrayList<String> lcon = new ArrayList<>();
		ConsultaDAO cndao = new ConsultaDAO();
		lcon = cndao.getDatas();
		System.out.println(lcon);
		String[] listacon = new String[100];
		// lista[0]=lpet.get(0);
		for (int i = 0; i < lcon.size(); i++) {
			listacon[i] = lcon.get(i);
		}
		
		ArrayList<String> lconh = new ArrayList<>();
		
		lconh = cndao.getHoras();
		System.out.println(lconh);
		String[] listaconh = new String[100];
		// lista[0]=lpet.get(0);
		for (int i = 0; i < lconh.size(); i++) {
			listaconh[i] = lconh.get(i);
		}
																																																																																	
																																																																																	last_con = new JPanel();
																																																																																	last_con.setBackground(new Color(255, 0, 128));
																																																																																	last_con.setBounds(0, 0, 564, 317);
																																																																																	//layeredPane.add(last_con);
																																																																																	last_con.setLayout(null);
																																																																																	
																																																																																	scrollPane_6 = new JScrollPane();
																																																																																	scrollPane_6.setBounds(228, 23, 323, 40);
																																																																																	last_con.add(scrollPane_6);
																																																																																	
																																																																																	table_1 = new JTable();
																																																																																	table_1.setModel(new DefaultTableModel(
																																																																																		new Object[][] {
																																																																																		},
																																																																																		new String[] {
																																																																																			"Nome", "CPF", "Hora", "Data"
																																																																																		}
																																																																																	) {
																																																																																		Class[] columnTypes = new Class[] {
																																																																																			String.class, String.class, String.class, String.class
																																																																																		};
																																																																																		public Class getColumnClass(int columnIndex) {
																																																																																			return columnTypes[columnIndex];
																																																																																		}
																																																																																	});
																																																																																	scrollPane_6.setViewportView(table_1);
																																																																																	
																																																																																	scrollPane_7 = new JScrollPane();
																																																																																	scrollPane_7.setBounds(228, 90, 323, 40);
																																																																																	last_con.add(scrollPane_7);
																																																																																	
																																																																																	table_2 = new JTable();
																																																																																	scrollPane_7.setViewportView(table_2);
																																																																																	table_2.setModel(new DefaultTableModel(
																																																																																		new Object[][] {
																																																																																		},
																																																																																		new String[] {
																																																																																			"Nome", "CPF", "Hora", "Data"
																																																																																		}
																																																																																	) {
																																																																																		Class[] columnTypes = new Class[] {
																																																																																			String.class, String.class, String.class, String.class
																																																																																		};
																																																																																		public Class getColumnClass(int columnIndex) {
																																																																																			return columnTypes[columnIndex];
																																																																																		}
																																																																																	});
																																																																																	
																																																																																	menuItem = new JMenuItem("New menu item");
																																																																																	scrollPane_7.setColumnHeaderView(menuItem);
																																																																																	
																																																																																	btnNewButton_24 = new JButton("Visualizar");
																																																																																	btnNewButton_24.setForeground(new Color(255, 255, 128));
																																																																																	btnNewButton_24.setBackground(new Color(0, 64, 128));
																																																																																	btnNewButton_24.setFont(new Font("Tahoma", Font.PLAIN, 18));
																																																																																	btnNewButton_24.addActionListener(new ActionListener() {
																																																																																		public void actionPerformed(ActionEvent e) {
																																																																																			ConsultaDAO cnDAO = new ConsultaDAO();
																																																																																			ClienteDAO cDAO = new ClienteDAO();
																																																																																			VeterinarioDAO vDAO = new VeterinarioDAO();
																																																																																			ArrayList<Consulta> consultas = new ArrayList<>();
																																																																																			ArrayList<Cliente> clientes = new ArrayList<>();
																																																																																			ArrayList<Veterinario> veterinarios = new ArrayList<>();

																																																																																			
																																																																																			String data1Str = comboBox_data1.getSelectedItem().toString();
																																																																																			String data2Str = comboBox_data2.getSelectedItem().toString();
																																																																																			
																																																																																			Date data1 = Date.valueOf(data1Str);
																																																																																			Date data2 = Date.valueOf(data2Str);
																																																																																			
																																																																																			
																																																																																			
																																																																																			
																																																																																			DefaultTableModel model3 = (DefaultTableModel) table_6.getModel();
																																																																																			model3.setRowCount(0);
																																																																																			
																																																																																			consultas = cnDAO.getDetailConsulta(data1, data2);
																																																																																			veterinarios = vDAO.getDetailConsulta();
																																																																																			
																																																																																			for (int i = 0; i < consultas.size(); i++) {
																																																																																				Consulta cn = consultas.get(i);
																																																																																				Veterinario v = veterinarios.get(i);
																																																																																				
																																																																																				model3.addRow(new Object[] {v.getEspecializacao(), v.getNome_vet(), cn.getCodColeira(), cn.getHora(),
																																																																																						cn.getData()  });
																																																																																				
																																																																																			}
																																																																																		}
																																																																																	});
																																																																																	btnNewButton_24.setBounds(380, 283, 161, 21);
																																																																																	last_con.add(btnNewButton_24);
																																																																																	
																																																																																	lblNewLabel_43 = new JLabel("Primeira consulta");
																																																																																	lblNewLabel_43.setForeground(new Color(255, 255, 255));
																																																																																	lblNewLabel_43.setFont(new Font("Tahoma", Font.PLAIN, 17));
																																																																																	lblNewLabel_43.setBounds(305, 67, 193, 21);
																																																																																	last_con.add(lblNewLabel_43);
																																																																																	
																																																																																	lblNewLabel_44 = new JLabel("\u00DAltima consulta");
																																																																																	lblNewLabel_44.setForeground(new Color(255, 255, 255));
																																																																																	lblNewLabel_44.setFont(new Font("Tahoma", Font.PLAIN, 17));
																																																																																	lblNewLabel_44.setBounds(305, 0, 175, 21);
																																																																																	last_con.add(lblNewLabel_44);
																																																																																	
																																																																																	scrollPane_8 = new JScrollPane();
																																																																																	scrollPane_8.setBounds(22, 141, 519, 134);
																																																																																	last_con.add(scrollPane_8);
																																																																																	
																																																																																	table_6 = new JTable();
																																																																																	scrollPane_8.setViewportView(table_6);
																																																																																	table_6.setModel(new DefaultTableModel(
																																																																																		new Object[][] {
																																																																																		},
																																																																																		new String[] {
																																																																																			"Especializa\u00E7\u00E3o", "Nome", "Pet", "Hora", "Data"
																																																																																		}
																																																																																	) {
																																																																																		Class[] columnTypes = new Class[] {
																																																																																			String.class, String.class, Integer.class, String.class, String.class
																																																																																		};
																																																																																		public Class getColumnClass(int columnIndex) {
																																																																																			return columnTypes[columnIndex];
																																																																																		}
																																																																																	});
																																																																																	
																																																																																	lblNewLabel_45 = new JLabel("Consultas (Detalhadas)");
																																																																																	lblNewLabel_45.setFont(new Font("Tahoma", Font.PLAIN, 17));
																																																																																	lblNewLabel_45.setForeground(new Color(255, 255, 255));
																																																																																	lblNewLabel_45.setBounds(23, 107, 219, 35);
																																																																																	last_con.add(lblNewLabel_45);
																																																																																	
																																																																																	JButton btnNewButton_9 = new JButton("Visualizar");
																																																																																	btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
																																																																																	btnNewButton_9.setForeground(new Color(255, 255, 128));
																																																																																	btnNewButton_9.setBackground(new Color(0, 64, 128));
																																																																																	btnNewButton_9.addActionListener(new ActionListener() {
																																																																																		public void actionPerformed(ActionEvent e) {
																																																																																			ConsultaDAO cnDAO = new ConsultaDAO();
																																																																																			ClienteDAO cDAO = new ClienteDAO();
																																																																																			VeterinarioDAO vDAO = new VeterinarioDAO();
																																																																																			ArrayList<Consulta> consultas = new ArrayList<>();
																																																																																			ArrayList<Cliente> clientes = new ArrayList<>();
																																																																																			ArrayList<Veterinario> veterinarios = new ArrayList<>();
																																																																																			
																																																																																			String data3Str = comboBox_data3.getSelectedItem().toString();
																																																																																			
																																																																																			Date data3 = Date.valueOf(data3Str);
																																																																																			consultas = cnDAO.getFirstConsulta(data3);
																																																																																			clientes = cDAO.getFirstConsulta();
																																																																																			DefaultTableModel model = (DefaultTableModel) table_2.getModel();
																																																																																			model.setRowCount(0);
																																																																																			

																																																																																			for (int i = 0; i < consultas.size(); i++) {
																																																																																				Consulta cn = consultas.get(i);
																																																																																				Cliente c = clientes.get(i);
																																																																																				
																																																																																				model.addRow(new Object[] {c.getNome_cli(), c.getCPF(), cn.getHora(),
																																																																																						cn.getData()  });
																																																																																				
																																																																																			}
																																																																																			
																																																																																			DefaultTableModel model2 = (DefaultTableModel) table_1.getModel();
																																																																																			model2.setRowCount(0);
																																																																																			
																																																																																			consultas = cnDAO.getLastConsulta(data3);
																																																																																			clientes = cDAO.getLastConsulta();
																																																																																			
																																																																																			for (int i = 0; i < consultas.size(); i++) {
																																																																																				Consulta cn = consultas.get(i);
																																																																																				Cliente c = clientes.get(i);
																																																																																				
																																																																																				model2.addRow(new Object[] {c.getNome_cli(), c.getCPF(), cn.getHora(),
																																																																																						cn.getData()  });
																																																																																				
																																																																																			}
																																																																																		}
																																																																																	});
																																																																																	btnNewButton_9.setBounds(61, 65, 157, 23);
																																																																																	last_con.add(btnNewButton_9);
																																																																																	
																																																																																	lblNewLabel_54 = new JLabel("Data");
																																																																																	lblNewLabel_54.setForeground(new Color(255, 255, 255));
																																																																																	lblNewLabel_54.setHorizontalAlignment(SwingConstants.RIGHT);
																																																																																	lblNewLabel_54.setBounds(38, 30, 46, 14);
																																																																																	last_con.add(lblNewLabel_54);
																																																																																	
																																																																																	lblNewLabel_55 = new JLabel("Entre");
																																																																																	lblNewLabel_55.setHorizontalAlignment(SwingConstants.RIGHT);
																																																																																	lblNewLabel_55.setForeground(new Color(255, 255, 255));
																																																																																	lblNewLabel_55.setBounds(5, 289, 46, 14);
																																																																																	last_con.add(lblNewLabel_55);
																																																																																	
																																																																																	lblNewLabel_56 = new JLabel("e");
																																																																																	lblNewLabel_56.setHorizontalAlignment(SwingConstants.RIGHT);
																																																																																	lblNewLabel_56.setForeground(Color.WHITE);
																																																																																	lblNewLabel_56.setBounds(122, 289, 46, 14);
																																																																																	last_con.add(lblNewLabel_56);
																																																																																	
																																																																																	comboBox_data1 = new JComboBox(listacon);
																																																																																	comboBox_data1.setBounds(61, 287, 92, 18);
																																																																																	last_con.add(comboBox_data1);
																																																																																	
																																																																																	comboBox_data2 = new JComboBox(listacon);
																																																																																	comboBox_data2.setBounds(173, 287, 92, 18);
																																																																																	last_con.add(comboBox_data2);
																																																																																	
																																																																																	comboBox_data3 = new JComboBox(listacon);
																																																																																	comboBox_data3.setBounds(93, 28, 125, 18);
																																																																																	last_con.add(comboBox_data3);
																																																																																	
																																																																																	veterans = new JPanel();
																																																																																	veterans.setBackground(new Color(255, 255, 0));
																																																																																	veterans.setBounds(0, 0, 564, 317);
																																																																																	//layeredPane.add(veterans);
																																																																																	veterans.setLayout(null);
																																																																																	
																																																																																	JButton btnNewButton_7 = new JButton("Visualizar");
																																																																																	btnNewButton_7.setForeground(new Color(255, 255, 128));
																																																																																	btnNewButton_7.setBackground(new Color(0, 64, 128));
																																																																																	btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 26));
																																																																																	btnNewButton_7.addActionListener(new ActionListener() {
																																																																																		public void actionPerformed(ActionEvent e) {
																																																																																			VeterinarioDAO vDAO = new VeterinarioDAO();
																																																																																			ArrayList<Veterinario> vets = new ArrayList<>();
																																																																																			
																																																																																			String especializacaorqrd = comboBox_esp.getSelectedItem().toString();

																																																																																			vets = vDAO.getFreely(especializacaorqrd);
																																																																																			DefaultTableModel model = (DefaultTableModel) table_8.getModel();
																																																																																			model.setRowCount(0);
																																																																																			System.out
																																																																																					.println(vets.size());
																																																																																			for (int i = 0; i < vets.size(); i++) {
																																																																																				Veterinario v = vets.get(i);
																																																																																				model.addRow(new Object[] { v.getNome_vet(), v.getEspecializacao(), v.getExperiencia(), v.getCRMV() });
																																																																																				System.out.println("a" + vets.get(i));
																																																																																			}
																																																																																		}
																																																																																	});
																																																																																	btnNewButton_7.setBounds(186, 258, 177, 48);
																																																																																	veterans.add(btnNewButton_7);
																																																																																	
																																																																																	scrollPane_11 = new JScrollPane();
																																																																																	scrollPane_11.setBounds(44, 11, 452, 236);
																																																																																	veterans.add(scrollPane_11);
																																																																																	
																																																																																	table_8 = new JTable();
																																																																																	table_8.setModel(new DefaultTableModel(
																																																																																		new Object[][] {
																																																																																		},
																																																																																		new String[] {
																																																																																			"Nome", "Especializa\u00E7\u00E3o", "Experi\u00EAncia", "CRMV"
																																																																																		}
																																																																																	) {
																																																																																		Class[] columnTypes = new Class[] {
																																																																																			String.class, String.class, String.class, String.class
																																																																																		};
																																																																																		public Class getColumnClass(int columnIndex) {
																																																																																			return columnTypes[columnIndex];
																																																																																		}
																																																																																	});
																																																																																	scrollPane_11.setViewportView(table_8);
																																																																																	
																																																																																	comboBox_esp = new JComboBox(listaesp);
																																																																																	comboBox_esp.setBounds(44, 258, 107, 22);
																																																																																	veterans.add(comboBox_esp);
																																																																																																																																																	
																																																																																																																																																			log_vac = new JPanel();
																																																																																																																																																			log_vac.setBackground(new Color(128, 128, 128));
																																																																																																																																																			log_vac.setBounds(0, 0, 564, 317);
																																																																																																																																																			//layeredPane.add(log_vac);
																																																																																																																																																			log_vac.setLayout(null);
																																																																																																																																																			
																																																																																																																																																					comboBox_cpfvac = new JComboBox(listacliente);
																																																																																																																																																					comboBox_cpfvac.setBounds(59, 118, 121, 29);
																																																																																																																																																					log_vac.add(comboBox_cpfvac);
																																																																																																																																																					
																																																																																																																																																							comboBox_petvac = new JComboBox(listapet);
																																																																																																																																																							comboBox_petvac.setBounds(376, 118, 121, 29);
																																																																																																																																																							log_vac.add(comboBox_petvac);
																																																																																																																																																							
																																																																																																																																																									JLabel lblNewLabel_10_1 = new JLabel("Vacina");
																																																																																																																																																									lblNewLabel_10_1.setBounds(256, 93, 52, 14);
																																																																																																																																																									log_vac.add(lblNewLabel_10_1);
																																																																																																																																																									
																																																																																																																																																											textField_37 = new JTextField();
																																																																																																																																																											textField_37.setBounds(207, 118, 137, 29);
																																																																																																																																																											textField_37.setColumns(10);
																																																																																																																																																											log_vac.add(textField_37);
																																																																																																																																																											
																																																																																																																																																													JButton btnNewButton_19_1 = new JButton("Adicionar");
																																																																																																																																																													btnNewButton_19_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
																																																																																																																																																													btnNewButton_19_1.setBackground(new Color(0, 64, 128));
																																																																																																																																																													btnNewButton_19_1.setForeground(new Color(255, 255, 128));
																																																																																																																																																													btnNewButton_19_1.addActionListener(new ActionListener() {
																																																																																																																																																														public void actionPerformed(ActionEvent e) {
																																																																																																																																																															VacinaDAO vDAO = new VacinaDAO();
																																																																																																																																																															Vacinas vc = new Vacinas();
																																																																																																																																																															
																																																																																																																																																															String CPF = comboBox_cpfvac.getSelectedItem().toString();
																																																																																																																																																															int coleira = Integer.valueOf(comboBox_petvac.getSelectedItem().toString());
																																																																																																																																																															String nomevac = textField_37.getText();
																																																																																																																																																															Date datavac = Date.valueOf(textField_38.getText());
																																																																																																																																																															
																																																																																																																																																															if (vDAO.verifyVaci(CPF, coleira, nomevac, datavac) == true) {
																																																																																																																																																															if (vDAO.verifyVac(CPF, coleira) == false) {
																																																																																																																																																																vc.setCPF(CPF);
																																																																																																																																																																vc.setCodColeira(coleira);
																																																																																																																																																																vc.setNomevac(nomevac);
																																																																																																																																																																vc.setData(datavac);
																																																																																																																																																																
																																																																																																																																																																vDAO.inserir(vc);
																																																																																																																																																																System.out
																																																																																																																																																																		.println(vc);
																																																																																																																																																																JOptionPane.showMessageDialog(null, "Vacina registrada!");
																																																																																																																																																															} else {
																																																																																																																																																																System.out.println("Wrong!  " + vc);
																																																																																																																																																																JOptionPane.showMessageDialog(null, "N�o foi poss�vel encontrar o pet!");
																																																																																																																																																															}
																																																																																																																																																														} else {
																																																																																																																																																															JOptionPane.showMessageDialog(null, "Vacina j� registrada!");
																																																																																																																																																														}
																																																																																																																																																														}
																																																																																																																																																													});
																																																																																																																																																													btnNewButton_19_1.setBounds(203, 265, 148, 41);
																																																																																																																																																													log_vac.add(btnNewButton_19_1);
																																																																																																																																																													
																																																																																																																																																															JLabel lblNewLabel_32_2 = new JLabel("CPF");
																																																																																																																																																															lblNewLabel_32_2.setBounds(108, 93, 23, 14);
																																																																																																																																																															log_vac.add(lblNewLabel_32_2);
																																																																																																																																																															
																																																																																																																																																																	JLabel lblNewLabel_32_1_1 = new JLabel("Coleira");
																																																																																																																																																																	lblNewLabel_32_1_1.setBounds(416, 98, 40, 14);
																																																																																																																																																																	log_vac.add(lblNewLabel_32_1_1);
																																																																																																																																																																	
																																																																																																																																																																			textField_38 = new JTextField();
																																																																																																																																																																			textField_38.setColumns(10);
																																																																																																																																																																			textField_38.setBounds(207, 208, 137, 29);
																																																																																																																																																																			log_vac.add(textField_38);
																																																																																																																																																																			
																																																																																																																																																																					JLabel lblNewLabel_33 = new JLabel("Data de Vacina\u00E7\u00E3o");
																																																																																																																																																																					lblNewLabel_33.setBounds(225, 183, 113, 14);
																																																																																																																																																																					log_vac.add(lblNewLabel_33);
																																																																											
																																																																											
																																																																											
																																																																											
																																																																									
																																																																											
		
		
		
		
		
																																																																									vis_vac = new JPanel();
																																																																									vis_vac.setBackground(new Color(128, 128, 128));
																																																																									vis_vac.setBounds(0, 0, 564, 317);
																																																																									//layeredPane.add(vis_vac);
																																																																									vis_vac.setLayout(null);
																																																																									
																																																																									JScrollPane scrollPane_4 = new JScrollPane();
																																																																									scrollPane_4.setBounds(10, 6, 544, 231);
																																																																									vis_vac.add(scrollPane_4);
																																																																									
																																																																									table = new JTable();
																																																																									scrollPane_4.setViewportView(table);
																																																																									table.setModel(new DefaultTableModel(
																																																																										new Object[][] {
																																																																										},
																																																																										new String[] {
																																																																											"Cliente", "Pet", "Vacina", "Data"
																																																																										}
																																																																									) {
																																																																										Class[] columnTypes = new Class[] {
																																																																											String.class, Integer.class, String.class, String.class
																																																																										};
																																																																										public Class getColumnClass(int columnIndex) {
																																																																											return columnTypes[columnIndex];
																																																																										}
																																																																									});
																																																																									
																																																																									JButton btnNewButton_22 = new JButton("Ver vacinas");
																																																																									btnNewButton_22.setBackground(new Color(0, 64, 128));
																																																																									btnNewButton_22.setForeground(new Color(255, 255, 128));
																																																																									btnNewButton_22.setFont(new Font("Tahoma", Font.PLAIN, 25));
																																																																									btnNewButton_22.addActionListener(new ActionListener() {
																																																																										public void actionPerformed(ActionEvent e) {
																																																																											VacinaDAO vcDAO = new VacinaDAO();
																																																																											ArrayList<Vacinas> vacinas = new ArrayList<>();

																																																																											vacinas = vcDAO.getVacinas();
																																																																											DefaultTableModel model = (DefaultTableModel) table.getModel();
																																																																											model.setRowCount(0);

																																																																											for (int i = 0; i < vacinas.size(); i++) {
																																																																												Vacinas vc = vacinas.get(i);
																																																																												model.addRow(new Object[] { vc.getCPF(), vc.getCodColeira(), vc.getNomevac(), vc.getData()});
																																																																										}
																																																																										}
																																																																									});
																																																																									btnNewButton_22.setBounds(189, 260, 185, 35);
																																																																									vis_vac.add(btnNewButton_22);
																																																																									
																																																																											vis_aler = new JPanel();
																																																																											vis_aler.setBackground(new Color(255, 128, 64));
																																																																											vis_aler.setBounds(0, 0, 564, 317);
																																																																											//layeredPane.add(vis_aler);
																																																																											vis_aler.setLayout(null);
																																																																											
																																																																											scrollPane_5 = new JScrollPane();
																																																																											scrollPane_5.setBounds(49, 11, 461, 247);
																																																																											vis_aler.add(scrollPane_5);
																																																																											
																																																																													table_5 = new JTable();
																																																																													table_5.setModel(new DefaultTableModel(
																																																																														new Object[][] {
																																																																														},
																																																																														new String[] {
																																																																															"Cliente", "Pet", "Alergia"
																																																																														}
																																																																													) {
																																																																														Class[] columnTypes = new Class[] {
																																																																															String.class, Integer.class, String.class
																																																																														};
																																																																														public Class getColumnClass(int columnIndex) {
																																																																															return columnTypes[columnIndex];
																																																																														}
																																																																													});
																																																																													scrollPane_5.setViewportView(table_5);
																																																																													
																																																																													JButton btnNewButton_23 = new JButton("Ver alergias");
																																																																													btnNewButton_23.setForeground(new Color(255, 255, 128));
																																																																													btnNewButton_23.setBackground(new Color(0, 64, 128));
																																																																													btnNewButton_23.setFont(new Font("Tahoma", Font.PLAIN, 16));
																																																																													btnNewButton_23.addActionListener(new ActionListener() {
																																																																														public void actionPerformed(ActionEvent e) {
																																																																															AlergiaDAO aDAO = new AlergiaDAO();
																																																																															ArrayList<Alergias> alergias = new ArrayList<>();

																																																																															alergias = aDAO.getAlergias();
																																																																															DefaultTableModel model = (DefaultTableModel) table_5.getModel();
																																																																															model.setRowCount(0);

																																																																															for (int i = 0; i < alergias.size(); i++) {
																																																																																Alergias a = alergias.get(i);
																																																																																model.addRow(new Object[] { a.getCPF(), a.getCodColeira(), a.getNome()});
																																																																														}
																																																																														}
																																																																													});
																																																																													btnNewButton_23.setBounds(222, 272, 119, 34);
																																																																													vis_aler.add(btnNewButton_23);
																																																																																																																																															
																																																																																																																																																	alt_vet = new JPanel();
																																																																																																																																																	alt_vet.setBackground(new Color(255, 255, 0));
																																																																																																																																																	alt_vet.setBounds(0, 0, 564, 317);
																																																																																																																																																	//layeredPane.add(alt_vet);
																																																																																																																																																	alt_vet.setLayout(null);
																																																																																																																																																	
																																																																																																																																																			textField_26 = new JTextField();
																																																																																																																																																			textField_26.setColumns(10);
																																																																																																																																																			textField_26.setBounds(10, 53, 133, 34);
																																																																																																																																																			alt_vet.add(textField_26);
																																																																																																																																																			
																																																																																																																																																					textField_23 = new JTextField();
																																																																																																																																																					textField_23.setColumns(10);
																																																																																																																																																					textField_23.setBounds(407, 53, 133, 34);
																																																																																																																																																					alt_vet.add(textField_23);
																																																																																																																																																					
																																																																																																																																																							textField_24 = new JTextField();
																																																																																																																																																							textField_24.setColumns(10);
																																																																																																																																																							textField_24.setBounds(208, 53, 130, 34);
																																																																																																																																																							alt_vet.add(textField_24);
																																																																																																																																																							
																																																																																																																																																									JLabel lblNewLabel_19 = new JLabel("Especializa\u00E7\u00E3o");
																																																																																																																																																									lblNewLabel_19.setBounds(34, 28, 93, 14);
																																																																																																																																																									alt_vet.add(lblNewLabel_19);
																																																																																																																																																									
																																																																																																																																																											JLabel lblNewLabel_20 = new JLabel("Diploma");
																																																																																																																																																											lblNewLabel_20.setBounds(258, 28, 55, 14);
																																																																																																																																																											alt_vet.add(lblNewLabel_20);
																																																																																																																																																											
																																																																																																																																																													JLabel lblNewLabel_21 = new JLabel("Experi\u00EAncia");
																																																																																																																																																													lblNewLabel_21.setBounds(446, 28, 80, 14);
																																																																																																																																																													alt_vet.add(lblNewLabel_21);
																																																																																																																																																													
																																																																																																																																																															comboBox_1 = new JComboBox(listavet);
																																																																																																																																																															comboBox_1.setBounds(172, 193, 195, 54);
																																																																																																																																																															alt_vet.add(comboBox_1);
																																																																																																																																																															
																																																																																																																																																																	JButton btnNewButton_5 = new JButton("Alterar");
																																																																																																																																																																	btnNewButton_5.setForeground(new Color(255, 255, 128));
																																																																																																																																																																	btnNewButton_5.setBackground(new Color(0, 64, 128));
																																																																																																																																																																	btnNewButton_5.addActionListener(new ActionListener() {
																																																																																																																																																																		public void actionPerformed(ActionEvent e) {
																																																																																																																																																																			VeterinarioDAO vDAO = new VeterinarioDAO();
																																																																																																																																																																			Veterinario v = new Veterinario();

																																																																																																																																																																			String CRMV = comboBox_1.getSelectedItem().toString();
																																																																																																																																																																			String Diploma = textField_24.getText();
																																																																																																																																																																			String Especializacao = textField_26.getText();
																																																																																																																																																																			String Experiencia = textField_23.getText();

																																																																																																																																																																			v.setCRMV(CRMV);
																																																																																																																																																																			v.setDiploma(Diploma);
																																																																																																																																																																			v.setEspecializacao(Especializacao);
																																																																																																																																																																			v.setExperiencia(Experiencia);
																																																																																																																																																																			vDAO.detalhar(v);

																																																																																																																																																																			JOptionPane.showMessageDialog(null, "Veterin�rio alterado!");
																																																																																																																																																																		}
																																																																																																																																																																	});
																																																																																																																																																																	btnNewButton_5.setBounds(117, 283, 349, 23);
																																																																																																																																																																	alt_vet.add(btnNewButton_5);
																																																																																																																																																																	
																																																																																																																																																																	lblNewLabel_50 = new JLabel("CRMV");
																																																																																																																																																																	lblNewLabel_50.setBounds(245, 171, 46, 14);
																																																																																																																																																																	alt_vet.add(lblNewLabel_50);
																																																																																																																													
																																																																																																																																															log_VET = new JPanel();
																																																																																																																																															log_VET.setBackground(new Color(255, 255, 128));
																																																																																																																																															log_VET.setBounds(0, 0, 564, 317);
																																																																																																																																															//layeredPane.add(log_VET);
																																																																																																																																															log_VET.setLayout(null);
																																																																																																																																															
																																																																																																																																																	lblNewLabel_7 = new JLabel("CRMV");
																																																																																																																																																	lblNewLabel_7.setBounds(27, 11, 62, 14);
																																																																																																																																																	log_VET.add(lblNewLabel_7);
																																																																																																																																																	
																																																																																																																																																			lblNewLabel_8 = new JLabel("Nome");
																																																																																																																																																			lblNewLabel_8.setBounds(27, 41, 46, 14);
																																																																																																																																																			log_VET.add(lblNewLabel_8);
																																																																																																																																																			
																																																																																																																																																					lblNewLabel_9 = new JLabel("Idade");
																																																																																																																																																					lblNewLabel_9.setBounds(27, 126, 46, 14);
																																																																																																																																																					log_VET.add(lblNewLabel_9);
																																																																																																																																																					
																																																																																																																																																							btnNewButton_2 = new JButton("Cadastrar Veterin\u00E1rio");
																																																																																																																																																							btnNewButton_2.setBackground(new Color(0, 64, 128));
																																																																																																																																																							btnNewButton_2.setForeground(new Color(255, 255, 128));
																																																																																																																																																							btnNewButton_2.setBounds(91, 286, 377, 20);
																																																																																																																																																							btnNewButton_2.addActionListener(new ActionListener() {
																																																																																																																																																								public void actionPerformed(ActionEvent e) {
																																																																																																																																																									VeterinarioDAO vDAO = new VeterinarioDAO();
																																																																																																																																																									Veterinario v = new Veterinario();

																																																																																																																																																									String CRMV = textField.getText();
																																																																																																																																																									String nome = textField_15.getText();
																																																																																																																																																									String email = textField_16.getText();
																																																																																																																																																									int idade = Integer.valueOf(textField_17.getText());
																																																																																																																																																									String logradouro = textField_11.getText();
																																																																																																																																																									String bairro = textField_12.getText();								
																																																																																																																																																									String CEP = textField_13.getText();
																																																																																																																																																									int numero = Integer.valueOf(textField_14.getText());
																																																																																																																																																									String diploma = textField_18.getText();
																																																																																																																																																									String especializacao = textField_20.getText();
																																																																																																																																																									String experiencia = textField_19.getText();

																																																																																																																																																									if (vDAO.existeCMRV(CRMV) == false) {
																																																																																																																																																										v.setCRMV(CRMV);
																																																																																																																																																										v.setNome_vet(nome);
																																																																																																																																																										v.setIdade_vet(idade);
																																																																																																																																																										v.setEmail(email);
																																																																																																																																																										v.setLogradouro(logradouro);
																																																																																																																																																										v.setBairro(bairro);
																																																																																																																																																										v.setCEP(CEP);
																																																																																																																																																										v.setNumero(numero);
																																																																																																																																																										v.setEspecializacao(especializacao);
																																																																																																																																																										v.setDiploma(diploma);
																																																																																																																																																										v.setExperiencia(experiencia);
																																																																																																																																																										
																																																																																																																																																										vDAO.inserir(v);

																																																																																																																																																										JOptionPane.showMessageDialog(null, "Veterinario cadastrado!");
																																																																																																																																																										System.out.println("A" + v);
																																																																																																																																																									} else {
																																																																																																																																																										JOptionPane.showMessageDialog(null, "Veterinario ja registrado!");
																																																																																																																																																									}
																																																																																																																																																									textField_31.setText("");
																																																																																																																																																								}
																																																																																																																																																							});
																																																																																																																																																							log_VET.add(btnNewButton_2);
																																																																																																																																																							
																																																																																																																																																									JLabel lblNewLabel_11 = new JLabel("Logradouro");
																																																																																																																																																									lblNewLabel_11.setBounds(489, 11, 86, 14);
																																																																																																																																																									log_VET.add(lblNewLabel_11);
																																																																																																																																																									
																																																																																																																																																											JLabel lblNewLabel_12 = new JLabel("E-mail");
																																																																																																																																																											lblNewLabel_12.setBounds(25, 80, 46, 14);
																																																																																																																																																											log_VET.add(lblNewLabel_12);
																																																																																																																																																											
																																																																																																																																																													textField_11 = new JTextField();
																																																																																																																																																													textField_11.setBounds(413, 24, 141, 20);
																																																																																																																																																													textField_11.setColumns(10);
																																																																																																																																																													log_VET.add(textField_11);
																																																																																																																																																													
																																																																																																																																																															lblNewLabel_13 = new JLabel("Bairro");
																																																																																																																																																															lblNewLabel_13.setBounds(517, 41, 38, 14);
																																																																																																																																																															log_VET.add(lblNewLabel_13);
																																																																																																																																																															
																																																																																																																																																																	textField_12 = new JTextField();
																																																																																																																																																																	textField_12.setBounds(413, 55, 141, 31);
																																																																																																																																																																	textField_12.setColumns(10);
																																																																																																																																																																	log_VET.add(textField_12);
																																																																																																																																																																	
																																																																																																																																																																			lblNewLabel_14 = new JLabel("CEP");
																																																																																																																																																																			lblNewLabel_14.setBounds(526, 87, 28, 14);
																																																																																																																																																																			log_VET.add(lblNewLabel_14);
																																																																																																																																																																			
																																																																																																																																																																					textField_13 = new JTextField();
																																																																																																																																																																					textField_13.setBounds(413, 100, 141, 21);
																																																																																																																																																																					textField_13.setColumns(10);
																																																																																																																																																																					log_VET.add(textField_13);
																																																																																																																																																																					
																																																																																																																																																																							lblNewLabel_15 = new JLabel("N\u00FAmero");
																																																																																																																																																																							lblNewLabel_15.setBounds(508, 126, 58, 14);
																																																																																																																																																																							log_VET.add(lblNewLabel_15);
																																																																																																																																																																							
																																																																																																																																																																									textField_14 = new JTextField();
																																																																																																																																																																									textField_14.setBounds(413, 143, 141, 23);
																																																																																																																																																																									log_VET.add(textField_14);
																																																																																																																																																																									textField_14.setColumns(10);
																																																																																																																																																																									
																																																																																																																																																																											textField_15 = new JTextField();
																																																																																																																																																																											textField_15.setBounds(27, 60, 139, 20);
																																																																																																																																																																											textField_15.setColumns(10);
																																																																																																																																																																											log_VET.add(textField_15);
																																																																																																																																																																											
																																																																																																																																																																													textField_16 = new JTextField();
																																																																																																																																																																													textField_16.setBounds(27, 100, 139, 28);
																																																																																																																																																																													textField_16.setColumns(10);
																																																																																																																																																																													log_VET.add(textField_16);
																																																																																																																																																																													
																																																																																																																																																																															textField_17 = new JTextField();
																																																																																																																																																																															textField_17.setBounds(25, 141, 141, 25);
																																																																																																																																																																															textField_17.setColumns(10);
																																																																																																																																																																															log_VET.add(textField_17);
																																																																																																																																																																															
																																																																																																																																																																																	textField_18 = new JTextField();
																																																																																																																																																																																	textField_18.setBounds(198, 166, 141, 25);
																																																																																																																																																																																	log_VET.add(textField_18);
																																																																																																																																																																																	textField_18.setColumns(10);
																																																																																																																																																																																	
																																																																																																																																																																																			textField_19 = new JTextField();
																																																																																																																																																																																			textField_19.setBounds(198, 250, 141, 26);
																																																																																																																																																																																			textField_19.setColumns(10);
																																																																																																																																																																																			log_VET.add(textField_19);
																																																																																																																																																																																			
																																																																																																																																																																																					textField_20 = new JTextField();
																																																																																																																																																																																					textField_20.setBounds(198, 203, 141, 25);
																																																																																																																																																																																					textField_20.setColumns(10);
																																																																																																																																																																																					log_VET.add(textField_20);
																																																																																																																																																																																					
																																																																																																																																																																																							lblNewLabel_16 = new JLabel("Diploma");
																																																																																																																																																																																							lblNewLabel_16.setBounds(250, 152, 65, 14);
																																																																																																																																																																																							log_VET.add(lblNewLabel_16);
																																																																																																																																																																																							
																																																																																																																																																																																									lblNewLabel_17 = new JLabel("Especializa\u00E7\u00E3o");
																																																																																																																																																																																									lblNewLabel_17.setBounds(235, 189, 86, 14);
																																																																																																																																																																																									log_VET.add(lblNewLabel_17);
																																																																																																																																																																																									
																																																																																																																																																																																											lblNewLabel_18 = new JLabel("Experi\u00EAncia");
																																																																																																																																																																																											lblNewLabel_18.setBounds(240, 236, 123, 14);
																																																																																																																																																																																											log_VET.add(lblNewLabel_18);
																																																																																																																																																																																											
																																																																																																																																																																																											textField = new JTextField();
																																																																																																																																																																																											textField.setBounds(27, 24, 141, 14);
																																																																																																																																																																																											log_VET.add(textField);
																																																																																																																																																																																											textField.setColumns(10);
																																																																																																																											
																																																																																																																													log_pet = new JPanel();
																																																																																																																													log_pet.setBackground(UIManager.getColor("activeCaption"));
																																																																																																																													log_pet.setForeground(Color.RED);
																																																																																																																													log_pet.setBounds(0, 0, 564, 317);
																																																																																																																													
																																																																																																																													//layeredPane.add(log_pet);
																																																																																																																													log_pet.setLayout(null);
																																																																																																																													
																																																																																																																															JLabel lblNewLabel = new JLabel("CPF do dono");
																																																																																																																															lblNewLabel.setBounds(10, 63, 101, 14);
																																																																																																																															log_pet.add(lblNewLabel);
																																																																																																																															
																																																																																																																																	JLabel lblColeira = new JLabel("Coleira");
																																																																																																																																	lblColeira.setBounds(34, 95, 50, 14);
																																																																																																																																	log_pet.add(lblColeira);
																																																																																																																																	
																																																																																																																																			JLabel lblNewLabel_1 = new JLabel("Nome");
																																																																																																																																			lblNewLabel_1.setBounds(34, 137, 33, 14);
																																																																																																																																			log_pet.add(lblNewLabel_1);
																																																																																																																																			
																																																																																																																																					lblIdade = new JLabel("Idade");
																																																																																																																																					lblIdade.setBounds(34, 181, 68, 14);
																																																																																																																																					log_pet.add(lblIdade);
																																																																																																																																					
																																																																																																																																							lblPeso = new JLabel("Peso");
																																																																																																																																							lblPeso.setBounds(34, 231, 63, 14);
																																																																																																																																							log_pet.add(lblPeso);
																																																																																																																																							
																																																																																																																																									textField_col = new JTextField();
																																																																																																																																									textField_col.setColumns(10);
																																																																																																																																									textField_col.setBounds(115, 92, 297, 20);
																																																																																																																																									log_pet.add(textField_col);
																																																																																																																																									
																																																																																																																																											textField_idpet = new JTextField();
																																																																																																																																											textField_idpet.setColumns(10);
																																																																																																																																											textField_idpet.setBounds(115, 178, 297, 20);
																																																																																																																																											log_pet.add(textField_idpet);
																																																																																																																																											
																																																																																																																																													textField_nopet = new JTextField();
																																																																																																																																													textField_nopet.setColumns(10);
																																																																																																																																													textField_nopet.setBounds(115, 134, 297, 20);
																																																																																																																																													log_pet.add(textField_nopet);
																																																																																																																																													
																																																																																																																																															textField_peso = new JTextField();
																																																																																																																																															textField_peso.setBounds(115, 227, 297, 23);
																																																																																																																																															log_pet.add(textField_peso);
																																																																																																																																															textField_peso.setColumns(10);
																																																																																																																																															
																																																																																																																																																	btnNewButton_1 = new JButton("Cadastrar Pet");
																																																																																																																																																	btnNewButton_1.setForeground(new Color(255, 255, 128));
																																																																																																																																																	btnNewButton_1.setBackground(new Color(0, 64, 128));
																																																																																																																																																	btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
																																																																																																																																																	btnNewButton_1.addActionListener(new ActionListener() {
																																																																																																																																																		public void actionPerformed(ActionEvent e) {
																																																																																																																																																			PetDAO pDAO = new PetDAO();
																																																																																																																																																			Pet p = new Pet();

																																																																																																																																																			String CPF_D = comboBox_cpf_d.getSelectedItem().toString();
																																																																																																																																																			int coleira = Integer.valueOf(textField_col.getText());
																																																																																																																																																			String nome = textField_nopet.getText();
																																																																																																																																																			int idade = Integer.valueOf(textField_idpet.getText());
																																																																																																																																																			Double peso = Double.valueOf(textField_peso.getText());

																																																																																																																																																			if (pDAO.verifyCol(coleira) == false) {
																																																																																																																																																				p.setCodColeira(coleira);
																																																																																																																																																				p.setCPF(CPF_D);
																																																																																																																																																				p.setNome(nome);
																																																																																																																																																				p.setIdade(idade);
																																																																																																																																																				p.setPeso(peso);
																																																																																																																																																				pDAO.inserir(p);

																																																																																																																																																				JOptionPane.showMessageDialog(null, "Pet cadastrado!");
																																																																																																																																																			} else {
																																																																																																																																																				JOptionPane.showMessageDialog(null, "Pet já registrado!");
																																																																																																																																																			}
																																																																																																																																																			textField_31.setText("");
																																																																																																																																																		}
																																																																																																																																																	});
																																																																																																																																																	btnNewButton_1.setBounds(118, 283, 340, 23);
																																																																																																																																																	log_pet.add(btnNewButton_1);
																																																																																																																																																	
																																																																																																																																																			comboBox_cpf_d = new JComboBox(listacliente);
																																																																																																																																																			comboBox_cpf_d.setBounds(115, 59, 297, 22);
																																																																																																																																																			log_pet.add(comboBox_cpf_d);
																																																																																																																											
																																																																																																																													alt_cli = new JPanel();
																																																																																																																													alt_cli.setBackground(new Color(60, 179, 113));
																																																																																																																													alt_cli.setBounds(0, 0, 564, 317);
																																																																																																																													
																																																																																																																													//layeredPane.add(alt_cli);
																																																																																																																													alt_cli.setLayout(null);
																																																																																																																													
																																																																																																																															btnNewButton_10 = new JButton("Alterar Cliente");
																																																																																																																															btnNewButton_10.setForeground(new Color(0, 64, 128));
																																																																																																																															btnNewButton_10.setBackground(new Color(255, 255, 128));
																																																																																																																															btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
																																																																																																																															btnNewButton_10.addActionListener(new ActionListener() {
																																																																																																																																public void actionPerformed(ActionEvent e) {
																																																																																																																																	ClienteDAO cDAO = new ClienteDAO();
																																																																																																																																	Cliente c = new Cliente();

																																																																																																																																	String CPF = comboBox_3.getSelectedItem().toString();
																																																																																																																																	String nomeCliente = textField_nome.getText();
																																																																																																																																	Date data_nasc = Date.valueOf(textField_dataent.getText());
																																																																																																																																	Date data_entrada = Date.valueOf(textField_datanasc.getText());
																																																																																																																																	String email = textField_email.getText();

																																																																																																																																	c.setNome_cli(nomeCliente);
																																																																																																																																	c.setCPF(CPF);
																																																																																																																																	c.setData_entrada(data_entrada);
																																																																																																																																	c.setData_nasc(data_nasc);
																																																																																																																																	c.setEmail(email);

																																																																																																																																	cDAO.alterar(c);

																																																																																																																																	JOptionPane.showMessageDialog(null, "Cliente alterado!");

																																																																																																																																}
																																																																																																																															});
																																																																																																																															btnNewButton_10.setBounds(98, 283, 370, 23);
																																																																																																																															alt_cli.add(btnNewButton_10);
																																																																																																																															
																																																																																																																																	textField_nome = new JTextField();
																																																																																																																																	textField_nome.setColumns(10);
																																																																																																																																	textField_nome.setBounds(135, 63, 293, 20);
																																																																																																																																	alt_cli.add(textField_nome);
																																																																																																																																	
																																																																																																																																			lblNewLabel_2 = new JLabel("CPF");
																																																																																																																																			lblNewLabel_2.setBounds(77, 20, 51, 14);
																																																																																																																																			alt_cli.add(lblNewLabel_2);
																																																																																																																																			
																																																																																																																																					lblNewLabel_3 = new JLabel("Nome Completo");
																																																																																																																																					lblNewLabel_3.setBounds(26, 66, 121, 14);
																																																																																																																																					alt_cli.add(lblNewLabel_3);
																																																																																																																																					
																																																																																																																																							lblNewLabel_4 = new JLabel("Data de Entrada");
																																																																																																																																							lblNewLabel_4.setBounds(21, 108, 107, 14);
																																																																																																																																							alt_cli.add(lblNewLabel_4);
																																																																																																																																							
																																																																																																																																									lblNewLabel_5 = new JLabel("Data de Nascimento");
																																																																																																																																									lblNewLabel_5.setBounds(4, 158, 143, 14);
																																																																																																																																									alt_cli.add(lblNewLabel_5);
																																																																																																																																									
																																																																																																																																											lblNewLabel_6 = new JLabel("E-mail");
																																																																																																																																											lblNewLabel_6.setBounds(77, 210, 51, 20);
																																																																																																																																											alt_cli.add(lblNewLabel_6);
																																																																																																																																											
																																																																																																																																													textField_dataent = new JTextField();
																																																																																																																																													textField_dataent.setColumns(10);
																																																																																																																																													textField_dataent.setBounds(135, 105, 293, 20);
																																																																																																																																													alt_cli.add(textField_dataent);
																																																																																																																																													
																																																																																																																																															textField_email = new JTextField();
																																																																																																																																															textField_email.setColumns(10);
																																																																																																																																															textField_email.setBounds(135, 210, 293, 20);
																																																																																																																																															alt_cli.add(textField_email);
																																																																																																																																															
																																																																																																																																																	textField_datanasc = new JTextField();
																																																																																																																																																	textField_datanasc.setColumns(10);
																																																																																																																																																	textField_datanasc.setBounds(135, 155, 293, 20);
																																																																																																																																																	alt_cli.add(textField_datanasc);
																																																																																																																																																	
																																																																																																																																																			comboBox_3 = new JComboBox(listacliente);
																																																																																																																																																			comboBox_3.setBounds(135, 16, 293, 22);
																																																																																																																																																			alt_cli.add(comboBox_3);
																																																																																																																									
																																																																																																																											alt_pet = new JPanel();
																																																																																																																											alt_pet.setBackground(SystemColor.activeCaption);
																																																																																																																											alt_pet.setBounds(0, 0, 564, 317);
																																																																																																																											//layeredPane.add(alt_pet);
																																																																																																																											alt_pet.setLayout(null);
																																																																																																																											
																																																																																																																													comboBox_pet_col = new JComboBox(listapet);
																																																																																																																													comboBox_pet_col.setBounds(148, 52, 225, 27);
																																																																																																																													alt_pet.add(comboBox_pet_col);
																																																																																																																													
																																																																																																																															textField_newage = new JTextField();
																																																																																																																															textField_newage.setBounds(43, 152, 118, 27);
																																																																																																																															alt_pet.add(textField_newage);
																																																																																																																															textField_newage.setColumns(10);
																																																																																																																															
																																																																																																																																	textField_newpeso = new JTextField();
																																																																																																																																	textField_newpeso.setBounds(368, 145, 149, 34);
																																																																																																																																	alt_pet.add(textField_newpeso);
																																																																																																																																	textField_newpeso.setColumns(10);
																																																																																																																																	
																																																																																																																																			JLabel lblNewLabel_22 = new JLabel("Nova idade");
																																																																																																																																			lblNewLabel_22.setBounds(75, 127, 86, 14);
																																																																																																																																			alt_pet.add(lblNewLabel_22);
																																																																																																																																			
																																																																																																																																					JLabel lblNewLabel_22_1 = new JLabel("Novo peso");
																																																																																																																																					lblNewLabel_22_1.setBounds(425, 120, 67, 14);
																																																																																																																																					alt_pet.add(lblNewLabel_22_1);
																																																																																																																																					
																																																																																																																																							JButton btnNewButton_14 = new JButton("Alterar");
																																																																																																																																							btnNewButton_14.setForeground(new Color(255, 255, 128));
																																																																																																																																							btnNewButton_14.setBackground(new Color(0, 64, 128));
																																																																																																																																							btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
																																																																																																																																							btnNewButton_14.addActionListener(new ActionListener() {
																																																																																																																																								public void actionPerformed(ActionEvent e) {
																																																																																																																																									PetDAO pDAO = new PetDAO();
																																																																																																																																									Pet p = new Pet();

																																																																																																																																									int coleira = Integer.parseInt(comboBox_pet_col.getSelectedItem().toString());
																																																																																																																																									int idade = Integer.valueOf(textField_newage.getText());
																																																																																																																																									Double peso = Double.valueOf(textField_newpeso.getText());

																																																																																																																																									p.setCodColeira(coleira);
																																																																																																																																									p.setIdade(idade);
																																																																																																																																									p.setPeso(peso);
																																																																																																																																									pDAO.alter(p);

																																																																																																																																									JOptionPane.showMessageDialog(null, "Pet alterado!");
																																																																																																																																								}
																																																																																																																																							});
																																																																																																																																							btnNewButton_14.setBounds(208, 266, 118, 40);
																																																																																																																																							alt_pet.add(btnNewButton_14);
																																																																																																																																							
																																																																																																																																							JLabel lblNewLabel_49 = new JLabel("C\u00F3digo");
																																																																																																																																							lblNewLabel_49.setBounds(232, 27, 76, 14);
																																																																																																																																							alt_pet.add(lblNewLabel_49);
																																																																																																																			
																																																																																																																					log_cli = new JPanel();
																																																																																																																					log_cli.setLayout(null);
																																																																																																																					log_cli.setForeground(Color.RED);
																																																																																																																					log_cli.setBackground(SystemColor.textHighlight);
																																																																																																																					log_cli.setBounds(0, 0, 564, 317);
																																																																																																																					//layeredPane.add(log_cli);
																																																																																																																					
																																																																																																																							btnNewButton_6 = new JButton("Cadastrar Cliente");
																																																																																																																							btnNewButton_6.setBackground(new Color(255, 255, 128));
																																																																																																																							btnNewButton_6.setForeground(new Color(0, 64, 128));
																																																																																																																							btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
																																																																																																																							btnNewButton_6.addActionListener(new ActionListener() {
																																																																																																																								public void actionPerformed(ActionEvent e) {
																																																																																																																									ClienteDAO cDAO = new ClienteDAO();
																																																																																																																									Cliente c = new Cliente();

																																																																																																																									String CPF = textField_31.getText();
																																																																																																																									String nomeCliente = textFieldC_Nome.getText();
																																																																																																																									Date data_nasc = Date.valueOf(textField_33.getText());
																																																																																																																									Date data_entrada = Date.valueOf(textField_34.getText());
																																																																																																																									String email = textField_28.getText();
																																																																																																																									
																																																																																																																									 
																																																																																																																										
																																																																																																																															if (cDAO.verifycpf(CPF) == false) {
																																																																																																																										c.setNome_cli(nomeCliente);
																																																																																																																										c.setCPF(CPF);
																																																																																																																										c.setData_entrada(data_entrada);
																																																																																																																										c.setData_nasc(data_nasc);
																																																																																																																										c.setEmail(email);
																																																																																																																										cDAO.inserir(c);
																																																																																																																										JOptionPane.showMessageDialog(null, "Cliente registrado!");
																																																																																																																															} else {
																																																																																																																																JOptionPane.showMessageDialog(null, "Cliente ja registrado!");
																																																																																																																															}
																																																																																																																															textField_31.setText("");
																																																																																																																								}
																																																																																																																							});
																																																																																																																							btnNewButton_6.setBounds(94, 283, 370, 23);
																																																																																																																							log_cli.add(btnNewButton_6);
																																																																																																																							
																																																																																																																									textField_28 = new JTextField();
																																																																																																																									textField_28.setColumns(10);
																																																																																																																									textField_28.setBounds(123, 241, 293, 20);
																																																																																																																									log_cli.add(textField_28);
																																																																																																																									
																																																																																																																											lblNewLabel_24 = new JLabel("CPF");
																																																																																																																											lblNewLabel_24.setBounds(78, 37, 79, 14);
																																																																																																																											log_cli.add(lblNewLabel_24);
																																																																																																																											
																																																																																																																													lblNewLabel_25 = new JLabel("Nome Completo");
																																																																																																																													lblNewLabel_25.setBounds(22, 82, 113, 14);
																																																																																																																													log_cli.add(lblNewLabel_25);
																																																																																																																													
																																																																																																																															lblNewLabel_26 = new JLabel("Data de Entrada");
																																																																																																																															lblNewLabel_26.setBounds(22, 178, 113, 14);
																																																																																																																															log_cli.add(lblNewLabel_26);
																																																																																																																															
																																																																																																																																	lblNewLabel_27 = new JLabel("Data de Nascimento");
																																																																																																																																	lblNewLabel_27.setBounds(5, 128, 136, 14);
																																																																																																																																	log_cli.add(lblNewLabel_27);
																																																																																																																																	
																																																																																																																																			lblNewLabel_28 = new JLabel("E-mail");
																																																																																																																																			lblNewLabel_28.setBounds(73, 244, 40, 14);
																																																																																																																																			log_cli.add(lblNewLabel_28);
																																																																																																																																			
																																																																																																																																					textField_31 = new JTextField();
																																																																																																																																					textField_31.setColumns(10);
																																																																																																																																					textField_31.setBounds(123, 34, 293, 20);
																																																																																																																																					log_cli.add(textField_31);
																																																																																																																																					
																																																																																																																																							textFieldC_Nome = new JTextField();
																																																																																																																																							textFieldC_Nome.setColumns(10);
																																																																																																																																							textFieldC_Nome.setBounds(123, 79, 293, 20);
																																																																																																																																							log_cli.add(textFieldC_Nome);
																																																																																																																																							
																																																																																																																																									textField_33 = new JTextField();
																																																																																																																																									textField_33.setColumns(10);
																																																																																																																																									textField_33.setBounds(123, 125, 293, 20);
																																																																																																																																									log_cli.add(textField_33);
																																																																																																																																									
																																																																																																																																											textField_34 = new JTextField();
																																																																																																																																											textField_34.setColumns(10);
																																																																																																																																											textField_34.setBounds(123, 175, 293, 20);
																																																																																																																																											log_cli.add(textField_34);
																																																																																											
																																																																																													exc_vet = new JPanel();
																																																																																													exc_vet.setBackground(new Color(255, 255, 0));
																																																																																													exc_vet.setBounds(0, 0, 564, 317);
																																																																																													//layeredPane.add(exc_vet);
																																																																																													exc_vet.setLayout(null);
																																																																																													
																																																																																															btnNewButton = new JButton("Excluir Veterin\u00E1rio ");
																																																																																															btnNewButton.setBackground(new Color(255, 255, 128));
																																																																																															btnNewButton.setForeground(new Color(0, 0, 255));
																																																																																															btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
																																																																																															btnNewButton.addActionListener(new ActionListener() {
																																																																																																public void actionPerformed(ActionEvent e) {
																																																																																																	VeterinarioDAO vDAO = new VeterinarioDAO();
																																																																																																	Veterinario v = new Veterinario();

																																																																																																	String CRMV = comboBox_2.getSelectedItem().toString();
																																																																																																	v.setCRMV(CRMV);
																																																																																																	System.out.println("excluir " + "veterin�rio de CRMV: " + CRMV);
																																																																																																	vDAO.remover(v);
																																																																																																	JOptionPane.showMessageDialog(null, "Veterin�rio removido!");
																																																																																																}
																																																																																															});
																																																																																															btnNewButton.setBounds(179, 258, 221, 48);
																																																																																															exc_vet.add(btnNewButton);
																																																																																															
																																																																																																	comboBox_2 = new JComboBox(listavet);
																																																																																																	comboBox_2.setBounds(113, 132, 349, 48);
																																																																																																	exc_vet.add(comboBox_2);
																																																																																																	
																																																																																																	lblNewLabel_51 = new JLabel("CRMV");
																																																																																																	lblNewLabel_51.setFont(new Font("Tahoma", Font.PLAIN, 17));
																																																																																																	lblNewLabel_51.setBounds(250, 100, 93, 31);
																																																																																																	exc_vet.add(lblNewLabel_51);
																																																																																									
																																																																																											vis_pet = new JPanel();
																																																																																											vis_pet.setBackground(SystemColor.activeCaption);
																																																																																											vis_pet.setBounds(0, 0,  564, 317);
																																																																																											//layeredPane.add(vis_pet);
																																																																																											vis_pet.setLayout(null);
																																																																																											
																																																																																													scrollPane_1 = new JScrollPane();
																																																																																													scrollPane_1.setBounds(10, 45, 544, 191);
																																																																																													vis_pet.add(scrollPane_1);
																																																																																													
																																																																																															table_petdata = new JTable();
																																																																																															table_petdata.setModel(new DefaultTableModel(
																																																																																																new Object[][] {
																																																																																																},
																																																																																																new String[] {
																																																																																																	"Dono", "Coleira", "Nome", "Idade", "Peso"
																																																																																																}
																																																																																															) {
																																																																																																Class[] columnTypes = new Class[] {
																																																																																																	String.class, Integer.class, String.class, Integer.class, Double.class
																																																																																																};
																																																																																																public Class getColumnClass(int columnIndex) {
																																																																																																	return columnTypes[columnIndex];
																																																																																																}
																																																																																															});
																																																																																															scrollPane_1.setViewportView(table_petdata);
																																																																																															
																																																																																															JButton btnNewButton_15 = new JButton("Ver Pets");
																																																																																															btnNewButton_15.setForeground(new Color(255, 255, 128));
																																																																																															btnNewButton_15.setBackground(new Color(0, 64, 128));
																																																																																															btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 25));
																																																																																															btnNewButton_15.addActionListener(new ActionListener() {
																																																																																																public void actionPerformed(ActionEvent e) {
																																																																																																	PetDAO pDAO = new PetDAO();
																																																																																																	ArrayList<Pet> pets = new ArrayList<>();

																																																																																																	
																																																																																																	
																																																																																																	pets = pDAO.getPets();
																																																																																																	DefaultTableModel model = (DefaultTableModel) table_petdata.getModel();
																																																																																																	model.setRowCount(0);

																																																																																																	for (int i = 0; i < pets.size(); i++) {
																																																																																																		Pet p = pets.get(i);
																																																																																																		model.addRow(new Object[] { p.getCPF(), p.getCodColeira(), p.getNome(), p.getIdade(), p.getPeso() });
																																																																																																}
																																																																																																}
																																																																																															});
																																																																																															btnNewButton_15.setBounds(186, 260, 182, 46);
																																																																																															vis_pet.add(btnNewButton_15);
																																																																																							
																																																																																									exc_cli = new JPanel();
																																																																																									exc_cli.setBackground(new Color(60, 179, 113));
																																																																																									exc_cli.setBounds(0, 0, 564, 317);
																																																																																									//layeredPane.add(exc_cli);
																																																																																									exc_cli.setLayout(null);
																																																																																									
																																																																																											btnNewButton_11 = new JButton("Exluir Cliente");
																																																																																											btnNewButton_11.setForeground(new Color(0, 64, 128));
																																																																																											btnNewButton_11.setBackground(new Color(255, 255, 128));
																																																																																											btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 26));
																																																																																											btnNewButton_11.addActionListener(new ActionListener() {
																																																																																												public void actionPerformed(ActionEvent e) {
																																																																																													ClienteDAO cDAO = new ClienteDAO();
																																																																																													Cliente c = new Cliente();

																																																																																													String CPF = comboBox_4.getSelectedItem().toString();
																																																																																													c.setCPF(CPF);
																																																																																													System.out.println("excluir" + c);
																																																																																													cDAO.remover(c);
																																																																																													JOptionPane.showMessageDialog(null, "Cliente removido!");
																																																																																												}
																																																																																											});
																																																																																											btnNewButton_11.setBounds(93, 246, 394, 60);
																																																																																											exc_cli.add(btnNewButton_11);
																																																																																											
																																																																																													comboBox_4 = new JComboBox(listacliente);
																																																																																													comboBox_4.setBounds(93, 119, 394, 44);
																																																																																													exc_cli.add(comboBox_4);
																																																																																													
																																																																																													lblNewLabel_52 = new JLabel("CPF");
																																																																																													lblNewLabel_52.setFont(new Font("Tahoma", Font.PLAIN, 21));
																																																																																													lblNewLabel_52.setBounds(263, 82, 46, 26);
																																																																																													exc_cli.add(lblNewLabel_52);
																																																																																					
																																																																																							vis_cli = new JPanel();
																																																																																							vis_cli.setBackground(new Color(60, 179, 113));
																																																																																							vis_cli.setBounds(0, 0, 564, 317);
																																																																																							//layeredPane.add(vis_cli);
																																																																																							vis_cli.setLayout(null);
																																																																																							
																																																																																									btnNewButton_12 = new JButton("Ver clientes");
																																																																																									btnNewButton_12.setForeground(new Color(255, 255, 128));
																																																																																									btnNewButton_12.setBackground(new Color(0, 64, 128));
																																																																																									btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 27));
																																																																																									btnNewButton_12.addActionListener(new ActionListener() {
																																																																																										public void actionPerformed(ActionEvent e) {
																																																																																											ClienteDAO cDAO = new ClienteDAO();
																																																																																											ArrayList<Cliente> clientes = new ArrayList<>();

																																																																																											clientes = cDAO.getClientes();
																																																																																											DefaultTableModel model = (DefaultTableModel) tabela_clidata.getModel();
																																																																																											model.setRowCount(0);

																																																																																											for (int i = 0; i < clientes.size(); i++) {
																																																																																												Cliente c = clientes.get(i);
																																																																																												model.addRow(new Object[] { c.getNome_cli(), c.getCPF(), c.getData_nasc(), c.getData_entrada(),
																																																																																														c.getEmail() });
																																																																																											}
																																																																																										}
																																																																																									});
																																																																																									btnNewButton_12.setBounds(135, 34, 272, 46);
																																																																																									vis_cli.add(btnNewButton_12);
																																																																																									
																																																																																											JScrollPane scrollPane = new JScrollPane();
																																																																																											scrollPane.setBounds(10, 91, 544, 215);
																																																																																											vis_cli.add(scrollPane);
																																																																																											
																																																																																													tabela_clidata = new JTable();
																																																																																													tabela_clidata.setModel(new DefaultTableModel(new Object[][] {},
																																																																																															new String[] { "Nome", "CPF", "Nascimento", "Entrada", "E-mail" }) {
																																																																																														Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class };

																																																																																														public Class getColumnClass(int columnIndex) {
																																																																																															return columnTypes[columnIndex];
																																																																																														}
																																																																																													});
																																																																																													scrollPane.setViewportView(tabela_clidata);
																																																																																			
																																																																																					vis_vet = new JPanel();
																																																																																					vis_vet.setBackground(new Color(255, 255, 0));
																																																																																					vis_vet.setBounds(0, 0, 564, 317);
																																																																																					//layeredPane.add(vis_vet);
																																																																																					vis_vet.setLayout(null);
																																																																																					
																																																																																					scrollPane_2 = new JScrollPane();
																																																																																					scrollPane_2.setBounds(10, 11, 544, 243);
																																																																																					vis_vet.add(scrollPane_2);
																																																																																					
																																																																																							table_vet = new JTable();
																																																																																							table_vet.setModel(new DefaultTableModel(
																																																																																								new Object[][] {
																																																																																								},
																																																																																								new String[] {
																																																																																									"CRMV", "Nome", "Idade", "E-mail", "Logradouro", "Bairro", "CEP", "N\u00FAmero", "Especializa\u00E7\u00E3o", "Diploma", "Experi\u00EAncia"
																																																																																								}
																																																																																							) {
																																																																																								Class[] columnTypes = new Class[] {
																																																																																									String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class
																																																																																								};
																																																																																								public Class getColumnClass(int columnIndex) {
																																																																																									return columnTypes[columnIndex];
																																																																																								}
																																																																																							});
																																																																																							scrollPane_2.setViewportView(table_vet);
																																																																																							
																																																																																							JButton btnNewButton_20 = new JButton("Visualizar Veterin\u00E1rios");
																																																																																							btnNewButton_20.setForeground(new Color(255, 255, 128));
																																																																																							btnNewButton_20.setBackground(new Color(0, 64, 128));
																																																																																							btnNewButton_20.setFont(new Font("Tahoma", Font.PLAIN, 18));
																																																																																							btnNewButton_20.addActionListener(new ActionListener() {
																																																																																								public void actionPerformed(ActionEvent e) {
																																																																																									VeterinarioDAO vDAO = new VeterinarioDAO();
																																																																																									ArrayList<Veterinario> vets = new ArrayList<>();

																																																																																									vets = vDAO.getVets();
																																																																																									DefaultTableModel model = (DefaultTableModel) table_vet.getModel();
																																																																																									model.setRowCount(0);

																																																																																									for (int i = 0; i < vets.size(); i++) {
																																																																																										Veterinario v = vets.get(i);
																																																																																										model.addRow(new Object[] { v.getCRMV(), v.getNome_vet(), v.getIdade_vet(), v.getEmail(), v.getLogradouro(),
																																																																																												v.getBairro(), v.getCEP(), v.getNumero(), v.getEspecializacao(), v.getDiploma(), v.getExperiencia()});
																																																																																								}
																																																																																								
																																																																																								}
																																																																																							});
																																																																																							btnNewButton_20.setBounds(180, 265, 208, 42);
																																																																																							vis_vet.add(btnNewButton_20);
																																																																																	
																																																																																			exc_pet = new JPanel();
																																																																																			exc_pet.setBackground(SystemColor.activeCaption);
																																																																																			exc_pet.setBounds(0, 0, 564, 317);
																																																																																			//layeredPane.add(exc_pet);
																																																																																			exc_pet.setLayout(null);
																																																																																			
																																																																																					JComboBox comboBox_8 = new JComboBox(listapet);
																																																																																					comboBox_8.setToolTipText("");
																																																																																					comboBox_8.setBounds(122, 154, 323, 59);
																																																																																					exc_pet.add(comboBox_8);
																																																																																					
																																																																																							JButton btnNewButton_17 = new JButton("Excluir Pet");
																																																																																							btnNewButton_17.setFont(new Font("Tahoma", Font.PLAIN, 26));
																																																																																							btnNewButton_17.setBackground(new Color(255, 255, 128));
																																																																																							btnNewButton_17.setForeground(new Color(0, 64, 128));
																																																																																							btnNewButton_17.addActionListener(new ActionListener() {
																																																																																								public void actionPerformed(ActionEvent e) {
																																																																																									PetDAO pDAO = new PetDAO();
																																																																																									Pet p = new Pet();

																																																																																									Integer coleira = Integer.parseInt(comboBox_8.getSelectedItem().toString());
																																																																																									p.setCodColeira(coleira);
																																																																																									System.out.println("excluir " + "de coleira " + coleira + ": " + p);
																																																																																									pDAO.remover(p);
																																																																																									JOptionPane.showMessageDialog(null, "Pet removido!");
																																																																																								}
																																																																																							});
																																																																																							btnNewButton_17.setBounds(190, 253, 183, 53);
																																																																																							exc_pet.add(btnNewButton_17);
																																																																																							
																																																																																							lblNewLabel_53 = new JLabel("C\u00F3digo");
																																																																																							lblNewLabel_53.setFont(new Font("Tahoma", Font.PLAIN, 20));
																																																																																							lblNewLabel_53.setBounds(246, 113, 94, 30);
																																																																																							exc_pet.add(lblNewLabel_53);
																																																																																	
																																																																																	Pets = new JPanel();
																																																																																	Pets.setBackground(SystemColor.activeCaption);
																																																																																	Pets.setBounds(0, 0, 564, 317);
																																																																																	//layeredPane.add(Pets);
																																																																																	Pets.setLayout(null);
																																																																																	
																																																																																	scrollPane_10 = new JScrollPane();
																																																																																	scrollPane_10.setBounds(10, 11, 355, 233);
																																																																																	Pets.add(scrollPane_10);
																																																																																	
																																																																																	table_4 = new JTable();
																																																																																	scrollPane_10.setViewportView(table_4);
																																																																																	table_4.setModel(new DefaultTableModel(
																																																																																		new Object[][] {
																																																																																		},
																																																																																		new String[] {
																																																																																			"Dono", "C\u00F3digo", "Pet", "Vacina", "Data"
																																																																																		}
																																																																																	) {
																																																																																		Class[] columnTypes = new Class[] {
																																																																																			String.class, Integer.class, String.class, String.class, String.class
																																																																																		};
																																																																																		public Class getColumnClass(int columnIndex) {
																																																																																			return columnTypes[columnIndex];
																																																																																		}
																																																																																	});
																																																																																	
																																																																																	scrollPane_9 = new JScrollPane();
																																																																																	scrollPane_9.setBounds(375, 11, 179, 39);
																																																																																	Pets.add(scrollPane_9);
																																																																																	
																																																																																	table_7 = new JTable();
																																																																																	scrollPane_9.setViewportView(table_7);
																																																																																	table_7.setModel(new DefaultTableModel(
																																																																																		new Object[][] {
																																																																																		},
																																																																																		new String[] {
																																																																																			"Pets vacinados"
																																																																																		}
																																																																																	) {
																																																																																		Class[] columnTypes = new Class[] {
																																																																																			String.class
																																																																																		};
																																																																																		public Class getColumnClass(int columnIndex) {
																																																																																			return columnTypes[columnIndex];
																																																																																		}
																																																																																	});
																																																																																	
																																																																																	btnNewButton_25 = new JButton("Visualizar");
																																																																																	btnNewButton_25.setForeground(new Color(0, 64, 128));
																																																																																	btnNewButton_25.setBackground(new Color(255, 255, 128));
																																																																																	btnNewButton_25.setFont(new Font("Tahoma", Font.PLAIN, 25));
																																																																																	btnNewButton_25.addActionListener(new ActionListener() {
																																																																																		public void actionPerformed(ActionEvent e) {
																																																																																			VacinaDAO vcDAO = new VacinaDAO();
																																																																																			ClienteDAO cDAO = new ClienteDAO();
																																																																																			PetDAO pDAO = new PetDAO();
																																																																																			ArrayList<Vacinas> vacinas = new ArrayList<>();
																																																																																			ArrayList<Cliente> clientes = new ArrayList<>();
																																																																																			ArrayList<Pet> pets = new ArrayList<>();

																																																																																			int codigo = Integer.parseInt(comboBox_colpets.getSelectedItem().toString());
																																																																																			
																																																																																			vacinas = vcDAO.getVerVaccine();
																																																																																			clientes = cDAO.getVerVaccine();
																																																																																			pets = pDAO.getVerVaccine(codigo);
																																																																																			
																																																																																			
																																																																																			
																																																																																			DefaultTableModel model = (DefaultTableModel) table_4.getModel();
																																																																																			model.setRowCount(0);
																																																																																			
																																																																																			for (int i = 0; i < pets.size(); i++) {
																																																																																				Pet p = pets.get(i);
																																																																																				Cliente c = clientes.get(i);
																																																																																				Vacinas vc = vacinas.get(i);
																																																																																				
																																																																																				model.addRow(new Object[] {c.getNome_cli(), p.getCodColeira(), p.getNome(), vc.getNomevac(),
																																																																																					 vc.getData() });
																																																																																				
																																																																																			}
																																																																																			
																																																																																			pets = pDAO.getCounter();
																																																																																			
																																																																																			DefaultTableModel model2 = (DefaultTableModel) table_7.getModel();
																																																																																			model2.setRowCount(0);
																																																																																			
																																																																																			for (int i = 0; i < pets.size(); i++) {
																																																																																				Pet p = pets.get(i);
																																																																																			
																																																																																				
																																																																																				model2.addRow(new Object[] {p.getCodColeira()});
																																																																																				
																																																																																			}
																																																																																			
																																																																																		}

																																																																																		private int parseInt(
																																																																																				String text) {
																																																																																			// TODO Auto-generated method stub
																																																																																			return 0;
																																																																																		}
																																																																																	});
																																																																																	btnNewButton_25.setBounds(375, 54, 179, 221);
																																																																																	Pets.add(btnNewButton_25);
																																																																																	
																																																																																	lblNewLabel_46 = new JLabel("Cada pet e suas individuais vacinas tomadas por ele com seu dono");
																																																																																	lblNewLabel_46.setForeground(new Color(0, 0, 0));
																																																																																	lblNewLabel_46.setFont(new Font("Tahoma", Font.PLAIN, 17));
																																																																																	lblNewLabel_46.setHorizontalAlignment(SwingConstants.CENTER);
																																																																																	lblNewLabel_46.setBounds(10, 286, 544, 20);
																																																																																	Pets.add(lblNewLabel_46);
																																																																																	
																																																																																	comboBox_colpets = new JComboBox(listapet);
																																																																																	comboBox_colpets.setBounds(144, 253, 86, 22);
																																																																																	Pets.add(comboBox_colpets);
																																																																																									
																																																																																											alt_consulta = new JPanel();
																																																																																											alt_consulta.setLayout(null);
																																																																																											alt_consulta.setBackground(new Color(128, 128, 255));
																																																																																											alt_consulta.setBounds(0, 0, 564, 317);
																																																																																											//layeredPane.add(alt_consulta);
																																																																																											
																																																																																													btnNewButton_18 = new JButton("Alterar");
																																																																																													btnNewButton_18.setForeground(new Color(0, 64, 128));
																																																																																													btnNewButton_18.setBackground(new Color(255, 255, 128));
																																																																																													btnNewButton_18.setFont(new Font("Tahoma", Font.PLAIN, 27));
																																																																																													btnNewButton_18.addActionListener(new ActionListener() {
																																																																																														public void actionPerformed(ActionEvent e) {
																																																																																															ConsultaDAO cnDAO = new ConsultaDAO();
																																																																																															Consulta cn = new Consulta();
																																																																																															

																																																																																															String CRMV = comboBox_11.getSelectedItem().toString();
																																																																																															int coleira = Integer.parseInt(comboBox_13.getSelectedItem().toString());
																																																																																															String CPF = comboBox_12.getSelectedItem().toString();
																																																																																															Date data = Date.valueOf(textField_35.getText());
																																																																																															Time hora = Time.valueOf(textField_30.getText());
																																																																																															
																																																																																															
																																																																																															if (cnDAO.verifyUpdate(CRMV, coleira, CPF) == false) {
																																																																																																if (cnDAO.verifyDateTime(data, hora) == false) {
																																																																																															cn.setData(data);
																																																																																															cn.setHora(hora);
																																																																																															cn.setCRMV(CRMV);
																																																																																															cn.setCodColeira(coleira);
																																																																																															cn.setCPF(CPF);
																																																																																															cnDAO.alterar(cn);
																																																																																															

																																																																																															JOptionPane.showMessageDialog(null, "Consulta remarcada!");
																																																																																														} else {
																																																																																															JOptionPane.showMessageDialog(null, "Escolha outra data/hor�rio!");
																																																																																														}
																																																																																															System.out
																																																																																															.println(cn);
																																																																																														} else {
																																																																																															JOptionPane.showMessageDialog(null, "Consulta inexistente!");
																																																																																														}
																																																																																														}
																																																																																													});
																																																																																													btnNewButton_18.setBounds(199, 269, 169, 37);
																																																																																													alt_consulta.add(btnNewButton_18);
																																																																																													
																																																																																															textField_30 = new JTextField();
																																																																																															textField_30.setColumns(10);
																																																																																															textField_30.setBounds(52, 196, 118, 28);
																																																																																															alt_consulta.add(textField_30);
																																																																																															
																																																																																																	textField_35 = new JTextField();
																																																																																																	textField_35.setColumns(10);
																																																																																																	textField_35.setBounds(386, 196, 118, 28);
																																																																																																	alt_consulta.add(textField_35);
																																																																																																	
																																																																																																			comboBox_12 = new JComboBox(listacliente);
																																																																																																			comboBox_12.setBounds(199, 32, 142, 37);
																																																																																																			alt_consulta.add(comboBox_12);
																																																																																																			
																																																																																																					lblNewLabel_30 = new JLabel("Hor\u00E1rio");
																																																																																																					lblNewLabel_30.setBounds(52, 171, 46, 14);
																																																																																																					alt_consulta.add(lblNewLabel_30);
																																																																																																					
																																																																																																							lblNewLabel_31 = new JLabel("Data");
																																																																																																							lblNewLabel_31.setBounds(481, 171, 46, 14);
																																																																																																							alt_consulta.add(lblNewLabel_31);
																																																																																																							
																																																																																																									comboBox_11 = new JComboBox(listavet);
																																																																																																									comboBox_11.setBounds(10, 32, 142, 37);
																																																																																																									alt_consulta.add(comboBox_11);
																																																																																																									
																																																																																																											comboBox_13 = new JComboBox(listapet);
																																																																																																											comboBox_13.setBounds(414, 35, 140, 37);
																																																																																																											alt_consulta.add(comboBox_13);
																																																																																																											
																																																																																																											JLabel lblNewLabel_37 = new JLabel("CRMV");
																																																																																																											lblNewLabel_37.setBounds(10, 11, 57, 14);
																																																																																																											alt_consulta.add(lblNewLabel_37);
																																																																																																											
																																																																																																											JLabel lblNewLabel_37_1 = new JLabel("Pet");
																																																																																																											lblNewLabel_37_1.setBounds(508, 10, 46, 14);
																																																																																																											alt_consulta.add(lblNewLabel_37_1);
																																																																																																											
																																																																																																											JLabel lblNewLabel_37_1_1 = new JLabel("CPF");
																																																																																																											lblNewLabel_37_1_1.setBounds(209, 11, 54, 14);
																																																																																																											alt_consulta.add(lblNewLabel_37_1_1);
																																																																																							
																																																																																									log_consulta = new JPanel();
																																																																																									log_consulta.setBackground(new Color(128, 128, 255));
																																																																																									log_consulta.setBounds(0, 0, 564, 317);
																																																																																									//layeredPane.add(log_consulta);
																																																																																									log_consulta.setLayout(null);
																																																																																									
																																																																																											JButton btnNewButton_4 = new JButton("Marcar");
																																																																																											btnNewButton_4.setForeground(new Color(0, 64, 128));
																																																																																											btnNewButton_4.setBackground(new Color(255, 255, 128));
																																																																																											btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 27));
																																																																																											btnNewButton_4.addActionListener(new ActionListener() {
																																																																																												public void actionPerformed(ActionEvent e) {
																																																																																													ConsultaDAO cnDAO = new ConsultaDAO();
																																																																																													Consulta cn = new Consulta();

																																																																																													String CRMV = comboBox_9.getSelectedItem().toString();
																																																																																													int coleira = Integer.parseInt(comboBox.getSelectedItem().toString());
																																																																																													String CPF = comboBox_10.getSelectedItem().toString();
																																																																																													Date data = Date.valueOf(textField_22.getText());
																																																																																													Time hora = Time.valueOf(textField_21.getText());
																																																																																													
																																																																																													if (cnDAO.verifyDateTime(data, hora) == false) {
																																																																																													if (cnDAO.verifyWhole(data, hora, CRMV, coleira, CPF) == false) {
																																																																																															cn.setCRMV(CRMV);
																																																																																															cn.setCodColeira(coleira);
																																																																																															cn.setCPF(CPF);
																																																																																															cn.setData(data);
																																																																																															cn.setHora(hora);
																																																																																															cnDAO.marcar(cn);
																																																																																														}
																																																																																														JOptionPane.showMessageDialog(null, "Consultada marcada!");
																																																																																													} else {
																																																																																														JOptionPane.showMessageDialog(null, "Consulta j� marcada!");
																																																																																													}
																																																																																													textField_31.setText("");
																																																																																													System.out
																																																																																															.println(cn);
																																																																																												}
																																																																																												
																																																																																											});
																																																																																											btnNewButton_4.setBounds(199, 267, 169, 39);
																																																																																											log_consulta.add(btnNewButton_4);
																																																																																											
																																																																																													comboBox = new JComboBox(listapet);
																																																																																													comboBox.setBounds(10, 53, 139, 39);
																																																																																													log_consulta.add(comboBox);
																																																																																													
																																																																																															textField_21 = new JTextField();
																																																																																															textField_21.setBounds(93, 195, 105, 24);
																																																																																															log_consulta.add(textField_21);
																																																																																															textField_21.setColumns(10);
																																																																																															
																																																																																																	textField_22 = new JTextField();
																																																																																																	textField_22.setColumns(10);
																																																																																																	textField_22.setBounds(360, 191, 105, 28);
																																																																																																	log_consulta.add(textField_22);
																																																																																																	
																																																																																																			comboBox_9 = new JComboBox(listavet);
																																																																																																			comboBox_9.setBounds(209, 53, 139, 39);
																																																																																																			log_consulta.add(comboBox_9);
																																																																																																			
																																																																																																					comboBox_10 = new JComboBox(listacliente);
																																																																																																					comboBox_10.setBounds(415, 53, 139, 39);
																																																																																																					log_consulta.add(comboBox_10);
																																																																																																					
																																																																																																							lblNewLabel_23 = new JLabel("Hor\u00E1rio");
																																																																																																							lblNewLabel_23.setBounds(93, 170, 46, 14);
																																																																																																							log_consulta.add(lblNewLabel_23);
																																																																																																							
																																																																																																									lblNewLabel_29 = new JLabel("Data");
																																																																																																									lblNewLabel_29.setBounds(442, 166, 46, 14);
																																																																																																									log_consulta.add(lblNewLabel_29);
																																																																																																									
																																																																																																									JLabel lblNewLabel_34 = new JLabel("CRMV");
																																																																																																									lblNewLabel_34.setBounds(209, 28, 46, 14);
																																																																																																									log_consulta.add(lblNewLabel_34);
																																																																																																									
																																																																																																									JLabel lblNewLabel_35 = new JLabel("Pet");
																																																																																																									lblNewLabel_35.setBounds(10, 28, 23, 14);
																																																																																																									log_consulta.add(lblNewLabel_35);
																																																																																																									
																																																																																																									JLabel lblNewLabel_36 = new JLabel("Cliente");
																																																																																																									lblNewLabel_36.setBounds(415, 28, 50, 14);
																																																																																																									log_consulta.add(lblNewLabel_36);
																																																																																			
																																																																																					exc_consulta = new JPanel();
																																																																																					exc_consulta.setBackground(new Color(128, 128, 255));
																																																																																					exc_consulta.setBounds(0, 0, 564, 317);
																																																																																					layeredPane.add(exc_consulta);
																																																																																					exc_consulta.setLayout(null);
																																																																																					
																																																																																							comboBox_14 = new JComboBox(listavet);
																																																																																							comboBox_14.setBounds(10, 52, 162, 39);
																																																																																							exc_consulta.add(comboBox_14);
																																																																																							
																																																																																									comboBox_15 = new JComboBox(listapet);
																																																																																									comboBox_15.setBounds(200, 52, 162, 39);
																																																																																									exc_consulta.add(comboBox_15);
																																																																																									
																																																																																											comboBox_16 = new JComboBox(listacliente);
																																																																																											comboBox_16.setBounds(392, 52, 162, 39);
																																																																																											exc_consulta.add(comboBox_16);
																																																																																											
																																																																																													btnNewButton_3 = new JButton("Excluir");
																																																																																													btnNewButton_3.setBackground(new Color(255, 255, 128));
																																																																																													btnNewButton_3.setForeground(new Color(0, 64, 128));
																																																																																													btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 27));
																																																																																													btnNewButton_3.addActionListener(new ActionListener() {
																																																																																														public void actionPerformed(ActionEvent e) {
																																																																																															ConsultaDAO cnDAO = new ConsultaDAO();
																																																																																															Consulta cn = new Consulta();

																																																																																															String CRMV = comboBox_14.getSelectedItem().toString();
																																																																																															int coleira = Integer.parseInt(comboBox_15.getSelectedItem().toString());
																																																																																															String CPF = comboBox_16.getSelectedItem().toString();
																																																																																															Date data = Date.valueOf(comboBox_data.getSelectedItem().toString());
																																																																																															Time hora = Time.valueOf(comboBox_hora.getSelectedItem().toString());
																																																																																															
																																																																																															
																																																																																															if (cnDAO.verifyWhole(data, hora, CRMV, coleira, CPF) == true) {
																																																																																																cn.setData(data);
																																																																																																cn.setHora(hora);
																																																																																																cn.setCRMV(CRMV);
																																																																																																cn.setCodColeira(coleira);
																																																																																																cn.setCPF(CPF);
																																																																																																
																																																																																																
																																																																																																cnDAO.remover(cn);
																																																																																																
																																																																																																
																																																																																															System.out
																																																																																																	.println(cn);
																																																																																															JOptionPane.showMessageDialog(null, "Consulta desmarcada!");
																																																																																														} else {
																																																																																															JOptionPane.showMessageDialog(null, "Consulta inexistente!");
																																																																																															System.out
																																																																																																	.println("nah boe");
																																																																																														}
																																																																																														}
																																																																																													});
																																																																																													btnNewButton_3.setBounds(214, 267, 133, 39);
																																																																																													exc_consulta.add(btnNewButton_3);
																																																																																													
																																																																																													lblNewLabel_38 = new JLabel("CRMV");
																																																																																													lblNewLabel_38.setBounds(71, 33, 46, 14);
																																																																																													exc_consulta.add(lblNewLabel_38);
																																																																																													
																																																																																													lblNewLabel_39 = new JLabel("Pet");
																																																																																													lblNewLabel_39.setBounds(263, 33, 46, 14);
																																																																																													exc_consulta.add(lblNewLabel_39);
																																																																																													
																																																																																													lblNewLabel_40 = new JLabel("CPF");
																																																																																													lblNewLabel_40.setBounds(468, 33, 46, 14);
																																																																																													exc_consulta.add(lblNewLabel_40);
																																																																																													
																																																																																													lblNewLabel_41 = new JLabel("Hora");
																																																																																													lblNewLabel_41.setBounds(71, 164, 46, 14);
																																																																																													exc_consulta.add(lblNewLabel_41);
																																																																																													
																																																																																													lblNewLabel_42 = new JLabel("Data");
																																																																																													lblNewLabel_42.setBounds(468, 164, 46, 14);
																																																																																													exc_consulta.add(lblNewLabel_42);
																																																																																													
																																																																																													comboBox_hora = new JComboBox(listaconh);
																																																																																													comboBox_hora.setBounds(71, 186, 115, 33);
																																																																																													exc_consulta.add(comboBox_hora);
																																																																																													
																																																																																													comboBox_data = new JComboBox(listacon);
																																																																																													comboBox_data.setBounds(377, 186, 115, 33);
																																																																																													exc_consulta.add(comboBox_data);
																																																																																	
																																																																																			log_ale = new JPanel();
																																																																																			log_ale.setBackground(new Color(255, 128, 64));
																																																																																			log_ale.setBounds(0, 0, 564, 317);
																																																																																			//layeredPane.add(log_ale);
																																																																																			log_ale.setLayout(null);
																																																																																			
																																																																																					comboBox_17 = new JComboBox(listacliente);
																																																																																					comboBox_17.setBounds(71, 132, 96, 37);
																																																																																					log_ale.add(comboBox_17);
																																																																																					
																																																																																							comboBox_18 = new JComboBox(listapet);
																																																																																							comboBox_18.setBounds(366, 132, 96, 37);
																																																																																							log_ale.add(comboBox_18);
																																																																																							
																																																																																									JLabel lblNewLabel_10 = new JLabel("Alergia");
																																																																																									lblNewLabel_10.setBounds(247, 115, 46, 14);
																																																																																									log_ale.add(lblNewLabel_10);
																																																																																									
																																																																																											textField_36 = new JTextField();
																																																																																											textField_36.setBounds(177, 139, 179, 20);
																																																																																											log_ale.add(textField_36);
																																																																																											textField_36.setColumns(10);
																																																																																											
																																																																																													JButton btnNewButton_19 = new JButton("Adicionar");
																																																																																													btnNewButton_19.setForeground(new Color(255, 255, 128));
																																																																																													btnNewButton_19.setBackground(new Color(0, 64, 128));
																																																																																													btnNewButton_19.addActionListener(new ActionListener() {
																																																																																														public void actionPerformed(ActionEvent e) {
																																																																																															AlergiaDAO aDAO = new AlergiaDAO();
																																																																																															Alergias a = new Alergias();
																																																																																															
																																																																																															String CPF = comboBox_17.getSelectedItem().toString();
																																																																																															int coleira = Integer.valueOf(comboBox_18.getSelectedItem().toString());
																																																																																															String alergia = textField_36.getText();
																																																																																															
																																																																																															if (aDAO.verifyAler(CPF, coleira, alergia) == true) {
																																																																																															if (aDAO.verifyAle(CPF, coleira) == false) {
																																																																																																
																																																																																																a.setCPF(CPF);
																																																																																																a.setCodColeira(coleira);
																																																																																																a.setNome(alergia);
																																																																																																
																																																																																																
																																																																																																aDAO.inserir(a);
																																																																																																System.out
																																																																																																		.println(a);
																																																																																																JOptionPane.showMessageDialog(null, "Alergia registrada!");
																																																																																															} else{
																																																																																																System.out.println("Wrong " + a + "!");
																																																																																																JOptionPane.showMessageDialog(null, "N�o foi poss�vel encontrar o pet!");
																																																																																															}	
																																																																																														} else {
																																																																																															JOptionPane.showMessageDialog(null, "Alergia j� registrada!");
																																																																																														}
																																																																																														}
																																																																																													});
																																																																																													btnNewButton_19.setBounds(190, 269, 178, 37);
																																																																																													log_ale.add(btnNewButton_19);
																																																																																													
																																																																																															JLabel lblNewLabel_32 = new JLabel("CPF");
																																																																																															lblNewLabel_32.setBounds(71, 112, 23, 14);
																																																																																															log_ale.add(lblNewLabel_32);
																																																																																															
																																																																																																	JLabel lblNewLabel_32_1 = new JLabel("Coleira");
																																																																																																	lblNewLabel_32_1.setBounds(368, 112, 40, 14);
																																																																																																	log_ale.add(lblNewLabel_32_1);
																																																																											
																																																																												vis_consulta = new JPanel();
																																																																												vis_consulta.setBackground(new Color(128, 128, 255));
																																																																												vis_consulta.setBounds(0, 0, 564, 317);
																																																																												//layeredPane.add(vis_consulta);
																																																																												vis_consulta.setLayout(null);
																																																																												
																																																																												JScrollPane scrollPane_3 = new JScrollPane();
																																																																												scrollPane_3.setBounds(10, 11, 544, 261);
																																																																												vis_consulta.add(scrollPane_3);
																																																																												
																																																																														table_3 = new JTable();
																																																																														table_3.setModel(new DefaultTableModel(
																																																																															new Object[][] {
																																																																															},
																																																																															new String[] {
																																																																																"Veterin\u00E1rio", "Pet", "Dono", "Hora", "Data"
																																																																															}
																																																																														) {
																																																																															Class[] columnTypes = new Class[] {
																																																																																String.class, Integer.class, String.class, String.class, String.class
																																																																															};
																																																																															public Class getColumnClass(int columnIndex) {
																																																																																return columnTypes[columnIndex];
																																																																															}
																																																																														});
																																																																														scrollPane_3.setViewportView(table_3);
																																																																														
																																																																														JButton btnNewButton_21 = new JButton("Ver consultas");
																																																																														btnNewButton_21.setBackground(new Color(255, 255, 128));
																																																																														btnNewButton_21.setForeground(new Color(0, 64, 128));
																																																																														btnNewButton_21.setFont(new Font("Tahoma", Font.PLAIN, 17));
																																																																														btnNewButton_21.addActionListener(new ActionListener() {
																																																																															public void actionPerformed(ActionEvent e) {
																																																																																ConsultaDAO cnDAO = new ConsultaDAO();
																																																																																ArrayList<Consulta> consultas = new ArrayList<>();

																																																																																consultas = cnDAO.getConsultas();
																																																																																DefaultTableModel model = (DefaultTableModel) table_3.getModel();
																																																																																model.setRowCount(0);

																																																																																for (int i = 0; i < consultas.size(); i++) {
																																																																																	Consulta cn = consultas.get(i);
																																																																																	model.addRow(new Object[] { cn.getCRMV(), cn.getCodColeira(), cn.getCPF(), cn.getHora(),
																																																																																			cn.getData() });
																																																																																
																																																																															}
																																																																															}
																																																																														});
																																																																														btnNewButton_21.setBounds(199, 283, 168, 23);
																																																																														vis_consulta.add(btnNewButton_21);
																																																																															
																																																																																	JPanel landing_page = new JPanel();
																																																																																	landing_page.setBackground(new Color(0, 0, 0));
																																																																																	landing_page.setBounds(0, 0, 564, 317);
																																																																																	layeredPane.add(landing_page);
																																																																																	landing_page.setLayout(null);
																																																																																	
																																																																																	JPanel panel = new JPanel();
																																																																																	panel.setForeground(new Color(0, 255, 0));
																																																																																	panel.setBackground(new Color(0, 0, 0));
																																																																																	panel.setBounds(0, 0, 564, 317);
																																																																																	landing_page.add(panel);
																																																																																	panel.setLayout(null);
																																																																																	
																																																																																	btnNewButton_8 = new JButton("Entrar");
																																																																																	btnNewButton_8.addActionListener(new ActionListener() {
																																																																																		public void actionPerformed(ActionEvent e) {
																																																																																			Switch_screen(log_cli);
																																																																																		}
																																																																																	});
																																																																																	btnNewButton_8.setBackground(new Color(255, 255, 128));
																																																																																	btnNewButton_8.setForeground(new Color(0, 64, 128));
																																																																																	btnNewButton_8.setFont(new Font("Impact", Font.PLAIN, 31));
																																																																																	btnNewButton_8.setBounds(172, 267, 215, 39);
																																																																																	panel.add(btnNewButton_8);
																																																																																	
																																																																																	JLabel lblNewLabel_48 = new JLabel("BEM-VINDO!");
																																																																																	lblNewLabel_48.setForeground(new Color(255, 255, 0));
																																																																																	lblNewLabel_48.setFont(new Font("Impact", Font.PLAIN, 21));
																																																																																	lblNewLabel_48.setBounds(223, 206, 170, 39);
																																																																																	panel.add(lblNewLabel_48);
																																																																																	
																																																																																	JLabel lblNewLabel_47 = new JLabel("");
																																																																																	lblNewLabel_47.setBackground(new Color(255, 255, 0));
																																																																																	lblNewLabel_47.setForeground(new Color(255, 255, 255));
																																																																																	lblNewLabel_47.setBounds(-78, 0, 642, 317);
																																																																																	panel.add(lblNewLabel_47);
																																																																																	lblNewLabel_47.setIcon(new ImageIcon(PetShop.class.getResource("/images/uepa.png")));

	}

	public void Switch_screen(JPanel p) {
		layeredPane.removeAll();
		layeredPane.add(p);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
}
