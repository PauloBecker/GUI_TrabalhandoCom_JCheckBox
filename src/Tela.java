import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Tela implements ItemListener {
	
	JCheckBox chekBox1,chekBox2,chekBox3;
	JLabel label;
	
	public Tela() {

		JFrame frame = new JFrame("Título");
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		chekBox1 = new JCheckBox("opção 1");
		chekBox1.addItemListener(this);
		chekBox2 = new JCheckBox("opção 2");
		chekBox2.addItemListener(this);
		chekBox3 = new JCheckBox("opção 3");
		chekBox3.addItemListener(this);
		
		frame.add(chekBox1);
		frame.add(chekBox2);
		frame.add(chekBox3);
		
		label = new JLabel("");
		frame.add(label);
		
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

				new Tela();
			}
		});
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {


		String str="";
		
		str += chekBox1.isSelected()?" Opção1":"";
		str += chekBox2.isSelected()?" Opção2":"";
		str += chekBox3.isSelected()?" Opção3":"";
		label.setText(str);
		
	}

}
