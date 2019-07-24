import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
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
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
