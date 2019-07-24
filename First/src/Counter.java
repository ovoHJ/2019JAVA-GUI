import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Counter {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");

		// 창 크기 조절
		Dimension dim = new Dimension(500, 300);
		Dimension screen =Toolkit.getDefaultToolkit().getScreenSize();
		frame.setPreferredSize(dim);
		frame.setLocation(200, 100);
		frame.setLocation((screen.width-500)/2, (screen.height-300)/2);

		JPanel panel = new JPanel();
		JLabel lbId = new JLabel("아이디 : ");
		JTextField tfId = new JTextField(20);
		JLabel lbPassword = new JLabel("비밀번호 : ");
		JTextField tfPassword = new JTextField(20);
		JLabel lbGender = new JLabel("성별 : ");
		JRadioButton rbFemale = new JRadioButton("여자");
		JRadioButton rbMale = new JRadioButton("남자");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbFemale);
		bg.add(rbMale);
		JLabel lbMeal = new JLabel("식사 : ");
		JCheckBox cbChicken = new JCheckBox("치킨");
		JCheckBox cbPizza = new JCheckBox("피자");
		JLabel lbEdu = new JLabel("학력 : ");
		String[] edu = {"초졸", "중졸"};
		JComboBox<String> cxEdu = new JComboBox<>(edu);
		cxEdu.addItem("고졸");
		JButton bts = new JButton("아미~");
		ImageIcon ii = new ImageIcon("src/img/signup.gif");
		ImageIcon ii작은 = new ImageIcon(ii.getImage().getScaledInstance(230/4, 223/4, Image.SCALE_DEFAULT));
		JLabel lbSignup = new JLabel(ii작은);
		ImageIcon ii깐쇼새우 = new ImageIcon("src/img/깐쇼새우.JPG");
		ImageIcon ii작은깐쇼새우 = new ImageIcon(ii깐쇼새우.getImage().getScaledInstance(416/2, 253/2, Image.SCALE_DEFAULT));
		JButton bt깐쇼새우 = new JButton(ii작은깐쇼새우);
		
		panel.add(lbId);
		panel.add(tfId);
		panel.add(lbPassword);
		panel.add(tfPassword);
		panel.add(lbGender);
		panel.add(rbFemale);
		panel.add(rbMale);
		panel.add(lbMeal);
		panel.add(cbChicken);
		panel.add(cbPizza);
		panel.add(lbEdu);
		panel.add(cxEdu);
		panel.add(bts);
		panel.add(lbSignup);
		panel.add(bt깐쇼새우);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
