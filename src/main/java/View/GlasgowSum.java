/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author wende
 */
public class GlasgowSum extends javax.swing.JFrame {

    /**
     * Creates new form GlasgowSum
     */
    int totalGeral = 0;

    public GlasgowSum() {
        initComponents();

        setExtendedState(MAXIMIZED_BOTH);

        ImageIcon ocular01 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/OCULAR - Espontanea.png")));
        Image img1 = ocular01.getImage();
        Image img2 = img1.getScaledInstance(jlOcularEspontanea.getWidth(), jlOcularEspontanea.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jlOcularEspontanea.setIcon(i);

        ImageIcon ocular02 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/OCULAR - Por Estimulo Verbal.png")));
        Image img3 = ocular02.getImage();
        Image img4 = img3.getScaledInstance(jlOcularEstimuloVerbal.getWidth(), jlOcularEstimuloVerbal.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon z = new ImageIcon(img4);
        jlOcularEstimuloVerbal.setIcon(z);

        ImageIcon ocular03 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/OCULAR - Por Estimulo a Dor.png")));
        Image img5 = ocular03.getImage();
        Image img6 = img5.getScaledInstance(jlOcularEstimuloDor.getWidth(), jlOcularEstimuloDor.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon a = new ImageIcon(img6);
        jlOcularEstimuloDor.setIcon(a);

        ImageIcon ocular04 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/OCULAR - Sem Resposta.png")));
        Image img7 = ocular04.getImage();
        Image img8 = img7.getScaledInstance(jlOcularSemResposta.getWidth(), jlOcularSemResposta.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon b = new ImageIcon(img8);
        jlOcularSemResposta.setIcon(b);

        ImageIcon verbal01 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/VERBAL - Confuso (mas falando).png")));
        Image imgv1 = verbal01.getImage();
        Image imgv2 = imgv1.getScaledInstance(jlVerbal1.getWidth(), jlVerbal1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon iv = new ImageIcon(imgv2);
        jlVerbal1.setIcon(iv);

        ImageIcon verbal02 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/VERBAL - Orientado e conversando.png")));
        Image imgv3 = verbal02.getImage();
        Image imgv4 = imgv3.getScaledInstance(jlVerbal2.getWidth(), jlVerbal2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon zv = new ImageIcon(imgv4);
        jlVerbal2.setIcon(zv);

        ImageIcon verbal03 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/VERBAL - Resposta Inapropriada.png")));
        Image imgv5 = verbal03.getImage();
        Image imgv6 = imgv5.getScaledInstance(jlVerbal3.getWidth(), jlVerbal3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon av = new ImageIcon(imgv6);
        jlVerbal3.setIcon(av);

        ImageIcon verbal04 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/VERBAL - Sons Incompativeis.png")));
        Image imgv7 = verbal04.getImage();
        Image imgv8 = imgv7.getScaledInstance(jlVerbal4.getWidth(), jlVerbal4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bv = new ImageIcon(imgv8);
        jlVerbal4.setIcon(bv);

        ImageIcon verbal05 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/VERBAL - Sem resposta.png")));
        Image imgv9 = verbal05.getImage();
        Image imgv10 = imgv9.getScaledInstance(jlVerbal5.getWidth(), jlVerbal5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon cv = new ImageIcon(imgv10);
        jlVerbal5.setIcon(cv);

        ImageIcon motora01 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/MOTORA - Obedece ordens.png")));
        Image imgm1 = motora01.getImage();
        Image imgm2 = imgm1.getScaledInstance(jlMotora1.getWidth(), jlMotora1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon im = new ImageIcon(imgm2);
        jlMotora1.setIcon(im);

        ImageIcon motora02 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/MOTORA - Localiza a Dor.png")));
        Image imgm3 = motora02.getImage();
        Image imgm4 = imgm3.getScaledInstance(jlMotora2.getWidth(), jlMotora2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon zm = new ImageIcon(imgm4);
        jlMotora2.setIcon(zm);

        ImageIcon motora03 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/MOTORA - Reage a dor mas nao localiza.png")));
        Image imgm5 = motora03.getImage();
        Image imgm6 = imgm5.getScaledInstance(jlMotora3.getWidth(), jlMotora3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon am = new ImageIcon(imgm6);
        jlMotora3.setIcon(am);

        ImageIcon motora04 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/MOTORA - Flexão Anormal.png")));
        Image imgm7 = motora04.getImage();
        Image imgm8 = imgm7.getScaledInstance(jlMotora4.getWidth(), jlMotora4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bm = new ImageIcon(imgm8);
        jlMotora4.setIcon(bm);

        ImageIcon motora05 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/MOTORA - Extensão anormal.png")));
        Image imgm9 = motora05.getImage();
        Image imgm10 = imgm9.getScaledInstance(jlMotora5.getWidth(), jlMotora5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon cm = new ImageIcon(imgm10);
        jlMotora5.setIcon(cm);

        ImageIcon motora06 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/MOTORA - Sem resposta.png")));
        Image imgm11 = motora06.getImage();
        Image imgm12 = imgm11.getScaledInstance(jlMotora6.getWidth(), jlMotora6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon dm = new ImageIcon(imgm12);
        jlMotora6.setIcon(dm);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OcularGrupo = new javax.swing.ButtonGroup();
        VerbalGrupo = new javax.swing.ButtonGroup();
        MotoraGrupo = new javax.swing.ButtonGroup();
        lbEscalaGlasgow = new javax.swing.JLabel();
        jpOcular = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalOcular = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jlOcularEspontanea = new javax.swing.JLabel();
        jlOcularEstimuloVerbal = new javax.swing.JLabel();
        jlOcularEstimuloDor = new javax.swing.JLabel();
        jlOcularSemResposta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jpVerbal = new javax.swing.JPanel();
        totalVerbal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jlVerbal1 = new javax.swing.JLabel();
        jlVerbal2 = new javax.swing.JLabel();
        jlVerbal3 = new javax.swing.JLabel();
        jlVerbal4 = new javax.swing.JLabel();
        jlVerbal5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jpMotora = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        totalMotora = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jlMotora1 = new javax.swing.JLabel();
        jlMotora2 = new javax.swing.JLabel();
        jlMotora3 = new javax.swing.JLabel();
        jlMotora4 = new javax.swing.JLabel();
        jlMotora5 = new javax.swing.JLabel();
        jlMotora6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        classificacao = new javax.swing.JLabel();
        totGeral = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WENDELL CLIVE - UNIPE SPI - P2 2018.2 - Escala de Glasgow");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lbEscalaGlasgow.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbEscalaGlasgow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEscalaGlasgow.setText("ESCALA DE GLASGOW");

        jpOcular.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("ABERTURA");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel2.setText("OCULAR");

        totalOcular.setFont(new java.awt.Font("Arial Black", 0, 60)); // NOI18N
        totalOcular.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Pontuação");

        jlOcularEspontanea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Espontanea.png"))); // NOI18N

        jlOcularEstimuloVerbal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Por Estimulo Verbal.png"))); // NOI18N
        jlOcularEstimuloVerbal.setText("jLabel1");

        jlOcularEstimuloDor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Por Estimulo Verbal.png"))); // NOI18N
        jlOcularEstimuloDor.setText("jLabel1");

        jlOcularSemResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Por Estimulo Verbal.png"))); // NOI18N
        jlOcularSemResposta.setText("jLabel1");

        OcularGrupo.add(jRadioButton1);
        jRadioButton1.setText("Espontânea");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jRadioButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton1KeyPressed(evt);
            }
        });

        OcularGrupo.add(jRadioButton2);
        jRadioButton2.setText("Por Estimulo Verbal");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        OcularGrupo.add(jRadioButton3);
        jRadioButton3.setText("Por Estimulo a Dor");
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        OcularGrupo.add(jRadioButton4);
        jRadioButton4.setText("Sem Resposta");
        jRadioButton4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton4ItemStateChanged(evt);
            }
        });
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jRadioButton2)
                .addGap(36, 36, 36)
                .addComponent(jRadioButton3)
                .addGap(27, 27, 27)
                .addComponent(jRadioButton4)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jlOcularEstimuloVerbal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jlOcularEstimuloDor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jlOcularSemResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jlOcularEspontanea, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(777, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlOcularEstimuloVerbal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlOcularEstimuloDor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlOcularSemResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jlOcularEspontanea, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jpOcularLayout = new javax.swing.GroupLayout(jpOcular);
        jpOcular.setLayout(jpOcularLayout);
        jpOcularLayout.setHorizontalGroup(
            jpOcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOcularLayout.createSequentialGroup()
                .addGroup(jpOcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpOcularLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(jpOcularLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(32, 32, 32)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpOcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOcularLayout.createSequentialGroup()
                        .addComponent(totalOcular)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOcularLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30))))
        );
        jpOcularLayout.setVerticalGroup(
            jpOcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOcularLayout.createSequentialGroup()
                .addGroup(jpOcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpOcularLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpOcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpOcularLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26))
                            .addGroup(jpOcularLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalOcular, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOcularLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );

        jpVerbal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18))); // NOI18N

        totalVerbal.setFont(new java.awt.Font("Arial Black", 0, 60)); // NOI18N
        totalVerbal.setText("0");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Pontuação");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel5.setText("VERBAL");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setText("RESPOSTA");

        jlVerbal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Espontanea.png"))); // NOI18N

        jlVerbal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Por Estimulo Verbal.png"))); // NOI18N
        jlVerbal2.setText("jLabel1");

        jlVerbal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Por Estimulo Verbal.png"))); // NOI18N
        jlVerbal3.setText("jLabel1");

        jlVerbal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Por Estimulo Verbal.png"))); // NOI18N
        jlVerbal4.setText("jLabel1");

        jlVerbal5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Por Estimulo Verbal.png"))); // NOI18N
        jlVerbal5.setText("jLabel1");

        VerbalGrupo.add(jRadioButton5);
        jRadioButton5.setText("Orientado");
        jRadioButton5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton5ItemStateChanged(evt);
            }
        });
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        VerbalGrupo.add(jRadioButton6);
        jRadioButton6.setText("Confuso mas responde");
        jRadioButton6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton6ItemStateChanged(evt);
            }
        });
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        VerbalGrupo.add(jRadioButton7);
        jRadioButton7.setText("Resposta Inapropriada");
        jRadioButton7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton7ItemStateChanged(evt);
            }
        });
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        VerbalGrupo.add(jRadioButton8);
        jRadioButton8.setText("Sons Incompreensiveis");
        jRadioButton8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton8ItemStateChanged(evt);
            }
        });
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        VerbalGrupo.add(jRadioButton9);
        jRadioButton9.setText("Sem Resposta");
        jRadioButton9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton9ItemStateChanged(evt);
            }
        });
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton6)
                .addGap(32, 32, 32)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton9)
                .addGap(87, 87, 87))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jlVerbal1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlVerbal2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jlVerbal3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jlVerbal4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jlVerbal5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlVerbal4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlVerbal5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlVerbal3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlVerbal2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlVerbal1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jpVerbalLayout = new javax.swing.GroupLayout(jpVerbal);
        jpVerbal.setLayout(jpVerbalLayout);
        jpVerbalLayout.setHorizontalGroup(
            jpVerbalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVerbalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpVerbalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jpVerbalLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpVerbalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVerbalLayout.createSequentialGroup()
                        .addComponent(totalVerbal)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVerbalLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28))))
        );
        jpVerbalLayout.setVerticalGroup(
            jpVerbalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVerbalLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jpVerbalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVerbalLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jpVerbalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(totalVerbal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMotora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel11.setText("MOTORA");

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel12.setText("RESPOSTA");

        totalMotora.setFont(new java.awt.Font("Arial Black", 0, 60)); // NOI18N
        totalMotora.setText("0");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Pontuação");

        jlMotora1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Espontanea.png"))); // NOI18N

        jlMotora2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Por Estimulo Verbal.png"))); // NOI18N
        jlMotora2.setText("jLabel1");

        jlMotora3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Por Estimulo Verbal.png"))); // NOI18N
        jlMotora3.setText("jLabel1");

        jlMotora4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Por Estimulo Verbal.png"))); // NOI18N
        jlMotora4.setText("jLabel1");

        jlMotora5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Por Estimulo Verbal.png"))); // NOI18N
        jlMotora5.setText("jLabel1");

        jlMotora6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OCULAR - Por Estimulo Verbal.png"))); // NOI18N
        jlMotora6.setText("jLabel1");

        MotoraGrupo.add(jRadioButton10);
        jRadioButton10.setText("Obedece Ordens");
        jRadioButton10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton10ItemStateChanged(evt);
            }
        });
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        MotoraGrupo.add(jRadioButton11);
        jRadioButton11.setText("Localiza Dor");
        jRadioButton11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton11ItemStateChanged(evt);
            }
        });
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        MotoraGrupo.add(jRadioButton12);
        jRadioButton12.setText("Reage a dor mas não Localiza");
        jRadioButton12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton12ItemStateChanged(evt);
            }
        });
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        MotoraGrupo.add(jRadioButton13);
        jRadioButton13.setText("Flexão anormal");
        jRadioButton13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton13ItemStateChanged(evt);
            }
        });
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        MotoraGrupo.add(jRadioButton14);
        jRadioButton14.setText("Extensão anormal");
        jRadioButton14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton14ItemStateChanged(evt);
            }
        });
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        MotoraGrupo.add(jRadioButton15);
        jRadioButton15.setText("Sem Resposta");
        jRadioButton15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton15ItemStateChanged(evt);
            }
        });
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jRadioButton11)
                .addGap(28, 28, 28)
                .addComponent(jRadioButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton14)
                .addGap(30, 30, 30)
                .addComponent(jRadioButton15)
                .addGap(203, 203, 203))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14)
                    .addComponent(jRadioButton15)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jlMotora1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jlMotora2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jlMotora3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jlMotora4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jlMotora5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jlMotora6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jlMotora2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlMotora1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlMotora3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlMotora4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlMotora5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlMotora6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jpMotoraLayout = new javax.swing.GroupLayout(jpMotora);
        jpMotora.setLayout(jpMotoraLayout);
        jpMotoraLayout.setHorizontalGroup(
            jpMotoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMotoraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpMotoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jpMotoraLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addGroup(jpMotoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jpMotoraLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(totalMotora)))
                .addGap(28, 28, 28))
        );
        jpMotoraLayout.setVerticalGroup(
            jpMotoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMotoraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpMotoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMotoraLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(jpMotoraLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalMotora, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setText("CLASSIFICAÇÃO DO PACIENTE:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setText("- GRAVE: <= 8");

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel15.setText("- MODERADO: 9 - 12");

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel16.setText("- LEVE: > 12");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Pontuação");

        classificacao.setFont(new java.awt.Font("Arial Black", 0, 60)); // NOI18N

        totGeral.setFont(new java.awt.Font("Arial Black", 0, 60)); // NOI18N
        totGeral.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(totGeral)
                        .addGap(48, 48, 48))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addComponent(classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenu1.setText("Sobre");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEscalaGlasgow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpMotora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpVerbal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpOcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbEscalaGlasgow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpOcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpVerbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpMotora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton1KeyPressed


    }//GEN-LAST:event_jRadioButton1KeyPressed

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        if (jRadioButton1.isSelected()) {
            totalOcular.setText("4");
            totalGeral += 4;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 4;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }
        classifica();
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if (jRadioButton2.isSelected()) {
            totalOcular.setText("3");
            totalGeral += 3;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 3;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }
        classifica();
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        if (jRadioButton3.isSelected()) {
            totalOcular.setText("2");
            totalGeral += 2;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 2;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }
        classifica();
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton4ItemStateChanged
        if (jRadioButton4.isSelected()) {
            totalOcular.setText("1");
            totalGeral += 1;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 1;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }
        classifica();
    }//GEN-LAST:event_jRadioButton4ItemStateChanged

    private void jRadioButton5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton5ItemStateChanged
        if (jRadioButton5.isSelected()) {
            totalVerbal.setText("5");
            totalGeral += 5;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 5;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }
        classifica();
    }//GEN-LAST:event_jRadioButton5ItemStateChanged

    private void jRadioButton6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton6ItemStateChanged
        if (jRadioButton6.isSelected()) {
            totalVerbal.setText("4");
            totalGeral += 4;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 4;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }
        classifica();
    }//GEN-LAST:event_jRadioButton6ItemStateChanged

    private void jRadioButton7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton7ItemStateChanged
        if (jRadioButton7.isSelected()) {
            totalVerbal.setText("3");
            totalGeral += 3;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 3;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }
        classifica();
    }//GEN-LAST:event_jRadioButton7ItemStateChanged

    private void jRadioButton8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton8ItemStateChanged
        if (jRadioButton8.isSelected()) {
            totalVerbal.setText("2");
            totalGeral += 2;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 2;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }
        classifica();
    }//GEN-LAST:event_jRadioButton8ItemStateChanged

    private void jRadioButton9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton9ItemStateChanged
        if (jRadioButton9.isSelected()) {
            totalVerbal.setText("1");
            totalGeral += 1;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 1;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }
        classifica();
    }//GEN-LAST:event_jRadioButton9ItemStateChanged

    private void jRadioButton10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton10ItemStateChanged
        if (jRadioButton10.isSelected()) {
            totalMotora.setText("6");
            totalGeral += 6;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 6;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }
        classifica();
    }//GEN-LAST:event_jRadioButton10ItemStateChanged

    private void jRadioButton11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton11ItemStateChanged
        if (jRadioButton11.isSelected()) {
            totalMotora.setText("5");
            totalGeral += 5;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 5;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }
        classifica();
    }//GEN-LAST:event_jRadioButton11ItemStateChanged

    private void jRadioButton12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton12ItemStateChanged
        if (jRadioButton12.isSelected()) {
            totalMotora.setText("4");
            totalGeral += 4;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 4;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }
        classifica();
    }//GEN-LAST:event_jRadioButton12ItemStateChanged

    private void jRadioButton13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton13ItemStateChanged

        if (jRadioButton13.isSelected()) {
            totalMotora.setText("3");
            totalGeral += 3;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 3;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }

        classifica();
    }//GEN-LAST:event_jRadioButton13ItemStateChanged

    private void jRadioButton14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton14ItemStateChanged
        if (jRadioButton14.isSelected()) {
            totalMotora.setText("2");
            totalGeral += 2;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 2;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }
        classifica();
    }//GEN-LAST:event_jRadioButton14ItemStateChanged

    private void jRadioButton15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton15ItemStateChanged
        if (jRadioButton15.isSelected()) {
            totalMotora.setText("1");
            totalGeral += 1;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        } else {
            totalGeral -= 1;
            String conv = Integer.toString(totalGeral);
            totGeral.setText(conv);
        }
        classifica();
    }//GEN-LAST:event_jRadioButton15ItemStateChanged

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
            java.util.logging.Logger.getLogger(GlasgowSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlasgowSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlasgowSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlasgowSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlasgowSum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup MotoraGrupo;
    private javax.swing.ButtonGroup OcularGrupo;
    private javax.swing.ButtonGroup VerbalGrupo;
    private javax.swing.JLabel classificacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JLabel jlMotora1;
    private javax.swing.JLabel jlMotora2;
    private javax.swing.JLabel jlMotora3;
    private javax.swing.JLabel jlMotora4;
    private javax.swing.JLabel jlMotora5;
    private javax.swing.JLabel jlMotora6;
    private javax.swing.JLabel jlOcularEspontanea;
    private javax.swing.JLabel jlOcularEstimuloDor;
    private javax.swing.JLabel jlOcularEstimuloVerbal;
    private javax.swing.JLabel jlOcularSemResposta;
    private javax.swing.JLabel jlVerbal1;
    private javax.swing.JLabel jlVerbal2;
    private javax.swing.JLabel jlVerbal3;
    private javax.swing.JLabel jlVerbal4;
    private javax.swing.JLabel jlVerbal5;
    private javax.swing.JPanel jpMotora;
    private javax.swing.JPanel jpOcular;
    private javax.swing.JPanel jpVerbal;
    private javax.swing.JLabel lbEscalaGlasgow;
    private javax.swing.JLabel totGeral;
    private javax.swing.JLabel totalMotora;
    private javax.swing.JLabel totalOcular;
    private javax.swing.JLabel totalVerbal;
    // End of variables declaration//GEN-END:variables

    public String classifica() {

        if (totalGeral <= 8) {

            classificacao.setText("Grave");

        } else if (totalGeral > 8 && totalGeral < 12) {

            classificacao.setText("Moderado");

        } else {

            classificacao.setText("Leve");
        }
        return null;
    }
}
