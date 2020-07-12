
import static com.sun.javafx.image.impl.ByteArgb.getter;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joao victor
 */
public class APS extends javax.swing.JFrame {
    String teste;
    int enable = 0;
    
    public APS() {
        initComponents();
        this.setLocationRelativeTo(null);
        aviso.setVisible(false);

    }

    
 public class aluno {
 
 String linfosaluno [] = new String [8]; //Array Nome, Sobrenome, endereço. Genero observaçoes
 
   public aluno(){
    linfosaluno[0] = nomeCriança.getText();
     linfosaluno[1] = sobreNomeCriança.getText();
     linfosaluno[2] = endereçoCriança.getText();
     linfosaluno[3] = obsCriança.getText();
     linfosaluno[4] = idadeCriança.getText();
     linfosaluno[5] = cpfCriança.getText();
     linfosaluno[6] = CEP.getText();
     linfosaluno[7] = Genero.getSelectedItem().toString();
   }
    
   public  class pais extends aluno {
       
   String Sinfospais[][] = new String[2][5]; 
   
     /**
      *
      */
     public pais(){
        pais infopais = new pais();
        infopais.Sinfospais[0][0] = nomeMae.getText(); 
        infopais.Sinfospais[0][1] = sobrenomeMae.getText();
        infopais.Sinfospais[0][2] = trabalhoMae.getText();
        infopais.Sinfospais[0][3]= IdadeMae.getText();
        infopais.Sinfospais[0][4]= CPFmae.getText();
        
        infopais.Sinfospais[1][0] = nomePai.getText();
        infopais.Sinfospais[1][1] = sobrenomePai.getText();
        infopais.Sinfospais[1][2] = trabalhoPai.getText();
        infopais.Sinfospais[1][3]= idadePai.getText();
        infopais.Sinfospais[1][4]= cpfPai.getText();
        
        
   }
 }
   
 }
   
   private void Okaytela(){
   okaytela okay = new okaytela();
   okay.setVisible(true);
   }
   
