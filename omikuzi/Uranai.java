package omikuzi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Uranai extends JFrame{
	
	Uranai(){
		
		
		//メイン画面を作成aa
		
		JFrame frame = this;
	    JLabel lbl1 = new JLabel("あなたの運勢を占います");
	    Font font1 = new Font(Font.SERIF,Font.BOLD,40);
	    lbl1.setFont(font1);
	    lbl1.setHorizontalAlignment(JLabel.CENTER);
	    lbl1.setOpaque(true);
	    lbl1.setBackground(Color.GREEN);
	    
	    ImageIcon image = new ImageIcon("omikuzi/omikugi.jpg");
		JLabel lbl2 = new JLabel(image);
		
		JButton btn = new JButton("おみくじ開始!");
		btn.setFont(font1);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//ボタンが押された後の処理
				
				Font font2 = new Font(Font.SERIF,Font.BOLD,30);
				JPanel pane = new JPanel();
				Random r = new Random();
				ImageIcon image0;
				JLabel lbl0;
				JLabel lbl01=null;
				
				//乱数を生成し、おみくじの出方を決める

				int s =r.nextInt(4);
				if(s==0) {
					
					 image0 = new ImageIcon("omikuzi/daikiti.png");
					 lbl0 = new JLabel(image0);
					 lbl01 = new JLabel("今日はいい日になるね！");
					 lbl01.setForeground(Color.RED);
				
				
				}else if(s==1) {
					 image0 = new ImageIcon("omikuzi/chuukiti.png");
					 lbl0 = new JLabel(image0);
					 lbl01 = new JLabel("今日はいつもとかわらない！");
					 lbl01.setForeground(Color.PINK);
					
				}else if(s==2) {
					 image0 = new ImageIcon("omikuzi/kiti.png");
					 lbl0 = new JLabel(image0);
					 lbl01 = new JLabel("今日はあんまりついてないかも(泣)");
					 lbl01.setForeground(Color.DARK_GRAY);
				
				
				}else {
					 image0 = new ImageIcon("omikuzi/kyou.png");
					 lbl0 = new JLabel(image0);
					 lbl01 = new JLabel("今日は運が悪いから家にいよう(泣)");
					 lbl01.setForeground(Color.BLUE);
					
				}
	
				//おみくじ結果の画面
				
				pane.setLayout(new BorderLayout());
				lbl01.setFont(font2);
				lbl01.setHorizontalAlignment(JLabel.CENTER);
				pane.add(lbl0,BorderLayout.NORTH);
				pane.add(lbl01,BorderLayout.SOUTH);
				
				JDialog dlg = new JDialog(frame,"Dialog",true);
				dlg.getContentPane().add(pane);
				dlg.setSize(new java.awt.Dimension(600,600));
				dlg.setVisible(true);
				
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				btn.setVisible(false);
				
				
			}
			
		});
		
		//パネルを作成してメイン画面に追加する

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(lbl1,BorderLayout.NORTH);
		panel.add(lbl2,BorderLayout.CENTER);
		panel.add(btn, BorderLayout.SOUTH);
	
		add(panel);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Uranai");
		setSize(600,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		//コンストラクタ
		new Uranai();
	}

}
