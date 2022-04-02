/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import DTO.Usuario;
import java.sql.SQLException;


/**
 *
 * @author Intel i5
 */
public class Usuario_DAO {
    	Connection con = null;
	PreparedStatement pstm = null;
	ResultSet rst = null;
	
	public void FecharConexao() {
		try {
			if (con != null) {
				con.close();
			}
			
			if (pstm != null) {
				pstm.close();
			}
			
			if (rst != null) {
				rst.close();
			}
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Não foi possível fechar a conexão com o banco de dados, Erro: "+ e);
		}
	}

	
	public void InserirUsuario(Usuario u) {
		
		String comando = "INSERT INTO usuario(usua, senha, nome, sexo, idade, datacadastro, email) VALUES(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			
			con = Conexao_mysql.conexaoBD();
			pstm = con.prepareStatement(comando);
			
			pstm.setString(1, u.getUsua());
			pstm.setString(2, u.getSenha());
			pstm.setString(3, u.getNome());
			pstm.setString(4, String.valueOf(u.getSexo()));
			pstm.setInt(5, u.getIdade());
			pstm.setDate(6, new Date(u.getDatacadastro().getTime()));
			pstm.setString(7, u.getEmail());
			
			pstm.execute();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Não foi possivel inserir um novo usuário, erro: "+ e);
		}finally {
			FecharConexao();
		}
		
	}


	public void AtualizarUsuario(Usuario u) {
		String comando = "UPDATE usuario SET usua = ?, senha = ?, nome = ?, sexo = ?, idade = ?, email = ?, datacadastro = ? WHERE matricula = ?";
		
		try {
			
			con = Conexao_mysql.conexaoBD();
			pstm = con.prepareStatement(comando);
			
			pstm.setString(1, u.getUsua());
			pstm.setString(2, u.getSenha());
			pstm.setString(3, u.getNome());
			pstm.setString(4, String.valueOf(u.getSexo()));
			pstm.setInt(5, u.getIdade());
			pstm.setString(6, u.getEmail());
			pstm.setDate(7, new Date (u.getDatacadastro().getTime()));
			
			pstm.setInt(8, u.getMatricula());
			
			pstm.execute();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Não foi possivel editar o usuário, erro: "+ e);
		}finally {
			FecharConexao();
		}
	}
	
	
	public void DeletarUsuario(int matricu) {
		String comando = "DELETE FROM usuario WHERE matricula = ?";
		
		try {
			
			con = Conexao_mysql.conexaoBD();
			pstm = con.prepareStatement(comando);
			
			pstm.setInt(1, matricu);
			
			pstm.execute();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Não foi possivel deletar o usuário, erro: "+ e);
		}finally {
			FecharConexao();
		}
	}
	
	
	public List<Usuario> MostrarUsuarios() {
		String comando = "SELECT * FROM usuario";
		List<Usuario> usuarios = new ArrayList<>();
		
		try {
			
			con = Conexao_mysql.conexaoBD();
			pstm = con.prepareStatement(comando);
			
			rst = pstm.executeQuery();
			while(rst.next()) {
				Usuario u = new Usuario();
				
				u.setMatricula(rst.getInt("matricula"));
				u.setUsua(rst.getString("usua"));
				u.setSenha(rst.getString("senha"));
				u.setNome(rst.getString("nome"));
				u.setSexo(rst.getString("sexo"));
				u.setIdade(rst.getInt("idade"));
				u.setDatacadastro(rst.getDate("datacadastro"));
				u.setEmail(rst.getString("email"));
				
				usuarios.add(u);
			}
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Erro ao tentar mostrar os usuarios: "+e);
		}finally {
			FecharConexao();
		}
		
		return usuarios;
	}
        
        
        public ResultSet autenticaUsuario(String usua, String senha) {
            String comando = "SELECT * FROM usuario WHERE usua = ? and senha = ?"; 
            
            try {
                Connection con = Conexao_mysql.conexaoBD();
                pstm = con.prepareStatement(comando);
                pstm.setString(1, usua);
                pstm.setString(2, senha);
                
                rst = pstm.executeQuery();
                
                return rst;
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "autenticaUsuario: " + e.getMessage());
                
                return null;
            }
            
        }
        
        
        public ResultSet autenticaUsuarioEmail(String usuario, String email){
            
             String comando = "SELECT * FROM usuario WHERE usua = ? or email = ?"; 
            
            try {
                
                Connection con = Conexao_mysql.conexaoBD();
                pstm = con.prepareStatement(comando);
                pstm.setString(1, usuario);
                pstm.setString(2, email);
                
                rst = pstm.executeQuery();
                
                return rst;
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "autenticaUsuario: " + e.getMessage());
                return null;
            }
        }         
}
