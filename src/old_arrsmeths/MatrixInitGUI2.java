package old_arrsmeths;
import javax.swing.*;

import static old_arrsmeths.ArrMatrixMeths.*;

import java.awt.*;
import java.awt.event.*;
public class MatrixInitGUI2 extends JFrame{
	private JTextField[][] elmass;
	private JButton jbtnWrite;
	private JPanel jpnl;
	private TextArea txtar;
	private String[][] arrS;
	private int[][] arrI;
	public MatrixInitGUI2(int rows, int columns){
		initComponents(rows, columns);
	}
	private void initComponents(int rows, int columns){
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("������� �������� ��������� �������");
		
		jpnl = new JPanel();
		jpnl.setLayout(null);
		jbtnWrite = new JButton("Write element in array");
		txtar = new TextArea();
		
		elmass = new JTextField[rows][columns];
		for(int i = 0; i <= elmass.length-1; i++)
			for(int j = 0; j <= elmass[i].length-1; j++)
				elmass[i][j] = new JTextField(3);
		int x=0,y=0;
		for(int i = 0; i <= elmass.length-1; i++){
			for(int j = 0; j <= elmass[i].length-1; j++){
					elmass[i][j].setLocation(x,y);
					elmass[i][j].setSize(25,25);
					jpnl.add(elmass[i][j]);
					x += 26;
				}
			x = 0;
			y += 26;
		}
		//���������� ������������� ��������� ���������� ���������� ����, ���������������� 
		//���������� "�������� �������" (��������� ��������� ������ ������� ��������� ������)
		int coordX = elmass[rows-1][columns-1].getX();
		//���������� ������������� ��������� ���������� ���������� ����, ���������������� 
		//���������� "�������� �������" (��������� ��������� ������ ������� ��������� ������)
		int coordY = elmass[rows-1][columns-1].getY();
		
		//������ ���� ������ "��������� �������" (���������� ����� (rows) �������)
		int arrayCeilH = elmass[rows-1][columns-1].getY()+elmass[rows-1][columns-1].getHeight();
		//������ ���� ������ "��������� �������" (���������� �������� (columns) �������)
		int arrayCeilW = elmass[rows-1][columns-1].getX()+elmass[rows-1][columns-1].getWidth();

		//������� ������: �� ����������� - ������� ������� "�������� �������" (������/���������� ����), 
		//�� ��������� - ���������� (��������� ��������� ������) ���������� "�������� �������" (���������� 
		//����/������) � ����� � ��� ������� (����� �� ��������� ������ ���������� ������)
		jbtnWrite.setLocation(elmass[0][0].getX(), coordY+elmass[0][0].getHeight());
		jbtnWrite.setSize(arrayCeilW, elmass[0][0].getHeight());//(,25)
		jpnl.add(jbtnWrite);
		txtar.setLocation(elmass[0][columns-1].getX()+elmass[0][0].getWidth(), elmass[0][0].getY());
		txtar.setSize(arrayCeilW, arrayCeilH);
		txtar.setEditable(false);
		this.add(txtar);
		this.add(jpnl);	
		this.setSize((jbtnWrite.getX()+jbtnWrite.getWidth()+txtar.getWidth()+15), (jbtnWrite.getY()+jbtnWrite.getHeight()+40));
		jbtnWrite.setSize(arrayCeilW+txtar.getWidth(),jbtnWrite.getHeight());
		this.setLocationRelativeTo(null);
		
		jbtnWrite.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
				int reply = JOptionPane.showConfirmDialog(null, "����� ������������� ������?", "��� ������", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION) {
					arrI = new int[rows][columns];
					for(int i = 0; i <= elmass.length-1; i++)
						for(int j = 0; j <= elmass[i].length-1; j++)
							arrI[i][j] = Integer.parseInt(elmass[i][j].getText());				
					txtar.append(arrPrint(arrI)+"\n");
					}
				else {
					arrS = new String[rows][columns];
					for(int i = 0; i <= elmass.length-1; i++)
						for(int j = 0; j <= elmass[i].length-1; j++)
							arrS[i][j] = elmass[i][j].getText();
					txtar.append(arrPrint(arrS)+"\n");
					}
				}catch(NumberFormatException exc){
					JOptionPane.showMessageDialog(null, "������ �� ������������� ���������� ����:\n"+exc);
				}
			}
		});
	}
	public static void main(String[] args){
		new MatrixInitGUI2(4,4).setVisible(true);
	}
}