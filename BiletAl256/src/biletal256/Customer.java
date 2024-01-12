package biletal256;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Customer {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setBounds(200, 100, 600, 500);

        frame.add(musteriEkrani());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static int a = 2;
    public static int b = 2;
    public static String koltukNo = "1";
    public static String Kalkis = "1";
    public static String Varis = "1";
    public static String Ad = "1";
    public static String soyAd = "1";
    public static String firmaAd = "1";
    public static String aracTur = "1";
    public static String tarihbilgisi = "1";

    public static JPanel musteriEkrani() {
        JPanel musteriEkran = new JPanel();
        musteriEkran.setLayout(null);

        // Reklam paneli
        JPanel reklam = new JPanel();
        reklam.setBounds(0, 0, 600, 80);
        reklam.setBackground(Color.BLACK);
        reklam.setLayout(null);

        // Resim ekleme
        Image img1 = new ImageIcon(Main.class.getResource("biletal.png")).getImage();
        Image img2 = new ImageIcon(Main.class.getResource("back.png")).getImage();
        Image imgB = new ImageIcon(Main.class.getResource("bayrak.png")).getImage();
        JLabel label1 = new JLabel();
        label1.setBounds(0, 0, 300, 80);
        label1.setIcon(new ImageIcon(img1));
        JLabel label2 = new JLabel();
        label2.setBounds(300, 20, 300, 80);
        label2.setIcon(new ImageIcon(imgB));
        label2.setText("REDLİNE bir biletAl256 kuruluşudur.");
        label2.setHorizontalTextPosition(SwingConstants.RIGHT); // Metni sağa yerleştir
        label2.setHorizontalAlignment(SwingConstants.LEFT); // İçerikleri sola hizala
        JButton butonBack = new JButton();
        butonBack.setBounds(540, 20, 35, 35);
        butonBack.setIcon(new ImageIcon(img2));

        butonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Main main = new Main();
                main.main(new String[]{});

            }
        });

        JPanel IslemPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image imgANA = new ImageIcon(Main.class.getResource("anasayfa.png")).getImage();
                g.drawImage(imgANA, 0, 0, getWidth(), getHeight(), (ImageObserver) this);
            }
        };
        IslemPanel.setLayout(null);
        IslemPanel.setBounds(0, 80, 600, 420);
        JButton ucakButon = new JButton(" UCAK");
        ucakButon.setBounds(20, 20, 130, 50);
        ucakButon.setBackground(Color.red);
        Image imgU = new ImageIcon(Main.class.getResource("ucak.png")).getImage();
        ucakButon.setIcon(new ImageIcon(imgU));
        ucakButon.setHorizontalTextPosition(SwingConstants.RIGHT); // Metni sağa yerleştir
        ucakButon.setHorizontalAlignment(SwingConstants.LEFT); // İçerikleri sola hizala

        JButton otobusButon = new JButton(" OTOBUS");
        otobusButon.setBounds(210, 20, 130, 50);
        otobusButon.setBackground(Color.red);
        Image imgO = new ImageIcon(Main.class.getResource("otobus.png")).getImage();
        otobusButon.setIcon(new ImageIcon(imgO));
        otobusButon.setHorizontalTextPosition(SwingConstants.RIGHT); // Metni sağa yerleştir
        otobusButon.setHorizontalAlignment(SwingConstants.LEFT); // İçerikleri sola hizala

        JButton trenButon = new JButton(" TREN");
        trenButon.setBounds(400, 20, 130, 50);
        trenButon.setBackground(Color.red);
        Image imgT = new ImageIcon(Main.class.getResource("tren.png")).getImage();
        trenButon.setIcon(new ImageIcon(imgT));
        trenButon.setHorizontalTextPosition(SwingConstants.RIGHT); // Metni sağa yerleştir
        trenButon.setHorizontalAlignment(SwingConstants.LEFT); // İçerikleri sola hizala

        JButton biletGor = new JButton();
        biletGor.setBounds(553, 0, 32, 32);
        int greenColorValue = new Color(153, 51, 0).getRGB();
        biletGor.setBackground(new Color(greenColorValue));
        Image imgGor = new ImageIcon(Main.class.getResource("cizgiler.png")).getImage();
        biletGor.setIcon(new ImageIcon(imgGor));
        biletGor.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setBounds(784, 210, 350, 391);
                frame.setLayout(null);
                JPanel panelAna = new JPanel();
                panelAna.setLayout(null);
                panelAna.setBounds(0, 0, 350, 391);
                JPanel panelYan = new JPanel();
                panelYan.setBounds(0, 0, 80, 147);
                JPanel PanelFoto = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image imgANA = new ImageIcon(Main.class.getResource("mytown.png")).getImage();
                g.drawImage(imgANA, 0, 0, getWidth(), getHeight(), (ImageObserver) this);
            }
        };
                PanelFoto.setBackground(Color.red);
                PanelFoto.setBounds(0,147,350,244);
                
                panelAna.add(PanelFoto);
                panelYan.setLayout(null);
                JButton butonCikis = new JButton();
                
        Image imgck = new ImageIcon(Main.class.getResource("bcik.png")).getImage();
          butonCikis.setIcon(new ImageIcon(imgck));
                butonCikis.setBounds(280, 300,50,50);
                butonCikis.setBackground(Color.red);
                  butonCikis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.setVisible(false);

            }
        });
                panelAna.add(butonCikis);
                JButton buton1 = new JButton("AD:");
                buton1.setBounds(0, 0, 147, 18);
                buton1.setEnabled(false);
                buton1.setHorizontalAlignment(SwingConstants.LEFT);
                JButton buton2 = new JButton("SOYAD:");
                buton2.setBounds(0, 18, 147, 18);
                buton2.setEnabled(false);
                buton2.setHorizontalAlignment(SwingConstants.LEFT);
                JButton buton3 = new JButton("TARİH:");
                buton3.setBounds(0, 36, 147, 18);
                buton3.setEnabled(false);
                buton3.setHorizontalAlignment(SwingConstants.LEFT);
                JButton buton4 = new JButton("VASITA:");
                buton4.setBounds(0, 54, 147, 18);
                buton4.setEnabled(false);
                buton4.setHorizontalAlignment(SwingConstants.LEFT);
                JButton buton5 = new JButton("KALKIŞ:");
                buton5.setBounds(0, 72, 147, 18);
                buton5.setEnabled(false);
                buton5.setHorizontalAlignment(SwingConstants.LEFT);
                JButton buton6 = new JButton("VARIŞ:");
                buton6.setBounds(0, 90, 147, 18);
                buton6.setEnabled(false);
                buton6.setHorizontalAlignment(SwingConstants.LEFT);
                JButton buton7 = new JButton("KOLTUK:");
                buton7.setBounds(0, 108, 147, 18);
                buton7.setEnabled(false);
                buton7.setHorizontalAlignment(SwingConstants.LEFT);
                JButton buton8 = new JButton("---------");
                buton8.setBounds(0, 126, 147, 20);
                buton8.setEnabled(false);
                buton8.setHorizontalAlignment(SwingConstants.LEFT);
                panelYan.add(buton1);
                panelYan.add(buton2);
                panelYan.add(buton3);
                panelYan.add(buton4);
                panelYan.add(buton5);
                panelYan.add(buton6);
                panelYan.add(buton7);
                panelYan.add(buton8);
                JPanel panelIc = new JPanel();
                panelIc.setLayout(null);
                panelIc.setBounds(80, 0, 270, 147);
                panelIc.setBackground(Color.red);
                ArrayList<String> biletBilgi = readFromFile("biletbilgi.txt");
                JList<String> JlistBilet = createJList(biletBilgi);
                JScrollPane scrollPaneBilet = new JScrollPane(JlistBilet);
                scrollPaneBilet.setBounds(0, 0, 270, 147);

                panelIc.add(scrollPaneBilet);
                panelAna.add(panelIc);
                panelAna.add(panelYan);
                frame.add(panelAna);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });

        JPanel secimPanel = new JPanel();
        secimPanel.setBounds(20, 100, 250, 250);
        secimPanel.setBackground(Color.white);

        Image imgPoint = new ImageIcon(Main.class.getResource("point.png")).getImage();
        Image imgDate = new ImageIcon(Main.class.getResource("date.png")).getImage();
        JLabel kalkis = new JLabel("Kalkış Noktası:");
        kalkis.setBounds(0, 0, 250, 30);
        kalkis.setIcon(new ImageIcon(imgPoint));
        kalkis.setHorizontalTextPosition(SwingConstants.LEFT); // Metni sağa yerleştir
        kalkis.setHorizontalAlignment(SwingConstants.LEFT); // İçerikleri sola hizala
        JLabel varis = new JLabel("Varış Noktası:");
        varis.setBounds(0, 60, 250, 30);
        varis.setIcon(new ImageIcon(imgPoint));
        varis.setHorizontalTextPosition(SwingConstants.LEFT); // Metni sağa yerleştir
        varis.setHorizontalAlignment(SwingConstants.LEFT); // İçerikleri sola hizala

        JLabel tarih = new JLabel("Tarih Seçiniz:");
        tarih.setBounds(0, 120, 250, 30);
        tarih.setIcon(new ImageIcon(imgDate));
        tarih.setHorizontalTextPosition(SwingConstants.LEFT); // Metni sağa yerleştir
        tarih.setHorizontalAlignment(SwingConstants.LEFT); // İçerikleri sola hizala

        secimPanel.add(kalkis);
        secimPanel.add(varis);
        secimPanel.add(tarih);
        secimPanel.setOpaque(false);
        secimPanel.setLayout(null);
        secimPanel.setVisible(false);
        String[] sehirlerK = {"İstanbul", "Kocaeli", "Bilecik", "Ankara", "Eskişehir", "Konya"};
        String[] sehirlerV = {"İstanbul", "Kocaeli", "Bilecik", "Ankara", "Eskişehir", "Konya"};
        String[] tarihler = {"4 ARALIK", "5 ARALIK", "6 ARALIK", "7 ARALIK", "8 ARALIK", "9 ARALIK", "10 ARALIK"};

        otobusButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                secimPanel.setVisible(true);

                JComboBox<String> comboBoxK = new JComboBox<>(sehirlerK);
                comboBoxK.setBounds(0, 30, 250, 30);
                comboBoxK.setBackground(Color.LIGHT_GRAY);
                comboBoxK.setForeground(Color.DARK_GRAY);

                JComboBox<String> comboBoxV = new JComboBox<>(sehirlerV);
                comboBoxV.setBounds(0, 90, 250, 30);
                comboBoxV.setBackground(Color.LIGHT_GRAY);
                comboBoxV.setForeground(Color.DARK_GRAY);

                JComboBox<String> comboBoxTarih = new JComboBox<>(tarihler);
                comboBoxTarih.setBounds(0, 150, 250, 30);
                comboBoxTarih.setBackground(Color.LIGHT_GRAY);
                comboBoxTarih.setForeground(Color.DARK_GRAY);

                JButton butonBul = new JButton();
                butonBul.setBounds(0, 200, 210, 50);
                Image imgBul = new ImageIcon(Main.class.getResource("redbutton.png")).getImage();
                butonBul.setIcon(new ImageIcon(imgBul));
                butonBul.setBackground(Color.red);

                butonBul.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int k = comboBoxK.getSelectedIndex();
                        int v = comboBoxV.getSelectedIndex();
                        String x = (String) comboBoxK.getSelectedItem();
                        String y = (String) comboBoxV.getSelectedItem();
                        String z = (String) comboBoxTarih.getSelectedItem();
                        if (k == v) {
                            JOptionPane.showMessageDialog(IslemPanel, "Kalkış Noktası Varış Noktası ile Aynı Olamaz.", "Hata", JOptionPane.ERROR_MESSAGE);
                        } else {
                            a = k;
                            b = v;
                            Kalkis = x;
                            Varis = y;
                            tarihbilgisi = z;

                            aracTur = "OTOBÜS";

                            biletAlBus();

                        }

                    }
                });

                secimPanel.add(butonBul);
                secimPanel.add(comboBoxK);
                secimPanel.add(comboBoxV);
                secimPanel.add(comboBoxTarih);

            }
        });
        ucakButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                secimPanel.setVisible(true);

                JComboBox<String> comboBoxK = new JComboBox<>(sehirlerK);
                comboBoxK.setBounds(0, 30, 250, 30);
                comboBoxK.setBackground(Color.LIGHT_GRAY);
                comboBoxK.setForeground(Color.DARK_GRAY);

                JComboBox<String> comboBoxV = new JComboBox<>(sehirlerV);
                comboBoxV.setBounds(0, 90, 250, 30);
                comboBoxV.setBackground(Color.LIGHT_GRAY);
                comboBoxV.setForeground(Color.DARK_GRAY);

                JComboBox<String> comboBoxTarih = new JComboBox<>(tarihler);
                comboBoxTarih.setBounds(0, 150, 250, 30);
                comboBoxTarih.setBackground(Color.LIGHT_GRAY);
                comboBoxTarih.setForeground(Color.DARK_GRAY);

                JButton butonBul = new JButton();
                butonBul.setBounds(20, 200, 210, 40);
                Image imgBul = new ImageIcon(Main.class.getResource("redbutton.png")).getImage();
                butonBul.setIcon(new ImageIcon(imgBul));
                butonBul.setBackground(Color.red);

                butonBul.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        int k = comboBoxK.getSelectedIndex();
                        int v = comboBoxV.getSelectedIndex();
                        String x = (String) comboBoxK.getSelectedItem();
                        String y = (String) comboBoxV.getSelectedItem();
                        String z = (String) comboBoxTarih.getSelectedItem();
                        if (k == v) {
                            JOptionPane.showMessageDialog(IslemPanel, "Kalkış Noktası Varış Noktası ile Aynı Olamaz.", "Hata", JOptionPane.ERROR_MESSAGE);
                        } else {
                            a = k;
                            b = v;
                            Kalkis = x;
                            Varis = y;
                            tarihbilgisi = z;
                            aracTur = "UÇAK";
                            biletAlPlane();

                        }

                    }
                });

                secimPanel.add(butonBul);
                secimPanel.add(comboBoxK);
                secimPanel.add(comboBoxV);
                secimPanel.add(comboBoxTarih);
            }
        });

        trenButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                secimPanel.setVisible(true);

                JComboBox<String> comboBoxK = new JComboBox<>(sehirlerK);
                comboBoxK.setBounds(0, 30, 250, 30);
                comboBoxK.setBackground(Color.LIGHT_GRAY);
                comboBoxK.setForeground(Color.DARK_GRAY);

                JComboBox<String> comboBoxV = new JComboBox<>(sehirlerV);
                comboBoxV.setBounds(0, 90, 250, 30);
                comboBoxV.setBackground(Color.LIGHT_GRAY);
                comboBoxV.setForeground(Color.DARK_GRAY);

                JComboBox<String> comboBoxTarih = new JComboBox<>(tarihler);
                comboBoxTarih.setBounds(0, 150, 250, 30);
                comboBoxTarih.setBackground(Color.LIGHT_GRAY);
                comboBoxTarih.setForeground(Color.DARK_GRAY);

                JButton butonBul = new JButton();
                butonBul.setBounds(20, 200, 210, 40);
                Image imgBul = new ImageIcon(Main.class.getResource("redbutton.png")).getImage();
                butonBul.setIcon(new ImageIcon(imgBul));
                butonBul.setBackground(Color.red);

                butonBul.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int k = comboBoxK.getSelectedIndex();
                        int v = comboBoxV.getSelectedIndex();
                        String x = (String) comboBoxK.getSelectedItem();
                        String y = (String) comboBoxV.getSelectedItem();
                        String z = (String) comboBoxTarih.getSelectedItem();
                        if (k == v) {
                            JOptionPane.showMessageDialog(IslemPanel, "Kalkış Noktası Varış Noktası ile Aynı Olamaz.", "Hata", JOptionPane.ERROR_MESSAGE);
                        } else {
                            a = k;
                            b = v;
                            Kalkis = x;
                            Varis = y;
                            tarihbilgisi = z;
                            aracTur = "TREN";
                            biletAlTrain();
                        }

                    }
                });

                secimPanel.add(butonBul);
                secimPanel.add(comboBoxK);
                secimPanel.add(comboBoxV);
                secimPanel.add(comboBoxTarih);

            }
        });
        IslemPanel.add(biletGor);
        IslemPanel.add(secimPanel);
        IslemPanel.add(otobusButon);
        IslemPanel.add(ucakButon);
        IslemPanel.add(trenButon);
        reklam.add(label2);
        reklam.add(label1);
        reklam.add(butonBack);

        // Reklam panelini musteriEkran'a ekle
        musteriEkran.add(IslemPanel);
        musteriEkran.add(reklam);

        return musteriEkran;
    }

    public static JFrame biletAlBus() {
        String A = "otobus";
        JFrame frame = new JFrame();

        frame.setBounds(800, 100, 450, 600);
        frame.setLayout(null);
        JButton btBack = new JButton();
        btBack.setBounds(380, 508, 48, 48);
        Image img = new ImageIcon(Main.class.getResource("scik.png")).getImage();
        btBack.setBackground(Color.GRAY);
        btBack.setIcon(new ImageIcon(img));
        btBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.setVisible(false);
                Customer cst = new Customer();

                cst.main(new String[]{});

            }
        });

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image imgANA = new ImageIcon(Main.class.getResource("busphoto.png")).getImage();
                g.drawImage(imgANA, 0, 0, getWidth(), getHeight(), (ImageObserver) this);
            }
        };
        panel.setBounds(0, 0, 450, 600);
        panel.setLayout(null);

        ArrayList<String> otobusListesi = readFromFile("otobusbilgi.txt");
        ArrayList<String> Alistesi = filterList(otobusListesi, "A");
        ArrayList<String> Blistesi = filterList(otobusListesi, "B");
        ArrayList<String> Clistesi = filterList(otobusListesi, "C");

        // ArrayList'ten JList oluştur
        JList<String> JlistA = createJList(Alistesi);
        JList<String> JlistB = createJList(Blistesi);
        JList<String> JlistC = createJList(Clistesi);

        JPanel panelA = new JPanel();

        panelA.setBounds(0, 0, 250, 100);
        panelA.setLayout(null);
        panelA.setOpaque(false);

        JScrollPane scrollPaneA = new JScrollPane(JlistA);

        scrollPaneA.setBounds(0, 0, 200, 100);
        JButton butonA = koltukGoster(JlistA, frame, panelA, A, btBack, A);

        butonA.setBounds(200, 50, 50, 50);
        panelA.add(butonA);
        panelA.add(scrollPaneA);

        JPanel panelB = new JPanel();
        panelB.setBounds(0, 200, 250, 100);
        panelB.setLayout(null);
        panelB.setOpaque(false);
        JScrollPane scrollPaneB = new JScrollPane(JlistB);
        scrollPaneB.setBounds(0, 0, 200, 100);
        JButton butonB = koltukGoster(JlistB, frame, panelB, A, btBack, A);
        butonB.setBounds(200, 50, 50, 50);
        panelB.add(butonB);
        panelB.add(scrollPaneB);

        JPanel panelC = new JPanel();
        panelC.setBounds(0, 400, 250, 100);
        panelC.setLayout(null);
        panelC.setOpaque(false);
        JScrollPane scrollPaneC = new JScrollPane(JlistC);
        scrollPaneC.setBounds(0, 0, 200, 100);
        JButton butonC = koltukGoster(JlistC, frame, panelC, A, btBack, A);
        butonC.setBounds(200, 50, 50, 50);
        panelC.add(butonC);

        panelC.add(scrollPaneC);

        panel.add(panelA);
        panel.add(panelB);
        panel.add(panelC);
        frame.add(btBack);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        return frame;
    }

    public static JFrame biletAlPlane() {
        String A = "ucak";
        JFrame frame = new JFrame();

        frame.setBounds(800, 100, 450, 600);
        frame.setLayout(null);
        JButton btBack = new JButton();
        btBack.setBounds(380, 508, 48, 48);
        Image img = new ImageIcon(Main.class.getResource("scik.png")).getImage();
        btBack.setBackground(Color.GRAY);
        btBack.setIcon(new ImageIcon(img));
        btBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.setVisible(false);
                Customer cst = new Customer();

                cst.main(new String[]{});

            }
        });

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image imgANA = new ImageIcon(Main.class.getResource("planephoto.png")).getImage();
                g.drawImage(imgANA, 0, 0, getWidth(), getHeight(), (ImageObserver) this);
            }
        };
        panel.setBounds(0, 0, 450, 600);
        panel.setLayout(null);

        ArrayList<String> otobusListesi = readFromFile("ucakbilgi.txt");
        ArrayList<String> Clistesi = filterList(otobusListesi, "C");
        ArrayList<String> Flistesi = filterList(otobusListesi, "F");

        // ArrayList'ten JList oluştur
        JList<String> JlistC = createJList(Clistesi);
        JList<String> JlistF = createJList(Flistesi);

        JPanel panelC = new JPanel();

        panelC.setBounds(0, 0, 250, 100);
        panelC.setLayout(null);
        panelC.setOpaque(false);
        JScrollPane scrollPaneC = new JScrollPane(JlistC);
        scrollPaneC.setBounds(0, 0, 200, 100);
        JButton butonC = koltukGoster(JlistC, frame, panelC, A, btBack, A);

        butonC.setBounds(200, 50, 50, 50);
        panelC.add(butonC);

        panelC.add(scrollPaneC);

        JPanel panelF = new JPanel();
        panelF.setBounds(0, 200, 250, 100);
        panelF.setLayout(null);
        panelF.setOpaque(false);
        JScrollPane scrollPaneF = new JScrollPane(JlistF);
        scrollPaneF.setBounds(0, 0, 200, 100);
        JButton butonF = koltukGoster(JlistF, frame, panelF, A, btBack, A);

        butonF.setBounds(200, 50, 50, 50);
        panelF.add(butonF);

        panelF.add(scrollPaneF);

        panel.add(panelC);
        panel.add(panelF);

        frame.add(btBack);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        return frame;
    }

    public static JFrame biletAlTrain() {
        String A = "tren";
        JFrame frame = new JFrame();

        frame.setBounds(800, 100, 450, 600);
        frame.setLayout(null);
        JButton btBack = new JButton();
        btBack.setBounds(380, 508, 48, 48);
        Image img = new ImageIcon(Main.class.getResource("scik.png")).getImage();
        btBack.setBackground(Color.GRAY);
        btBack.setIcon(new ImageIcon(img));
        btBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.setVisible(false);
                Customer cst = new Customer();

                cst.main(new String[]{});

            }
        });

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image imgANA = new ImageIcon(Main.class.getResource("trainphoto.png")).getImage();
                g.drawImage(imgANA, 0, 0, getWidth(), getHeight(), (ImageObserver) this);
            }
        };
        panel.setBounds(0, 0, 450, 600);
        panel.setLayout(null);

        ArrayList<String> otobusListesi = readFromFile("trenbilgi.txt");
        ArrayList<String> Dlistesi = filterList(otobusListesi, "D");

        // ArrayList'ten JList oluştur
        JList<String> JlistD = createJList(Dlistesi);

        JPanel panelD = new JPanel();

        panelD.setBounds(0, 0, 250, 100);
        panelD.setLayout(null);
        panelD.setOpaque(false);
        JScrollPane scrollPaneD = new JScrollPane(JlistD);
        scrollPaneD.setBounds(0, 0, 200, 100);
        JButton butonD = koltukGoster(JlistD, frame, panelD, A, btBack, A);

        butonD.setBounds(200, 50, 50, 50);
        panelD.add(butonD);

        panelD.add(scrollPaneD);

        panel.add(panelD);

        frame.add(btBack);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        return frame;
    }

    public static ArrayList<String> readFromFile(String fileName) {
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Dosyanın sonuna kadar oku
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public static ArrayList<String> filterList(ArrayList<String> originalList, String anahtarKelime) {
        ArrayList<String> filteredList = new ArrayList<>();

        for (String item : originalList) {
            if (item.startsWith(anahtarKelime)) {
                filteredList.add(item);
            }
        }

        return filteredList;
    }

    public static JList<String> createJList(ArrayList<String> arrayList) {
        DefaultListModel<String> listModel = new DefaultListModel<>();

        // ArrayList'teki elemanları DefaultListModel'e ekleyin
        for (String item : arrayList) {
            listModel.addElement(item);
        }

        // DefaultListModel'i kullanarak JList oluşturun
        JList<String> jList = new JList<>(listModel);

        return jList;
    }

    public static JButton koltukGoster(JList<String> liste, JFrame frame, JPanel panel1, String a, JButton btn, String secim) {
        JButton buton = new JButton();

        buton.setSize(50, 50);
        buton.setBackground(Color.red);
        Image imgBul = new ImageIcon(Main.class.getResource("seat.png")).getImage();
        buton.setIcon(new ImageIcon(imgBul));
        buton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int seciliIndex = liste.getSelectedIndex();
                if (seciliIndex != -1) {
                    frame.getContentPane().removeAll(); // Tüm bileşenleri kaldır
                    frame.revalidate();  // Yeniden düzenleme
                    frame.repaint();     // Yeniden çizme
                    panel1.setBounds(0, 0, 250, 100);
                    firmaAd = panel1.getName();
                    JPanel panel2 = new JPanel();
                    panel2.setLayout(null);

                    if (secim.equals("otobus")) {
                        panel2 = panelO();

                    } else if (secim.equals("ucak")) {
                        panel2 = panelU();
                    } else if (secim.equals("tren")) {
                        panel2 = panelT();
                    }

                    panel2.setBackground(Color.red);
                    panel2.setBounds(10, 102, 368, 450);

                    JLabel saatLabel = new JLabel();
                    saatLabel.setBounds(10, 400, 350, 50);
                    if (seciliIndex == 0) {
                        saatLabel.setText("09:00-10:00 SEFERI");
                    } else if (seciliIndex == 1) {
                        saatLabel.setText("10:00-11:00 SEFERI");
                    } else if (seciliIndex == 2) {
                        saatLabel.setText("11:00-12:00 SEFERI");
                    }

                    panel2.add(saatLabel);

                    frame.add(btn);
                    frame.add(panel1);
                    frame.add(panel2);

                    frame.setVisible(true);
                }
            }
        });

        return buton;
    }

    private static java.util.List<JButton> sarıButonlar = new java.util.ArrayList<>();

    public static JPanel panelO() {
        // Ana paneli oluştur
        JPanel panelOtobus = new JPanel();
        JPanel sag = new JPanel();
        JPanel sol = new JPanel();
        JPanel koridor = new JPanel();
        koridor.setBounds(115, 10, 15, 400);
        koridor.setBackground(Color.LIGHT_GRAY);
        sag.setLayout(new GridLayout(10, 1, 10, 10));
        sol.setLayout(new GridLayout(10, 2, 10, 10));
        sol.setBounds(5, 10, 110, 400);

        sag.setBounds(130, 10, 50, 400);
        panelOtobus.setLayout(null); // 10 satır, 4 sütunlu GridLayout
        panelOtobus.setSize(250, 450);
        JButton butonTamamla = new JButton("Tamamla");
        butonTamamla.setBounds(265, 397, 100, 50);

        // Sol tarafa butonları ekle
        for (int i = 1; i <= 20; i++) {
            JButton button = new JButton("" + i);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Tıklanan butonun rengini sarı yap
                    button.setBackground(Color.YELLOW);
                    // Sarı renkteki butonları takip etmek için listeye ekle
                    sarıButonlar.add(button);

                }
            });
            sol.add(button);
        }

        // Sağ tarafa butonları ekle
        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton("" + (i + 20));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Tıklanan butonun rengini sarı yap
                    button.setBackground(Color.YELLOW);
                    // Sarı renkteki butonları takip etmek için listeye ekle
                    sarıButonlar.add(button);
                }
            });
            sag.add(button);
        }

        butonTamamla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ad ve Soyad girişi için JTextField'lar
                JTextField adTextField = new JTextField();
                JTextField soyadTextField = new JTextField();

                // Label oluştur ve içeriğini ayarla
                String ucret = String.valueOf(200 * (a + b));
                JLabel ucretLabel = new JLabel("BILET BEDELI:" + ucret);

                // Giriş ekranını oluştur
                Object[] message = {
                    "Ad:", adTextField,
                    "Soyad:", soyadTextField,
                    ucretLabel
                };

                int option = JOptionPane.showConfirmDialog(null, message, "Ad ve Soyad Giriniz", JOptionPane.OK_CANCEL_OPTION);

                if (option == JOptionPane.OK_OPTION) {
                    // Sarı renkteki butonları pembe renge dönüştür ve devre dışı bırak
                    for (JButton sarıButon : sarıButonlar) {

                        sarıButon.setBackground(Color.PINK);
                        koltukNo = sarıButon.getText();
                        Ad = adTextField.getText();
                        soyAd = soyadTextField.getText();
                        DataOperations dt = new DataOperations();
                        dt.addDataToFile("biletbilgi.txt", Ad);
                        dt.addDataToFile("biletbilgi.txt", soyAd);
                        dt.addDataToFile("biletbilgi.txt", tarihbilgisi);
                        dt.addDataToFile("biletbilgi.txt", aracTur);
                        dt.addDataToFile("biletbilgi.txt", Kalkis);
                        dt.addDataToFile("biletbilgi.txt", Varis);
                        dt.addDataToFile("biletbilgi.txt", koltukNo);
                        dt.addDataToFile("biletbilgi.txt", "------------------------");
                        sarıButon.setEnabled(false);
                    }
                    sarıButonlar.clear();

                    // İşlem tamamlandı mesajını göster
                    JOptionPane.showMessageDialog(null, "İŞLEMİNİZ TAMAMLANMIŞTIR!");
                }
            }
        });
        panelOtobus.add(butonTamamla);
        panelOtobus.add(koridor);
        panelOtobus.add(sol);
        panelOtobus.add(sag);

        return panelOtobus;
    }
    private static java.util.List<JButton> sarıButonlar1 = new java.util.ArrayList<>();

    public static JPanel panelU() {
        // Ana paneli oluştur
        JPanel panelOtobus = new JPanel();
        JPanel sag = new JPanel();
        JPanel sol = new JPanel();
        JPanel koridor = new JPanel();
        koridor.setBounds(175, 10, 15, 380);
        koridor.setBackground(Color.LIGHT_GRAY);
        sag.setLayout(new GridLayout(10, 3, 10, 10));
        sol.setLayout(new GridLayout(10, 3, 10, 10));
        sol.setBounds(5, 10, 170, 380);
        sag.setBounds(190, 10, 170, 380);
        panelOtobus.setLayout(null);
        panelOtobus.setSize(390, 380);
        JButton butonTamamla = new JButton("Tamamla");
        butonTamamla.setBounds(265, 397, 100, 50);

        // Sol tarafa butonları ekle
        for (int i = 1; i <= 30; i++) {
            JButton button = new JButton("" + i);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Tıklanan butonun rengini sarı yap
                    button.setBackground(Color.YELLOW);
                    // Sarı renkteki butonları takip etmek için listeye ekle
                    sarıButonlar1.add(button);
                }
            });
            sol.add(button);
        }

        // Sağ tarafa butonları ekle
        for (int i = 1; i <= 30; i++) {
            JButton button = new JButton("" + (i + 30));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Tıklanan butonun rengini sarı yap
                    button.setBackground(Color.YELLOW);
                    // Sarı renkteki butonları takip etmek için listeye ekle
                    sarıButonlar1.add(button);
                }
            });
            sag.add(button);
        }
        butonTamamla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ad ve Soyad girişi için JTextField'lar
                JTextField adTextField = new JTextField();
                JTextField soyadTextField = new JTextField();

                // Label oluştur ve içeriğini ayarla
                String ucret = String.valueOf(500 * (a + b));
                JLabel ucretLabel = new JLabel("BILET BEDELI:" + ucret);
                // Giriş ekranını oluştur
                Object[] message = {
                    "Ad:", adTextField,
                    "Soyad:", soyadTextField,
                    ucretLabel
                };

                int option = JOptionPane.showConfirmDialog(null, message, "Ad ve Soyad Giriniz", JOptionPane.OK_CANCEL_OPTION);

                if (option == JOptionPane.OK_OPTION) {
                    // Sarı renkteki butonları pembe renge dönüştür ve devre dışı bırak
                    for (JButton sarıButon : sarıButonlar1) {
                        sarıButon.setBackground(Color.PINK);
                        koltukNo = sarıButon.getText();
                        Ad = adTextField.getText();
                        soyAd = soyadTextField.getText();
                        DataOperations dt = new DataOperations();
                        dt.addDataToFile("biletbilgi.txt", Ad);
                        dt.addDataToFile("biletbilgi.txt", soyAd);
                        dt.addDataToFile("biletbilgi.txt", tarihbilgisi);
                        dt.addDataToFile("biletbilgi.txt", aracTur);
                        dt.addDataToFile("biletbilgi.txt", Kalkis);
                        dt.addDataToFile("biletbilgi.txt", Varis);
                        dt.addDataToFile("biletbilgi.txt", koltukNo);
                        dt.addDataToFile("biletbilgi.txt", "------------------------");
                        sarıButon.setEnabled(false);
                    }
                    sarıButonlar1.clear();

                    // İşlem tamamlandı mesajını göster
                    JOptionPane.showMessageDialog(null, "İŞLEMİNİZ TAMAMLANMIŞTIR!");
                }
            }
        });
        panelOtobus.add(butonTamamla);
        panelOtobus.add(koridor);
        panelOtobus.add(sol);
        panelOtobus.add(sag);

        return panelOtobus;
    }
    private static java.util.List<JButton> sarıButonlar2 = new java.util.ArrayList<>();

    public static JPanel panelT() {
        // Ana paneli oluştur
        JPanel panelOtobus = new JPanel();
        JPanel sag = new JPanel();
        JPanel sol = new JPanel();
        JPanel koridor = new JPanel();
        koridor.setBounds(115, 10, 15, 400);
        koridor.setBackground(Color.LIGHT_GRAY);
        sag.setLayout(new GridLayout(10, 2, 10, 10));
        sol.setLayout(new GridLayout(10, 2, 10, 10));
        sol.setBounds(5, 10, 110, 400);
        sag.setBounds(130, 10, 110, 400);
        panelOtobus.setLayout(null); // 10 satır, 4 sütunlu GridLayout
        panelOtobus.setSize(300, 400);
        JButton butonTamamla = new JButton("Tamamla");
        butonTamamla.setBounds(265, 397, 100, 50);

        // Sol tarafa butonları ekle
        for (int i = 1; i <= 20; i++) {
            JButton button = new JButton("" + i);
            // Tıklanan butonun rengini sarı yap

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Tıklanan butonun rengini sarı yap
                    button.setBackground(Color.YELLOW);
                    // Sarı renkteki butonları takip etmek için listeye ekle
                    sarıButonlar2.add(button);
                }
            });
            sol.add(button);
        }

        // Sağ tarafa butonları ekle
        for (int i = 1; i <= 20; i++) {
            JButton button = new JButton("" + (i + 20));
            // Tıklanan butonun rengini sarı yap
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Tıklanan butonun rengini sarı yap
                    button.setBackground(Color.YELLOW);
                    // Sarı renkteki butonları takip etmek için listeye ekle
                    sarıButonlar2.add(button);
                }
            });
            sag.add(button);
        }
        butonTamamla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ad ve Soyad girişi için JTextField'lar
                JTextField adTextField = new JTextField();
                JTextField soyadTextField = new JTextField();

                // Label oluştur ve içeriğini ayarla
                String ucret = String.valueOf(300 * (a + b));
                JLabel ucretLabel = new JLabel("BILET BEDELI:" + ucret);

                // Giriş ekranını oluştur
                Object[] message = {
                    "Ad:", adTextField,
                    "Soyad:", soyadTextField,
                    ucretLabel
                };

                int option = JOptionPane.showConfirmDialog(null, message, "Ad ve Soyad Giriniz", JOptionPane.OK_CANCEL_OPTION);

                if (option == JOptionPane.OK_OPTION) {
                    // Sarı renkteki butonları pembe renge dönüştür ve devre dışı bırak
                    for (JButton sarıButon : sarıButonlar2) {
                        sarıButon.setBackground(Color.PINK);
                        koltukNo = sarıButon.getText();
                        Ad = adTextField.getText();
                        soyAd = soyadTextField.getText();
                        sarıButon.setEnabled(false);
                        DataOperations dt = new DataOperations();
                        dt.addDataToFile("biletbilgi.txt", Ad);
                        dt.addDataToFile("biletbilgi.txt", soyAd);
                        dt.addDataToFile("biletbilgi.txt", tarihbilgisi);
                        dt.addDataToFile("biletbilgi.txt", aracTur);
                        dt.addDataToFile("biletbilgi.txt", Kalkis);
                        dt.addDataToFile("biletbilgi.txt", Varis);
                        dt.addDataToFile("biletbilgi.txt", koltukNo);
                        dt.addDataToFile("biletbilgi.txt", "------------------------");
                    }
                    sarıButonlar2.clear();

                    // İşlem tamamlandı mesajını göster
                    JOptionPane.showMessageDialog(null, "İŞLEMİNİZ TAMAMLANMIŞTIR!");
                }
            }
        });

        panelOtobus.add(butonTamamla);

        panelOtobus.add(koridor);
        panelOtobus.add(sol);
        panelOtobus.add(sag);

        return panelOtobus;
    }

}
