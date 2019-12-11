/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JPanel;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import controller.MainHome_Controller;
import exceptions.MyException;
import javax.swing.table.DefaultTableModel;

import static view.starter.entrar;
import static view.starter.window;

/**
 *
 * @author black
 */
public class MainHome extends javax.swing.JPanel {

    /**
     * Creates new form registro_cultivo
     */
    
    public static Sign_in presentacion;        
    public static AddCrop_UI agregar; 
    public static ReportPlague_UI reporte;
    public static TrackCrops_UI track;
    public int count;
    

    HashMap<String,String> currentCrops;
    DefaultListModel listModel;
    MainHome_Controller controller = new MainHome_Controller();

    
    public MainHome() {
        initComponents();
        setCropsNamesInList();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_tabbed_panel = new javax.swing.JTabbedPane();
        table_news_scroll = new javax.swing.JScrollPane();
        table_news = new javax.swing.JTable();
        panel_mapa = new javax.swing.JPanel();
        myCrops_pnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myCrops_list = new javax.swing.JList<String>();
        track_btn = new javax.swing.JButton();
        myCrops_lbl = new javax.swing.JLabel();
        logout_btn = new javax.swing.JButton();
        addCrop_btn = new javax.swing.JButton();
        report_btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setMaximumSize(new java.awt.Dimension(1000, 626));
        setMinimumSize(new java.awt.Dimension(1000, 626));
        setPreferredSize(new java.awt.Dimension(1000, 626));

        Main_tabbed_panel.setMaximumSize(new java.awt.Dimension(1000, 626));
        Main_tabbed_panel.setMinimumSize(new java.awt.Dimension(1000, 626));
        Main_tabbed_panel.setPreferredSize(new java.awt.Dimension(1000, 626));

        table_news.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "nombre", "titulo", "plaga", "descripcion"
            }
        ));
        table_news.setToolTipText("");
        table_news.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table_news.setEnabled(false);
        table_news.setFocusable(false);
        table_news.setRowHeight(90);
        table_news.setRowMargin(10);
        table_news_scroll.setViewportView(table_news);

        Main_tabbed_panel.addTab("noticias", table_news_scroll);

        panel_mapa.setBackground(new java.awt.Color(204, 255, 204));
        panel_mapa.setMaximumSize(new java.awt.Dimension(1000, 626));
        panel_mapa.setMinimumSize(new java.awt.Dimension(1000, 626));
        panel_mapa.setPreferredSize(new java.awt.Dimension(1000, 626));

        javax.swing.GroupLayout panel_mapaLayout = new javax.swing.GroupLayout(panel_mapa);
        panel_mapa.setLayout(panel_mapaLayout);
        panel_mapaLayout.setHorizontalGroup(
            panel_mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_mapaLayout.setVerticalGroup(
            panel_mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Main_tabbed_panel.addTab("Mapa", panel_mapa);

        myCrops_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                myCrops_listValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(myCrops_list);

        track_btn.setText("Track");
        track_btn.setEnabled(false);
        track_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                track_btnActionPerformed(evt);
            }
        });

        myCrops_lbl.setFont(new java.awt.Font("Harrington", 0, 36)); // NOI18N
        myCrops_lbl.setText("Mis Cultivos");

        javax.swing.GroupLayout myCrops_pnlLayout = new javax.swing.GroupLayout(myCrops_pnl);
        myCrops_pnl.setLayout(myCrops_pnlLayout);
        myCrops_pnlLayout.setHorizontalGroup(
            myCrops_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myCrops_pnlLayout.createSequentialGroup()
                .addGroup(myCrops_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myCrops_pnlLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(track_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myCrops_pnlLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(myCrops_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        myCrops_pnlLayout.setVerticalGroup(
            myCrops_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myCrops_pnlLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(myCrops_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(myCrops_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myCrops_pnlLayout.createSequentialGroup()
                        .addComponent(track_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myCrops_pnlLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );

        Main_tabbed_panel.addTab("Mis Cultivos", myCrops_pnl);

        logout_btn.setText("cerrar sesion");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        addCrop_btn.setText("Agregar cultivo");
        addCrop_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCrop_btnActionPerformed(evt);
            }
        });

        report_btn.setText("Reportar plaga");
        report_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(582, 582, 582)
                        .addComponent(report_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addCrop_btn)
                        .addGap(47, 47, 47)
                        .addComponent(logout_btn))
                    .addComponent(Main_tabbed_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout_btn)
                    .addComponent(addCrop_btn)
                    .addComponent(report_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Main_tabbed_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        returnToSignIn();         
    }//GEN-LAST:event_logout_btnActionPerformed

    private void addCrop_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCrop_btnActionPerformed
        goToAddCrop();
    }//GEN-LAST:event_addCrop_btnActionPerformed

    private void report_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_btnActionPerformed
        goToReport();
    }//GEN-LAST:event_report_btnActionPerformed

    private void track_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_track_btnActionPerformed
       showCropData();
    }//GEN-LAST:event_track_btnActionPerformed

    private void myCrops_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_myCrops_listValueChanged
        track_btn.setEnabled(true);
    }//GEN-LAST:event_myCrops_listValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Main_tabbed_panel;
    private javax.swing.JButton addCrop_btn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout_btn;
    private javax.swing.JLabel myCrops_lbl;
    private javax.swing.JList<String> myCrops_list;
    private javax.swing.JPanel myCrops_pnl;
    private javax.swing.JPanel panel_mapa;
    private javax.swing.JButton report_btn;
    private javax.swing.JTable table_news;
    private javax.swing.JScrollPane table_news_scroll;
    private javax.swing.JButton track_btn;
    // End of variables declaration//GEN-END:variables


    /**
     * Method to return to the Sign In window
     */
    public void returnToSignIn(){
        presentacion = new Sign_in();
        presentacion.setSize(1000, 626);
        
        window.remove(entrar);
        

        window.add(presentacion);
        
        window.repaint();
        window.revalidate();
        
        window.setVisible(true);
    }
    
    /**
     * Method to move to the Add Crop window
     */
    public void goToAddCrop(){
        agregar = new AddCrop_UI();

        agregar.setSize(1000,626);

        window.remove(entrar);

        window.add(agregar);
        window.repaint();
        window.revalidate();
        window.setVisible(true);
    }
    
    /**
     * Method to go to the report window
     */
    public void goToReport(){
        reporte = new ReportPlague_UI();
        
        reporte.setSize(1000, 626);
        window.remove(entrar);
        window.add(reporte);
        window.repaint();
        window.revalidate();
        window.setVisible(true);
    }
    
    
    
    /**
     * Method to set a model to the crops names list
     */
    public void setCropsNamesInList(){
        currentCrops = new HashMap<>();
        listModel = new DefaultListModel();
        
        try{
            currentCrops = controller.getCropsNames();
            myCrops_list.setModel(listModel);
            
            for(int i=0; i<currentCrops.size(); i++){
                listModel.addElement(currentCrops.values().toArray()[i]);
            }
        }
        catch(MyException ex){
            ex.showException(this);
        }
    }
    
    /**
     * Method to show the crop information when track button is pressed
     */
    public void showCropData(){
        TrackCrops_UI track = new TrackCrops_UI();
        try{
            HashMap<String,String> data = controller.getCropData(this.myCrops_list.getSelectedValue());
            track.goToTrack(data);
        }
        catch(MyException ex){
            ex.showException(this);
        }
    }
    
    public void noticia(String nombre,String titulo,String plaga,String desc)
    {
        DefaultTableModel model = (DefaultTableModel) table_news.getModel(); 
        model.addRow(new Object[]{nombre,titulo,plaga,desc});
    }
}
