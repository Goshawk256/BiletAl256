

package biletal256;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;




public class Company extends User{

   
    @Override
   public String kullaniciAdi() {
      
       return "";
    }

    @Override
    public String Sifre() {
       
        return "";
    }

  
    public JPanel anaPanel;
    public JPanel panel;
    public JPanel panel1;
    public JPanel panel2;
   
   
    public DefaultListModel<String> listModel;
    public DefaultListModel<String> listModel1;
    public DefaultListModel<String> listModel2;
    public JList<String> firmaListesi;
    public JList<String> firmaUcretListesi;
    public JList<String> firmaSifreListesi;
   


   

    public JPanel olusturVeGoster() {
        DataOperations dataAl=new DataOperations();
        // Ana panel oluştur
        anaPanel=new JPanel();
        anaPanel.setBounds(0,0,600,300);
        anaPanel.setLayout(null);
        
        panel = new JPanel();
        panel1=new JPanel();
        panel2=new JPanel();
   
      
        panel.setBounds(0,0,200,200);
        panel1.setBounds(200,9,200,191);
        panel2.setBounds(400,9,200,191);
     
        
       
      
        panel.setLayout(new BorderLayout());
         panel1.setLayout(new BorderLayout());
          panel2.setLayout(new BorderLayout());
        

        // Firma listesi modeli ve JList oluştur
         listModel = new DefaultListModel<>();
        firmaListesi = new JList<>(listModel);
         listModel1 = new DefaultListModel<>();
        firmaUcretListesi =new JList<>(listModel1);
         listModel2=new DefaultListModel<>();
        firmaSifreListesi=new JList<>(listModel2);
       
     
        

        // ArrayList oluştur ve örnek firmalari ekle
       

        guncelleJList(listModel,"veriler.txt");
        guncelleJList(listModel1,"hizmetbedeli.txt");
        guncelleJList(listModel2,"sifreler.txt");

        // Firma Ekle butonunu oluştur ve ActionListener ekle
        JButton firmaEkleButton = new JButton("Firma Ekle");
        firmaEkleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firmaEkleDialoguGoster();
              
            }
        });

        // Firma Sil butonunu oluştur ve ActionListener ekle
        JButton firmaSilButton = new JButton("Firma Sil");
        firmaSilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firmaSil();
            }
        });

       // Layout ve eklemeleri düzenle
        JPanel buttonPanel = new JPanel();
        JButton butonS=new JButton("SIFRELER");
        butonS.setEnabled(false);
        
       
        
        JButton butonU=new JButton("HIZMET BEDELI");
        butonU.setEnabled(false);
        
       
        buttonPanel.add(firmaEkleButton);
        buttonPanel.add(firmaSilButton);
     
        panel.add(BorderLayout.NORTH, buttonPanel);
        panel.add(BorderLayout.CENTER, new JScrollPane(firmaListesi));
        panel1.add(BorderLayout.NORTH, butonU);
        panel1.add(BorderLayout.CENTER,new JScrollPane(firmaUcretListesi));
        panel2.add(BorderLayout.NORTH, butonS);
        panel2.add(BorderLayout.CENTER,new JScrollPane(firmaSifreListesi));
        
     anaPanel.add(panel);
     anaPanel.add(panel1);
     anaPanel.add(panel2);
    
     
       
        return anaPanel;
    }
     
    
 
 

    public JPanel firmaA(DefaultListModel<String> A,JList<String>B,String veri,String firmaAdi)
    {
       JPanel anaFirmaPanel=new JPanel();
       anaFirmaPanel.setBounds(0,0,600,500);
       anaFirmaPanel.setLayout(null);
       
        
        return anaFirmaPanel;
    }
  
  


    
    private void firmaEkleDialoguGoster() {
    // Yeni bir JDialog oluştur
    JDialog firmaEkleDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(panel), "Firma Ekle", true);
    firmaEkleDialog.setSize(300, 250);
    firmaEkleDialog.setLayout(new FlowLayout());

    // Firma adı ve şifre için JTextField'lar
    JTextField firmaAdiField = new JTextField(20);
    JTextField firmaSifreField = new JTextField(20);
    JTextField firmaUcretField=new JTextField(20);
    

    // JButton oluştur
    JButton ekleButton = new JButton("Ekle");

    // JButton'a ActionListener ekle
    ekleButton.addActionListener(new ActionListener() {
        DataOperations op=new DataOperations();
        @Override
        public void actionPerformed(ActionEvent e) {
            // JTextField'ların içeriğini al
            String firmaAdi = firmaAdiField.getText();
            String firmaSifre = firmaSifreField.getText();
            String firmaUcret=firmaUcretField.getText();

            // Eğer firma adı ve şifre boş değilse, ArrayList ve JList'i güncelle
            if (!firmaAdi.isEmpty() && !firmaSifre.isEmpty() &&!firmaUcret.isEmpty()) {
                op.readFromFile("veriler.txt").add(firmaAdi);
                op.addDataToFile("veriler.txt", firmaAdi);
                op.readFromFile("sifreler.txt").add(firmaSifre);
                op.addDataToFile("sifreler.txt", firmaSifre);
                op.readFromFile("hizmetbedeli.txt").add(firmaUcret);
                op.addDataToFile("hizmetbedeli.txt", firmaUcret);
                
               
               
                
                guncelleJList(listModel,"veriler.txt");
                guncelleJList(listModel1,"hizmetbedeli.txt");
                guncelleJList(listModel2,"sifreler.txt");
            }

            // Dialogu kapat
            firmaEkleDialog.dispose();
        }
    });

    // JTextField ve JButton'ları dialoga ekle
    firmaEkleDialog.add(new JLabel("Firma Adı: "));
    firmaEkleDialog.add(firmaAdiField);
    firmaEkleDialog.add(new JLabel("Firma Şifre: "));
    firmaEkleDialog.add(firmaSifreField);
    firmaEkleDialog.add(new JLabel("Firma Ucreti:"));
    firmaEkleDialog.add(firmaUcretField);
    firmaEkleDialog.add(ekleButton);

    // Dialogu göster
    firmaEkleDialog.setVisible(true);
}


    private void firmaSil() {
        DataOperations dataAl =new DataOperations();
        // Seçili firma indeksini al
        int seciliIndex = firmaListesi.getSelectedIndex();
        String seciliFirma=firmaListesi.getSelectedValue();
        int seciliIndexS = firmaSifreListesi.getSelectedIndex();
        String seciliSifre=firmaSifreListesi.getSelectedValue();
        int seciliIndexU = firmaUcretListesi.getSelectedIndex();
        String seciliUcret=firmaUcretListesi.getSelectedValue();
        
        // Eğer bir firma seçiliyse, ArrayList ve JList'i güncelle
        if (seciliIndex != -1) {
            dataAl.readFromFile("veriler.txt").remove(seciliIndex);
            dataAl.removeDataFromFile("veriler.txt", seciliFirma);
            dataAl.readFromFile("sifreler.txt").remove(seciliIndexS);
            dataAl.removeDataFromFile("sifreler.txt", seciliSifre);
            dataAl.readFromFile("hizmetbedeli.txt").remove(seciliIndexU);
            dataAl.removeDataFromFile("hizmetbedeli.txt", seciliUcret);
            dataAl.removeDatawithName("otobusbilgi.txt",seciliFirma);
            dataAl.removeDatawithName("ucakbilgi.txt",seciliFirma);
            dataAl.removeDatawithName("trenbilgi.txt",seciliFirma);
              
            
            
             guncelleJList(listModel,"veriler.txt");
             guncelleJList(listModel1,"hizmetbedeli.txt");
             guncelleJList(listModel2,"sifreler.txt");
        }
    }
    
      public DefaultListModel guncelleJList(DefaultListModel listModeli,String fileName) {
          DataOperations dataAl=new DataOperations();
        // JList modelini temizle ve ArrayList'teki firmalari ekleyerek güncelle
        listModeli.clear();
        for (String firma : dataAl.readFromFile(fileName)) {
            listModeli.addElement(firma);
        }
      return listModeli;
    }
      
      
      
}
   
   
   

