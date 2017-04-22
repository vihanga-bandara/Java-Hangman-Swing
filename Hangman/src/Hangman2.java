
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Devkie
 */
public class Hangman2 extends javax.swing.JFrame {

    /**
     * Creates new form Hangman2
     */
    public Hangman2() {
        initComponents();
        correct_time.setVisible(false);
        sets.setVisible(false);
        randomcheck.setVisible(false);
        hiddenword.setVisible(false); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tryLetter = new javax.swing.JButton();
        char1 = new javax.swing.JLabel();
        char2 = new javax.swing.JLabel();
        char3 = new javax.swing.JLabel();
        char4 = new javax.swing.JLabel();
        char5 = new javax.swing.JLabel();
        aLetter = new javax.swing.JTextField();
        incorrect = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        correct_time = new javax.swing.JLabel();
        sets = new javax.swing.JLabel();
        char6 = new javax.swing.JLabel();
        char7 = new javax.swing.JLabel();
        char8 = new javax.swing.JLabel();
        randomcheck = new javax.swing.JLabel();
        hiddenword = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hangman");

        tryLetter.setText("Try Letter");
        tryLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryLetterActionPerformed(evt);
            }
        });

        char1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        char1.setText("X");

        char2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        char2.setText("X");

        char3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        char3.setText("X");

        char4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        char4.setText("X");

        char5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        char5.setText("X");

        incorrect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        incorrect.setText("0");

        message.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        message.setText("Message");

        image.setIcon(new javax.swing.ImageIcon("S:\\IIT\\Lectures\\SFDP\\SFDP1\\CW1\\Netbeans\\Hangman 2\\Images\\hang1.png")); // NOI18N

        correct_time.setText("0");

        sets.setText("0");

        char6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        char6.setText("x");

        char7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        char7.setText("x");

        char8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        char8.setText("x");

        randomcheck.setText("0");

        hiddenword.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hiddenword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correct_time, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(randomcheck)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tryLetter)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(incorrect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                .addComponent(aLetter, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(char1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(char2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(char3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(char4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(char5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(char6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(char7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(char8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(char1)
                            .addComponent(char2)
                            .addComponent(char3)
                            .addComponent(char4)
                            .addComponent(char5)
                            .addComponent(char6)
                            .addComponent(char7)
                            .addComponent(char8))
                        .addGap(57, 57, 57)
                        .addComponent(aLetter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(incorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(tryLetter))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correct_time)
                            .addComponent(sets)
                            .addComponent(randomcheck)
                            .addComponent(hiddenword))
                        .addGap(18, 18, 18)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tryLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryLetterActionPerformed
       int check=0;
        String word=(aLetter.getText().toLowerCase());
       if (word.equals("")){
           check=2;
           JOptionPane.showMessageDialog(null,"Please enter a letter first!");
           message.setText("Enter a Letter Please!");
           
       }
       if ((word.length())>1){
           JOptionPane.showMessageDialog(null,"Please enter only one letter at a time.");                
       }       
       String guessword;
       int rcheck;
       rcheck=Integer.parseInt(randomcheck.getText());
       if (rcheck==0){
        String[]a={"Hello","Kid","Bone","Dog","Coloniel","Tentacles"}; 
        guessword = (a[new Random().nextInt(a.length)]);
        hiddenword.setText(guessword); 
        rcheck=rcheck+1;
        randomcheck.setText(Integer.toString(rcheck));
       }
       guessword=hiddenword.getText();
       guessword=(guessword.toLowerCase());
       if ((guessword.length())==3){
           char4.setText("");
           char5.setText("");
           char6.setText("");
           char7.setText("");
           char8.setText("");
       }else if ((guessword.length())==4){
           char5.setText("");
           char6.setText("");
           char7.setText("");
           char8.setText("");
       }else if ((guessword.length())==5){
           char6.setText("");
           char7.setText("");
           char8.setText("");
       }else if ((guessword.length())==6){
           char7.setText("");
           char8.setText("");
       }else if ((guessword.length())==7){
           char8.setText("");
       }
       String[]wordarray=guessword.split("");     
        int set; 
        int correct_times; 
        int correct_label;
        int wrong_times;
        int length=guessword.length();
        set=Integer.parseInt(sets.getText());
        correct_times=Integer.parseInt(correct_time.getText());
        wrong_times=Integer.parseInt(incorrect.getText());
       for (int i=0;i<(wordarray.length);i++){
           if ((wordarray[i].equals(word))&& (!word.equals(""))){
               correct_label=i;
                   if (correct_label==1){
                   char1.setText(word);  
                   set=set+1;
                 }else if (correct_label==2){
                   char2.setText(word);
                     set=set+1;
                 }else if (correct_label==3){
                   char3.setText(word); 
                     set=set+1;
                 }else if (correct_label==4){
                   char4.setText(word);
                     set=set+1;
                 }else if (correct_label==5){
                   char5.setText(word);
                     set=set+1;
                 }else if (correct_label==6){
                   char6.setText(word);
                     set=set+1;
                 }else if (correct_label==7){
                     char7.setText(word);
                     set=set+1;
                 }else if (correct_label==8){
                     char8.setText(word);
                     set=set+1;
                 }                          
               check=1;
 
       }          
       }
       sets.setText(Integer.toString(set));
       if (check==0){
           wrong_times=wrong_times+1;
           incorrect.setText(Integer.toString(wrong_times));
           message.setText("The Letter you entered is incorrect");
       }else if (check==1){      
            correct_times=correct_times+1;
            correct_time.setText(Integer.toString(correct_times));
            message.setText("Welldone :)");
       }
       if (wrong_times==1){
           ImageIcon iconLogo = new ImageIcon("Images/hang2.png");
           image.setIcon(iconLogo);       
       }else if(wrong_times==2){
           ImageIcon iconLogo = new ImageIcon("Images/hang3.png");
           image.setIcon(iconLogo);       
       }else if(wrong_times==3){
           ImageIcon iconLogo = new ImageIcon("Images/hang4.png");
           image.setIcon(iconLogo);       
       }else if(wrong_times==4){
           ImageIcon iconLogo = new ImageIcon("Images/hang5.png");
           image.setIcon(iconLogo);       
       }else if(wrong_times==5){
           ImageIcon iconLogo = new ImageIcon("Images/hang6.png");
           image.setIcon(iconLogo);       
       }else if(wrong_times==6){
           ImageIcon iconLogo = new ImageIcon("Images/hangfinal.png");
           image.setIcon(iconLogo);
           JOptionPane.showMessageDialog(null,"You did not win. Game over."); 
            aLetter.setText("");
           System.exit(0); 
       }
        if (set==(guessword.length())){
           JOptionPane.showMessageDialog(null,"Congratulations you have won. Game over."); 
            aLetter.setText("");
            System.exit(0);
        }
       aLetter.setText("");
       
    }//GEN-LAST:event_tryLetterActionPerformed
public static String[]readArray (String file){
    int c=0;
            Random rand=new Random();     
            File Randomwords =new File("guesswords.txt");
            try {
            Scanner sc= new Scanner(Randomwords);
             while(sc.hasNext()){
                 c=c+1;
                 
             }
             String[]words=new String[c];
             Scanner sc2=new Scanner(Randomwords);
             for (int i=0;i<c;i++){
                 words[i]=sc2.next();
             }
                         return words;

            }
            catch(FileNotFoundException e){
                JOptionPane.showMessageDialog(null, "Could not find file.", "ERROR", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            return null;
}
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
            java.util.logging.Logger.getLogger(Hangman2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hangman2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hangman2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hangman2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hangman2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aLetter;
    private javax.swing.JLabel char1;
    private javax.swing.JLabel char2;
    private javax.swing.JLabel char3;
    private javax.swing.JLabel char4;
    private javax.swing.JLabel char5;
    private javax.swing.JLabel char6;
    private javax.swing.JLabel char7;
    private javax.swing.JLabel char8;
    private javax.swing.JLabel correct_time;
    private javax.swing.JLabel hiddenword;
    private javax.swing.JLabel image;
    private javax.swing.JLabel incorrect;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel message;
    private javax.swing.JLabel randomcheck;
    private javax.swing.JLabel sets;
    private javax.swing.JButton tryLetter;
    // End of variables declaration//GEN-END:variables
}