   private void validacampo(String n){
    if(n.equals(""))
    {
        
    aviso.setVisible(true);
    
    }else
    {
    enable = enable +1;
    aviso.setVisible(false);
    }
    
    if (enable == 15)
    {
    Cadastrarbuttom.setEnabled(true);
    }
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        nomeCriança = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sobreNomeCriança = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        endereçoCriança = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obsCriança = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Genero = new javax.swing.JComboBox<>();
        CEP = new javax.swing.JFormattedTextField();
        cpfCriança = new javax.swing.JFormattedTextField();
        idadeCriança = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        nomePai = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sobrenomePai = new javax.swing.JTextField();
        trabalhoPai = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cpfPai = new javax.swing.JFormattedTextField();
        idadePai = new javax.swing.JFormattedTextField();
        Cadastrarbuttom = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        nomeMae = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sobrenomeMae = new javax.swing.JTextField();
        trabalhoMae = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        CPFmae = new javax.swing.JFormattedTextField();
        IdadeMae = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        aviso = new javax.swing.JLabel();
        Consultar = new javax.swing.JButton();

        jLabel11.setText("jLabel11");

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(664, 345));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nomeCriança.setMaximumSize(new java.awt.Dimension(30, 30));
        nomeCriança.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                nomeCriançaMouseMoved(evt);
            }
        });
        nomeCriança.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeCriançaFocusLost(evt);
            }
        });
        nomeCriança.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomeCriançaMouseClicked(evt);
            }
        });
        nomeCriança.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCriançaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        sobreNomeCriança.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sobreNomeCriançaFocusLost(evt);
            }
        });

        jLabel5.setText("CEP");

        endereçoCriança.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                endereçoCriançaFocusLost(evt);
            }
        });
        endereçoCriança.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endereçoCriançaActionPerformed(evt);
            }
        });

        jLabel4.setText("Endereço");

        jLabel8.setText("Idade ");

        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoclient/foto filho.PNG"))); // NOI18N

        jLabel16.setText("Sobrenome");

        obsCriança.setColumns(20);
        obsCriança.setRows(5);
        obsCriança.setText("Sem Observações");
        jScrollPane1.setViewportView(obsCriança);

        jLabel7.setText("CPF");

        jLabel2.setText("Genero:");

        Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Não sei", "Microsft" }));
        Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneroActionPerformed(evt);
            }
        });

        try {
            CEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CEPFocusLost(evt);
            }
        });

        try {
            cpfCriança.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfCriança.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfCriançaFocusLost(evt);
            }
        });

        try {
            idadeCriança.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        idadeCriança.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idadeCriançaFocusLost(evt);
            }
        });
        idadeCriança.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeCriançaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(endereçoCriança, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CEP))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cpfCriança, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeCriança, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sobreNomeCriança, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(idadeCriança, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sobreNomeCriança)
                            .addComponent(nomeCriança, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idadeCriança)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel16)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cpfCriança, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(CEP)
                            .addComponent(endereçoCriança)))
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel2FocusLost(evt);
            }
        });

        nomePai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomePaiFocusLost(evt);
            }
        });
        nomePai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomePaiActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        jLabel6.setText("Sobrenome");

        sobrenomePai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sobrenomePaiFocusLost(evt);
            }
        });
        sobrenomePai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobrenomePaiActionPerformed(evt);
            }
        });

        trabalhoPai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                trabalhoPaiFocusLost(evt);
            }
        });
        trabalhoPai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabalhoPaiActionPerformed(evt);
            }
        });

        jLabel9.setText("Trabalho");

        jLabel10.setText("Idade ");

        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto pai.PNG"))); // NOI18N

        jLabel22.setText("CPF");

        try {
            cpfPai.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfPai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfPaiFocusLost(evt);
            }
        });

        try {
            idadePai.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        idadePai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idadePaiFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpfPai, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(trabalhoPai))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(sobrenomePai))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idadePai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idadePai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(sobrenomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(trabalhoPai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cpfPai))
                .addContainerGap())
        );

        Cadastrarbuttom.setText("Cadastrar");
        Cadastrarbuttom.setEnabled(false);
        Cadastrarbuttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarbuttomActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nomeMae.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeMaeFocusLost(evt);
            }
        });
        nomeMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeMaeActionPerformed(evt);
            }
        });

        jLabel17.setText("Nome");

        jLabel18.setText("Sobrenome");

        sobrenomeMae.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sobrenomeMaeFocusLost(evt);
            }
        });
        sobrenomeMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobrenomeMaeActionPerformed(evt);
            }
        });

        trabalhoMae.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                trabalhoMaeFocusLost(evt);
            }
        });
        trabalhoMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabalhoMaeActionPerformed(evt);
            }
        });

        jLabel19.setText("Trabalho");

        jLabel20.setText("Idade ");

        label3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto mae.PNG"))); // NOI18N

        jLabel21.setText("CPF");

        try {
            CPFmae.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CPFmae.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CPFmaeFocusLost(evt);
            }
        });

        try {
            IdadeMae.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        IdadeMae.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IdadeMaeFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3)
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CPFmae, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trabalhoMae))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sobrenomeMae))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IdadeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdadeMae, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jLabel20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(sobrenomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(trabalhoMae, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(CPFmae, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Cadastro de Aluno");

        aviso.setForeground(new java.awt.Color(255, 0, 0));
        aviso.setText("ALGUM CAMPO NÃO FOI PREENCHIDO");
        aviso.setToolTipText("");

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(259, 259, 259)
                            .addComponent(jLabel12))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(aviso)
                                .addGap(27, 27, 27)
                                .addComponent(Cadastrarbuttom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Consultar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrarbuttom)
                    .addComponent(aviso)
                    .addComponent(Consultar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarbuttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarbuttomActionPerformed
       
       Okaytela();
       
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastrarbuttomActionPerformed

    private void nomeCriançaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCriançaActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_nomeCriançaActionPerformed

    private void nomePaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomePaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomePaiActionPerformed

    private void sobrenomePaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrenomePaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sobrenomePaiActionPerformed

    private void trabalhoPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabalhoPaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trabalhoPaiActionPerformed

    private void nomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeMaeActionPerformed

    private void sobrenomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrenomeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sobrenomeMaeActionPerformed

    private void trabalhoMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabalhoMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trabalhoMaeActionPerformed

    private void endereçoCriançaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endereçoCriançaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endereçoCriançaActionPerformed

    private void nomeCriançaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeCriançaMouseClicked
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_nomeCriançaMouseClicked

    private void nomeCriançaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeCriançaMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCriançaMouseMoved

    private void nomeCriançaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeCriançaFocusLost
        // TODO add your handling code here:
       
       teste = nomeCriança.getText();
       
        validacampo(teste);
        
        
    }//GEN-LAST:event_nomeCriançaFocusLost

    private void sobreNomeCriançaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sobreNomeCriançaFocusLost
         // TODO add your handling code here:
        teste = sobreNomeCriança.getText();
       
        validacampo(teste);
    }//GEN-LAST:event_sobreNomeCriançaFocusLost

    private void idadeCriançaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeCriançaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeCriançaActionPerformed

    private void idadeCriançaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idadeCriançaFocusLost
        // TODO add your handling code here:
        teste = idadeCriança.getText();
       
        validacampo(teste);
    }//GEN-LAST:event_idadeCriançaFocusLost

    private void cpfCriançaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfCriançaFocusLost
        // TODO add your handling code here:
        
        teste = cpfCriança.getText();
       
        validacampo(teste);
    }//GEN-LAST:event_cpfCriançaFocusLost

    private void endereçoCriançaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_endereçoCriançaFocusLost
        // TODO add your handling code here:
        teste = endereçoCriança.getText();
       
        validacampo(teste);
    }//GEN-LAST:event_endereçoCriançaFocusLost

    private void CEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CEPFocusLost
        // TODO add your handling code here:
        teste = CEP.getText(); 
        validacampo(teste);
    }//GEN-LAST:event_CEPFocusLost

    private void nomePaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomePaiFocusLost
        // TODO add your handling code here:
        teste = nomePai.getText(); 
        validacampo(teste);
    }//GEN-LAST:event_nomePaiFocusLost

    private void idadePaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idadePaiFocusLost
        // TODO add your handling code here:
        teste = idadePai.getText(); 
        validacampo(teste);
    }//GEN-LAST:event_idadePaiFocusLost

    private void sobrenomePaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sobrenomePaiFocusLost
        // TODO add your handling code here:
         teste = sobrenomePai.getText(); 
         validacampo(teste);
    }//GEN-LAST:event_sobrenomePaiFocusLost

    private void trabalhoPaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_trabalhoPaiFocusLost
        // TODO add your handling code here:
        teste = trabalhoPai.getText(); 
         validacampo(teste);
    }//GEN-LAST:event_trabalhoPaiFocusLost

    private void cpfPaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfPaiFocusLost
        // TODO add your handling code here:
        teste = cpfPai.getText(); 
         validacampo(teste);
    }//GEN-LAST:event_cpfPaiFocusLost

    private void jPanel2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2FocusLost

    private void nomeMaeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeMaeFocusLost
        // TODO add your handling code here:
        teste = nomeMae.getText(); 
         validacampo(teste);
    }//GEN-LAST:event_nomeMaeFocusLost

    private void IdadeMaeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdadeMaeFocusLost
        // TODO add your handling code here:
        teste = IdadeMae.getText(); 
         validacampo(teste);
    }//GEN-LAST:event_IdadeMaeFocusLost

    private void sobrenomeMaeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sobrenomeMaeFocusLost
        // TODO add your handling code here:
        teste = sobrenomeMae.getText(); 
         validacampo(teste);
    }//GEN-LAST:event_sobrenomeMaeFocusLost

    private void trabalhoMaeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_trabalhoMaeFocusLost
        // TODO add your handling code here:
        teste = trabalhoMae.getText(); 
         validacampo(teste);
    }//GEN-LAST:event_trabalhoMaeFocusLost

    private void CPFmaeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CPFmaeFocusLost
        // TODO add your handling code here:
        teste = CPFmae.getText(); 
         validacampo(teste);
    }//GEN-LAST:event_CPFmaeFocusLost

    private void GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneroActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        // TODO add your handling code here:
       aluno info = new aluno();
       Consultartela consult = new Consultartela();
       consult.setVisible(true);
       consult.Add(info.linfosaluno[0],info.linfosaluno[1],info.linfosaluno[5]);
    }//GEN-LAST:event_ConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(APS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CEP;
    private javax.swing.JFormattedTextField CPFmae;
    private javax.swing.JButton Cadastrarbuttom;
    private javax.swing.JButton Consultar;
    private javax.swing.JComboBox<String> Genero;
    private javax.swing.JFormattedTextField IdadeMae;
    private javax.swing.JLabel aviso;
    private javax.swing.JFormattedTextField cpfCriança;
    private javax.swing.JFormattedTextField cpfPai;
    private javax.swing.JTextField endereçoCriança;
    private javax.swing.JFormattedTextField idadeCriança;
    private javax.swing.JFormattedTextField idadePai;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label3;
    private javax.swing.JTextField nomeCriança;
    private javax.swing.JTextField nomeMae;
    private javax.swing.JTextField nomePai;
    private javax.swing.JTextArea obsCriança;
    private javax.swing.JTextField sobreNomeCriança;
    private javax.swing.JTextField sobrenomeMae;
    private javax.swing.JTextField sobrenomePai;
    private javax.swing.JTextField trabalhoMae;
    private javax.swing.JTextField trabalhoPai;
    // End of variables declaration//GEN-END:variables
}
