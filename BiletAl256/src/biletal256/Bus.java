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
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Bus extends Vehicle {

    @Override
    public void VehicleId() {
    
       
    }
    
    public DefaultListModel<String> listModel;
    public DefaultListModel<String> listModel1;
    public DefaultListModel<String> listModel2;
    public JList<String> otobusId;
    public JList<String> seferSaat;
    public JList<String> ucakId;
   
            
    
    
   public JPanel otobusListele(String firma) {
    Airplane plane = new Airplane();
    Company cmp = new Company();
    JPanel anaPanel = new JPanel();
    anaPanel.setBounds(0, 50, 600, 150);
    anaPanel.setLayout(new AbsoluteLayout());
    
if (firma.equals("A")) {
    listModel = new DefaultListModel<>();
    otobusId = new JList<>(listModel);
    readFile("otobusbilgi.txt", firma);
    guncelleList(listModel, "otobusbilgi.txt", firma);
    JScrollPane pane1 = new JScrollPane(otobusId);
    anaPanel.add(pane1, new AbsoluteConstraints(0, 0, 200, 150)); // Koordinatları belirtin

    listModel1 = new DefaultListModel<>();
    seferSaat = new JList<>(listModel1);
    listModel1.add(0, "09:00-10:00");
    listModel1.add(1, "10:00-11:00");
    listModel1.add(2, "11:00-12:00");
    JScrollPane pane2 = new JScrollPane(seferSaat);
    anaPanel.add(pane2, new AbsoluteConstraints(200, 0, 200, 150)); // Koordinatları belirtin

    JButton butonEkle = new JButton("Bus ADD");
    
    butonEkle.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           otobusEkleGoster(anaPanel,listModel,"otobusbilgi.txt",firma);
        }
    });
   anaPanel.add(butonEkle, new AbsoluteConstraints(400, 0, 100, 50)); // Koordinatları belirtin
   
   JButton butonSil =new JButton("Bus DEL");
   butonSil.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           kuyrukSil(otobusId,listModel,"otobusbilgi.txt",firma);
       }  
   });
   anaPanel.add(butonSil, new AbsoluteConstraints(400,50, 100, 50));
}
        else if(firma.equals("B"))
        {
          listModel = new DefaultListModel<>();
              otobusId = new JList<>(listModel);
             readFile("otobusbilgi.txt", firma);
              guncelleList(listModel,"otobusbilgi.txt",firma);
              
             JScrollPane panel= new JScrollPane(otobusId);
              anaPanel.add(panel,new AbsoluteConstraints(0, 0, 200, 150)); // Koordinatları belirtin
              
             listModel1=new DefaultListModel<>();
             seferSaat=new JList<>(listModel1);
             listModel1.add(0,"09:00-10:00");
             listModel1.add(1,"10:00-11:00");
             listModel1.add(2,"11:00-12:00");
             JScrollPane panel2= new JScrollPane(seferSaat);
             anaPanel.add(panel2, new AbsoluteConstraints(200, 0, 200, 150)); // Koordinatları belirtin  
             
             JButton butonEkle = new JButton("Buss ADD");
    
    butonEkle.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           otobusEkleGoster(anaPanel,listModel,"otobusbilgi.txt",firma);
        }
    });
   anaPanel.add(butonEkle, new AbsoluteConstraints(400, 0, 100, 50)); // Koordinatları belirtin
   
   JButton butonSil =new JButton("Bus DEL");
   butonSil.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           kuyrukSil(otobusId,listModel,"otobusbilgi.txt",firma);
       }  
   });
   anaPanel.add(butonSil, new AbsoluteConstraints(400,50, 100, 50));
        }
        else if(firma.equals("C"))
        {
           
             listModel = new DefaultListModel<>();
              otobusId = new JList<>(listModel);
              readFile("otobusbilgi.txt", firma);
              guncelleList(listModel,"otobusbilgi.txt",firma);
              
             JScrollPane panel= new JScrollPane(otobusId);
             anaPanel.add(panel, new AbsoluteConstraints(0, 0, 200, 150)); // Koordinatları belirtin
             
             listModel1=new DefaultListModel<>();
             seferSaat=new JList<>(listModel1);
             listModel1.add(0,"09:00-10:00");
             listModel1.add(1,"10:00-11:00");
             listModel1.add(2,"11:00-12:00");
             JScrollPane panel2 = new JScrollPane(seferSaat);
             anaPanel.add(panel2, new AbsoluteConstraints(200, 0, 200, 150)); // Koordinatları belirtin

             JButton butonEkle = new JButton("Bus ADD");
    
    butonEkle.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           otobusEkleGoster(anaPanel,listModel,"otobusbilgi.txt",firma);
        }
    });
   anaPanel.add(butonEkle, new AbsoluteConstraints(400, 0, 100, 50)); // Koordinatları belirtin
   
   JButton butonSil =new JButton("Bus DEL");
   butonSil.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           kuyrukSil(otobusId,listModel,"otobusbilgi.txt",firma);
       }  
   });
   anaPanel.add(butonSil, new AbsoluteConstraints(400,50, 100, 50));
            
        }
        else
        {
               
        }
        anaPanel.setVisible(true);
        return anaPanel;
    }
    public static ArrayList<String> readFile(String fileName,String baslangic) {
        ArrayList<String> readList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                 if (line.startsWith(baslangic)) {
                   readList.add(line);
                }
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readList;
    }
public DefaultListModel guncelleList(DefaultListModel listModeli,String fileName,String baslangic) {
          DataOperations dataAl=new DataOperations();
        // JList modelini temizle ve ArrayList'teki firmalari ekleyerek güncelle
        listModeli.clear();
        for (String firma : readFile(fileName,baslangic)) {
            listModeli.addElement(firma);
        }
      return listModeli;
    }




  public void otobusEkleGoster(JPanel panel,DefaultListModel listModeli,String fileName,String baslangic) {
     
  JDialog otobusEkleDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(panel), "SEFER EKLE", true);
   otobusEkleDialog.setSize(300, 200);
    otobusEkleDialog.setLayout(null);
    JTextField otobusAdiField = new JTextField(20);
   JLabel label= new JLabel("Otobus ID: ");
   label.setBounds(2,0,150,30);
   otobusAdiField.setBounds(2,30,150,30);
    JButton butonTamam=new JButton("EKLE");
    butonTamam.setBounds(208,126,70,30);
    butonTamam.addActionListener(new ActionListener(){
         DataOperations op=new DataOperations();
        @Override 
        public void actionPerformed(ActionEvent e){
            String otobusAdi = otobusAdiField.getText();
            if (!otobusAdi.isEmpty()) {
                op.readFromFile(fileName).add(otobusAdi);
                op.addDataToFile(fileName, otobusAdi);
                guncelleList(listModeli,fileName,baslangic);
            }
            otobusEkleDialog.dispose();
        }
         
    });
   
    
    
    
    
    
    
     otobusEkleDialog.add(label);
     otobusEkleDialog.add(otobusAdiField);
     otobusEkleDialog.add(butonTamam);
     otobusEkleDialog.setVisible(true);
}

  public void kuyrukSil(JList<String> list,DefaultListModel listModeli,String fileName,String baslangic)
  {
       DataOperations dataAl =new DataOperations();
        int seciliIndex = list.getSelectedIndex();
        String seciliSecenek=list.getSelectedValue();
        if (seciliIndex != -1) {
            dataAl.readFromFile(fileName).remove(seciliIndex);
            dataAl.removeDataFromFile(fileName, seciliSecenek);
        }
        guncelleList(listModeli,fileName,baslangic);
  }
}
