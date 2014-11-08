/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warproject;

import controller.Gerenciador;
import javax.swing.JButton;

/**
 *
 * @author 13221098774
 */
public class TelaDeJogo extends javax.swing.JFrame {
    Gerenciador gerenciador = Gerenciador.getInstance();
    /**
     * Creates new form TelaInicial
     */
    public TelaDeJogo() {
        initComponents();
        meuInitComponents();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaInteira = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logConsole = new javax.swing.JTextPane();
        console = new javax.swing.JLabel();
        painelOpcoes = new javax.swing.JTabbedPane();
        distribuir = new javax.swing.JPanel();
        labelPossui = new javax.swing.JLabel();
        qntExercitos = new javax.swing.JTextField();
        labelSoldados = new javax.swing.JLabel();
        Continuar = new javax.swing.JButton();
        reverter = new javax.swing.JButton();
        atacar = new javax.swing.JPanel();
        lPais = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        paisDefesa = new javax.swing.JTextField();
        paisAtaque = new javax.swing.JTextField();
        dadoUmAtaque = new javax.swing.JTextField();
        dadoUmDefesa = new javax.swing.JTextField();
        dadpDoisDefesa = new javax.swing.JTextField();
        dadoTresDefesa = new javax.swing.JTextField();
        dadoDoisAtaque = new javax.swing.JTextField();
        dadoTresAtaque = new javax.swing.JTextField();
        btnAtacar = new javax.swing.JButton();
        btnPassarAtaque = new javax.swing.JButton();
        movimentar = new javax.swing.JPanel();
        lbMovimentacao = new javax.swing.JLabel();
        passarMovimentacao = new javax.swing.JButton();
        lbPais = new javax.swing.JLabel();
        paisDe = new javax.swing.JTextField();
        paisPara = new javax.swing.JTextField();
        lbPara = new javax.swing.JLabel();
        numEx = new javax.swing.JLabel();
        qtdExercitos = new javax.swing.JFormattedTextField();
        enviaExercitos = new javax.swing.JButton();
        defender = new javax.swing.JPanel();
        dadoTresAtaqueD = new javax.swing.JTextField();
        paisDefesaD = new javax.swing.JTextField();
        dadoUmAtaqueD = new javax.swing.JTextField();
        xD = new javax.swing.JLabel();
        lPaisD = new javax.swing.JLabel();
        paisAtaqueD = new javax.swing.JTextField();
        btnDefenderD = new javax.swing.JButton();
        dadoTresDefesaD = new javax.swing.JTextField();
        dadoDoisAtaqueD = new javax.swing.JTextField();
        dadpDoisDefesaD = new javax.swing.JTextField();
        dadoUmDefesa1 = new javax.swing.JTextField();
        cartas = new javax.swing.JPanel();
        cartaObjetivo = new javax.swing.JLabel();
        cartaUm = new javax.swing.JLabel();
        cartaDois = new javax.swing.JLabel();
        cartaTres = new javax.swing.JLabel();
        cartaQuatro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTrocar = new javax.swing.JButton();
        btnTaurica = new javax.swing.JButton();
        btnBithynia = new javax.swing.JButton();
        btnDacia = new javax.swing.JButton();
        btnMoesia = new javax.swing.JButton();
        btnThracia = new javax.swing.JButton();
        btnMacedonia = new javax.swing.JButton();
        btnAchaca = new javax.swing.JButton();
        btnCreta = new javax.swing.JButton();
        btnAsia = new javax.swing.JButton();
        btnAssyria = new javax.swing.JButton();
        btnGalatia = new javax.swing.JButton();
        btnCappadocia = new javax.swing.JButton();
        btnPonfus = new javax.swing.JButton();
        btnArmenia = new javax.swing.JButton();
        btnMesopotamia = new javax.swing.JButton();
        btnSyria = new javax.swing.JButton();
        btnArabiaPetrae = new javax.swing.JButton();
        btnJudaca = new javax.swing.JButton();
        btnAegyptus = new javax.swing.JButton();
        btnCyrenaica = new javax.swing.JButton();
        btnNumidia = new javax.swing.JButton();
        btnMauritania = new javax.swing.JButton();
        btnAfrica = new javax.swing.JButton();
        btnSicilia = new javax.swing.JButton();
        btnItalia = new javax.swing.JButton();
        btnSardina = new javax.swing.JButton();
        btnCorsica = new javax.swing.JButton();
        btnRaetia = new javax.swing.JButton();
        btnGermaniaInferior = new javax.swing.JButton();
        btnBelgica = new javax.swing.JButton();
        btnLugdunensis = new javax.swing.JButton();
        btnAquitania = new javax.swing.JButton();
        btnLusitania = new javax.swing.JButton();
        btnTarraconensis = new javax.swing.JButton();
        btnBaetica = new javax.swing.JButton();
        btnNarbonensis = new javax.swing.JButton();
        btnBritania = new javax.swing.JButton();
        btnGermaniaSuperior = new javax.swing.JButton();
        btnPandomia = new javax.swing.JButton();
        btnIllyricum = new javax.swing.JButton();
        btnLycia = new javax.swing.JButton();
        btnCyprus = new javax.swing.JButton();
        mapaDoJogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        telaInteira.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setViewportView(logConsole);

        console.setText("Console");

        labelPossui.setText("Você possui:");

        qntExercitos.setText("0");
        qntExercitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qntExercitosActionPerformed(evt);
            }
        });

        labelSoldados.setText("soldados para distribuir.");

        Continuar.setText("Continuar");

        reverter.setText("Reverter");

        javax.swing.GroupLayout distribuirLayout = new javax.swing.GroupLayout(distribuir);
        distribuir.setLayout(distribuirLayout);
        distribuirLayout.setHorizontalGroup(
            distribuirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(distribuirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(distribuirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(distribuirLayout.createSequentialGroup()
                        .addComponent(labelPossui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qntExercitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSoldados)
                        .addGap(0, 191, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, distribuirLayout.createSequentialGroup()
                        .addComponent(reverter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Continuar)))
                .addContainerGap())
        );
        distribuirLayout.setVerticalGroup(
            distribuirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(distribuirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(distribuirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPossui)
                    .addComponent(qntExercitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSoldados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(distribuirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Continuar)
                    .addComponent(reverter))
                .addContainerGap())
        );

        painelOpcoes.addTab("Distribuir", distribuir);

        lPais.setText("Pais:");

        x.setText("X");

        paisDefesa.setText("Aegyptus");

        paisAtaque.setText("Cyrenaica");
        paisAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisAtaqueActionPerformed(evt);
            }
        });

        dadoUmAtaque.setText("0");

        dadoUmDefesa.setText("0");
        dadoUmDefesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoUmDefesaActionPerformed(evt);
            }
        });

        dadpDoisDefesa.setText("0");

        dadoTresDefesa.setText("0");

        dadoDoisAtaque.setText("0");

        dadoTresAtaque.setText("0");

        btnAtacar.setText("Atacar");

        btnPassarAtaque.setText("Passar");

        javax.swing.GroupLayout atacarLayout = new javax.swing.GroupLayout(atacar);
        atacar.setLayout(atacarLayout);
        atacarLayout.setHorizontalGroup(
            atacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atacarLayout.createSequentialGroup()
                .addGroup(atacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(atacarLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(atacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dadoUmAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(atacarLayout.createSequentialGroup()
                                .addComponent(lPais)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paisAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dadoDoisAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dadoTresAtaque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(x)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(atacarLayout.createSequentialGroup()
                        .addComponent(dadoTresDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtacar))
                    .addGroup(atacarLayout.createSequentialGroup()
                        .addGroup(atacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paisDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dadoUmDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addGroup(atacarLayout.createSequentialGroup()
                        .addComponent(dadpDoisDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPassarAtaque)))
                .addContainerGap())
        );
        atacarLayout.setVerticalGroup(
            atacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atacarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPais)
                    .addComponent(x)
                    .addComponent(paisDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paisAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadoUmAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadoUmDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadpDoisDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadoDoisAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPassarAtaque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(atacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadoTresDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadoTresAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtacar))
                .addContainerGap())
        );

        painelOpcoes.addTab("Atacar", atacar);

        lbMovimentacao.setText("Movimentação");

        passarMovimentacao.setText("Passar");

        lbPais.setText("Do pais");

        paisDe.setText("Africa");

        paisPara.setText("Sicilia");
        paisPara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisParaActionPerformed(evt);
            }
        });

        lbPara.setText("para");

        numEx.setText("Numero de exércitos:");

        qtdExercitos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        qtdExercitos.setText("0");

        enviaExercitos.setText("Enviar");

        javax.swing.GroupLayout movimentarLayout = new javax.swing.GroupLayout(movimentar);
        movimentar.setLayout(movimentarLayout);
        movimentarLayout.setHorizontalGroup(
            movimentarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movimentarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(movimentarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movimentarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(passarMovimentacao))
                    .addGroup(movimentarLayout.createSequentialGroup()
                        .addGroup(movimentarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMovimentacao)
                            .addGroup(movimentarLayout.createSequentialGroup()
                                .addGroup(movimentarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, movimentarLayout.createSequentialGroup()
                                        .addComponent(numEx)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qtdExercitos))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, movimentarLayout.createSequentialGroup()
                                        .addComponent(lbPais)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(paisDe, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbPara)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(movimentarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paisPara, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviaExercitos))))
                        .addGap(0, 147, Short.MAX_VALUE)))
                .addContainerGap())
        );
        movimentarLayout.setVerticalGroup(
            movimentarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movimentarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMovimentacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movimentarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPais)
                    .addComponent(paisDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paisPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movimentarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numEx)
                    .addComponent(qtdExercitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviaExercitos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(passarMovimentacao)
                .addContainerGap())
        );

        painelOpcoes.addTab("Movimentar", movimentar);

        dadoTresAtaqueD.setText("0");

        paisDefesaD.setText("Cappadocia");

        dadoUmAtaqueD.setText("0");

        xD.setText("X");

        lPaisD.setText("Pais:");

        paisAtaqueD.setText("Asia");

        btnDefenderD.setText("Defender");

        dadoTresDefesaD.setText("0");

        dadoDoisAtaqueD.setText("0");

        dadpDoisDefesaD.setText("0");

        dadoUmDefesa1.setText("0");
        dadoUmDefesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoUmDefesa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout defenderLayout = new javax.swing.GroupLayout(defender);
        defender.setLayout(defenderLayout);
        defenderLayout.setHorizontalGroup(
            defenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defenderLayout.createSequentialGroup()
                .addGroup(defenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defenderLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(defenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dadoUmAtaqueD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(defenderLayout.createSequentialGroup()
                                .addComponent(lPaisD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paisAtaqueD, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dadoDoisAtaqueD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dadoTresAtaqueD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(defenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defenderLayout.createSequentialGroup()
                        .addComponent(dadoTresDefesaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDefenderD))
                    .addGroup(defenderLayout.createSequentialGroup()
                        .addGroup(defenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paisDefesaD, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dadoUmDefesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dadpDoisDefesaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        defenderLayout.setVerticalGroup(
            defenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defenderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(defenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPaisD)
                    .addComponent(xD)
                    .addComponent(paisDefesaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paisAtaqueD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(defenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadoUmAtaqueD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadoUmDefesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(defenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadpDoisDefesaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadoDoisAtaqueD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(defenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadoTresDefesaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadoTresAtaqueD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDefenderD))
                .addContainerGap())
        );

        painelOpcoes.addTab("Defender", defender);

        cartaObjetivo.setText("Carta Objetivo");

        cartaUm.setText("Carta1");

        cartaDois.setText("Carta2");

        cartaTres.setText("Carta3");

        cartaQuatro.setText("Carta4");

        jLabel6.setText("Carta5");

        btnTrocar.setText("Trocar");

        javax.swing.GroupLayout cartasLayout = new javax.swing.GroupLayout(cartas);
        cartas.setLayout(cartasLayout);
        cartasLayout.setHorizontalGroup(
            cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cartasLayout.createSequentialGroup()
                        .addGroup(cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartaTres)
                            .addComponent(cartaObjetivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addGroup(cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartaQuatro)
                            .addComponent(cartaUm))
                        .addGap(108, 108, 108)
                        .addGroup(cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartaDois, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTrocar)))
                .addContainerGap())
        );
        cartasLayout.setVerticalGroup(
            cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cartaObjetivo)
                    .addComponent(cartaUm)
                    .addComponent(cartaDois))
                .addGap(46, 46, 46)
                .addGroup(cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cartaQuatro)
                    .addComponent(cartaTres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnTrocar)
                .addContainerGap())
        );

        painelOpcoes.addTab("Cartas", cartas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(console)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(painelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(console)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        telaInteira.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 1130, 210));

        btnTaurica.setBackground(new java.awt.Color(255, 255, 255));
        btnTaurica.setText("0");
        btnTaurica.setBorder(null);
        btnTaurica.setBorderPainted(false);
        btnTaurica.setName("btnTaurica"); // NOI18N
        btnTaurica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTauricaActionPerformed(evt);
            }
        });
        telaInteira.add(btnTaurica, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 18, 18));

        btnBithynia.setBackground(new java.awt.Color(255, 255, 255));
        btnBithynia.setText("0");
        btnBithynia.setBorder(null);
        btnBithynia.setBorderPainted(false);
        btnBithynia.setName("btnBithynia"); // NOI18N
        btnBithynia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBithyniaActionPerformed(evt);
            }
        });
        telaInteira.add(btnBithynia, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 18, 18));

        btnDacia.setBackground(new java.awt.Color(255, 255, 255));
        btnDacia.setText("0");
        btnDacia.setBorder(null);
        btnDacia.setBorderPainted(false);
        btnDacia.setName("btnDacia"); // NOI18N
        btnDacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaciaActionPerformed(evt);
            }
        });
        telaInteira.add(btnDacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 18, 18));

        btnMoesia.setBackground(new java.awt.Color(255, 255, 255));
        btnMoesia.setText("0");
        btnMoesia.setBorder(null);
        btnMoesia.setBorderPainted(false);
        btnMoesia.setName("btnMoesia"); // NOI18N
        btnMoesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoesiaActionPerformed(evt);
            }
        });
        telaInteira.add(btnMoesia, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 18, 18));

        btnThracia.setBackground(new java.awt.Color(255, 255, 255));
        btnThracia.setText("0");
        btnThracia.setBorder(null);
        btnThracia.setBorderPainted(false);
        btnThracia.setName("btnThracia"); // NOI18N
        btnThracia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThraciaActionPerformed(evt);
            }
        });
        telaInteira.add(btnThracia, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 18, 18));

        btnMacedonia.setBackground(new java.awt.Color(255, 255, 255));
        btnMacedonia.setText("0");
        btnMacedonia.setBorder(null);
        btnMacedonia.setBorderPainted(false);
        btnMacedonia.setName("btnMacedonia"); // NOI18N
        btnMacedonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMacedoniaActionPerformed(evt);
            }
        });
        telaInteira.add(btnMacedonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 18, 18));

        btnAchaca.setBackground(new java.awt.Color(255, 255, 255));
        btnAchaca.setText("0");
        btnAchaca.setBorder(null);
        btnAchaca.setBorderPainted(false);
        btnAchaca.setName("btnAchaca"); // NOI18N
        btnAchaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAchacaActionPerformed(evt);
            }
        });
        telaInteira.add(btnAchaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 18, 18));

        btnCreta.setBackground(new java.awt.Color(255, 255, 255));
        btnCreta.setText("0");
        btnCreta.setBorder(null);
        btnCreta.setBorderPainted(false);
        btnCreta.setName("btnCreta"); // NOI18N
        btnCreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCretaActionPerformed(evt);
            }
        });
        telaInteira.add(btnCreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 18, 18));

        btnAsia.setBackground(new java.awt.Color(255, 255, 255));
        btnAsia.setText("0");
        btnAsia.setBorder(null);
        btnAsia.setBorderPainted(false);
        btnAsia.setName("btnAsia"); // NOI18N
        btnAsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsiaActionPerformed(evt);
            }
        });
        telaInteira.add(btnAsia, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 18, 18));

        btnAssyria.setBackground(new java.awt.Color(255, 255, 255));
        btnAssyria.setText("0");
        btnAssyria.setBorder(null);
        btnAssyria.setBorderPainted(false);
        btnAssyria.setName("btnAssyria"); // NOI18N
        btnAssyria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssyriaActionPerformed(evt);
            }
        });
        telaInteira.add(btnAssyria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 250, 18, 18));

        btnGalatia.setBackground(new java.awt.Color(255, 255, 255));
        btnGalatia.setText("0");
        btnGalatia.setBorder(null);
        btnGalatia.setBorderPainted(false);
        btnGalatia.setName("btnGalatia"); // NOI18N
        btnGalatia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGalatiaActionPerformed(evt);
            }
        });
        telaInteira.add(btnGalatia, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 18, 18));

        btnCappadocia.setBackground(new java.awt.Color(255, 255, 255));
        btnCappadocia.setText("0");
        btnCappadocia.setBorder(null);
        btnCappadocia.setBorderPainted(false);
        btnCappadocia.setName("btnCappadocia"); // NOI18N
        btnCappadocia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCappadociaActionPerformed(evt);
            }
        });
        telaInteira.add(btnCappadocia, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, 18, 18));

        btnPonfus.setBackground(new java.awt.Color(255, 255, 255));
        btnPonfus.setText("0");
        btnPonfus.setBorder(null);
        btnPonfus.setBorderPainted(false);
        btnPonfus.setName("btnPonfus"); // NOI18N
        btnPonfus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPonfusActionPerformed(evt);
            }
        });
        telaInteira.add(btnPonfus, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, 18, 18));

        btnArmenia.setBackground(new java.awt.Color(255, 255, 255));
        btnArmenia.setText("0");
        btnArmenia.setBorder(null);
        btnArmenia.setBorderPainted(false);
        btnArmenia.setName("btnArmenia"); // NOI18N
        btnArmenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArmeniaActionPerformed(evt);
            }
        });
        telaInteira.add(btnArmenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 200, 18, 18));

        btnMesopotamia.setBackground(new java.awt.Color(255, 255, 255));
        btnMesopotamia.setText("0");
        btnMesopotamia.setBorder(null);
        btnMesopotamia.setBorderPainted(false);
        btnMesopotamia.setName("btnMesopotamia"); // NOI18N
        btnMesopotamia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesopotamiaActionPerformed(evt);
            }
        });
        telaInteira.add(btnMesopotamia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 270, 18, 18));

        btnSyria.setBackground(new java.awt.Color(255, 255, 255));
        btnSyria.setText("0");
        btnSyria.setBorder(null);
        btnSyria.setBorderPainted(false);
        btnSyria.setName("btnSyria"); // NOI18N
        btnSyria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSyriaActionPerformed(evt);
            }
        });
        telaInteira.add(btnSyria, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 290, 18, 18));

        btnArabiaPetrae.setBackground(new java.awt.Color(255, 255, 255));
        btnArabiaPetrae.setText("0");
        btnArabiaPetrae.setBorder(null);
        btnArabiaPetrae.setBorderPainted(false);
        btnArabiaPetrae.setName("btnArabiaPetrae"); // NOI18N
        btnArabiaPetrae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArabiaPetraeActionPerformed(evt);
            }
        });
        telaInteira.add(btnArabiaPetrae, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, 18, 18));

        btnJudaca.setBackground(new java.awt.Color(255, 255, 255));
        btnJudaca.setText("0");
        btnJudaca.setBorder(null);
        btnJudaca.setBorderPainted(false);
        btnJudaca.setName("btnJudaca"); // NOI18N
        btnJudaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJudacaActionPerformed(evt);
            }
        });
        telaInteira.add(btnJudaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 18, 18));

        btnAegyptus.setBackground(new java.awt.Color(255, 255, 255));
        btnAegyptus.setText("0");
        btnAegyptus.setBorder(null);
        btnAegyptus.setBorderPainted(false);
        btnAegyptus.setName("btnAegyptus"); // NOI18N
        btnAegyptus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAegyptusActionPerformed(evt);
            }
        });
        telaInteira.add(btnAegyptus, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 18, 18));

        btnCyrenaica.setBackground(new java.awt.Color(255, 255, 255));
        btnCyrenaica.setText("0");
        btnCyrenaica.setBorder(null);
        btnCyrenaica.setBorderPainted(false);
        btnCyrenaica.setName("btnCyrenaica"); // NOI18N
        btnCyrenaica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCyrenaicaActionPerformed(evt);
            }
        });
        telaInteira.add(btnCyrenaica, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 18, 18));

        btnNumidia.setBackground(new java.awt.Color(255, 255, 255));
        btnNumidia.setText("0");
        btnNumidia.setBorder(null);
        btnNumidia.setBorderPainted(false);
        btnNumidia.setName("btnNumidia"); // NOI18N
        btnNumidia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumidiaActionPerformed(evt);
            }
        });
        telaInteira.add(btnNumidia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 18, 18));

        btnMauritania.setBackground(new java.awt.Color(255, 255, 255));
        btnMauritania.setText("0");
        btnMauritania.setBorder(null);
        btnMauritania.setBorderPainted(false);
        btnMauritania.setName("btnMauritania"); // NOI18N
        btnMauritania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMauritaniaActionPerformed(evt);
            }
        });
        telaInteira.add(btnMauritania, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 18, 18));

        btnAfrica.setBackground(new java.awt.Color(255, 255, 255));
        btnAfrica.setText("0");
        btnAfrica.setBorder(null);
        btnAfrica.setBorderPainted(false);
        btnAfrica.setName("btnAfrica"); // NOI18N
        btnAfrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfricaActionPerformed(evt);
            }
        });
        telaInteira.add(btnAfrica, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 18, 18));

        btnSicilia.setBackground(new java.awt.Color(255, 255, 255));
        btnSicilia.setText("0");
        btnSicilia.setBorder(null);
        btnSicilia.setBorderPainted(false);
        btnSicilia.setName("btnSicilia"); // NOI18N
        btnSicilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiciliaActionPerformed(evt);
            }
        });
        telaInteira.add(btnSicilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 18, 18));

        btnItalia.setBackground(new java.awt.Color(255, 255, 255));
        btnItalia.setText("0");
        btnItalia.setBorder(null);
        btnItalia.setBorderPainted(false);
        btnItalia.setName("btnItalia"); // NOI18N
        btnItalia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItaliaActionPerformed(evt);
            }
        });
        telaInteira.add(btnItalia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 18, 18));

        btnSardina.setBackground(new java.awt.Color(255, 255, 255));
        btnSardina.setText("0");
        btnSardina.setBorder(null);
        btnSardina.setBorderPainted(false);
        btnSardina.setName("btnSardina"); // NOI18N
        btnSardina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSardinaActionPerformed(evt);
            }
        });
        telaInteira.add(btnSardina, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 18, 18));

        btnCorsica.setBackground(new java.awt.Color(255, 255, 255));
        btnCorsica.setText("0");
        btnCorsica.setBorder(null);
        btnCorsica.setBorderPainted(false);
        btnCorsica.setName("btnCorsica"); // NOI18N
        btnCorsica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorsicaActionPerformed(evt);
            }
        });
        telaInteira.add(btnCorsica, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 18, 18));

        btnRaetia.setBackground(new java.awt.Color(255, 255, 255));
        btnRaetia.setText("0");
        btnRaetia.setBorder(null);
        btnRaetia.setBorderPainted(false);
        btnRaetia.setName("btnRaetia"); // NOI18N
        btnRaetia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaetiaActionPerformed(evt);
            }
        });
        telaInteira.add(btnRaetia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 18, 18));

        btnGermaniaInferior.setBackground(new java.awt.Color(255, 255, 255));
        btnGermaniaInferior.setText("0");
        btnGermaniaInferior.setBorder(null);
        btnGermaniaInferior.setBorderPainted(false);
        btnGermaniaInferior.setName("btnGermaniaInferior"); // NOI18N
        btnGermaniaInferior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGermaniaInferiorActionPerformed(evt);
            }
        });
        telaInteira.add(btnGermaniaInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 18, 18));

        btnBelgica.setBackground(new java.awt.Color(255, 255, 255));
        btnBelgica.setText("0");
        btnBelgica.setBorder(null);
        btnBelgica.setBorderPainted(false);
        btnBelgica.setName("btnBelgica"); // NOI18N
        btnBelgica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBelgicaActionPerformed(evt);
            }
        });
        telaInteira.add(btnBelgica, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 18, 18));

        btnLugdunensis.setBackground(new java.awt.Color(255, 255, 255));
        btnLugdunensis.setText("0");
        btnLugdunensis.setBorder(null);
        btnLugdunensis.setBorderPainted(false);
        btnLugdunensis.setName("btnLugdunensis"); // NOI18N
        btnLugdunensis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugdunensisActionPerformed(evt);
            }
        });
        telaInteira.add(btnLugdunensis, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 18, 18));

        btnAquitania.setBackground(new java.awt.Color(255, 255, 255));
        btnAquitania.setText("0");
        btnAquitania.setBorder(null);
        btnAquitania.setBorderPainted(false);
        btnAquitania.setName("btnAquitania"); // NOI18N
        btnAquitania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAquitaniaActionPerformed(evt);
            }
        });
        telaInteira.add(btnAquitania, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 18, 18));

        btnLusitania.setBackground(new java.awt.Color(255, 255, 255));
        btnLusitania.setText("0");
        btnLusitania.setBorder(null);
        btnLusitania.setBorderPainted(false);
        btnLusitania.setName("btnLusitania"); // NOI18N
        btnLusitania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLusitaniaActionPerformed(evt);
            }
        });
        telaInteira.add(btnLusitania, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 18, 18));

        btnTarraconensis.setBackground(new java.awt.Color(255, 255, 255));
        btnTarraconensis.setText("0");
        btnTarraconensis.setBorder(null);
        btnTarraconensis.setBorderPainted(false);
        btnTarraconensis.setName("btnTarraconensis"); // NOI18N
        btnTarraconensis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarraconensisActionPerformed(evt);
            }
        });
        telaInteira.add(btnTarraconensis, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 18, 18));

        btnBaetica.setBackground(new java.awt.Color(255, 255, 255));
        btnBaetica.setText("0");
        btnBaetica.setBorder(null);
        btnBaetica.setBorderPainted(false);
        btnBaetica.setName("btnBaetica"); // NOI18N
        btnBaetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaeticaActionPerformed(evt);
            }
        });
        telaInteira.add(btnBaetica, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 18, 18));

        btnNarbonensis.setBackground(new java.awt.Color(255, 255, 255));
        btnNarbonensis.setText("0");
        btnNarbonensis.setBorder(null);
        btnNarbonensis.setBorderPainted(false);
        btnNarbonensis.setName("btnNarbonensis"); // NOI18N
        btnNarbonensis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNarbonensisActionPerformed(evt);
            }
        });
        telaInteira.add(btnNarbonensis, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 18, 18));

        btnBritania.setBackground(new java.awt.Color(255, 255, 255));
        btnBritania.setText("0");
        btnBritania.setBorder(null);
        btnBritania.setBorderPainted(false);
        btnBritania.setName("btnBritania"); // NOI18N
        btnBritania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBritaniaActionPerformed(evt);
            }
        });
        telaInteira.add(btnBritania, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 18, 18));

        btnGermaniaSuperior.setBackground(new java.awt.Color(255, 255, 255));
        btnGermaniaSuperior.setText("0");
        btnGermaniaSuperior.setBorder(null);
        btnGermaniaSuperior.setBorderPainted(false);
        btnGermaniaSuperior.setName("btnGermaniaSuperior"); // NOI18N
        btnGermaniaSuperior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGermaniaSuperiorActionPerformed(evt);
            }
        });
        telaInteira.add(btnGermaniaSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 18, 18));

        btnPandomia.setBackground(new java.awt.Color(255, 255, 255));
        btnPandomia.setText("0");
        btnPandomia.setBorder(null);
        btnPandomia.setBorderPainted(false);
        btnPandomia.setName("btnPandomia"); // NOI18N
        btnPandomia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPandomiaActionPerformed(evt);
            }
        });
        telaInteira.add(btnPandomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 18, 18));

        btnIllyricum.setBackground(new java.awt.Color(255, 255, 255));
        btnIllyricum.setText("0");
        btnIllyricum.setBorder(null);
        btnIllyricum.setBorderPainted(false);
        btnIllyricum.setName("btnIllyricum"); // NOI18N
        btnIllyricum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIllyricumActionPerformed(evt);
            }
        });
        telaInteira.add(btnIllyricum, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 18, 18));

        btnLycia.setBackground(new java.awt.Color(255, 255, 255));
        btnLycia.setText("0");
        btnLycia.setBorder(null);
        btnLycia.setBorderPainted(false);
        btnLycia.setName("btnLycia"); // NOI18N
        btnLycia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLyciaActionPerformed(evt);
            }
        });
        telaInteira.add(btnLycia, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 18, 18));

        btnCyprus.setBackground(new java.awt.Color(255, 255, 255));
        btnCyprus.setText("0");
        btnCyprus.setBorder(null);
        btnCyprus.setBorderPainted(false);
        btnCyprus.setName("btnCyprus"); // NOI18N
        btnCyprus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCyprusActionPerformed(evt);
            }
        });
        telaInteira.add(btnCyprus, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, 18, 18));

        mapaDoJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warproject/Mapa.png"))); // NOI18N
        telaInteira.add(mapaDoJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telaInteira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(telaInteira, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qntExercitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qntExercitosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qntExercitosActionPerformed

    private void dadoUmDefesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoUmDefesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dadoUmDefesaActionPerformed

    private void paisParaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisParaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisParaActionPerformed

    private void dadoUmDefesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoUmDefesa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dadoUmDefesa1ActionPerformed

    private void paisAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisAtaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisAtaqueActionPerformed

    private void btnTauricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTauricaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTauricaActionPerformed

    private void btnBithyniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBithyniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBithyniaActionPerformed

    private void btnDaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDaciaActionPerformed

    private void btnMoesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoesiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMoesiaActionPerformed

    private void btnThraciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThraciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThraciaActionPerformed

    private void btnMacedoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMacedoniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMacedoniaActionPerformed

    private void btnAchacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAchacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAchacaActionPerformed

    private void btnCretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCretaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCretaActionPerformed

    private void btnAsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsiaActionPerformed

    private void btnAssyriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssyriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssyriaActionPerformed

    private void btnGalatiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGalatiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGalatiaActionPerformed

    private void btnCappadociaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCappadociaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCappadociaActionPerformed

    private void btnPonfusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPonfusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPonfusActionPerformed

    private void btnArmeniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArmeniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArmeniaActionPerformed

    private void btnMesopotamiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesopotamiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMesopotamiaActionPerformed

    private void btnSyriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSyriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSyriaActionPerformed

    private void btnArabiaPetraeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArabiaPetraeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArabiaPetraeActionPerformed

    private void btnJudacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJudacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJudacaActionPerformed

    private void btnAegyptusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAegyptusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAegyptusActionPerformed

    private void btnCyrenaicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCyrenaicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCyrenaicaActionPerformed

    private void btnNumidiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumidiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumidiaActionPerformed

    private void btnMauritaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMauritaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMauritaniaActionPerformed

    private void btnAfricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfricaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAfricaActionPerformed

    private void btnSiciliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiciliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiciliaActionPerformed

    private void btnItaliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItaliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnItaliaActionPerformed

    private void btnSardinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSardinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSardinaActionPerformed

    private void btnCorsicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorsicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCorsicaActionPerformed

    private void btnRaetiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaetiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRaetiaActionPerformed

    private void btnGermaniaInferiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGermaniaInferiorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGermaniaInferiorActionPerformed

    private void btnBelgicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBelgicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBelgicaActionPerformed

    private void btnLugdunensisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugdunensisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLugdunensisActionPerformed

    private void btnAquitaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAquitaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAquitaniaActionPerformed

    private void btnTarraconensisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarraconensisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTarraconensisActionPerformed

    private void btnLusitaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLusitaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLusitaniaActionPerformed

    private void btnBaeticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaeticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBaeticaActionPerformed

    private void btnNarbonensisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNarbonensisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNarbonensisActionPerformed

    private void btnBritaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBritaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBritaniaActionPerformed

    private void btnGermaniaSuperiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGermaniaSuperiorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGermaniaSuperiorActionPerformed

    private void btnPandomiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPandomiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPandomiaActionPerformed

    private void btnIllyricumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIllyricumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIllyricumActionPerformed

    private void btnLyciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLyciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLyciaActionPerformed

    private void btnCyprusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCyprusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCyprusActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continuar;
    private javax.swing.JPanel atacar;
    private javax.swing.JButton btnAchaca;
    private javax.swing.JButton btnAegyptus;
    private javax.swing.JButton btnAfrica;
    private javax.swing.JButton btnAquitania;
    private javax.swing.JButton btnArabiaPetrae;
    private javax.swing.JButton btnArmenia;
    private javax.swing.JButton btnAsia;
    private javax.swing.JButton btnAssyria;
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnBaetica;
    private javax.swing.JButton btnBelgica;
    private javax.swing.JButton btnBithynia;
    private javax.swing.JButton btnBritania;
    private javax.swing.JButton btnCappadocia;
    private javax.swing.JButton btnCorsica;
    private javax.swing.JButton btnCreta;
    private javax.swing.JButton btnCyprus;
    private javax.swing.JButton btnCyrenaica;
    private javax.swing.JButton btnDacia;
    private javax.swing.JButton btnDefenderD;
    private javax.swing.JButton btnGalatia;
    private javax.swing.JButton btnGermaniaInferior;
    private javax.swing.JButton btnGermaniaSuperior;
    private javax.swing.JButton btnIllyricum;
    private javax.swing.JButton btnItalia;
    private javax.swing.JButton btnJudaca;
    private javax.swing.JButton btnLugdunensis;
    private javax.swing.JButton btnLusitania;
    private javax.swing.JButton btnLycia;
    private javax.swing.JButton btnMacedonia;
    private javax.swing.JButton btnMauritania;
    private javax.swing.JButton btnMesopotamia;
    private javax.swing.JButton btnMoesia;
    private javax.swing.JButton btnNarbonensis;
    private javax.swing.JButton btnNumidia;
    private javax.swing.JButton btnPandomia;
    private javax.swing.JButton btnPassarAtaque;
    private javax.swing.JButton btnPonfus;
    private javax.swing.JButton btnRaetia;
    private javax.swing.JButton btnSardina;
    private javax.swing.JButton btnSicilia;
    private javax.swing.JButton btnSyria;
    private javax.swing.JButton btnTarraconensis;
    private javax.swing.JButton btnTaurica;
    private javax.swing.JButton btnThracia;
    private javax.swing.JButton btnTrocar;
    private javax.swing.JLabel cartaDois;
    private javax.swing.JLabel cartaObjetivo;
    private javax.swing.JLabel cartaQuatro;
    private javax.swing.JLabel cartaTres;
    private javax.swing.JLabel cartaUm;
    private javax.swing.JPanel cartas;
    private javax.swing.JLabel console;
    private javax.swing.JTextField dadoDoisAtaque;
    private javax.swing.JTextField dadoDoisAtaqueD;
    private javax.swing.JTextField dadoTresAtaque;
    private javax.swing.JTextField dadoTresAtaqueD;
    private javax.swing.JTextField dadoTresDefesa;
    private javax.swing.JTextField dadoTresDefesaD;
    private javax.swing.JTextField dadoUmAtaque;
    private javax.swing.JTextField dadoUmAtaqueD;
    private javax.swing.JTextField dadoUmDefesa;
    private javax.swing.JTextField dadoUmDefesa1;
    private javax.swing.JTextField dadpDoisDefesa;
    private javax.swing.JTextField dadpDoisDefesaD;
    private javax.swing.JPanel defender;
    private javax.swing.JPanel distribuir;
    private javax.swing.JButton enviaExercitos;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lPais;
    private javax.swing.JLabel lPaisD;
    private javax.swing.JLabel labelPossui;
    private javax.swing.JLabel labelSoldados;
    private javax.swing.JLabel lbMovimentacao;
    private javax.swing.JLabel lbPais;
    private javax.swing.JLabel lbPara;
    private javax.swing.JTextPane logConsole;
    private javax.swing.JLabel mapaDoJogo;
    private javax.swing.JPanel movimentar;
    private javax.swing.JLabel numEx;
    private javax.swing.JTabbedPane painelOpcoes;
    private javax.swing.JTextField paisAtaque;
    private javax.swing.JTextField paisAtaqueD;
    private javax.swing.JTextField paisDe;
    private javax.swing.JTextField paisDefesa;
    private javax.swing.JTextField paisDefesaD;
    private javax.swing.JTextField paisPara;
    private javax.swing.JButton passarMovimentacao;
    private javax.swing.JTextField qntExercitos;
    private javax.swing.JFormattedTextField qtdExercitos;
    private javax.swing.JButton reverter;
    private javax.swing.JPanel telaInteira;
    private javax.swing.JLabel x;
    private javax.swing.JLabel xD;
    // End of variables declaration//GEN-END:variables

    private void meuInitComponents() {
        JButton btnterritorios[] = {
            btnBaetica,
            btnLusitania,
            btnTarraconensis,
            btnAquitania,
            btnLugdunensis,
            btnBritania,
            btnNarbonensis,
            btnBelgica,
            btnGermaniaSuperior,
            btnGermaniaInferior,
            btnRaetia,
            btnPandomia,
            btnIllyricum,
            btnItalia,
            btnCorsica,
            btnSardina,
            btnSicilia,
            btnMauritania,
            btnAfrica,
            btnNumidia,
            btnCyrenaica,
            btnDacia,
            btnMoesia,
            btnThracia,
            btnMacedonia,
            btnAchaca,
            btnCreta,
            btnAsia,
            btnGalatia,
            btnBithynia,
            btnTaurica,
            btnCyprus,
            btnLycia,
            btnCappadocia,
            btnPonfus,
            btnArmenia,
            btnAssyria,
            btnMesopotamia,
            btnSyria,
            btnJudaca,
            btnArabiaPetrae,
            btnAegyptus
        };
        gerenciador.setTerritoriosJogadores(btnterritorios);
    }
}
