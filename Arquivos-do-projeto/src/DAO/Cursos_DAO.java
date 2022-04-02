/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Cursos;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Intel i5
 */
public class Cursos_DAO {
    
    Connection con = null;
    PreparedStatement pstm = null;
    ResultSet rst = null;
    
    
    public void fecharConexao() {
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
   
    
    public List<Cursos> mostrarCursos(){
        
        List<Cursos> cursos = new ArrayList<>();
        String comando = "SELECT * FROM cursos";
         
        try{
            
            con = Conexao_mysql.conexaoBD();
            pstm = con.prepareCall(comando);
            rst = pstm.executeQuery();
            
            while(rst.next()){
                Cursos c = new Cursos();
                
                c.setId_curso(rst.getInt("id_curso"));
                c.setNome_curso(rst.getString("nome_curso"));
                c.setDescricao(rst.getString("descricao"));
                c.setCarga_horaria(rst.getInt("carga_horaria"));
                
                cursos.add(c);  
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cursos_DAO: "+ e.getMessage());
        }finally{
            fecharConexao();
        }
        return cursos;
    }
    
    
    public List<Cursos> pesquisarCurso(String nomeDoCurso){
        
        List<Cursos> cursosAchados = new ArrayList<>();
        
        String comando = "SELECT * FROM cursos WHERE nome_curso LIKE '"+nomeDoCurso+"%'";
        
        try{
            con = Conexao_mysql.conexaoBD();
            pstm = con.prepareStatement(comando);
            
            rst = pstm.executeQuery();
            
            while(rst.next()){
                Cursos c = new Cursos();
                
                c.setId_curso(rst.getInt("id_curso"));
                c.setNome_curso(rst.getString("nome_curso"));
                c.setDescricao(rst.getString("descricao"));
                c.setCarga_horaria(rst.getInt("carga_horaria"));
                
                cursosAchados.add(c);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cursos_DAO: "+ e.getMessage());
        }finally{
            fecharConexao();
        }
        
        return cursosAchados;
    } 
    
    
}
