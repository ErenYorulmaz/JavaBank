import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//Eren Yorulmaz
public class BedenKitleIndeksi {
public static int BoyCM;
public static int KiloKG;
public static String BoySTR;
public static String KiloSTR;
public static double BDI=4.2;
	public static void main(String[] args) {
		JFrame screen=new JFrame("Beden Kitle Indeksi");
		JLabel lbl_Welcome = new JLabel("Beden Kitle Indeksi Hesaplama Programimiza Hosgeldiniz");
		lbl_Welcome.setForeground(Color.BLUE);
		lbl_Welcome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lbl_Welcome.setBounds(10, 11, 564, 52);
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.RED);
		canvas.setBounds(10, 57, 564, 6);
		JLabel lbl_1 = new JLabel("Lutfen kilonuzu giriniz :");
		lbl_1.setForeground(Color.BLACK);
		lbl_1.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lbl_1.setBounds(20, 78, 224, 38);
		JLabel lbl_2 = new JLabel("Lutfen boyunuzu giriniz :");
		lbl_2.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lbl_2.setBounds(20, 141, 224, 38);
		JTextField Field_Kilo = new JTextField();
		Field_Kilo.setBounds(311, 91, 169, 20);
		Field_Kilo.setColumns(10);
		JTextField Field_Boy = new JTextField();
		Field_Boy.setColumns(10);
		Field_Boy.setBounds(311, 154, 169, 20);
		JLabel lbl_Sonuc = new JLabel("                            Hesaplama Sonucunuz ;");
		lbl_Sonuc.setForeground(Color.BLUE);
		lbl_Sonuc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lbl_Sonuc.setBounds(10, 259, 564, 46);
		JLabel lbl_BKI = new JLabel("Beden Kitle Indeksiniz :");
		lbl_BKI.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lbl_BKI.setBounds(10, 316, 224, 38);
		JLabel lbl_BKI_SONUC = new JLabel("");
		lbl_BKI_SONUC.setForeground(Color.BLUE);
		lbl_BKI_SONUC.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lbl_BKI_SONUC.setBounds(256, 316, 224, 38);
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(Color.RED);
		canvas_1.setBounds(10, 247, 564, 6);
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(194, 202, 187, 38);
		
		screen.add(btnNewButton);
		screen.add(canvas_1);
		screen.add(lbl_BKI_SONUC);
		screen.add(lbl_BKI);
		screen.add(lbl_Sonuc);
		screen.add(Field_Boy);
		screen.add(Field_Kilo);
		screen.add(lbl_2);
		screen.add(lbl_1);
		screen.add(canvas);
		screen.add(lbl_Welcome);
		screen.setLayout(null);
		screen.setBounds(620,320,600,450);
		screen.setVisible(true);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BoySTR=Field_Boy.getText();
				KiloSTR=Field_Kilo.getText();
				KiloKG=Integer.parseInt(KiloSTR);  
				BoyCM=Integer.parseInt(BoySTR);
				JOptionPane.showInternalMessageDialog(screen,BoyCM);
			}
		});
		;
	}
}
