/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.dao;

import Connection.ConnectionFactory;
import Models.UsuarioPO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DF
 */
public class UsuarioDAO {
        
    public void salvar(UsuarioPO up){

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("INSERT INTO USUARIO (nome,sexo,cpf,crm,telefone,email,login,senha,administrador),VALUES(?,?,?,?,?,?,?,?,?)");
            stat.setString(1,up.getNome());
            stat.setString(2, up.getSexo());
            stat.setString(3, up.getCpf());
            stat.setString(4,up.getCrm());
            stat.setString(5, up.getTelefone());
            stat.setString(6,up.getEmail());
            stat.setString(6, up.getEmail());
            stat.setString(7, up.getLogin());
            stat.setString(8, up.getSenha());
            stat.setString(9, up.getAdministrador());
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Seus dados foram salvos com sucesso.\n"
                    + "Por favor realize o login novamente!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar, por favor entre em contato"
                    + "com o administrador do sistema."+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stat);
        }
    }
}
