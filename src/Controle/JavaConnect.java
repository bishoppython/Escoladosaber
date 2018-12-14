/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

/**
 *
 * @author Anderson
 */

import java.sql.*;
import javax.swing.*;
public class JavaConnect {
    
    Connection conn = null;
    public static Connection connectDb(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\UFRPE\\Projeto MOO\\Escola.sqlite"); //Endereço do Banco de Dados
            //JOptionPane.showMessageDialog(null, "CONEXÃO ESTABELECIDA COM SUCESSO!");
            return conn; //Retorna nossa conexão bem sucedida
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); // Caso não consiga uma conexão ele retornará o erro
            return null;
        }
       
   
    }
    
    
}
