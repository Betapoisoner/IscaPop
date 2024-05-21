package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Centro;
import model.Conexion;

public class CentroDAO {
	private static Connection conn = null;
	private static PreparedStatement pstmtSelect;
	private static PreparedStatement pstmtInsert;
	private static PreparedStatement pstmtUpdate;

	/**
	 * Preparar SQL: Se ejecuta nada mas se abre la pagina principal, ya que el DAO
	 * de Centro se usará nada mas se abra la aplicación.
	 * 
	 * Haces la conexion llamando a Conexion.getConexion(). Se crean los
	 * PreparedStatements para todas las consultas posibles.
	 * 
	 * @throws SQLException
	 * @throws Exception
	 */
	public static void prepareSQL() throws SQLException, Exception {
		try {
			conn = Conexion.getConnection();
			String sqlInsert = "INSERT INTO Centro VALUES (?,?,?)";
			pstmtInsert = conn.prepareStatement(sqlInsert);
			String sqlSelect = "SELECT * FROM Centro WHERE id=? AND passwd=?";
			pstmtSelect = conn.prepareStatement(sqlSelect);
			String sqlUpdate = "UPDATE Centro SET name=?";
			pstmtUpdate = conn.prepareStatement(sqlUpdate);
		} catch (SQLException sqle) {
			throw sqle;
		} catch (Exception ex) {
			throw ex;
		}
	}

	/**
	 * Cerrar SQL: Se cierran los prepared statements primero, y luego la conexión.
	 * Ya que si cerramos la conexion primero no podemos acceder a los statements.
	 * 
	 * @throws SQLException
	 * @throws Exception
	 */
	public static void closeSQL() throws SQLException, Exception {
		try {
			pstmtInsert.close();
			pstmtSelect.close();
			pstmtUpdate.close();
			conn.close();
		} catch (SQLException sqle) {
			throw sqle;
		} catch (Exception ex) {
			throw ex;
		}
	}

	/**
	 * Registrar Centro: Para registrar un centro/darlo de alta.
	 * 
	 * Se le pasa el objeto centro que hemos creado en la vista. Se cambia el
	 * Prepared Statement para insertar, pasandole el Id, Name y Passwd. Se ejecuta
	 * el Prepared Statement con executeUpdate().
	 * 
	 * Se limpian los Parametros antes de hacer el return.
	 * 
	 * Si devuelve lineas insertadas (el insert se ha realizado correctamente) -->
	 * Se inicia sesión con ese Centro en el Control. Si no devuelve lineas
	 * insertadas --> Lanza una excepción.
	 * 
	 * @param cen
	 * @return boolean
	 * @throws SQLException
	 * @throws Exception
	 */
	public static void addCentro(Centro cen) throws SQLException, Exception {
		try {
			conn = Conexion.getConnection();
			pstmtInsert.setString(1, cen.getId_Centro());
			pstmtInsert.setString(2, cen.getNombre());
			pstmtInsert.setString(3, cen.getContrasena());
			int lineasInsert = pstmtInsert.executeUpdate();
			pstmtInsert.clearParameters();
			if (!(lineasInsert > 0))
				throw new Exception("ERROR: ¡No se ha podido dar de alta al centro!");
		} catch (SQLException sqle) {
			throw sqle;
		} catch (Exception ex) {
			throw ex;
		}
	}

	/**
	 * Iniciar Sesión Centro: Para iniciar sesión como un Centro ya registrado.
	 * 
	 * Se pasa el Id y la Passwd del Centro y se comprueba que la contraseña sea
	 * correcta. Si la contraseña o el id no son correctos y no devuelve nada -->
	 * Lanza excepción. Si la contraseña es correcta --> Devuelve el centro e inicia
	 * sesion en el Control.
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
	public static Centro getCentro(String id, String passwd) throws SQLException, Exception {
		try {
			conn = Conexion.getConnection();
			pstmtSelect.setString(1, id);
			pstmtSelect.setString(2, passwd);
			ResultSet rs = pstmtSelect.executeQuery();
			if (!rs.next()) {
				pstmtSelect.clearParameters();
				throw new Exception("ERROR: ¡No se ha podido iniciar sesión!");
			}
			Centro c = null;
			String name = rs.getString("name");
			c = new Centro(id, name, passwd);
			pstmtSelect.clearParameters();
			return c;
		} catch (SQLException sqle) {
			throw sqle;
		} catch (Exception ex) {
			throw ex;
		}
	}

	/**
	 * Cambiar Nombre Centro: Para realizar el cambio de nombre de un Centro si es
	 * necesario.
	 * 
	 * Se cambian los parametros del PreparedStatement. Se ejecuta. Y se se
	 * actualiza la línea para asegurarse que se ha insertado (updateRow()).
	 * 
	 * Se cambia la información en el objeto centro.
	 * 
	 * Se limpian los parametros.
	 * 
	 * @param cen
	 * @param name
	 * @throws SQLException
	 * @throws Exception
	 */
	public static void changeName(Centro cen, String name) throws SQLException, Exception {
		try {
			conn = Conexion.getConnection();
			pstmtUpdate.setString(1, name);
			ResultSet rs = pstmtUpdate.executeQuery();
			if (!rs.next()) {
				pstmtUpdate.clearParameters();
				throw new Exception("ERROR: ¡No se ha podido cambiar el nombre!");
			}
			rs.updateRow();
			cen.setName(name);
			pstmtUpdate.clearParameters();
		} catch (SQLException sqle) {
			throw sqle;
		} catch (Exception ex) {
			throw ex;
		}
	}
}