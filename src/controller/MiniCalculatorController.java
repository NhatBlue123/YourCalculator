package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MiniCalculatorView;

public class MiniCalculatorController implements ActionListener{

	private MiniCalculatorView v;
	public MiniCalculatorController(MiniCalculatorView v) {
		this.v = v;
	}
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("+"))
		{
			v.displayCalcu(src);
			//v.maths(src);
		}
		else if(src.equals("-"))
		{
			v.displayCalcu(src);
			//v.maths(src);
		}
		else if(src.equals("*"))
		{
			v.displayCalcu(src);
			//v.maths(src);
		}
		else if(src.equals("/"))
		{
			v.displayCalcu(src);
			//v.maths(src);
		}
		else if(src.equals("^"))
		{
			v.displayCalcu(src);
			//v.maths(src);
		}
		else if(src.equals("%"))
		{
			v.displayCalcu(src);
			//v.maths(src);
		}
		else if(src.equals("="))
		{
			v.calcuBy(src);
		}
		
	}

}
