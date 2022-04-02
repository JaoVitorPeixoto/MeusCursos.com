/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.Date;

/**
 *
 * @author Intel i5
 */
public class Assis_Usua_Curs_DAO {
    
    private String nome_cursoA;
    private String descricaoA;
    private int carga_horariaA;
    private int id_cursoA;

    public int getId_cursoA() {
        return id_cursoA;
    }

    public void setId_cursoA(int id_cursoA) {
        this.id_cursoA = id_cursoA;
    }

    public String getNome_cursoA() {
        return nome_cursoA;
    }

    public void setNome_cursoA(String nome_cursoA) {
        this.nome_cursoA = nome_cursoA;
    }

    public String getDescricaoA() {
        return descricaoA;
    }

    public void setDescricaoA(String descricaoA) {
        this.descricaoA = descricaoA;
    }

    public int getCarga_horariaA() {
        return carga_horariaA;
    }

    public void setCarga_horariaA(int carga_horariaA) {
        this.carga_horariaA = carga_horariaA;
    }

    public Date getData_assisteA() {
        return data_assisteA;
    }

    public void setData_assisteA(Date data_assisteA) {
        this.data_assisteA = data_assisteA;
    }
    private Date data_assisteA;
    
}
