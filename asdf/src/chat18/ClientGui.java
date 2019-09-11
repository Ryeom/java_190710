package chat18;
import java.awt.Color;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import chat18.ClientGui;
public class ClientGui  extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField jtf;
	private JTextArea jta;
	private BackClient client = new BackClient();
	private static String nickName;


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 닉네임부터 설정하세요 : ");
		nickName = scanner.nextLine();
		scanner.close();        

		new ClientGui();
	}

	public ClientGui() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 224, 230));
		frame.setBounds(100, 100, 450, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		jtf = new JTextField();
		jtf.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 22));
		jtf.setBounds(12, 538, 352, 44);
		frame.getContentPane().add(jtf);
		jtf.setColumns(10);
		jtf.addActionListener(this);

		jta = new JTextArea();
		jta.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 22));
		jta.setBounds(0, 72, 434, 452);
		jta.setEditable(true);//편집금지
		frame.getContentPane().add(jta);

		JButton button = new JButton("<<<");//뒤로가기
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);//로긘창꺼벌여!!!!!!!!!!!!!!!!!!!!!
			}
		});
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 22));
		button.setFocusPainted(false);
		button.setBorderPainted(false);
		button.setBackground(new Color(255, 204, 204));
		button.setBounds(0, 0, 317, 64);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("이모티콘");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ClientGui.EmotionGui();
				//eg.main(null);//메인안부름
				//eg.initialize();
			}
		});
		button_1.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 22));
		button_1.setFocusPainted(false);
		button_1.setBorderPainted(false);
		button_1.setBackground(new Color(255, 204, 204));
		button_1.setBounds(314, 0, 120, 64);
		frame.getContentPane().add(button_1);

		JButton button_3 = new JButton("<");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 22));
		button_3.setFocusPainted(false);
		button_3.setBorderPainted(false);
		button_3.setBackground(new Color(255, 204, 204));
		button_3.setBounds(376, 538, 46, 44);
		frame.getContentPane().add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setEnabled(false);
		scrollBar.setBounds(417, 72, 17, 452);
		frame.getContentPane().add(scrollBar);
		frame.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		client.setGui(this);
		client.setNickname(nickName);
		client.connet();


	}


	@Override
	//말치면 보내는 부분
	public void actionPerformed(ActionEvent e) {
		String msg;
		msg = nickName+ ":" + jtf.getText()+"\n";
		client.sendMessage(msg);
		jtf.setText("");	
	}

	public void appendMsg(String msg) {
		jta.append(msg);
	}


	public class EmotionGui {

		private JFrame frame3;
		ClientGui cg ;
		private String emobuf;
		private BackClient clientb;

		public EmotionGui() {
			emobuf = null;
			initialize();
		}

		public void initialize() {
			frame3 = new JFrame();
			frame3.getContentPane().setBackground(new Color(176, 224, 230));
			frame3.getContentPane().setLayout(null);

			JButton button = new JButton("<<<");
			button.setHorizontalAlignment(SwingConstants.LEFT);
			button.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 22));
			button.setFocusPainted(false);
			button.setBorderPainted(false);
			button.setBackground(new Color(255, 204, 204));
			button.setBounds(0, 0, 81, 64);
			button.addActionListener(new ActionListener() {//뒤로가기
				public void actionPerformed(ActionEvent e) {
					//frame3.setVisible(false);
				}
			});
			frame3.getContentPane().add(button);

			JButton button_1 = new JButton("\uC774\uBAA8\uD2F0\uCF58\uC744 \uC120\uD0DD\uD558\uC0C8\uC624");
			button_1.setHorizontalAlignment(SwingConstants.RIGHT);
			button_1.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 22));
			button_1.setFocusPainted(false);
			button_1.setBorderPainted(false);
			button_1.setBackground(new Color(255, 204, 204));
			button_1.setBounds(75, 0, 359, 64);
			frame3.getContentPane().add(button_1);

			JButton button_2 = new JButton("(\uFF3E\u25BD\uFF3E)");
			button_2.addActionListener(new ActionListener() {//(＾▽＾)
				public void actionPerformed(ActionEvent e) {
					emobuf = "(＾▽＾)";
					emoticon(emobuf);
					frame3.setVisible(false);
				}
			});
			button_2.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 20));
			button_2.setFocusPainted(false);
			button_2.setBorderPainted(false);
			button_2.setBackground(new Color(240, 248, 255));
			button_2.setBounds(219, 359, 203, 85);
			frame3.getContentPane().add(button_2);

			JButton button_3 = new JButton("(9\uFF40>\u03C9<)9");
			button_3.addActionListener(new ActionListener() {//(9｀>ω<)9
				public void actionPerformed(ActionEvent e) {
					emobuf = "(9｀>ω<)9";
					emoticon(emobuf);
					frame3.setVisible(false);
				}
			});
			button_3.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 20));
			button_3.setFocusPainted(false);
			button_3.setBorderPainted(false);
			button_3.setBackground(new Color(240, 248, 255));
			button_3.setBounds(10, 359, 203, 85);
			frame3.getContentPane().add(button_3);

			JButton btnO = new JButton("o(\uFF40^\u00B4 *)");//o(｀^´ *)
			btnO.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					emobuf = "o(｀^´ *)";
					emoticon(emobuf);
					frame3.setVisible(false);
				}
			});
			btnO.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 20));
			btnO.setFocusPainted(false);
			btnO.setBorderPainted(false);
			btnO.setBackground(new Color(240, 248, 255));
			btnO.setBounds(219, 264, 203, 85);
			frame3.getContentPane().add(btnO);

			JButton btnA = new JButton("A^-^)");
			btnA.addActionListener(new ActionListener() {//A^-^)
				public void actionPerformed(ActionEvent e) {
					emobuf = "A^-^)";
					emoticon(emobuf);
					frame3.setVisible(false);
				}
			});
			btnA.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 20));
			btnA.setFocusPainted(false);
			btnA.setBorderPainted(false);
			btnA.setBackground(new Color(240, 248, 255));
			btnA.setBounds(10, 264, 203, 85);
			frame3.getContentPane().add(btnA);

			JButton btntt = new JButton("(T_T)");//(T_T)
			btntt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					emobuf = "(T_T)";
					emoticon(emobuf);
					frame3.setVisible(false);
				}
			});
			btntt.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 20));
			btntt.setFocusPainted(false);
			btntt.setBorderPainted(false);
			btntt.setBackground(new Color(240, 248, 255));
			btntt.setBounds(219, 169, 203, 85);
			frame3.getContentPane().add(btntt);

			JButton btnL = new JButton("L(*\u00B4\u2200\uFF40*)/");
			btnL.addActionListener(new ActionListener() {//L(*´∀｀*)/
				public void actionPerformed(ActionEvent e) {
					emobuf = "L(*´∀｀*)/";
					emoticon(emobuf);
					frame3.setVisible(false);
				}
			});
			btnL.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 20));
			btnL.setFocusPainted(false);
			btnL.setBorderPainted(false);
			btnL.setBackground(new Color(240, 248, 255));
			btnL.setBounds(10, 169, 203, 85);
			frame3.getContentPane().add(btnL);

			JButton button_8 = new JButton("\uFF08\u25CF\u00B4\u2227\uFF40\u25CF\uFF09");
			button_8.addActionListener(new ActionListener() {//（●´∧｀●）
				public void actionPerformed(ActionEvent e) {
					emobuf = "（●´∧｀●）";
					emoticon(emobuf);
					frame3.setVisible(false);
				}
			});
			button_8.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 20));
			button_8.setFocusPainted(false);
			button_8.setBorderPainted(false);
			button_8.setBackground(new Color(240, 248, 255));
			button_8.setBounds(219, 74, 203, 85);
			frame3.getContentPane().add(button_8);

			JButton button_9 = new JButton("(~\u02D8\u3141\u02D8)~");//(~˘ㅁ˘)~
			button_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					emobuf = "(~˘ㅁ˘)~";
					emoticon(emobuf);
					frame3.setVisible(false);
				}
			});
			button_9.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 20));
			button_9.setFocusPainted(false);
			button_9.setBorderPainted(false);
			button_9.setBackground(new Color(240, 248, 255));
			button_9.setBounds(10, 74, 203, 85);
			frame3.getContentPane().add(button_9);

			JButton button_10 = new JButton("(\u00B4\u03B5\uFF40*)");
			button_10.addActionListener(new ActionListener() {//(´ε｀*)
				public void actionPerformed(ActionEvent e) {
					emobuf = "(´ε｀*)";
					emoticon(emobuf);
					frame3.setVisible(false);
				}
			});
			button_10.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 20));
			button_10.setFocusPainted(false);
			button_10.setBorderPainted(false);
			button_10.setBackground(new Color(240, 248, 255));
			button_10.setBounds(219, 454, 203, 85);
			frame3.getContentPane().add(button_10);

			JButton btno = new JButton("(\u261E^o^)\u261E");
			btno.addActionListener(new ActionListener() {//(☞^o^)☞
				public void actionPerformed(ActionEvent e) {
					emobuf = "(☞^o^)☞";
					emoticon(emobuf);
					frame3.setVisible(false);
				}
			});
			btno.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 20));
			btno.setFocusPainted(false);
			btno.setBorderPainted(false);
			btno.setBackground(new Color(240, 248, 255));
			btno.setBounds(10, 454, 203, 85);
			frame3.getContentPane().add(btno);

			JLabel lblTalkTalk = new JLabel("4\uC870 TALK TALK TALK!");
			lblTalkTalk.setForeground(Color.GRAY);
			lblTalkTalk.setFont(new Font("210 맨발의청춘 L", Font.PLAIN, 17));
			lblTalkTalk.setBounds(122, 549, 196, 33);
			frame3.getContentPane().add(lblTalkTalk);
			frame3.setBounds(100, 100, 450, 630);
			//frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			frame3.setVisible(true);
		}
		void emoticon(String buf) {
			String emsg;
			emsg = nickName + ":" + buf+"\n";
			clientb.sendMessage(emsg);
			jtf.setText("");
		}

	}


}