package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import utils.MySQLConexion;

public class fechasOcupadas_database {
	private int id_medico;
	private int dia;
	private int mes_fecha;
	private int bloque;
	private int dia_fecha;
	private String rut;
	
	public fechasOcupadas_database(int bloque,int dia_fecha,int mes_fecha) {
		this.bloque=bloque;
		this.dia_fecha=dia_fecha;
		this.mes_fecha=mes_fecha;
	}
	public fechasOcupadas_database(int bloque,int dia_fecha,int mes_fecha,String rut,int dia,int id_medico) {
		this.bloque=bloque;
		this.dia_fecha=dia_fecha;
		this.mes_fecha=mes_fecha;
		this.dia=dia;
		this.rut=rut;
		this.id_medico=id_medico;
	}
	public void insertarDatos() {
		String result = null, last = null;
		MySQLConexion cc = new MySQLConexion();
        @SuppressWarnings("static-access")
		Connection cn = cc.getConexion();
        PreparedStatement pst = null;
		String sql = "INSERT INTO fechas_ocupadas values (null,?,?,?,?,?,?)";
		try {
			pst = cn.prepareStatement(sql);
			pst.setInt(1,id_medico);
			pst.setInt(2,dia);
			pst.setInt(3,mes_fecha);
			pst.setInt(4,bloque);
			pst.setInt(5,dia_fecha);
			pst.setString(6,rut);
			pst.execute();
			cn.close();
			pst.close();
		}catch(SQLException e) {
			System.out.println("Error en fechasOcupadas_database.insertarDatos ");
		}
	}
	public boolean buscarFecha() {
		int i=0;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MySQLConexion conn = new MySQLConexion();
		Connection con = MySQLConexion.getConexion();
		
		
		try {
			int flag=0;
			String sql = "SELECT * FROM fechas_ocupadas WHERE bloque="+bloque+" AND dia_fecha="+dia_fecha+" AND mes_fecha="+mes_fecha;
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {	
				flag=1;
				
			}
			ps.close();
			rs.close();
			if(flag==1) {
				return true;
			}
			else {
				return false;
			}
		
			
		}catch(SQLException ex) {
			
			System.err.println(ex.toString());
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		fechasOcupadas_database fecha = new fechasOcupadas_database(4,31,2);
		if(fecha.buscarFecha()==false) {
			System.out.println("Ese dia, mes y hora esta disponible para una cita");
		}else {System.out.println("Ya hay cita en ese dia, mes y hora");}
	}

}