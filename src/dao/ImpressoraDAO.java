/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import impressora.Impressao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.View;
import model.ImpressoraModel;


/**
 *
 * @author gabrielm
 */
public class ImpressoraDAO {
    
    private final Connection connection;

    public ImpressoraDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void select(String impressora) throws SQLException{
              
           // String sql = "SELECT * FROM `capa_de_processo` WHERE numero_processo = "++";
            
           // PreparedStatement statement = connection.prepareStatement(sql);
           // statement.execute();      
        }
    
        
}