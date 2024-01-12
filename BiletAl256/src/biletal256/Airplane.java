
package biletal256;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.netbeans.lib.awtextra.AbsoluteConstraints;


public class Airplane {
    
    
    public DefaultListModel<String> listModel;
    public DefaultListModel<String> listModel1;
    public DefaultListModel<String> listModel2;
    public JList<String> ucakId;
    public JList<String> seferSaat;
   
            
    
    
    public JPanel  ucakListele(String firma)
    {   Bus bus=new Bus();
        Company cmp=new Company();
        JPanel anaPanel=new JPanel();
        anaPanel.setBounds(0,200,600,150);
       
        
       
         if(firma.equals("C"))
        {
             listModel = new DefaultListModel<>();
              ucakId = new JList<>(listModel);
              readFile("ucakbilgi.txt", firma);
              guncelleList(listModel,"ucakbilgi.txt",firma);
             JScrollPane pane= new JScrollPane(ucakId);
             pane.setBounds(0,0,200,150);
             
              anaPanel.add(pane);
             listModel1=new DefaultListModel<>();
             seferSaat=new JList<>(listModel1);
             listModel1.add(0,"09:00-10:00");
             listModel1.add(1,"10:00-11:00");
             listModel1.add(2,"11:00-12:00");
             JScrollPane pane2= new JScrollPane(seferSaat);
             pane2.setBounds(200,0,200,150);
             anaPanel.add(pane2);
             
             anaPanel.setLayout(null);
             anaPanel.setVisible(true);
             JButton butonEkle = new JButton("Plane ADD");
             butonEkle.setBounds(400, 0,100,50);
    
    butonEkle.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
           bus.otobusEkleGoster(anaPanel,listModel,"ucakbilgi.txt",firma);
        }
    });
    
   anaPanel.add(butonEkle);
   
   JButton butonSil =new JButton("Plane DEL");
    butonSil.setBounds(400,50,100,50);
   butonSil.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           
           bus.kuyrukSil(ucakId,listModel,"ucakbilgi.txt",firma);
       }  
   });
   anaPanel.add(butonSil);
               
        }
         else if(firma.equals("F"))
         {  
             anaPanel.setBounds(0,50,600,150);
             listModel = new DefaultListModel<>();
              ucakId = new JList<>(listModel);
              readFile("ucakbilgi.txt", firma);
              guncelleList(listModel,"ucakbilgi.txt",firma);
             JScrollPane pane= new JScrollPane(ucakId);
             pane.setBounds(0,0,200,150);
             
              anaPanel.add(pane);
             listModel1=new DefaultListModel<>();
             seferSaat=new JList<>(listModel1);
             listModel1.add(0,"09:00-10:00");
             listModel1.add(1,"10:00-11:00");
             listModel1.add(2,"11:00-12:00");
             JScrollPane pane2= new JScrollPane(seferSaat);
             pane2.setBounds(200,0,200,150);
             anaPanel.add(pane2);
              JButton butonEkle = new JButton("Plane ADD");
             butonEkle.setBounds(400, 0,100,50);
    
    butonEkle.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
           bus.otobusEkleGoster(anaPanel,listModel,"ucakbilgi.txt",firma);
        }
    });
    
   anaPanel.add(butonEkle);
   
   JButton butonSil =new JButton("Plane DEL");
    butonSil.setBounds(400,50,100,50);
   butonSil.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           
           bus.kuyrukSil(ucakId,listModel,"ucakbilgi.txt",firma);
       }  
   });
   anaPanel.add(butonSil);  
               
             
             anaPanel.setLayout(null);
             anaPanel.setVisible(true);
              
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
}
