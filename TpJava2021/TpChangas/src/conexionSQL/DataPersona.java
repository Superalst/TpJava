package conexionSQL;

import entidades.*;

import java.sql.*;
import java.util.LinkedList;

public class DataPersona {
	
	public LinkedList<Persona> getAll(){
		Statement stmt=null;
		ResultSet rs=null;
		LinkedList<Persona> pers= new LinkedList<>();
		
		try {
			stmt= DbConnector.getInstancia().getConn().createStatement();
			rs= stmt.executeQuery("SELECT * FROM bkwscpfq5sshgak97bp2.persona;");
			//intencionalmente no se recupera la password
			if(rs!=null) {
				while(rs.next()) {
					Persona p=new Persona();
					p.setDni(rs.getInt("dni"));
					p.setNombre(rs.getString("nombre"));
					p.setApellido(rs.getString("apellido"));
					p.setTelefono(rs.getString("telefono"));
					p.setOficio(rs.getString("oficio"));
					p.setAreaTrabajo(rs.getString("areaTrabajo"));
					p.setValuacionPromedio(rs.getDouble("valuacionPromedio"));
					pers.add(p);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(rs!=null) {rs.close();}
				if(stmt!=null) {stmt.close();}
				DbConnector.getInstancia().releaseConn();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return pers;
	}

	
	
	public void add(Persona p) {
		PreparedStatement stmt= null;
		try {
			stmt=DbConnector.getInstancia().getConn().
					prepareStatement(
							"insert into persona(dni, nombre, apellido, telefono, oficio, areaTrabajo, valuacionPromedio) values(?,?,?,?,?,?,?)");
			stmt.setInt(1, p.getDni());
			stmt.setString(2, p.getNombre());
			stmt.setString(3, p.getApellido());
			stmt.setString(4, p.getTelefono());
			stmt.setString(5, p.getOficio());
			stmt.setString(6, p.getAreaTrabajo());
			stmt.setDouble(7, p.getValuacionPromedio());
			stmt.executeUpdate();
			
	        }
			
		  catch (SQLException e) {
	        e.printStackTrace();
	        
		} finally {
	        try {
	            if(stmt!=null)stmt.close();
	            DbConnector.getInstancia().releaseConn();
	        } catch (SQLException e) {
	        	e.printStackTrace();
	        }
		}
	}

	
}