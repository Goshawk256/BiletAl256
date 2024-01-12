
package biletal256;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


/**
 *
 * @author MR256
 */
public class Main {
    public static void main(String[] args) {
       Customer cust=new Customer();
        
        JFrame frame=new JFrame(); 
        
        
        JButton butonAdmin=new JButton();
        JButton butonMusteri=new JButton();
        JButton butonFirma=new JButton();
        JButton butonExit=new JButton();
        
        
       
        frame.setBounds(200,100,600,500);
        frame.setForeground(Color.GRAY);
        butonAdmin.setBounds(30,20,100,40);
        butonMusteri.setBounds(150,20,100,40);
        butonFirma.setBounds(270,20,100,40);
        butonExit.setBounds(470,400,100,50);
       
        butonAdmin.setBackground(Color.LIGHT_GRAY);
        Image img= new ImageIcon(Main.class.getResource("admin1.png")).getImage();
        butonAdmin.setIcon(new ImageIcon(img));
        butonMusteri.setBackground(Color.LIGHT_GRAY);
        butonFirma.setBackground(Color.LIGHT_GRAY);
        butonAdmin.setText("ADMIN");
        butonMusteri.setText("Musteri");
        butonFirma.setText("Firma");
        butonExit.setText("EXIT");
        
        
     butonAdmin.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Kullanıcı adı ve şifre girişi için bileşenlerin oluşturulması
        JLabel usernameLabel = new JLabel("Kullanıcı Adı: ");
        JTextField usernameField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Şifre: ");
        JPasswordField passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Giriş Yap");

        // Bileşenlerin boyutları ve konumları
        usernameLabel.setBounds(60, 60, 100, 30);
        usernameField.setBounds(60, 90, 200, 30);
        passwordLabel.setBounds(60, 120, 100, 30);
        passwordField.setBounds(60, 150, 200, 30);
        loginButton.setBounds(60, 190, 100, 30);

        // Bileşenlerin pencereye eklenmesi
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);

