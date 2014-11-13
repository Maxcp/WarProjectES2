/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warproject;

import controller.Gerenciador;

/**
 *
 * @author Samsung
 */
public class TelaFimDeJogo extends javax.swing.JFrame {

    Gerenciador gerenciador = Gerenciador.getInstance();

    /**
     * Creates new form TelaFimDeJogo
     */
    public TelaFimDeJogo() {
        initComponents();
        gerenciador.pegaJogadorDaRodada();
        mensagemBaixo.setForeground(gerenciador.pegaJogadorDaRodada().getColor());
        mensagemCima.setForeground(gerenciador.pegaJogadorDaRodada().getColor());
        mensagemCima.setText("PARABÉNS JOGADOR " + gerenciador.pegaJogadorDaRodada().getNomeCor().toUpperCase() + ", VOCÊ VENCEU!!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensagemBaixo = new javax.swing.JLabel();
        thisIsSparta = new javax.swing.JLabel();
        mensagemCima = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensagemBaixo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mensagemBaixo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensagemBaixo.setText("OBRIGADO POR JOGAR :)");
        getContentPane().add(mensagemBaixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 440, 40));

        thisIsSparta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warproject/thisIsSparta.jpg"))); // NOI18N
        getContentPane().add(thisIsSparta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        mensagemCima.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mensagemCima.setText("PARABÉNS JOGADOR VERMELHO, VOCÊ VENCEU!!");
        getContentPane().add(mensagemCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        gerenciador.reiniciaGerenciador();
        TelaOpcoes telaDeOpt = new TelaOpcoes();
        telaDeOpt.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mensagemBaixo;
    private javax.swing.JLabel mensagemCima;
    private javax.swing.JLabel thisIsSparta;
    // End of variables declaration//GEN-END:variables
}