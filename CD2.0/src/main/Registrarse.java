package main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import classVO.Usuario;
import mantenimientos.GestionUsuario;
import mantenimientos.HorarioRandom;
import mantenimientos.connect_codigoMaestro;
import mantenimientos.connect_tbUsuarios;
import mantenimientos.medico_database;
import rspanelgradiente.RSPanelGradiente;
import utils.MySQLConexion;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import rojerusan.RSPasswordTextPlaceHolder;
import javax.swing.JTextField;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class Registrarse extends JFrame {

	
	
	public Registrarse() {
		setUndecorated(true);
		initComponents();
		this.setLocationRelativeTo(null);
		
		
	}
		
	public void initComponents(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel barra = new JPanel();
		barra.setBounds(0, 0, 800, 32);
		barra.setBackground(new java.awt.Color(66, 169, 174));
		contentPane.add(barra);
		barra.setLayout(null);
		
		JLabel lblCerrar = new JLabel("");
		lblCerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblCerrar.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/icons8_close_window_32px_1.png")));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblCerrar.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/icons8_close_window_32px.png")));
			}
		});
		lblCerrar.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/icons8_close_window_32px.png")));
		lblCerrar.setBounds(768, 0, 32, 32);
		barra.add(lblCerrar);
		
		JLabel lblMinimizar = new JLabel("");
		lblMinimizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblMinimizar.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/minimizar_blanco_32px.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblMinimizar.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/minimizar_azul_oscuro_32px.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				setState(JFrame.ICONIFIED);
			}
		});
		lblMinimizar.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/minimizar_azul_oscuro_32px.png")));
		lblMinimizar.setBounds(739, 0, 32, 32);
		barra.add(lblMinimizar);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 448);
		panel.setBackground(new java.awt.Color(33, 44, 61));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		lblNewLabel.setBounds(181, 131, 55, 19);
		panel.add(lblNewLabel);
		
		JLabel lblIngreseSuContrasea = new JLabel("Ingrese su contrase\u00F1a");
		lblIngreseSuContrasea.setForeground(Color.WHITE);
		lblIngreseSuContrasea.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		lblIngreseSuContrasea.setBounds(132, 203, 162, 25);
		panel.add(lblIngreseSuContrasea);
		
		JLabel lblIngreseElCodigo = new JLabel("Ingrese el c\u00F3digo maestro");
		lblIngreseElCodigo.setForeground(Color.WHITE);
		lblIngreseElCodigo.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		lblIngreseElCodigo.setBounds(116, 273, 185, 25);
		panel.add(lblIngreseElCodigo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(100, 146, 216, 11);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(100, 222, 216, 11);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(100, 292, 216, 11);
		panel.add(separator_2);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		btnRegresar.setBackground(new Color(19, 30, 49));
		btnRegresar.setBounds(458, 399, 113, 38);
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Login nuevaVentana2 = new Login();
				nuevaVentana2.setVisible(true);
			}
		});
		panel.add(btnRegresar);
		
		
		
		
		rdMedico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(rdMedico.isSelected() == false) {
					rdMedico.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/icons8_medical_doctor_64px_3.png")));
				}
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdMedico.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/icons8_medical_doctor_64px_1.png")));
				if(rdMedico.isSelected() == true) {
					rdMedico.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/icons8_medical_doctor_64px_4.png")));
					
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
					rdMedico.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/icons8_medical_doctor_64px_4.png")));
					rdSecretaria.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/secretaria_celeste_64px.png")));
					comboEsp.setVisible(true);
					lblElijaSuEspecialidad.setVisible(true);
			
			}
		});
		rdMedico.setFont(new Font("Sitka Small", Font.BOLD, 14));
		rdMedico.setForeground(new Color(255, 255, 255));
		rdMedico.setBackground(new Color(33, 44, 61));
		rdMedico.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/icons8_medical_doctor_64px_1.png")));
		rdMedico.setBounds(158, 59, 139, 73);
		panel.add(rdMedico);
		
		
		rdSecretaria.setFont(new Font("Sitka Small", Font.BOLD, 14));
		rdSecretaria.setForeground(new Color(255, 255, 255));
		rdSecretaria.setBackground(new Color(33, 44, 61));
		rdSecretaria.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/secretaria_celeste_64px.png")));
		rdSecretaria.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				comboEsp.setVisible(false);
				lblElijaSuEspecialidad.setVisible(false);
				rdSecretaria.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/secretaria_roja_64px.png")));
				if(rdSecretaria.isSelected()) {
					rdMedico.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/icons8_medical_doctor_64px_1.png")));
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
					if(rdSecretaria.isSelected()== false) {
					rdSecretaria.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/secretaria_blanca_64px.png")));
					}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdSecretaria.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/secretaria_celeste_64px.png")));
				if(rdSecretaria.isSelected()) {
					rdSecretaria.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/secretaria_roja_64px.png")));
				}
			}
		});
		rdSecretaria.setBounds(470, 59, 173, 73);
		panel.add(rdSecretaria);
		
		JLabel lblElijaSuProfesin = new JLabel("Elija su profesi\u00F3n");
		lblElijaSuProfesin.setBounds(336, 41, 128, 25);
		panel.add(lblElijaSuProfesin);
		lblElijaSuProfesin.setForeground(Color.WHITE);
		lblElijaSuProfesin.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		
		JLabel lblIngreseSuNombre = new JLabel("Ingrese su nombre");
		lblIngreseSuNombre.setForeground(Color.WHITE);
		lblIngreseSuNombre.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		lblIngreseSuNombre.setBounds(502, 128, 139, 25);
		panel.add(lblIngreseSuNombre);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(458, 146, 216, 11);
		panel.add(separator_3);
		
		JLabel lblIngreseSuCiudad = new JLabel("Ingrese su apellido");
		lblIngreseSuCiudad.setForeground(Color.WHITE);
		lblIngreseSuCiudad.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		lblIngreseSuCiudad.setBounds(497, 203, 139, 25);
		panel.add(lblIngreseSuCiudad);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(458, 222, 216, 11);
		panel.add(separator_4);
		
		JLabel lblIngreseSuCiudad_1 = new JLabel("Ingrese su ciudad");
		lblIngreseSuCiudad_1.setForeground(Color.WHITE);
		lblIngreseSuCiudad_1.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		lblIngreseSuCiudad_1.setBounds(504, 273, 124, 19);
		panel.add(lblIngreseSuCiudad_1);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(458, 292, 216, 11);
		panel.add(separator_5);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setForeground(Color.WHITE);
		btnRegistrarse.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		btnRegistrarse.setBackground(new Color(19, 30, 49));
		btnRegistrarse.setBounds(668, 399, 113, 38);
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//usuario.contentEquals(null) || clave.contentEquals(null) || codigo.contentEquals(null)
				String usuario = txtUsuario.getText();
				String clave = String.copyValueOf(txtPassNoVisible.getPassword());
				String codigo = txtCodigoMaestro.getText();
				String nombre = txtNombre.getText();
				String apellido = txtApellido.getText();
				String ciudad = txtCiudad.getText();
				String rut = txtRut.getText();
				
				
				
					if( !usuario.isEmpty() || !clave.isEmpty() || !codigo.isEmpty() || !nombre.isEmpty() || !apellido.isEmpty() || !ciudad.isEmpty() || !rut.isEmpty()) {
						
						if( codigo.equals(connect_codigoMaestro.getCodigoMaestro())) {
							if(repiteUsuario(usuario)==0) {
								if(rdMedico.isSelected() == true && rdSecretaria.isSelected() == true) {JOptionPane.showMessageDialog(contentPane, "Escoja solo 1 profesion","Error",JOptionPane.ERROR_MESSAGE);}
								else if(rdMedico.isSelected() == false && rdSecretaria.isSelected() == false) {JOptionPane.showMessageDialog(contentPane, "Escoja una profesion","Error",JOptionPane.ERROR_MESSAGE);}
								else if(rdMedico.isSelected() == true) {
									if(!(comboEsp.getItemAt(0).toString()).equals(comboEsp.getSelectedItem().toString())) {
										
										System.out.println("\n"+rut);
										Usuario usu = new Usuario(usuario,clave,nombre,apellido,ciudad,"1",comboEsp.getSelectedIndex(),rut);
										registrarEnTablaMedico(usu);
										medico_database med = new medico_database();
										HorarioRandom hr = new HorarioRandom(med.getUltimoId_medico());
										hr.generarHorario();
										connect_tbUsuarios.insertUsuario(usu);
										JOptionPane.showMessageDialog(contentPane, "Registrado exitosamente","OK",JOptionPane.INFORMATION_MESSAGE);
									}else {JOptionPane.showMessageDialog(contentPane, "Escoja una especialidad","Error",JOptionPane.ERROR_MESSAGE);};
								}
								else if(rdSecretaria.isSelected() == true) {
									System.out.println("secre");
									Usuario usu1 = new Usuario(usuario,clave,nombre,apellido,ciudad,"0",rut);
									connect_tbUsuarios.insertUsuario(usu1);
									JOptionPane.showMessageDialog(contentPane, "Registrado exitosamente","OK",JOptionPane.INFORMATION_MESSAGE);
								}
							}else {JOptionPane.showMessageDialog(contentPane, "Escoja otro nombre de usuario, ese est� repetido","Error",JOptionPane.ERROR_MESSAGE);}
						}
						else{JOptionPane.showMessageDialog(contentPane, "Codigo maestro erroneo","Error",JOptionPane.ERROR_MESSAGE);}
					}else {JOptionPane.showMessageDialog(contentPane, "Datos invalidos","Error",JOptionPane.ERROR_MESSAGE);}
				
				
				/*
				GestionUsuario gestionUsuario = new GestionUsuario();
				
				Usuario usuario2 = new Usuario();
				
				usuario2.setUsuario(usuario);
				usuario2.setClave(clave);
				
				Usuario usu = gestionUsuario.obtenerUsuario(usuario2);
				System.out.println("usuario: "+usu);
				if(usu!=null) {
					JOptionPane.showMessageDialog(contentPane, "Bienvenido");
					
					this.dispose();
					
					ProgramaFRM2 bienvenida = new ProgramaFRM2();
					bienvenida.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(contentPane, "Datos invalidos","Error",JOptionPane.ERROR_MESSAGE);
				}*/
			}
		});
		panel.add(btnRegistrarse);
		
		txtUsuario = new JTextField();
		txtUsuario.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtUsuario.setCaretColor(new Color(255, 255, 255));
		txtUsuario.setForeground(Color.WHITE);
		txtUsuario.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		txtUsuario.setBackground(new Color(19, 30, 49));
		txtUsuario.setBounds(100, 153, 216, 34);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtCodigoMaestro = new JTextField();
		txtCodigoMaestro.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtCodigoMaestro.setCaretColor(new Color(255, 255, 255));
		txtCodigoMaestro.setForeground(Color.WHITE);
		txtCodigoMaestro.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		txtCodigoMaestro.setBackground(new Color(19, 30, 49));
		txtCodigoMaestro.setColumns(10);
		txtCodigoMaestro.setBounds(100, 369, 216, 34);
		panel.add(txtCodigoMaestro);
		
		txtNombre = new JTextField();
		txtNombre.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtNombre.setCaretColor(new Color(255, 255, 255));
		txtNombre.setForeground(Color.WHITE);
		txtNombre.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		txtNombre.setBackground(new Color(19, 30, 49));
		txtNombre.setColumns(10);
		txtNombre.setBounds(458, 153, 216, 34);
		panel.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtApellido.setCaretColor(new Color(255, 255, 255));
		txtApellido.setForeground(Color.WHITE);
		txtApellido.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		txtApellido.setBackground(new Color(19, 30, 49));
		txtApellido.setColumns(10);
		txtApellido.setBounds(458, 228, 216, 34);
		panel.add(txtApellido);
		
		txtCiudad = new JTextField();
		txtCiudad.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtCiudad.setCaretColor(new Color(255, 255, 255));
		txtCiudad.setForeground(Color.WHITE);
		txtCiudad.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		txtCiudad.setBackground(new Color(19, 30, 49));
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(458, 301, 216, 34);
		panel.add(txtCiudad);
		
		txtPassVisible = new JTextField();
		txtPassVisible.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtPassVisible.setCaretColor(new Color(255, 255, 255));
		txtPassVisible.setForeground(Color.WHITE);
		txtPassVisible.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		txtPassVisible.setBackground(new Color(19, 30, 49));
		txtPassVisible.setColumns(10);
		txtPassVisible.setBounds(100, 231, 216, 34);
		txtPassVisible.setVisible(false);
		panel.add(txtPassVisible);
		
		txtPassNoVisible = new JPasswordField();
		txtPassNoVisible.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtPassNoVisible.setCaretColor(new Color(255, 255, 255));
		txtPassNoVisible.setForeground(Color.WHITE);
		txtPassNoVisible.setFont(new Font("Sitka Small", Font.PLAIN, 25));
		txtPassNoVisible.setBackground(new Color(19, 30, 49));
		txtPassNoVisible.setBounds(100, 231, 216, 34);
		panel.add(txtPassNoVisible);
		
		JLabel Visibilidad = new JLabel("");
		Visibilidad.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				Visibilidad.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/icons8_eye_40px_1.png")));
				txtPassVisible.setText(String.copyValueOf(txtPassNoVisible.getPassword()));
				txtPassVisible.setVisible(true);
				txtPassNoVisible.setVisible(false);
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Visibilidad.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/icons8_closed_eye_40px_2.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Visibilidad.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/icons8_closed_eye_40px.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Visibilidad.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/icons8_closed_eye_40px_2.png")));
				txtPassVisible.setVisible(false);
				txtPassNoVisible.setVisible(true);
				
			}
		});
		Visibilidad.setIcon(new ImageIcon(Registrarse.class.getResource("/Image/icons8_closed_eye_40px.png")));
		Visibilidad.setBounds(326, 226, 40, 40);
		panel.add(Visibilidad);
		
		bg.add(rdMedico);
		bg.add(rdSecretaria);
		
	
		lblElijaSuEspecialidad.setForeground(Color.WHITE);
		lblElijaSuEspecialidad.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		lblElijaSuEspecialidad.setBounds(502, 339, 150, 22);
		panel.add(lblElijaSuEspecialidad);
		lblElijaSuEspecialidad.setVisible(false);
		
		comboEsp.setForeground(Color.BLACK);
		comboEsp.setBackground(SystemColor.windowBorder);
		comboEsp.setBounds(458, 363, 323, 25);
		comboEsp.setFont(new Font("Sitka Small", Font.BOLD, 12));
		comboEsp.setVisible(false);;
		comboEspecialidades();
		panel.add(comboEsp);
		
		txtRut = new JTextField();
		txtRut.setForeground(Color.WHITE);
		txtRut.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		txtRut.setColumns(10);
		txtRut.setCaretColor(Color.WHITE);
		txtRut.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtRut.setBackground(new Color(19, 30, 49));
		txtRut.setBounds(100, 301, 216, 34);
		panel.add(txtRut);
		
		JLabel lblIngreseSuRut = new JLabel("Ingrese su rut");
		lblIngreseSuRut.setForeground(Color.WHITE);
		lblIngreseSuRut.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		lblIngreseSuRut.setBounds(158, 341, 99, 19);
		panel.add(lblIngreseSuRut);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(100, 360, 216, 11);
		panel.add(separator_6);
	}
	private void registrarEnTablaMedico(Usuario usu) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		
		try {
		
			con = MySQLConexion.getConexion();
				String sql = "INSERT INTO medicos values (null,?, ?, ?, ?)";
				pst = con.prepareStatement(sql);
				pst.setString(1, usu.getNombre());
				pst.setString(2, usu.getApellidos());
				pst.setString(3, usu.getRut());
				pst.setInt(4, usu.getEspecialidad());
				pst.executeUpdate();
			
			
			pst.close();
			con.close();
			
			
			
			} 
			catch (Exception e) {
				System.out.println("Error en 'Registrarse.registrarEnTablaMedico'");
				System.out.println(e.getMessage());
			}
		
	}
	
	private void comboEspecialidades() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		MySQLConexion conn = new MySQLConexion();
		Connection con = MySQLConexion.getConexion();
		
		try {
			
			String sql = "SELECT * FROM especialidades_medicas";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			comboEsp.addItem("Seleccione especialidad");
			
			while(rs.next()) {
				comboEsp.addItem(rs.getString("especialidad"));
			}
			
			rs.close();
			
		}catch(SQLException ex) {
			
			System.err.println(ex.toString());
		}
	}
	private int repiteUsuario(String usuario1) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		MySQLConexion conn = new MySQLConexion();
		Connection con = MySQLConexion.getConexion();

		try {
			
			String sql = "SELECT * FROM tb_usuario WHERE usuario="+usuario1;
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("\nMostrando datos:\n");		
			while(rs.next()) {
				System.out.println("base "+rs.getString(1)+" usuario1  "+usuario1);				
			}
			rs = ps.executeQuery();
			while(rs.next()) {
				if(rs.getString(1).equals(usuario1)) {
					System.out.println("\nhay repetido\n");
					rs.close();
					con.close();
					return 1;
				}
				
			}
			System.out.println("no hay repetido");
			con.close();
			rs.close();
			
			return 0;
			
		}catch(SQLException ex) {
			
			System.err.println(ex.toString());
			return 0;
		}
	}
	JComboBox comboEsp = new JComboBox();
	private int x;
    private int y;
    private JTextField txtUsuario;
    private JTextField txtCodigoMaestro;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtCiudad;
    private JTextField txtPassVisible;
    private JPasswordField txtPassNoVisible;
    private JTextField txtRut;
    JRadioButton rdMedico = new JRadioButton("MEDICO");
    private JPanel contentPane;
	private ButtonGroup bg = new ButtonGroup();
	JRadioButton rdSecretaria = new JRadioButton("SECRETARIA");
	JLabel lblElijaSuEspecialidad = new JLabel("Elija su especialidad");

    
    protected void this_mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
}

    protected void this_mouseDragged(MouseEvent e) {
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
}
}	