        // Pencereyi yeniden çiz
        frame.revalidate();
        frame.repaint();
        loginButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Admin admin=new Admin();
            String enteredUserName=usernameField.getText();
            char[] enteredPassword = passwordField.getPassword();
            String correctUserName=admin.kullaniciAdi();
            String correctPassword=admin.Sifre();
            if(enteredUserName.equals(correctUserName)&&new String(enteredPassword).equals(correctPassword)){
                JOptionPane.showMessageDialog(frame, "Giriş başarılı!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
                frame.getContentPane().removeAll(); // Tüm bileşenleri kaldır
                frame.revalidate(); // Yeniden düzenleme
                frame.repaint(); // Yeniden çizme
                frame.add(butonExit);
                butonExit.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.getContentPane().removeAll(); // Tüm bileşenleri kaldır
        frame.revalidate(); // Yeniden düzenleme
        frame.repaint(); // Yeniden çizme

        // Ana menü bileşenlerini tekrar ekle
        frame.add(butonAdmin);
        frame.add(butonMusteri);
        frame.add(butonFirma);

        frame.setVisible(true);
    }
});

                
             SwingUtilities.invokeLater(() -> {
           Company  cmp=new Company();
          frame.add(cmp.olusturVeGoster());
          
          
          frame.setVisible(true);
                
        });
            
             
             
            }
            else {
                    JOptionPane.showMessageDialog(frame, "Kullanıcı adı veya şifre hatalıdır.", "Hata", JOptionPane.ERROR_MESSAGE);
                }

                // Giriş alanlarını temizle
                usernameField.setText("");
                passwordField.setText("");
          } 
        });
    }
});

     butonFirma.addActionListener(new ActionListener(){
       @Override  
       public void actionPerformed(ActionEvent e){
           // Kullanıcı adı ve şifre girişi için bileşenlerin oluşturulması
        JLabel usernameLabel = new JLabel("Kullanıcı Adı: ");
        JTextField usernameField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Şifre: ");
        JPasswordField passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Giriş Yap");

        // Bileşenlerin boyutları ve konumları
        usernameLabel.setBounds(60, 60, 100, 30);
        usernameField.setBounds(60, 90, 200, 30);
        passwordLabel.setBounds(60, 120, 100, 30);
        passwordField.setBounds(60, 150, 200, 30);
        loginButton.setBounds(60, 190, 100, 30);

        // Bileşenlerin pencereye eklenmesi
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);

        // Pencereyi yeniden çiz
        frame.revalidate();
        frame.repaint();
        loginButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Company cmp=new Company();
            DataOperations firmaData=new DataOperations();
            
           
            String enteredUserName=usernameField.getText();
            char[] enteredPassword = passwordField.getPassword();
            String correctUserName=""; 
            String correctPassword="";
            int indexAd;
            if(firmaData.readFromFile("veriler.txt").contains(enteredUserName))
            {
               indexAd =firmaData.readFromFile("veriler.txt").indexOf(enteredUserName);
                correctUserName=enteredUserName;
                correctPassword=firmaData.readFromFile("sifreler.txt").get(indexAd);
                
            }
            
            
            if(enteredUserName.equals(correctUserName)&&new String(enteredPassword).equals(correctPassword)){
                JOptionPane.showMessageDialog(frame, "Giriş başarılı!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
                frame.getContentPane().removeAll(); // Tüm bileşenleri kaldır
                frame.revalidate(); // Yeniden düzenleme
                frame.repaint(); // Yeniden çizme
                
                frame.add(butonExit);
                butonExit.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.getContentPane().removeAll(); // Tüm bileşenleri kaldır
        frame.revalidate();  // Yeniden düzenleme
        frame.repaint();     // Yeniden çizme    
        
        // Ana menü bileşenlerini tekrar ekle
        frame.add(butonAdmin);
        frame.add(butonMusteri);
        frame.add(butonFirma);

        frame.setVisible(true);
    }
});
              
                 JTextField aracBilgi=new JTextField();
                aracBilgi.setText("                      "+correctUserName+" FIRMASI KULLANICI EKRANI");
                aracBilgi.setBackground(Color.darkGray);
                
                Font font = new Font("Arial", Font.BOLD, 20);
                aracBilgi.setFont(font);
                
                aracBilgi.setEditable(false);
                aracBilgi.setEnabled(false);
                aracBilgi.setBounds(0,0,600,50);
               
                 DefaultListModel<String> listModelA=new DefaultListModel<>();
                 JList<String> firmaListesiA=new JList<>();
                 
                 Bus bus =new Bus();
                 Airplane plane=new Airplane();
                 Train train=new Train();
                 if(correctUserName.equals("A"))
                 {
                     frame.add(bus.otobusListele(correctUserName));
                 }
                 else if(correctUserName.equals("B"))
                 {
                      frame.add(bus.otobusListele(correctUserName));
                 }
                  else if(correctUserName.equals("C"))
                 {
                      frame.add(bus.otobusListele(correctUserName));
                      frame.add(plane.ucakListele(correctUserName));
                 }
                   else if(correctUserName.equals("D"))
                 {
                    frame.add(train.trenListele(correctUserName));  
                 }
                   else if(correctUserName.equals("F"))
                 {
                    frame.add(plane.ucakListele(correctUserName));
                 }
                 else
                 {
                       
                 }
                frame.setVisible(true);
                frame.add(aracBilgi);
        
                
                
     
                

            }
            else {
                    JOptionPane.showMessageDialog(frame, "Kullanıcı adı veya şifre hatalıdır.", "Hata", JOptionPane.ERROR_MESSAGE);
                }

                // Giriş alanlarını temizle
                usernameField.setText("");
                passwordField.setText("");
          } 
        });
       }
     });
     
     butonMusteri.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      frame.setVisible(false);
      Customer customer=new Customer();
      customer.main(new String[]{});
      
        
    }
 });
         
        
        
        frame.setLayout(null);
       
        frame.add(butonAdmin);
        frame.add(butonMusteri);
        frame.add(butonFirma);
       
        frame.setVisible(true);
        
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }   
    
    
}
