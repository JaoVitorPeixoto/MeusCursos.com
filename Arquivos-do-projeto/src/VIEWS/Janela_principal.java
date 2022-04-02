/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEWS;

import DAO.Assis_Usua_Curs_DAO;
import DAO.Assiste_DAO;
import DAO.Cursos_DAO;
import DTO.Assiste;
import DTO.Cursos;
import DTO.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Intel i5
 */


public class Janela_principal extends javax.swing.JFrame {
    private Usuario usuario;
    int matricula;
    

    /**
     * Creates new form Janela_principal
     */
    public Janela_principal(Usuario u) {
        
        this.usuario = u;
        initComponents();

        carregarTabelaCurso();
        carregarTabelaMeusCursos();

        if (u != null){

            String data = String.valueOf(usuario.getDatacadastro()).replace("-", "/");

            lblMATRICULA.setText(String.valueOf(usuario.getMatricula()));
            lblUSUARIO.setText(usuario.getUsua());
            lblSENHA.setText(usuario.getSenha());
            lblNOME.setText(usuario.getNome());
            lblIDADE.setText(String.valueOf(usuario.getIdade()));
            lblSEXO.setText(usuario.getSexo());
            lblDATA.setText(data);
            lblEMAIL.setText(usuario.getEmail());
        
       }
        
        DefaultTableModel modeloCurso = (DefaultTableModel) tblCURSOS.getModel();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCURSOS = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPESQUISAR = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnEDITAR = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnLOGOUT = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblMATRICULA = new javax.swing.JLabel();
        lblUSUARIO = new javax.swing.JLabel();
        lblSENHA = new javax.swing.JLabel();
        lblNOME = new javax.swing.JLabel();
        lblIDADE = new javax.swing.JLabel();
        lblSEXO = new javax.swing.JLabel();
        lblDATA = new javax.swing.JLabel();
        lblEMAIL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMEUSCURSOS = new javax.swing.JTable();
        btnINSCREVER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153));

        tblCURSOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id do curso", "Nome do curso", "Descrição", "Carga horária"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCURSOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCURSOSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCURSOS);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("PESQUISAR CURSO:");

        txtPESQUISAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPESQUISARActionPerformed(evt);
            }
        });
        txtPESQUISAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPESQUISARKeyReleased(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Matrícula:");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("Usuário:");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setText("Senha:");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setText("Idade:");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setText("Sexo:");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setText("Data de cadastro:");

        btnEDITAR.setText("Editar dados");
        btnEDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEDITARActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setText("E-mail:");

        btnLOGOUT.setText("Logout");
        btnLOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLOGOUTActionPerformed(evt);
            }
        });

        jSeparator1.setBorder(new javax.swing.border.MatteBorder(null));

        lblMATRICULA.setForeground(new java.awt.Color(255, 153, 0));

        lblUSUARIO.setForeground(new java.awt.Color(255, 153, 0));

        lblSENHA.setForeground(new java.awt.Color(255, 153, 0));

        lblNOME.setForeground(new java.awt.Color(255, 153, 0));

        lblIDADE.setForeground(new java.awt.Color(255, 153, 0));

        lblSEXO.setForeground(new java.awt.Color(255, 153, 0));

        lblDATA.setForeground(new java.awt.Color(255, 153, 0));

        lblEMAIL.setForeground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEMAIL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMATRICULA, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSEXO, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDATA, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnLOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnEDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEDITAR, btnLOGOUT});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblMATRICULA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblUSUARIO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblSENHA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblNOME))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblIDADE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblSEXO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblDATA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblEMAIL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEDITAR, btnLOGOUT});

        jTabbedPane1.addTab("Dados", jPanel1);

        tblMEUSCURSOS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblMEUSCURSOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id do curso", "Nome do curso", "Descrição", "Carga horária", "Data de inscrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMEUSCURSOS);

        jTabbedPane1.addTab("Meus cursos", jScrollPane2);

        btnINSCREVER.setText("Inscrever-se");
        btnINSCREVER.setEnabled(false);
        btnINSCREVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINSCREVERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnINSCREVER, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPESQUISAR, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPESQUISAR, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnINSCREVER, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPESQUISARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPESQUISARActionPerformed

    }//GEN-LAST:event_txtPESQUISARActionPerformed

    private void txtPESQUISARKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPESQUISARKeyReleased
       carregarTabelaCurso();
    }//GEN-LAST:event_txtPESQUISARKeyReleased

    private void tblCURSOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCURSOSMouseClicked
        btnINSCREVER.setEnabled(true);
    }//GEN-LAST:event_tblCURSOSMouseClicked

    private void btnLOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLOGOUTActionPerformed
        
        int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Aviso", 0, 3);
        
        if(opc == 0){
            dispose();
            new Janela_login().setVisible(true);
        }
      
    }//GEN-LAST:event_btnLOGOUTActionPerformed

    private void btnEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEDITARActionPerformed
        dispose();
        new Janela_cadastro(this.usuario).setVisible(true);
    }//GEN-LAST:event_btnEDITARActionPerformed

    private void btnINSCREVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINSCREVERActionPerformed
       inscreverse();
       carregarTabelaCurso();
    }//GEN-LAST:event_btnINSCREVERActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Janela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela_principal(null).setVisible(true);
            }
        });
    }
    
    public void carregarTabelaCurso(){
        
        Assiste_DAO daoA = new Assiste_DAO();
        Cursos_DAO dao = new Cursos_DAO();
        DefaultTableModel modeloCurso = (DefaultTableModel) tblCURSOS.getModel();
        modeloCurso.getDataVector().clear();
        
        if (txtPESQUISAR.getText().trim().equals("")){
               List<String> nomeCurso = new ArrayList<>();
               
            for(Assis_Usua_Curs_DAO a: daoA.mostrarAssiste(usuario.getMatricula())){
                 nomeCurso.add(a.getNome_cursoA()); 
            }
               
            for(Cursos c: dao.mostrarCursos()){
               if(!nomeCurso.contains(c.getNome_curso())){
                   modeloCurso.addRow(new Object[]{c.getId_curso(), c.getNome_curso(), c.getDescricao(), c.getCarga_horaria()});
                }
            }
    
        }else{
            
            List<String> nomeCurso = new ArrayList<>();
            
            for(Assis_Usua_Curs_DAO a: daoA.mostrarAssiste(usuario.getMatricula())){
                nomeCurso.add(a.getNome_cursoA());
            } 
            
            for(Cursos c: dao.pesquisarCurso(txtPESQUISAR.getText().trim())){
                if(!nomeCurso.contains(c.getNome_curso())){
                    modeloCurso.addRow(new Object[]{c.getId_curso(), c.getNome_curso(), c.getDescricao(), c.getCarga_horaria()});
                }
            }      
        }
    
    }
    
    
    public void carregarTabelaMeusCursos(){
        
        Assiste_DAO dao = new Assiste_DAO();
        DefaultTableModel modeloMeu = (DefaultTableModel) tblMEUSCURSOS.getModel();
        modeloMeu.getDataVector().clear();
        
        for(Assis_Usua_Curs_DAO a: dao.mostrarAssiste(usuario.getMatricula())){
            modeloMeu.addRow(new Object[] {a.getId_cursoA(), a.getNome_cursoA(), a.getDescricaoA(), a.getCarga_horariaA(), a.getData_assisteA()});
        }
        
    }
    
    
    public void inscreverse(){
        
         try{
            DefaultTableModel modeloCursos = (DefaultTableModel) tblCURSOS.getModel();
            Assiste_DAO assiste = new Assiste_DAO();
            Assiste a = new Assiste();
            
            int id_curso = (int) modeloCursos.getValueAt(tblCURSOS.getSelectedRow(), 0);
            
            a.setMatriculaEst(this.usuario.getMatricula());
            a.setId_cursoEst(id_curso);
            a.setData_assiste(new Date());
            
            assiste.inserirAssiste(a);
            
            JOptionPane.showMessageDialog(null, "Inscrição realizada com sucesso.");
            carregarTabelaMeusCursos();
            
        }catch (ArrayIndexOutOfBoundsException erro) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha da tabela.", "Alerta", 2);
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "InscreverCurso: " + erro.getMessage());
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEDITAR;
    private javax.swing.JButton btnINSCREVER;
    private javax.swing.JButton btnLOGOUT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDATA;
    private javax.swing.JLabel lblEMAIL;
    private javax.swing.JLabel lblIDADE;
    private javax.swing.JLabel lblMATRICULA;
    private javax.swing.JLabel lblNOME;
    private javax.swing.JLabel lblSENHA;
    private javax.swing.JLabel lblSEXO;
    private javax.swing.JLabel lblUSUARIO;
    private javax.swing.JTable tblCURSOS;
    private javax.swing.JTable tblMEUSCURSOS;
    private javax.swing.JTextField txtPESQUISAR;
    // End of variables declaration//GEN-END:variables
}
