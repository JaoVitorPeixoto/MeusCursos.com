/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Cursos;

/**
 *
 * @author Intel i5
 */
public class Teste {
    
    public static void main(String[] args) {
       
        Cursos_DAO dao = new Cursos_DAO();

        
        for( Cursos c : dao.pesquisarCurso("H")){
            System.out.println("Nome do curso: "+ c.getNome_curso());
        }
          
    }
}
