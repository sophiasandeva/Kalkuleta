/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Sefruit Cerita
 */
public class KonversiBilangan extends javax.swing.JFrame {
    private int x;
    private int y;
    /**
     * Creates new form KonversiBilangan
     */
    public KonversiBilangan() {
        initComponents();
        this.setLocationRelativeTo(null); // center form in the screen
        this.setResizable(false); // prevent frame from being resized
        ImageIcon logo = new ImageIcon("src/image/logoframe.png"); // create image icon
        this.setIconImage(logo.getImage()); // change icon of frame
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        bilanganFrame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        matangButton = new javax.swing.JButton();
        bmiButton = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        bilComboBox = new javax.swing.JComboBox<>();
        binerTextField = new javax.swing.JTextField();
        oktalTextField = new javax.swing.JTextField();
        desimalTextField = new javax.swing.JTextField();
        hexaTextField = new javax.swing.JTextField();
        bilanganTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        restartButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkuleta | Konversi Bilangan");
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 102, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 255, 153));

        bilanganFrame.setBackground(new java.awt.Color(0, 0, 0));
        bilanganFrame.setPreferredSize(new java.awt.Dimension(90, 36));
        bilanganFrame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bilanganFrameMouseDragged(evt);
            }
        });
        bilanganFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bilanganFrameMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cross-square-button (2) (1).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minimize (5) (1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Konversi Bilangan");

        javax.swing.GroupLayout bilanganFrameLayout = new javax.swing.GroupLayout(bilanganFrame);
        bilanganFrame.setLayout(bilanganFrameLayout);
        bilanganFrameLayout.setHorizontalGroup(
            bilanganFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bilanganFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(132, 132, 132)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bilanganFrameLayout.setVerticalGroup(
            bilanganFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bilanganFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(10, 10, 10))
        );

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));

        matangButton.setBackground(new java.awt.Color(189, 112, 9));
        matangButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        matangButton.setText("Konversi Mata Uang");
        matangButton.setFocusable(false);
        matangButton.setPreferredSize(new java.awt.Dimension(207, 31));
        matangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matangButtonActionPerformed(evt);
            }
        });

        bmiButton.setBackground(new java.awt.Color(189, 112, 9));
        bmiButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bmiButton.setText("Kalkulator BMI");
        bmiButton.setFocusable(false);
        bmiButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bmiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(bmiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(matangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bmiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));

        bilComboBox.setBackground(new java.awt.Color(153, 102, 0));
        bilComboBox.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        bilComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biner", "Oktal", "Desimal", "Hexadesimal" }));

        binerTextField.setEditable(false);
        binerTextField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        binerTextField.setToolTipText("");
        binerTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        binerTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        binerTextField.setEnabled(false);

        oktalTextField.setEditable(false);
        oktalTextField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        oktalTextField.setToolTipText("");
        oktalTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        oktalTextField.setEnabled(false);

        desimalTextField.setEditable(false);
        desimalTextField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        desimalTextField.setToolTipText("");
        desimalTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        desimalTextField.setEnabled(false);

        hexaTextField.setEditable(false);
        hexaTextField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        hexaTextField.setToolTipText("");
        hexaTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        hexaTextField.setEnabled(false);

        bilanganTextField.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        bilanganTextField.setForeground(new java.awt.Color(102, 102, 102));
        bilanganTextField.setText("Masukkan bilangan disini");
        bilanganTextField.setToolTipText("");
        bilanganTextField.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        bilanganTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bilanganTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bilanganTextFieldFocusLost(evt);
            }
        });
        bilanganTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bilanganTextFieldKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Biner (Basis 2)");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Oktal (Basis 8)");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Desimal (Basis 10)");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Hexadesimal (Basis 16)");

        jSeparator1.setBackground(new java.awt.Color(204, 153, 0));
        jSeparator1.setForeground(new java.awt.Color(204, 153, 0));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(bilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(bilanganTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)))
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(hexaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(desimalTextField)
                            .addComponent(oktalTextField)
                            .addComponent(binerTextField))))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bilanganTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(binerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oktalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desimalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hexaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(444, 8));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setPreferredSize(new java.awt.Dimension(8, 270));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        restartButton.setBackground(new java.awt.Color(255, 255, 255));
        restartButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        restartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reuse (1) (3).png"))); // NOI18N
        restartButton.setFocusable(false);
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });

        homeButton.setBackground(new java.awt.Color(153, 153, 153));
        homeButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home (1) (2).png"))); // NOI18N
        homeButton.setFocusable(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 51, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(102, 51, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(102, 51, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bilanganFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(572, Short.MAX_VALUE)))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(562, Short.MAX_VALUE)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(bilanganFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(515, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(66, 66, 66)))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(525, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setExtendedState(KonversiBilangan.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void bilanganFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bilanganFrameMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_bilanganFrameMousePressed

    private void bilanganFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bilanganFrameMouseDragged
        int x1 = evt.getXOnScreen();
        int y1 = evt.getYOnScreen();
        
        this.setLocation(x1-x, y1-y);
    }//GEN-LAST:event_bilanganFrameMouseDragged

    private void matangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matangButtonActionPerformed
        KonversiMataUang konversiMataUang = new KonversiMataUang();
        konversiMataUang.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_matangButtonActionPerformed

    private void bmiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmiButtonActionPerformed
        KalkulatorBMI kalkulatorBmi = new KalkulatorBMI();
        kalkulatorBmi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bmiButtonActionPerformed

    private void bilanganTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bilanganTextFieldFocusGained
        if(bilanganTextField.getText().equals("Masukkan bilangan disini")){
            bilanganTextField.setText("");
            bilanganTextField.setFont(new Font("Century Gothic", 1, 14)); //1 untuk bold, 14 ukuran font
            bilanganTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_bilanganTextFieldFocusGained

    private void bilanganTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bilanganTextFieldFocusLost
        if(bilanganTextField.getText().equals("")){
            bilanganTextField.setText("Masukkan bilangan disini");
            bilanganTextField.setFont(new Font("Century Gothic", 1, 11));
            bilanganTextField.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_bilanganTextFieldFocusLost

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        Rumah home = new Rumah();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        bilanganTextField.setText("Masukkan bilangan disini");
        bilanganTextField.setFont(new Font("Century Gothic", 1, 11));
        bilanganTextField.setForeground(new Color(102,102,102));
        bilComboBox.requestFocus();
        binerTextField.setText("");
        oktalTextField.setText("");
        desimalTextField.setText("");
        hexaTextField.setText("");
    }//GEN-LAST:event_restartButtonActionPerformed

    private void bilanganTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bilanganTextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        try{
            if(bilComboBox.getSelectedItem()=="Biner"){
                String biner7 = bilanganTextField.getText();
                int outDes7 = Integer.parseInt(biner7,2);
                desimalTextField.setText(Integer.toUnsignedString(outDes7));

                String biner8 = bilanganTextField.getText();
                int outDes8 = Integer.parseInt(biner8,2);
                String hasilDes8 = Integer.toUnsignedString (outDes8);
                int hasilOktal8 = Integer.parseInt(hasilDes8);
                oktalTextField.setText(Integer.toOctalString(hasilOktal8));

                String biner9 = bilanganTextField.getText();
                int outDes9 = Integer.parseInt(biner9,8);
                String hasilDes9 = Integer.toUnsignedString (outDes9);
                int hasilHex9 = Integer.parseInt(hasilDes9);
                hexaTextField.setText(Integer.toHexString(hasilHex9));
	
                String binerc = bilanganTextField.getText();
                binerTextField.setText(binerc);
            }
                else if(bilComboBox.getSelectedItem()=="Oktal"){
                String oktal4 = bilanganTextField.getText();
                int outDes4 = Integer.parseInt(oktal4,8);
                desimalTextField.setText(Integer.toUnsignedString(outDes4));

                String oktal5 = bilanganTextField.getText();
                int outDes5 = Integer.parseInt(oktal5,8);
                String hasilDes5 = Integer.toUnsignedString(outDes5);
                int hasilBiner5 = Integer.parseInt(hasilDes5);
                binerTextField.setText(Integer.toBinaryString(hasilBiner5));
            
                String oktal6 = bilanganTextField.getText();
                int outDes6 = Integer.parseInt(oktal6,8);
                String hasilDes6 = Integer.toUnsignedString(outDes6);
                int hasilHex6 = Integer.parseInt(hasilDes6);
                hexaTextField.setText(Integer.toHexString(hasilHex6));
	
                String oktalb = bilanganTextField.getText();
                oktalTextField.setText(oktalb);
            }
            else if(bilComboBox.getSelectedItem()=="Desimal"){
                String des10 = bilanganTextField.getText();
                int outOktal10 = Integer.parseInt(des10);
                oktalTextField.setText(Integer.toOctalString(outOktal10));

                String des11 = bilanganTextField.getText();
                int outBiner11 = Integer.parseInt(des11);
                binerTextField.setText(Integer.toBinaryString(outBiner11));

                String des12 = bilanganTextField.getText();
                int outHex12 = Integer.parseInt(des12);
                hexaTextField.setText(Integer.toHexString(outHex12));
	
                String desimald = bilanganTextField.getText();
                desimalTextField.setText(desimald);
            }
            else if(bilComboBox.getSelectedItem()=="Hexadesimal"){
                String hexa = bilanganTextField.getText();
                int outDes = Integer.parseInt(hexa,16);
                desimalTextField.setText(Integer.toUnsignedString(outDes));

                String hexa2 = bilanganTextField.getText();
                int outDes2 = Integer.parseInt(hexa2,16);
                String hasilDes2 = Integer.toUnsignedString(outDes2);
                int hasilBiner2 = Integer.parseInt(hasilDes2);
                binerTextField.setText(Integer.toBinaryString(hasilBiner2));
	
                String hexa3 = bilanganTextField.getText();
                int outDes3 = Integer.parseInt(hexa3,16);
                String hasilDes3 = Integer.toUnsignedString(outDes3);
                int hasilOktal3 = Integer.parseInt(hasilDes3);
                oktalTextField.setText(Integer.toOctalString(hasilOktal3));

                String hasilHexa4 = bilanganTextField.getText();
                hexaTextField.setText(hasilHexa4);
            }
        } catch (NumberFormatException ex){
            //JOptionPane.showMessageDialog(null, "Invalid");
            binerTextField.setText("Invalid");
            oktalTextField.setText("Invalid");
            desimalTextField.setText("Invalid");
            hexaTextField.setText("Invalid");
        }
        }
    }//GEN-LAST:event_bilanganTextFieldKeyPressed

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
            java.util.logging.Logger.getLogger(KonversiBilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiBilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiBilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiBilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiBilangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bilComboBox;
    private javax.swing.JPanel bilanganFrame;
    private javax.swing.JTextField bilanganTextField;
    private javax.swing.JTextField binerTextField;
    private javax.swing.JButton bmiButton;
    private javax.swing.JTextField desimalTextField;
    private javax.swing.JTextField hexaTextField;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JButton matangButton;
    private javax.swing.JTextField oktalTextField;
    private javax.swing.JButton restartButton;
    // End of variables declaration//GEN-END:variables
}
