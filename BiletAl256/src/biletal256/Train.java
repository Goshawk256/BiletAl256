
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


public class Train extends Vehicle{

    @Override
    public void VehicleId() {
       
    }
      public DefaultListModel<String> listModel;
    public DefaultListModel<String> listModel1;
    public DefaultListModel<String> listModel2;
    public JList<String> trenId;
    public JList<String> seferSaat;
    
    
     public JPanel  trenListele(String firma)
    {Bus bus =new Bus();
        
        JPanel anaPanel=new JPanel();
        anaPanel.setBounds(0,50,600,150);
         if(firma.equals("D"))
        {
             listModel = new DefaultListModel<>();
              trenId = new JList<>(listModel);
              readFile("trenbilgi.txt", firma);
              guncelleList(listModel,"trenbilgi.txt",firma);
             JScrollPane pane= new JScrollPane(trenId);
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
              JButton butonEkle = new JButton("Train ADD");
             butonEkle.setBounds(400, 0,100,50);
    
    butonEkle.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
           bus.otobusEkleGoster(anaPanel,listModel,"trenbilgi.txt",firma);
        }
    });
    
   anaPanel.add(butonEkle);
   
   JButton butonSil =new JButton("Train DEL");
    butonSil.setBounds(400,50,100,50);
   butonSil.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           
           bus.kuyrukSil(trenId,listModel,"trenbilgi.txt",firma);
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
