/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;
import com.github.britooo.looca.api.group.servicos.Servico;
import com.github.britooo.looca.api.group.servicos.ServicoGrupo;
import com.github.britooo.looca.api.group.temperatura.Temperatura;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class TelaPrincipal extends javax.swing.JFrame {

    Looca looca = new Looca();
    Sistema sistema = looca.getSistema();
    DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();
    ServicoGrupo grupoDeServicos = looca.getGrupoDeServicos();
    ProcessoGrupo grupoDeProcessos = looca.getGrupoDeProcessos();
    Temperatura temperatura = looca.getTemperatura();
    Memoria memoria = looca.getMemoria();
    Processador processador = looca.getProcessador();

    public TelaPrincipal() {
        initComponents();
        this.setResizable(false);
        this.looca = new Looca();
        this.setUpOs();

        cpu.setText(looca.getTemperatura().getTemperatura().toString());
        usoRam.setText(looca.getMemoria().getEmUso().toString());
        disponibilidadeRam.setText(looca.getMemoria().getDisponivel().toString());
        totalRam.setText(looca.getMemoria().getTotal().toString());

        int delay = 5000;
        int interval = 1000;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                cpu.setText(looca.getTemperatura().getTemperatura().toString());
                usoRam.setText(looca.getMemoria().getEmUso().toString());
                disponibilidadeRam.setText(looca.getMemoria().getDisponivel().toString());
                totalRam.setText(looca.getMemoria().getTotal().toString());

            }
        }, delay, interval);

    }

    private void setUpOs() {
        Sistema sistema = looca.getSistema();
        lblSistemaOperacionalValue.setText(String.format("▶ %s", sistema.getSistemaOperacional()));
        lblFabricanteValue.setText(String.format("▶ %s", sistema.getFabricante()));
        lblArquiteturaValue.setText(String.format("▶ %d bits", sistema.getArquitetura()));

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSistemaOperacionalValue = new javax.swing.JLabel();
        lblFabricanteValue = new javax.swing.JLabel();
        lblArquiteturaValue = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalRam = new javax.swing.JLabel();
        cpu = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        disponibilidadeRam = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        usoRam = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        grupoDeDisco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Fabricante:");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sistema Operacional:");
        jLabel2.setMaximumSize(new java.awt.Dimension(119, 25));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Arquitetura:");

        lblSistemaOperacionalValue.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        lblSistemaOperacionalValue.setForeground(new java.awt.Color(0, 0, 0));
        lblSistemaOperacionalValue.setText("--");

        lblFabricanteValue.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        lblFabricanteValue.setForeground(new java.awt.Color(0, 0, 0));
        lblFabricanteValue.setText("--");

        lblArquiteturaValue.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        lblArquiteturaValue.setForeground(new java.awt.Color(0, 0, 0));
        lblArquiteturaValue.setText("--");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\corin\\OneDrive\\Documentos\\NetBeansProjects\\projeto-point\\src\\main\\java\\telas\\PointPoint.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Disponibilidade RAM:");

        totalRam.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        totalRam.setForeground(new java.awt.Color(0, 0, 0));
        totalRam.setText("--");

        cpu.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        cpu.setForeground(new java.awt.Color(0, 0, 0));
        cpu.setText("--");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CPU:");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Memória RAM:");

        disponibilidadeRam.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        disponibilidadeRam.setForeground(new java.awt.Color(0, 0, 0));
        disponibilidadeRam.setText("--");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Uso de RAM:");

        usoRam.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        usoRam.setForeground(new java.awt.Color(0, 0, 0));
        usoRam.setText("--");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Discos:");

        grupoDeDisco.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        grupoDeDisco.setForeground(new java.awt.Color(0, 0, 0));
        grupoDeDisco.setText("--");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 282, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grupoDeDisco)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(cpu)
                    .addComponent(jLabel1)
                    .addComponent(lblFabricanteValue)
                    .addComponent(lblSistemaOperacionalValue)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(totalRam)
                            .addComponent(lblArquiteturaValue))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(disponibilidadeRam, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(usoRam, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSistemaOperacionalValue)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblFabricanteValue)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lblArquiteturaValue)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalRam)
                    .addComponent(disponibilidadeRam)
                    .addComponent(usoRam))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpu)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(grupoDeDisco)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cpu;
    private javax.swing.JLabel disponibilidadeRam;
    private javax.swing.JLabel grupoDeDisco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblArquiteturaValue;
    private javax.swing.JLabel lblFabricanteValue;
    private javax.swing.JLabel lblSistemaOperacionalValue;
    private javax.swing.JLabel totalRam;
    private javax.swing.JLabel usoRam;
    // End of variables declaration//GEN-END:variables
}
