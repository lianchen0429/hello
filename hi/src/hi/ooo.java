import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFrame extends JFrame {
	private JTextField tf;
	private JCheckBox cbBold;
	private JCheckBox cbItalic;
	//�ʵ�=��k=������k=�����k/���O��k
	//�غc��
	public CheckBoxFrame(){
		//���n��
		super("�֨�������յ{��");
		setLayout(new FlowLayout());
		//�����Ȼs�Ƴ���
		tfText= new JTextField("���[��r��]�w���ܤ�");//�إߤ�r���
		Font f= new Font("�L�n������"),Font.PLAIN,14);
		tfText.setFont(f);
		//tfText.setFont(new Font("�L�n������"),Font.PLAIN,14);
		add(tfText);//�N��r����[�J�����
		
		
		cbBold= new JCheckBox("����");
		cbItalic= new JCheckBox("����");
	}
	//�@���k
	//�������O
	private class CBHandler implements ItemListener{
		//�W��
		private int b= Font.PLAIN;
		private int i= Font.PLAIN;
		//�ʵ�
		public void itemStateChanged(ItemEvent e){
			if(e.getSource()==cbBold)
				b=
		}
	}
}
