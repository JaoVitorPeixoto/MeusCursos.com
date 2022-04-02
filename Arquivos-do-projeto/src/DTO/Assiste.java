/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Intel i5
 */
public class Assiste {
    
    	
	private int id_assiste;
	private int matriculaEst;
	private int id_cursoEst;
	private Date data_assiste;
	
	public int getId_assiste() {
		return id_assiste;
	}
	public void setId_assiste(int id_assiste) {
		this.id_assiste = id_assiste;
	}
	public int getMatriculaEst() {
		return matriculaEst;
	}
	public void setMatriculaEst(int matriculaEst) {
		this.matriculaEst = matriculaEst;
	}
	public int getId_cursoEst() {
		return id_cursoEst;
	}
	public void setId_cursoEst(int id_cursoEst) {
		this.id_cursoEst = id_cursoEst;
	}
	public Date getData_assiste() {
		return data_assiste;
	}
	public void setData_assiste(Date data_assiste) {
		this.data_assiste = data_assiste;
	}
    
}
