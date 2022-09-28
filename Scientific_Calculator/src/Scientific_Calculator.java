public class Scientific_Calculator extends javax.swing.JFrame {

    /**
     * Creates new form cal
     */
    public Scientific_Calculator() {
        initComponents();
       // on.setVisible();
    }
     double number1,number2,result;

    String s="",s1="",s2="";
    //double n,m;
    char ch;
    String answer;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tan_button = new javax.swing.JButton();
        cos_button = new javax.swing.JButton();
        sin_button = new javax.swing.JButton();
        exp_button = new javax.swing.JButton();
        r_button = new javax.swing.JButton();
        x1_button = new javax.swing.JButton();
        log_button = new javax.swing.JButton();
        sinh_button = new javax.swing.JButton();
        cosh_button = new javax.swing.JButton();
        tanh_button = new javax.swing.JButton();
        xy_button = new javax.swing.JButton();
        clr_button = new javax.swing.JButton();
        plus_button = new javax.swing.JButton();
        minuse_button = new javax.swing.JButton();
        nine_button = new javax.swing.JButton();
        eight_button = new javax.swing.JButton();
        seven_button = new javax.swing.JButton();
        x3_button = new javax.swing.JButton();
        into_button = new javax.swing.JButton();
        six_button = new javax.swing.JButton();
        five_button = new javax.swing.JButton();
        four_button = new javax.swing.JButton();
        x2_button = new javax.swing.JButton();
        devide2_button = new javax.swing.JButton();
        three_button = new javax.swing.JButton();
        two_button = new javax.swing.JButton();
        one_button = new javax.swing.JButton();
        fact_button = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        point_button = new javax.swing.JButton();
        zero_button = new javax.swing.JButton();
        plus_minus = new javax.swing.JButton();
        on = new javax.swing.JRadioButton();
        off = new javax.swing.JRadioButton();
        sin_button1 = new javax.swing.JButton();
        sin_button2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator by Kaiyum");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        text.setEditable(false);
        text.setBackground(new java.awt.Color(204, 204, 204));
        text.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        jLabel1.setText("Scientific Calculator");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 3, 11)); // NOI18N
        jLabel2.setText("by Md. Abdul Kaiyum");

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 13)); // NOI18N
        jLabel3.setText("FX-991 Plus");

        tan_button.setBackground(new java.awt.Color(51, 51, 51));
        tan_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tan_button.setForeground(new java.awt.Color(255, 255, 255));
        tan_button.setText("tan");
        tan_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tan_buttonActionPerformed(evt);
            }
        });

        cos_button.setBackground(new java.awt.Color(51, 51, 51));
        cos_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cos_button.setForeground(new java.awt.Color(255, 255, 255));
        cos_button.setText("cos");
        cos_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cos_buttonActionPerformed(evt);
            }
        });

        sin_button.setBackground(new java.awt.Color(51, 51, 51));
        sin_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sin_button.setForeground(new java.awt.Color(255, 255, 255));
        sin_button.setText("sin");
        sin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sin_buttonActionPerformed(evt);
            }
        });

        exp_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exp_button.setText("exp");
        exp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exp_buttonActionPerformed(evt);
            }
        });

        r_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        r_button.setText("√ ");
        r_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_buttonActionPerformed(evt);
            }
        });

        x1_button.setBackground(new java.awt.Color(51, 51, 51));
        x1_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        x1_button.setForeground(new java.awt.Color(255, 255, 255));
        x1_button.setText("1/x");
        x1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1_buttonActionPerformed(evt);
            }
        });

        log_button.setBackground(new java.awt.Color(51, 51, 51));
        log_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        log_button.setForeground(new java.awt.Color(255, 255, 255));
        log_button.setText("log");
        log_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_buttonActionPerformed(evt);
            }
        });

        sinh_button.setBackground(new java.awt.Color(51, 51, 51));
        sinh_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sinh_button.setForeground(new java.awt.Color(255, 255, 255));
        sinh_button.setText("sinh");
        sinh_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinh_buttonActionPerformed(evt);
            }
        });

        cosh_button.setBackground(new java.awt.Color(51, 51, 51));
        cosh_button.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        cosh_button.setForeground(new java.awt.Color(255, 255, 255));
        cosh_button.setText("cosh");
        cosh_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosh_buttonActionPerformed(evt);
            }
        });

        tanh_button.setBackground(new java.awt.Color(51, 51, 51));
        tanh_button.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tanh_button.setForeground(new java.awt.Color(255, 255, 255));
        tanh_button.setText("tanh");
        tanh_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanh_buttonActionPerformed(evt);
            }
        });

        xy_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xy_button.setText("x^y");
        xy_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xy_buttonActionPerformed(evt);
            }
        });

        clr_button.setBackground(new java.awt.Color(255, 0, 102));
        clr_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clr_button.setText("Clr");
        clr_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_buttonActionPerformed(evt);
            }
        });

        plus_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        plus_button.setText("+");
        plus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_buttonActionPerformed(evt);
            }
        });

        minuse_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minuse_button.setText("-");
        minuse_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minuse_buttonActionPerformed(evt);
            }
        });

        nine_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nine_button.setText("9");
        nine_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nine_buttonActionPerformed(evt);
            }
        });

        eight_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eight_button.setText("8");
        eight_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eight_buttonActionPerformed(evt);
            }
        });

        seven_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seven_button.setText("7");
        seven_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seven_buttonActionPerformed(evt);
            }
        });

        x3_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        x3_button.setText("x^3");
        x3_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3_buttonActionPerformed(evt);
            }
        });

        into_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        into_button.setText("*");
        into_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                into_buttonActionPerformed(evt);
            }
        });

        six_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        six_button.setText("6");
        six_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                six_buttonActionPerformed(evt);
            }
        });

        five_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        five_button.setText("5");
        five_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five_buttonActionPerformed(evt);
            }
        });

        four_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        four_button.setText("4");
        four_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four_buttonActionPerformed(evt);
            }
        });

        x2_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        x2_button.setText("x^2");
        x2_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2_buttonActionPerformed(evt);
            }
        });

        devide2_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        devide2_button.setText("/");
        devide2_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devide2_buttonActionPerformed(evt);
            }
        });

        three_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        three_button.setText("3");
        three_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three_buttonActionPerformed(evt);
            }
        });

        two_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        two_button.setText("2");
        two_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two_buttonActionPerformed(evt);
            }
        });

        one_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        one_button.setText("1");
        one_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_buttonActionPerformed(evt);
            }
        });

        fact_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fact_button.setText("n!");
        fact_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fact_buttonActionPerformed(evt);
            }
        });

        equal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        point_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        point_button.setText(".");
        point_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                point_buttonActionPerformed(evt);
            }
        });

        zero_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        zero_button.setText("0");
        zero_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_buttonActionPerformed(evt);
            }
        });

        plus_minus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        plus_minus.setText("+/-");
        plus_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_minusActionPerformed(evt);
            }
        });

        on.setBackground(new java.awt.Color(204, 204, 255));
        on.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        on.setForeground(new java.awt.Color(0, 153, 0));
        on.setText("ON");
        on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onActionPerformed(evt);
            }
        });

        off.setBackground(new java.awt.Color(204, 204, 255));
        off.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        off.setForeground(new java.awt.Color(255, 0, 0));
        off.setText("OFF");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });

        sin_button1.setBackground(new java.awt.Color(51, 51, 51));
        sin_button1.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        sin_button1.setForeground(new java.awt.Color(255, 255, 255));
        sin_button1.setText("1/sin");
        sin_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sin_button1ActionPerformed(evt);
            }
        });

        sin_button2.setBackground(new java.awt.Color(51, 51, 51));
        sin_button2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        sin_button2.setForeground(new java.awt.Color(255, 255, 255));
        sin_button2.setText("1/cos");
        sin_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sin_button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(text)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(x3_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(seven_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eight_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nine_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(minuse_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fact_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(one_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(two_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(three_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(devide2_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(x2_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(four_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(five_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(six_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(into_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(xy_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(r_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exp_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clr_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(plus_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(x1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sinh_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cosh_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tanh_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sin_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sin_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cos_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tan_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(log_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sin_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(plus_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(zero_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(point_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(on)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(off)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(on)
                    .addComponent(off))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tan_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cos_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sin_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sin_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanh_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cosh_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sinh_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sin_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clr_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xy_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exp_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nine_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seven_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x3_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minuse_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(six_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x2_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(into_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(three_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fact_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devide2_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(point_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textActionPerformed

    private void tan_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tan_buttonActionPerformed
        double kaiyum=Math.tan(Double.parseDouble(text.getText()));

        text.setText("");
        text.setText(text.getText()+kaiyum);
    }//GEN-LAST:event_tan_buttonActionPerformed

    public void enable()
    {
        text.setEnabled(true);
        on.setEnabled(false);
         off.setEnabled(true);
        zero_button.setEnabled(true);
        one_button.setEnabled(true);
        two_button.setEnabled(true);
        three_button.setEnabled(true);
        four_button.setEnabled(true);
        five_button.setEnabled(true);
        six_button.setEnabled(true);
        seven_button.setEnabled(true);
        eight_button.setEnabled(true);
        nine_button.setEnabled(true);
        r_button.setEnabled(true);
        exp_button.setEnabled(true);
        sin_button.setEnabled(true);
        cos_button.setEnabled(true);
        tan_button.setEnabled(true);
        x1_button.setEnabled(true);
        log_button.setEnabled(true);
        sinh_button.setEnabled(true);
        cosh_button.setEnabled(true);
        tanh_button.setEnabled(true);
        xy_button.setEnabled(true);
        sin_button1.setEnabled(true);
        sin_button2.setEnabled(true);
        clr_button.setEnabled(true);
       
        plus_button.setEnabled(true);
        minuse_button.setEnabled(true);
        devide2_button.setEnabled(true);
        equal.setEnabled(true);
        point_button.setEnabled(true);
        x3_button.setEnabled(true);
        x2_button.setEnabled(true);
        fact_button.setEnabled(true);
        plus_minus.setEnabled(true);
        into_button.setEnabled(true);
        
    }
     public void disable()
    {
        text.setEnabled(false);
        on.setEnabled(true);
         off.setEnabled(false);
        zero_button.setEnabled(false);
        one_button.setEnabled(false);
        two_button.setEnabled(false);
        three_button.setEnabled(false);
        four_button.setEnabled(false);
        five_button.setEnabled(false);
        six_button.setEnabled(false);
        seven_button.setEnabled(false);
        eight_button.setEnabled(false);
        nine_button.setEnabled(false);
        r_button.setEnabled(false);
        exp_button.setEnabled(false);
        sin_button.setEnabled(false);
        cos_button.setEnabled(false);
        tan_button.setEnabled(false);
        x1_button.setEnabled(false);
        log_button.setEnabled(false);
        sinh_button.setEnabled(false);
        cosh_button.setEnabled(false);
        tanh_button.setEnabled(false);
        xy_button.setEnabled(false);
        sin_button1.setEnabled(false);
        sin_button2.setEnabled(false);
        clr_button.setEnabled(false);
        plus_button.setEnabled(false);
        minuse_button.setEnabled(false);
        devide2_button.setEnabled(false);
        equal.setEnabled(false);
        point_button.setEnabled(false);
        x3_button.setEnabled(false);
        x2_button.setEnabled(false);
        fact_button.setEnabled(false);
        plus_minus.setEnabled(false);
        into_button.setEnabled(false);
        
    }
    private void cos_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cos_buttonActionPerformed
        double kaiyum=Math.cos(Double.parseDouble(text.getText()));

        text.setText("");
        text.setText(text.getText()+kaiyum);
    }//GEN-LAST:event_cos_buttonActionPerformed

    private void sin_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sin_buttonActionPerformed
        double kaiyum=Math.sin(Double.parseDouble(text.getText()));
        text.setText("");
        text.setText(text.getText()+kaiyum);
    }//GEN-LAST:event_sin_buttonActionPerformed

    private void exp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exp_buttonActionPerformed
       String str= text.getText();
        double kaiyum=Math.exp(Double.parseDouble(str));

        text.setText("");
        text.setText(text.getText()+kaiyum);
    }//GEN-LAST:event_exp_buttonActionPerformed

    private void r_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_buttonActionPerformed
         String str= text.getText();
        double kaiyum=Math.sqrt(Double.parseDouble(str));

        text.setText("");
        text.setText(text.getText()+kaiyum);
    }//GEN-LAST:event_r_buttonActionPerformed

    private void x1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1_buttonActionPerformed
        double kaiyum=Double.parseDouble(text.getText());
        kaiyum=1/kaiyum;
        text.setText("");
        text.setText(text.getText()+kaiyum);
    }//GEN-LAST:event_x1_buttonActionPerformed

    private void log_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_buttonActionPerformed
        double kaiyum=Math.log(Double.parseDouble(text.getText()));

        text.setText("");
        text.setText(text.getText()+kaiyum);
    }//GEN-LAST:event_log_buttonActionPerformed

    private void sinh_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinh_buttonActionPerformed
        double kaiyum=Math.sinh(Double.parseDouble(text.getText()));

        text.setText("");
        text.setText(text.getText()+kaiyum);
    }//GEN-LAST:event_sinh_buttonActionPerformed

    private void cosh_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosh_buttonActionPerformed
        double kaiyum=Math.cosh(Double.parseDouble(text.getText()));

        text.setText("");
        text.setText(text.getText()+kaiyum);
    }//GEN-LAST:event_cosh_buttonActionPerformed

    private void tanh_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanh_buttonActionPerformed
        double kaiyum=Math.tanh(Double.parseDouble(text.getText()));

        text.setText("");
        text.setText(text.getText()+kaiyum);
    }//GEN-LAST:event_tanh_buttonActionPerformed

    private void xy_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xy_buttonActionPerformed
        s=s+"^";
       text.setText( s);
    }//GEN-LAST:event_xy_buttonActionPerformed

    private void clr_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_buttonActionPerformed

        s="";
        s1="";
        s2="";
       //answer="";
      
        text.setText("");
    }//GEN-LAST:event_clr_buttonActionPerformed

    private void plus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_buttonActionPerformed

         s=s+"+";
        text.setText(s);
       
    }//GEN-LAST:event_plus_buttonActionPerformed

    private void minuse_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minuse_buttonActionPerformed

         s=s+"-";
       text.setText(s);
       
    }//GEN-LAST:event_minuse_buttonActionPerformed

    private void nine_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nine_buttonActionPerformed
       s=s+"9";
       text.setText( s);
    }//GEN-LAST:event_nine_buttonActionPerformed

    private void eight_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eight_buttonActionPerformed
        s=s+"8";
        text.setText( s);
    }//GEN-LAST:event_eight_buttonActionPerformed

    private void seven_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seven_buttonActionPerformed
         s=s+"7";
         text.setText( s);
    }//GEN-LAST:event_seven_buttonActionPerformed

    private void x3_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3_buttonActionPerformed
       String str= text.getText();
        double kaiyum=Double.parseDouble(str);
        kaiyum=kaiyum*kaiyum*kaiyum;
        text.setText("");
        text.setText(text.getText()+kaiyum);
    }//GEN-LAST:event_x3_buttonActionPerformed

    private void into_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_into_buttonActionPerformed
        s=s+"*";
        text.setText(s);
       
    }//GEN-LAST:event_into_buttonActionPerformed

    private void six_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_six_buttonActionPerformed
         s=s+"6";
         text.setText( s);
    }//GEN-LAST:event_six_buttonActionPerformed

    private void five_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five_buttonActionPerformed
        s=s+"5";
        text.setText( s);
    }//GEN-LAST:event_five_buttonActionPerformed

    private void four_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four_buttonActionPerformed
         s=s+"4";
         text.setText( s);
    }//GEN-LAST:event_four_buttonActionPerformed

    private void x2_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2_buttonActionPerformed
        String str= text.getText();
        double kaiyum=Double.parseDouble(str);
        kaiyum=kaiyum*kaiyum;
        text.setText("");
        text.setText(text.getText()+kaiyum);
      
    }//GEN-LAST:event_x2_buttonActionPerformed

    private void devide2_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devide2_buttonActionPerformed
         s=s+"/";
        text.setText(s);
        
    }//GEN-LAST:event_devide2_buttonActionPerformed

    private void three_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three_buttonActionPerformed
         s=s+"3";
         text.setText( s);
    }//GEN-LAST:event_three_buttonActionPerformed

    private void two_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two_buttonActionPerformed
       s=s+"2";
       text.setText( s);
    }//GEN-LAST:event_two_buttonActionPerformed

    private void one_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_buttonActionPerformed
       s=s+"1";
       text.setText( s);
    }//GEN-LAST:event_one_buttonActionPerformed

    private void fact_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fact_buttonActionPerformed
         String str= text.getText();
        double kaiyum = Double.parseDouble(str);
        double fact=1;
        while(kaiyum!=0){
            fact=fact*kaiyum;
            kaiyum--;
        }
        text.setText("");
        text.setText(text.getText()+ fact);
        
    }//GEN-LAST:event_fact_buttonActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        
         int i,count=0;
        
        for(i=0;i<s.length();i++)  
        {
           
            if(s.charAt(i)=='+')
            {
                ch=s.charAt(i);
                break;
            }
            else if(s.charAt(i)=='-')
            {
                ch=s.charAt(i);
                break;
            }
            else if(s.charAt(i)=='*')
            {
                ch=s.charAt(i);
                break;
            }
            else if(s.charAt(i)=='/')
            {
                ch=s.charAt(i);
                break;
            }
             else if(s.charAt(i)=='^')
            {
                ch=s.charAt(i);
                break;
            }
          
            else
            {
                s1=s1+s.charAt(i);
               
            }
      
        count++;
        }

       for(i=count+1; i< s.length(); i++)
       {
       s2=s2+s.charAt(i);
   }
       
        
     number1=Double.parseDouble(s1);
     number2=Double.parseDouble(s2);
   
    if(ch=='+')
    {
        result=number1+number2;   
        answer =Double.toString(result);
        text.setText(answer);
    }
    
   
    else if(ch=='-')
    {
        result=number1-number2;   
        answer =Double.toString(result);
        text.setText(answer);
    }
    
    else if(ch=='*')
    {
        result=number1*number2;   
        answer =Double.toString(result);
        text.setText(answer);
    }
    
   else if(ch=='/')
    {
        result=number1/number2;   
       answer =Double.toString(result);
       text.setText(answer);
    }
    else if(ch=='^')
    {
        result=result= Math.pow(number1,number2);   
       answer =Double.toString(result);
       text.setText(answer);
    }
    
   
    }//GEN-LAST:event_equalActionPerformed

    private void point_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_point_buttonActionPerformed
         s=s+".";
         text.setText( s);
    }//GEN-LAST:event_point_buttonActionPerformed

    private void zero_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_buttonActionPerformed
        s=s+"0";
         text.setText( s);
    }//GEN-LAST:event_zero_buttonActionPerformed

    private void plus_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_minusActionPerformed
         String str= text.getText();
        double kaiyum=Double.parseDouble(str);
        kaiyum=kaiyum*(-1);
        text.setText("");
        text.setText(text.getText()+kaiyum);
    }//GEN-LAST:event_plus_minusActionPerformed

    private void onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onActionPerformed
        enable();
    }//GEN-LAST:event_onActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        disable();
    }//GEN-LAST:event_offActionPerformed

    private void sin_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sin_button1ActionPerformed
        double kaiyum=1/Math.sin(Double.parseDouble(text.getText()));

        text.setText("");
        text.setText(text.getText()+kaiyum);
    }//GEN-LAST:event_sin_button1ActionPerformed

    private void sin_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sin_button2ActionPerformed
        double kaiyum=1/Math.cos(Double.parseDouble(text.getText()));

        text.setText("");
        text.setText(text.getText()+kaiyum);
    }//GEN-LAST:event_sin_button2ActionPerformed

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
            java.util.logging.Logger.getLogger(Scientific_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scientific_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scientific_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scientific_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scientific_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clr_button;
    private javax.swing.JButton cos_button;
    private javax.swing.JButton cosh_button;
    private javax.swing.JButton devide2_button;
    private javax.swing.JButton eight_button;
    private javax.swing.JButton equal;
    private javax.swing.JButton exp_button;
    private javax.swing.JButton fact_button;
    private javax.swing.JButton five_button;
    private javax.swing.JButton four_button;
    private javax.swing.JButton into_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton log_button;
    private javax.swing.JButton minuse_button;
    private javax.swing.JButton nine_button;
    private javax.swing.JRadioButton off;
    private javax.swing.JRadioButton on;
    private javax.swing.JButton one_button;
    private javax.swing.JButton plus_button;
    private javax.swing.JButton plus_minus;
    private javax.swing.JButton point_button;
    private javax.swing.JButton r_button;
    private javax.swing.JButton seven_button;
    private javax.swing.JButton sin_button;
    private javax.swing.JButton sin_button1;
    private javax.swing.JButton sin_button2;
    private javax.swing.JButton sinh_button;
    private javax.swing.JButton six_button;
    private javax.swing.JButton tan_button;
    private javax.swing.JButton tanh_button;
    private javax.swing.JTextField text;
    private javax.swing.JButton three_button;
    private javax.swing.JButton two_button;
    private javax.swing.JButton x1_button;
    private javax.swing.JButton x2_button;
    private javax.swing.JButton x3_button;
    private javax.swing.JButton xy_button;
    private javax.swing.JButton zero_button;
    // End of variables declaration//GEN-END:variables
}
