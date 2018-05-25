package Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 *
 * @author Arles Cerrato
 */

/**
 * Clase Padre para los modelos de las entidades fuertes y debiles
*/
public class  Conexion {
    
    /**
     * Atributo para conectarte a la base de  datos
    */
    protected Connection connect;
    
    /**
     * Metodo para insertar una tupla. 
     * @param entidad: nombre de la entidad
     * @param atributos: atributos de la entidad
    */
    
    public static void main(String args[]){
        Conexion con = new Conexion();
        
        System.out.println(con.connect());
    }

    public Connection getConnect() {
        return connect;
    }
    
    public void insert(String entidad){
        this.connect();
        String[] meta = entidad.split("/");
        String key = "";
        for (int i = 0; i < meta.length - 2; i++) {
            key += "?,";
        }
        key = key.substring(0, key.length() - 1);
        try {
            PreparedStatement st = connect.prepareStatement("INSERT INTO " + meta[0] +
            " ("+ meta[1] +") " +
                    "values("+ key +")");
            for (int i = 0; i < meta.length - 2; i++) {
                st.setString(i + 1, meta[i + 2]);
            }
            st.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        this.close();
    }
    
    public void insertPro(String entidad){
        this.connect();
        String[] meta = entidad.split("/");
        String key = "";
        for (int i = 2; i < meta.length; i++) {
            key += "'" + meta[i] + "',";
        }
        key = key.substring(0, key.length() - 1);
        try {
            CallableStatement cstmt = connect.prepareCall("{call INSERT" + meta[0].toUpperCase() + "(" + key + ")}");
            cstmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        this.close();
    }
    
    /**
     * Metodo para actualizar los datos de una tupla
     * @param entidad: donde contendra los datos que se actualizaran
     */
    public void update(String entidad){
        //this.connect();
        String[] meta = entidad.split("/");
        String[] atri = meta[1].split(",");
        String key = "";
        for (int i = 1; i < atri.length; i++) {
            key += atri[i] + "=?,";
        }
        key = key.substring(0, key.length() - 1);
        
        System.out.println("key " + key);
        try {
            PreparedStatement st = connect.prepareStatement("UPDATE " + meta[0] +
                    "set " + key + " where " + atri[0] + "=?");
            
            for (int i = 0; i < meta.length - 3; i++) {
                st.setString(i + 1, meta[i + 3]);
            }
            
            st.setString(meta.length - 3, meta[2]);
            st.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        this.close();
    }
    
    public void updatePro(String entidad){
        this.connect();
        String[] meta = entidad.split("/");
        String key = "";
        for (int i = 2; i < meta.length; i++) {
            key += meta[i] + ",";
        }
        key = key.substring(0, key.length() - 1);
        try {
            CallableStatement cstmt = connect.prepareCall("{call UPDATE" + meta[0].toUpperCase() + "(" + key + ")}");
            cstmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        this.close();
    }
    
    /**
     * Metodo para eliminar una tupla.
     * @param entidad
     * @param id
    */
    public void deletePro(String entidad, String id){
        this.connect();
        try {
            CallableStatement cstmt = connect.prepareCall("{call DELETE" + entidad.toUpperCase() + "('" + id + "')}");
            
            /*if(entidad.equals("Venta"))
                cstmt = connect.prepareCall("{call procVentas_Menores (" + 5 + ", " + id + ")}");
            */
            cstmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        this.close();
    }
    
    public ResultSet consulta1(){
        try {
            this.connect();
            Statement st = connect.createStatement();
            ResultSet rs;
            try {
                String query = "SELECT LANA.MANUFACTURA.MARCA, LANA.FABRICANTE.PAIS FROM LANA.MANUFACTURA INNER JOIN LANA.FABRICANTE ON LANA.MANUFACTURA.IDFABRICANTE=LANA.FABRICANTE.IDFABRICANTE WHERE LANA.FABRICANTE.PAIS='USA';;";
                rs = st.executeQuery(query);
                
                return rs;
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        this.close();
        return null;
    }
    
    /**
     * Metodo que realiza la conexion a la base de datos.
     * Es obligatorio declararlo para realizar una consulata.
     * @return retorna un booleano para saber si se realizo la conecccion
    */
    public boolean connect(){
        try {
            String user, pass;
            connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "LANA", "Samir123");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    /**
     * Metodo para cerrar la conexion a la base de datos.
     * Es obligatiorio declararlo al finalizar la consulta
    */
    public void close (){
        try {
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la base de datos");
        }
    }
    
}
