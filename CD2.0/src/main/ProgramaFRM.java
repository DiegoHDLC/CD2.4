/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classDAO.PacientesDAO;
import classVO.PacientesVO;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import rojeru_san.componentes.RSCalendarBeanInfo;
import rojeru_san.componentes.RSDateChooserBeanInfo;
import rojeru_san.componentes.RSDateChooser;
import java.awt.Font;

@SuppressWarnings("serial")
public class ProgramaFRM extends javax.swing.JFrame {

    /**
     * Creates new form ProgramaFRM
     */
    public ProgramaFRM() {
        initComponents();
        cargarPacientes(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({ "rawtypes" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        registrarDisco = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        d_clave = new javax.swing.JTextField();
        d_nombre = new javax.swing.JTextField();
        d_autor = new javax.swing.JTextField();
        d_genero = new javax.swing.JTextField();
        d_precio = new javax.swing.JTextField();
        actualizarDisco = new javax.swing.JButton();
        buscarDisco = new javax.swing.JButton();
        eliminarDisco = new javax.swing.JButton();
        limpiarDisco = new javax.swing.JButton();
        d_status = new javax.swing.JTextField();
        list_pacientes = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_general = new javax.swing.JTable();
        buscageneral = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        /*registrarDisco.setText("Registrar");
        registrarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDiscoActionPerformed(evt);
            }
        });*/
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setToolTipText("");
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(10, 17, 37, 14);
        lblNombre = new javax.swing.JLabel();
        lblNombre.setBounds(10, 55, 60, 14);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(10, 245, 73, 14);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(10, 215, 73, 14);
        lblRut = new javax.swing.JLabel();
        lblRut.setBounds(10, 169, 37, 14);
        p_clave = new javax.swing.JTextField();
        p_clave.setBounds(86, 11, 89, 27);
        p_nombre = new javax.swing.JTextField();
        p_nombre.setBounds(86, 49, 190, 27);
        p_direccion = new javax.swing.JTextField();
        p_direccion.setBounds(86, 201, 190, 27);
        p_telefono = new javax.swing.JTextField();
        p_telefono.setBounds(86, 239, 189, 27);
        p_rut = new javax.swing.JTextField();
        p_rut.setBounds(86, 163, 190, 27);
        javax.swing.JButton registrarProveedor = new javax.swing.JButton();
        registrarProveedor.setBounds(10, 379, 102, 23);
        actualizarPaciente = new javax.swing.JButton();
        actualizarPaciente.setBounds(210, 379, 103, 23);
        buscarPaciente = new javax.swing.JButton();
        buscarPaciente.setBounds(122, 379, 78, 23);
        eliminarPaciente = new javax.swing.JButton();
        eliminarPaciente.setBounds(324, 379, 89, 23);
        limpiarPaciente = new javax.swing.JButton();
        limpiarPaciente.setBounds(422, 379, 102, 23);
        p_status = new javax.swing.JTextField();
        p_status.setBounds(10, 277, 514, 37);
        
        jLabel1.setText("ID");
                
        lblNombre.setText("Nombre");
                        
        jLabel3.setText("Telefono");
                                
        jLabel4.setText("Direccion");
                                        
        lblRut.setText("RUT");
                                                
        p_telefono.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		p_telefonoActionPerformed(evt);
        	}
        });
                                                        
        registrarProveedor.setText("registrar");
        registrarProveedor.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		registrarPacienteActionPerformed(evt);
        	}
        });
        
        actualizarPaciente.setText("actualizar");
        actualizarPaciente.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		actualizarPacienteActionPerformed(evt);
        	}
        });
        
        buscarPaciente.setText("buscar");
        buscarPaciente.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		buscarPacienteActionPerformed(evt);
        	}
        });
        
        eliminarPaciente.setText("eliminar");
        eliminarPaciente.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		eliminarPacienteActionPerformed(evt);
        	}
        });
        
        limpiarPaciente.setText("limpiar todo");
        limpiarPaciente.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		limpiarPacienteActionPerformed(evt);
        	}
        });
        
        p_apellido = new JTextField();
        p_apellido.setBounds(86, 87, 190, 27);
        
        p_fecha = new JTextField();
        p_fecha.setFont(new Font("Sitka Text", Font.ITALIC, 14));
        p_fecha.setToolTipText("fdfdf");
        p_fecha.setBounds(135, 125, 141, 27);
        
        JLabel lblApellidos = new JLabel();
        lblApellidos.setBounds(10, 93, 60, 14);
        lblApellidos.setText("Apellidos");
        
        JLabel lblFecha = new JLabel();
        lblFecha.setBounds(10, 131, 148, 14);
        lblFecha.setText("Fecha de Nacimiento");
        
        jTabbedPane1.addTab("Pacientes", jPanel1);
        jPanel1.setLayout(null);
        jPanel1.add(registrarProveedor);
        jPanel1.add(actualizarPaciente);
        jPanel1.add(buscarPaciente);
        jPanel1.add(eliminarPaciente);
        jPanel1.add(limpiarPaciente);
        jPanel1.add(p_status);
        jPanel1.add(lblRut);
        jPanel1.add(jLabel1);
        jPanel1.add(lblNombre);
        jPanel1.add(lblApellidos);
        jPanel1.add(p_clave);
        jPanel1.add(p_direccion);
        jPanel1.add(p_rut);
        jPanel1.add(p_apellido);
        jPanel1.add(p_nombre);
        jPanel1.add(p_telefono);
        jPanel1.add(p_fecha);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel3);
        jPanel1.add(lblFecha);
        
        /*RSDateChooser p_fecha = new RSDateChooser();
        p_fecha.setFormatoFecha("dd/MM/yyyy");
        p_fecha.setBounds(236, 112, 240, 40);
        jPanel1.add(p_fecha);
        */
        
        jLabel6.setText("ID");
        	
        jLabel7.setText("Nombre");
        
        jLabel8.setText("Autor");
        	
        jLabel9.setText("Genero");
        
        jLabel10.setText("Precio");
        	
        jLabel11.setText("Proveedor");
        
        	/*actualizarDisco.setText("Actualizar");
        actualizarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarDiscoActionPerformed(evt);
            }
        });*/

        /*buscarDisco.setText("Buscar");
        buscarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDiscoActionPerformed(evt);
            }
        });*/

        /*eliminarDisco.setText("Eliminar");
        eliminarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDiscoActionPerformed(evt);
            }
        });*/

        /*limpiarDisco.setText("Limpiar Todo");
        limpiarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarDiscoActionPerformed(evt);
            }
        });*/

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d_nombre)
                            .addComponent(d_autor)
                            .addComponent(d_genero)
                            .addComponent(d_precio)
                            .addComponent(list_pacientes, 0, 262, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d_status, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(registrarDisco)
                                .addGap(30, 30, 30)
                                .addComponent(actualizarDisco)
                                .addGap(35, 35, 35)
                                .addComponent(buscarDisco)
                                .addGap(44, 44, 44)
                                .addComponent(eliminarDisco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(limpiarDisco)))
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(d_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(d_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(d_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(d_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(d_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(list_pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(d_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarDisco)
                    .addComponent(actualizarDisco)
                    .addComponent(buscarDisco)
                    .addComponent(eliminarDisco)
                    .addComponent(limpiarDisco))
                .addGap(71, 71, 71))
        );

        jTabbedPane1.addTab("Discos", jPanel2);

        jScrollPane1.setViewportView(tabla_general);

        /*buscageneral.setText("Buscar Todo");
        buscageneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscageneralActionPerformed(evt);
            }
        });*/

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(buscageneral)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(buscageneral)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tabla discos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_telefonoActionPerformed

    private void registrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProveedorActionPerformed
        PacientesVO pac = new PacientesVO();
        pac.setNombre(p_nombre.getText());
        pac.setApellidos(p_apellido.getText());
       // pac.setFecha_nacimiento(p_fecha.getDate());
        pac.setRut(p_rut.getText());
        pac.setDireccion(p_direccion.getText());
        pac.setTelefono(p_telefono.getText());
        //prov.setEmail(p_email.getText());
        String resp = PacientesDAO.registrarPacientes(pac);
        p_status.setText(resp);
        p_nombre.setText("");
        p_apellido.setText("");
        p_fecha.setText("");
        p_rut.setText("");
        p_telefono.setText("");
        p_direccion.setText("");
        cargarPacientes(0);
    }//GEN-LAST:event_registrarProveedorActionPerformed

    private void actualizarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarProveedorActionPerformed
        PacientesVO pac = new PacientesVO();
        pac.setIdPaciente(Integer.parseInt(p_clave.getText()));
        pac.setNombre(p_nombre.getText());
        pac.setApellidos(p_apellido.getText());
        //pac.setFecha_nacimiento(p_fecha.getText());
        pac.setRut(p_rut.getText());
        pac.setDireccion(p_direccion.getText());
        pac.setTelefono(p_telefono.getText());
        //prov.setEmail(p_email.getText());
        String resp = PacientesDAO.ActualizarPacientes(pac);
        p_status.setText(resp);
        p_nombre.setText("");
        p_apellido.setText("");
        p_fecha.setText("");
        p_rut.setText("");
        p_direccion.setText("");
        p_telefono.setText("");
        
        //p_email.setText("");
        cargarPacientes(0);
    }//GEN-LAST:event_actualizarProveedorActionPerformed

    private void buscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProveedorActionPerformed
        PacientesVO pac = PacientesDAO.buscarPacientes(p_clave.getText());
        p_clave.setText(pac.getIdPaciente()+"");
        p_nombre.setText(pac.getNombre());
        p_apellido.setText(pac.getApellidos());
        //p_fecha.setText(pac.getFecha_nacimiento());
        p_rut.setText(pac.getRut());
        p_direccion.setText(pac.getDireccion());
        p_telefono.setText(pac.getTelefono());
        //p_email.setText(prov.getEmail());
        p_status.setText(pac.getResultado());
    }//GEN-LAST:event_buscarProveedorActionPerformed

    private void eliminarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProveedorActionPerformed
        String resp = PacientesDAO.eliminarPacientes(p_clave.getText());
        p_status.setText(resp);
        p_nombre.setText("");
        p_apellido.setText("");
        p_fecha.setText("");
        p_rut.setText("");
        p_direccion.setText("");
        p_telefono.setText("");
        cargarPacientes(0);
    }//GEN-LAST:event_eliminarProveedorActionPerformed

    private void limpiarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarProveedorActionPerformed
    	p_nombre.setText("");
        p_apellido.setText("");
        p_fecha.setText("");
        p_rut.setText("");
        p_direccion.setText("");
        p_telefono.setText("");
    }//GEN-LAST:event_limpiarProveedorActionPerformed

    /*private void registrarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDiscoActionPerformed
        PacientesVO d = (PacientesVO) list_proveedores.getSelectedItem();
        DiscosVO disc = new DiscosVO();
        Integer p_disc = d.getId_proveedor();
        disc.setNombre(d_nombre.getText());
        disc.setAutor(d_autor.getText());
        disc.setGenero(d_genero.getText());
        disc.setPrecio(Double.parseDouble(d_precio.getText()));
        disc.setId_proveedor(p_disc);
        String resp = DiscosDAO.registrarDisco(disc);
        d_clave.setText("");
        d_nombre.setText("");
        d_autor.setText("");
        d_genero.setText("");
        d_precio.setText("");
        d_status.setText(resp);
        cargarProveedores(0);
    }//GEN-LAST:event_registrarDiscoActionPerformed

    private void buscarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDiscoActionPerformed
        DiscosVO disc = DiscosDAO.buscarDisco(d_clave.getText());
        d_clave.setText(disc.getId_disco()+"");
        d_nombre.setText(disc.getNombre());
        d_autor.setText(disc.getAutor());
        d_genero.setText(disc.getGenero());
        d_precio.setText(disc.getPrecio()+"");
        d_status.setText(disc.getResultado());
        cargarProveedores(disc.getId_proveedor());
    }//GEN-LAST:event_buscarDiscoActionPerformed

    private void limpiarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarDiscoActionPerformed
        d_clave.setText("");
        d_nombre.setText("");
        d_autor.setText("");
        d_genero.setText("");
        d_precio.setText("");
        cargarProveedores(0);
    }//GEN-LAST:event_limpiarDiscoActionPerformed

    private void actualizarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDiscoActionPerformed
        ProveedoresVO d = (ProveedoresVO) list_proveedores.getSelectedItem();
        DiscosVO disc = new DiscosVO();
        Integer p_disc = d.getId_proveedor();
        disc.setId_disco(Integer.parseInt(d_clave.getText()));
        disc.setNombre(d_nombre.getText());
        disc.setAutor(d_autor.getText());
        disc.setGenero(d_genero.getText());
        disc.setPrecio(Double.parseDouble(d_precio.getText()));
        disc.setId_proveedor(p_disc);
        String resp = DiscosDAO.registrarDisco(disc);
        d_clave.setText("");
        d_nombre.setText("");
        d_autor.setText("");
        d_genero.setText("");
        d_precio.setText("");
        d_status.setText(resp);
        cargarProveedores(0);
    }//GEN-LAST:event_actualizarDiscoActionPerformed

    private void eliminarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDiscoActionPerformed
        String resp = DiscosDAO.eliminarDisco(d_clave.getText());
        d_clave.setText("");
        d_nombre.setText("");
        d_autor.setText("");
        d_genero.setText("");
        d_precio.setText("");
        d_status.setText(resp);
        cargarProveedores(0);
    }//GEN-LAST:event_eliminarDiscoActionPerformed

    private void buscageneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscageneralActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Autor");
        modelo.addColumn("Precio");
        tabla_general.setModel(modelo);
        Object[] arrDiscos = new Object[4];
        for(DiscosVO disc: DiscosDAO.getListDiscos()){
            arrDiscos[0] = disc.getId_disco();
            arrDiscos[1] = disc.getNombre();
            arrDiscos[2] = disc.getAutor();
            arrDiscos[3] = disc.getPrecio();
            modelo.addRow(arrDiscos);
        }
        tabla_general.setModel(modelo);
    }//GEN-LAST:event_buscageneralActionPerformed
	*/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
        	for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProgramaFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramaFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramaFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramaFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramaFRM().setVisible(true);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
	public void cargarPacientes(int busca){
        int index = 1;
        list_pacientes.removeAllItems();
        list_pacientes.addItem("Selecciona un paciente");
        for(PacientesVO pac: PacientesDAO.getListPacientes()){
            list_pacientes.addItem(pac);
            if(pac.getIdPaciente() == busca){
                list_pacientes.setSelectedIndex(index);
            }
            index++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarDisco;
    private javax.swing.JButton actualizarPaciente;
    private javax.swing.JButton buscageneral;
    private javax.swing.JButton buscarDisco;
    private javax.swing.JButton buscarPaciente;
    private javax.swing.JTextField d_autor;
    private javax.swing.JTextField d_clave;
    private javax.swing.JTextField d_genero;
    private javax.swing.JTextField d_nombre;
    private javax.swing.JTextField d_precio;
    private javax.swing.JTextField d_status;
    private javax.swing.JButton eliminarDisco;
    private javax.swing.JButton eliminarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton limpiarDisco;
    private javax.swing.JButton limpiarPaciente;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox list_pacientes;
    private javax.swing.JTextField p_clave;
    private javax.swing.JTextField p_direccion;
    private javax.swing.JTextField p_rut;
    private javax.swing.JTextField p_nombre;
    private javax.swing.JTextField p_status;
    private javax.swing.JTextField p_telefono;
    private javax.swing.JButton registrarDisco;
    private javax.swing.JTable tabla_general;
    private JTextField p_apellido;
    private JTextField p_fecha;
}