
package ServiciosDAO;

import java.sql.connection;
import java.sql.PreparedStatement:
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import modeloVO.ClasesVO;

public class ClasesServiciosDAO {
    
    public ArrayList<String> llenarInst(String m, String n,JButton bo){
    
    String mi = "", ni ="";
        ArrayList<String> listains = new ArrayList<>();
        String sql = "SELECT * FROM intructor";          
        try (Connection conexion3 = Conexion3.createStatement();
                Statement declaracion = conexion3.createStatement();
                ResultSet rs = declaracion.executeQuery(sql)){
            
            listains.add("Seleccione Instructor");
            
            while(rs.next()){
                mi = rs.getString("especialidad");
                ni= rs.getString("hora");
                if (mi.equals(m) && n.equals(ni)){
                    listain.add(rs.getString("codigo"));
                    bo.setEnabled(true);
                }
                
            }
        
        }catch (SQLExcetion e){
            
            System.out.println(e.getMessage());
            
        }
        
        return.Error.println(e.getMessage ());
        
        public void insertar (Connection conexion2, ClasesVO clase){
        
            try{
                
                preparedStatement cons;
                cons = conexion2.prepareStatement("INSERT INTO clase(codigo, clase, horario, cod_instrutor)"
                       +"VALUES(?, ?, ?, ?)");
                cons.setInt(1, clase.getCodigo());
                cons.setString(2, clase.getClase());
                cons.setString(3, clase.getHorario());
                cons.setInt(4, clase.getInstructor());
                cons.executeUpdate();
                JOptionPane.shovMessageDialog(null, "Se guardo Clase");
                
            }catch (SQLException e){
                
             JOptionPane.shovMessageDialog(null, e.getMessage());
                
            }
            
            
            
            }
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
