package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
     * direccion donde esta la base de datos del sistema de facturacion
     */
    private final String url = "./database/SistemaFacturacion.db";
    
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
        con.update("test/num,name,num2,name2/0909/jiih/787/jbjb");
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
            //st.execute();
        } catch (Exception ex) {
        }
        this.close();
    }
    
    /**
     * Metodo para actualizar los datos de una tupla
     * @param entity: donde contendra los datos que se actualizaran
     */
    public void update(String entidad){
        //this.connect();
        String[] meta = entidad.split("/");
        String[] atri = meta[1].split(",");
        String key = "";
        for (int i = 0; i < atri.length; i++) {
            key += atri[i] + "=?,";
        }
        key = key.substring(0, key.length() - 1);
        
        System.out.println("key " + key);
        try {
            PreparedStatement st = connect.prepareStatement("UPDATE" + meta[0] +
                    "set " + key);
            for (int i = 0; i < meta.length - 2; i++) {
                st.setString(i + 1, meta[i + 2]);
            }
            //st.execute();
        } catch (Exception ex) {
        }
        this.close();
    }
    
    /**
     * Metodo para eliminar una tupla.
     * @param id
    */
    public void delete(String id){
        
    }
    
    /**
     * Metodo que realiza la conexion a la base de datos.
     * Es obligatorio declararlo para realizar una consulata.
     * @return retorna un booleano para saber si se realizo la conecccion
    */
    protected boolean connect(){
        try {
            String user, pass;
            connect = DriverManager.getConnection("jdbc:oracle:"+url);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    /**
     * Metodo para cerrar la conexion a la base de datos.
     * Es obligatiorio declararlo al finalizar la consulta
    */
    protected void close (){
        try {
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la base de datos");
        }
    }
    
}
