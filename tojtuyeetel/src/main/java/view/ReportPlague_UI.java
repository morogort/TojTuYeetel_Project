/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ReportPlague_Controller;
import exceptions.MyException;
import javax.swing.JOptionPane;
import static view.MainHome.reporte;
import static view.starter.entrar;
import static view.starter.window;

/**
 *
 * @author black
 */
public class ReportPlague_UI extends javax.swing.JPanel {

    ReportPlague_Controller controller = new ReportPlague_Controller();
    
    /**
     * Creates new form report_plaga
     */
    public ReportPlague_UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcao = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        tipoplaga = new javax.swing.JComboBox();
        back_btn = new javax.swing.JToggleButton();
        sendReport_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));
        setMaximumSize(new java.awt.Dimension(1000, 626));
        setMinimumSize(new java.awt.Dimension(1000, 626));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reportar plaga");

        descripcao.setColumns(20);
        descripcao.setRows(5);
        descripcao.setText("Describe la situacion...");
        jScrollPane1.setViewportView(descripcao);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Plaga encontrada");

        tipoplaga.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dragon amarillo", "Acaro blanco", "picudo de chile", "Minador de la hoja" }));

        back_btn.setText("Regresar");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        sendReport_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sendReport_btn.setText("Enviar reporte");
        sendReport_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendReport_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Titulo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(sendReport_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(tipoplaga, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_btn)
                .addGap(3, 3, 3)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tipoplaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(sendReport_btn)
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Back to home button event
     * @param evt 
     */
    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        returnToHome();
    }//GEN-LAST:event_back_btnActionPerformed
    /**
     * Send the view reference to the controller to create a new report
     * @param evt 
     */
    private void sendReport_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendReport_btnActionPerformed
        
        try{
            controller.report_crop(this);
            returnToHome();
        }
        catch(MyException ex){
            ex.showException(this);
        }
        
        
    }//GEN-LAST:event_sendReport_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton back_btn;
    public javax.swing.JTextArea descripcao;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton sendReport_btn;
    public javax.swing.JComboBox tipoplaga;
    public javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables

    /**
     * Method to change the actual window to the Home Window
     */
    public void returnToHome(){
        window.remove(reporte);        
        window.add(entrar);
        
        window.repaint();
        window.revalidate();
        window.setVisible(true);
    }
    
}