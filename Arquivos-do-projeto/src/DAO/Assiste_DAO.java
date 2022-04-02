/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Assiste;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Intel i5
 */
public class Assiste_DAO {
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
    
    
    public void inserirAssiste(Assiste a){
        String comando = "INSERT INTO assiste(matriculaEst, id_cursoEst, data_assiste) VALUES(?, ?, ?)";
        
        try{
            con = Conexao_mysql.conexaoBD();
            pstm = con.prepareStatement(comando);
            
            pstm.setInt(1, a.getMatriculaEst());
            pstm.setInt(2, a.getId_cursoEst());
            pstm.setDate(3, new Date(a.getData_assiste().getTime()));
            
            pstm.execute();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"InserirAssiste: "+ e);
        }finally{
            fecharConexao();
        }
        
    }
    
    
    public ArrayList<Assis_Usua_Curs_DAO> mostrarAssiste(int matricula){
        
        ArrayList<Assis_Usua_Curs_DAO> assistidos = new ArrayList<>();
        
        String comando = "SELECT c.id_curso, c.nome_curso, c.descricao, c.carga_horaria, a.data_assiste FROM cursos c "+
                "JOIN assiste a ON c.id_curso = a.id_cursoEst "+
                "JOIN usuario u ON a.matriculaEst = u.matricula "+
                "WHERE u.matricula = ?";
        
        try{
            con = Conexao_mysql.conexaoBD();
            pstm = con.prepareStatement(comando);
            pstm.setInt(1, matricula);
            
            rst = pstm.executeQuery();
            
            while(rst.next()){
                Assis_Usua_Curs_DAO as = new Assis_Usua_Curs_DAO();
                
                as.setNome_cursoA(rst.getString("nome_curso"));
                as.setDescricaoA(rst.getString("descricao"));
                as.setCarga_horariaA(rst.getInt("carga_horaria"));
                as.setData_assisteA(rst.getDate("data_assiste"));
                as.setId_cursoA(rst.getInt("id_curso"));
                
                assistidos.add(as);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"mostrarAssiste: "+ e);
        }finally{
            fecharConexao();
        }
     return assistidos;   
    }
    
}
