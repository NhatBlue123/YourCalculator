package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MiniCalculatorController;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame {
	private MiniCalculatorModel model;
	private Font font = new Font("Arial", Font.BOLD, 20);
	private Font font_TextField = new Font("Tahoma", Font.BOLD, 40);
	private JButton button;
	private ImageIcon icon;
	private ActionListener ac;
	private JTextField textCalcuField;
	private JTextField textAnswerField; 
	private JTextField textFirtsField ;
    private JTextField textSecondField;
	public MiniCalculatorView() {
		model = new MiniCalculatorModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		icon = new ImageIcon("C:\\Users\\bluez\\OneDrive\\Pictures\\1011863.png");
		//add icon
		
		//Events
		ac = new MiniCalculatorController(this);
		//Create GUI
		this.setTitle("Calculator");
		this.setSize(400, 400);
		this.setIconImage(icon.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		// Frame put text
		JLabel firts_Value = new JLabel("Firts Value: ");
		firts_Value.setFont(font);
		JLabel second_Value = new JLabel("Second Value: ");
		second_Value.setFont(font);
		JLabel calcu = new JLabel("Calculators: ");
		calcu.setFont(font);
		JLabel answe = new JLabel("Aswer: ");
		answe.setFont(font);
		// JTextField
		textFirtsField = new JTextField(model.getFirtsValue()+"",20);
		textFirtsField.setFont(font_TextField);
		textSecondField = new JTextField(model.getSecondValue()+"",20);
		textSecondField.setFont(font_TextField);
		textCalcuField = new JTextField(20);
		textCalcuField.setFont(font_TextField);
	    textAnswerField = new JTextField(20);
        textAnswerField.setFont(font_TextField);

		// Frame put label text
		JPanel panelText = new JPanel(new GridLayout(4, 2));
		for (int i = 0; i < 8; i++) {
			switch (i) {
			case 0:
				panelText.add(firts_Value);
				break;
			case 1:
				panelText.add(textFirtsField);
				break;
			case 2:
				panelText.add(second_Value);
				break;
			case 3:
				panelText.add(textSecondField);
				break;
			case 4:
				panelText.add(calcu);
				break;
			case 5:
				panelText.add(textCalcuField);
				break;
			case 6:
				panelText.add(answe);
				break;
			case 7:
				panelText.add(textAnswerField);
				break;
			default:
				break;
			}
		}
		
		//Calculations
		JPanel panel_calcu = new JPanel(new GridLayout(2,4));
		for(int i = 0 ; i < 7 ; i++)
		{
			switch (i) {
			case 0:
				button = new JButton("+");
				button.setFont(font);
			    button.addActionListener(ac);
				panel_calcu.add(button);
				break;
			case 1:
				button = new JButton("-");
				button.setFont(font);
				button.addActionListener(ac);
				panel_calcu.add(button);
				break;
			case 2:
				button = new JButton("*");
				button.setFont(font);
				button.addActionListener(ac);
				panel_calcu.add(button);
				break;
			case 3:
				button = new JButton("/");
				button.setFont(font);
				button.addActionListener(ac);
				panel_calcu.add(button);
				break;
			case 4:
				button = new JButton("^");
				button.setFont(font);
				button.addActionListener(ac);
				panel_calcu.add(button);
				break;
			case 5:
				button = new JButton("%");
				button.setFont(font);
				button.addActionListener(ac);
				panel_calcu.add(button);
				break;
			case 6:
				button = new JButton("=");
				button.setFont(font);
				button.addActionListener(ac);
				panel_calcu.add(button);
				break;
			default:
				break;
			}
		}
		this.setLayout(new BorderLayout());
		this.add(panelText, BorderLayout.NORTH);
		this.add(panel_calcu, BorderLayout.CENTER);
	}
	//Hien thi cac phep tinh
	public void displayCalcu(String calcu)
	{
		textCalcuField.setText(calcu);
	}
	public void maths(String calcu)
	{
		double firts = Double.parseDouble(textFirtsField.getText());
	    double second = Double.parseDouble(textSecondField.getText());
		if(calcu.equals("+"))
		{
			textAnswerField.setText(model.flus(firts,second) + "");
		}
		else if(calcu.equals("-"))
		{
			textAnswerField.setText(model.minus(firts,second)+"");
		}
		else if(calcu.equals("*"))
		{
			textAnswerField.setText(model.multiplication(firts,second) + "");
		}
		else if(calcu.equals("/"))
		{
			textAnswerField.setText(model.division(firts,second) + "");
		}
		else if(calcu.equals("^"))
		{
			textAnswerField.setText(model.pow(firts,second) + "");
		}
		else if(calcu.equals("%"))
		{
			textAnswerField.setText(model.mod(firts,second) + "");
		}
	}
    public void calcuBy(String calcu)
    {
    	double firts = Double.parseDouble(textFirtsField.getText());
	    double second = Double.parseDouble(textSecondField.getText());
    	if(calcu.equals("="))
    	{
    		if(this.textCalcuField.getText().equals("+"))
    		{
    			textAnswerField.setText(model.flus(firts,second) + "");
    		}else if(this.textCalcuField.getText().equals("-"))
    		{
    			textAnswerField.setText(model.minus(firts,second) + "");
    		}
    		else if(this.textCalcuField.getText().equals("*"))
    		{
    			textAnswerField.setText(model.multiplication(firts,second) + "");
    		}
    		else if(this.textCalcuField.getText().equals("/"))
    		{
    			textAnswerField.setText(model.division(firts,second) + "");
    		}
    		else if(this.textCalcuField.getText().equals("^"))
    		{
    			textAnswerField.setText(model.pow(firts,second) + "");
    		}
    		else if(this.textCalcuField.getText().equals("%"))
    		{
    			textAnswerField.setText(model.mod(firts,second) + "");
    		}
    	}
    }

}
