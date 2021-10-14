package logic;



import conexionSQL.DataPersona;
import conexionSQL.DbConnector;
import conexionSQL.Querys;
import entidades.Persona;

public class main {

	public static void main(String[] args) {

		DataPersona dp=new DataPersona();
		System.out.println(dp.getAll());
	}

}
