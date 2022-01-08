package ScreenUI;

import BussinessLogic.Arithmetic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ArthmeticUI extends JFrame implements MouseListener, ActionListener {

    JPanel panel;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JTextField txtField1;
    JTextField txtField2;
    JTextField txtfield3;
    JTextField txtfield4;
    JButton btn;

    private int num1;
    private int num2;
    private int num3;

    public ArthmeticUI(){
        setTitle("Arthmetic");
        setSize(600,600);
        setLayout(new BorderLayout());
        panel = new JPanel();
        //panel = new JPanel();
        panel.setLayout(null);
        //panel.setBackground(Color.RED);
        add(panel, BorderLayout.CENTER);

        //label
        label1 = new JLabel("Enter first number");
        label2 = new JLabel("Enter second number");
        label3 = new JLabel("Enter third number");
        label4 = new JLabel("The result is");

        //label bounds
        label1.setBounds(20,20,180,30);
        label2.setBounds(20,80,180,30);
        label3.setBounds(20,140,180,30);
        label4.setBounds(20,200,180,30);

        //textfield
        txtField1 = new JTextField();
        txtField2 = new JTextField();
        txtfield3 = new JTextField();
        txtfield4 = new JTextField();

        txtField1.setBounds(220,20,150,30);
        txtField2.setBounds(220,80,150,30);
        txtfield3.setBounds(220,140,150,30);
        txtfield4.setBounds(220,200,150,30);

        //button
        btn = new JButton("Clear");
        btn.setBackground(Color.RED);
        btn.setBounds(220,280,80,50);
        //add element to panel
        panel.add(label1);
        panel.add(txtField1);
        panel.add(label2);
        panel.add(txtField2);
        panel.add(label3);
        panel.add(txtfield3);
        panel.add(label4);
        panel.add(txtfield4);
        panel.add(btn);

        addMouseListener(this);
        btn.addActionListener(this);

        setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        label4.setText("The sum is ");
        this.num1 = Integer.parseInt(txtField1.getText());
        this.num2 = Integer.parseInt(txtField2.getText());
        this.num3 = Integer.parseInt(txtfield3.getText());
        Arithmetic arth = new Arithmetic(this.num1, this.num2, this.num3);
        txtfield4.setText(Integer.toString(arth.add()));

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label4.setText("The product is ");
        this.num1 = Integer.parseInt(txtField1.getText());
        this.num2 = Integer.parseInt(txtField2.getText());
        this.num3 = Integer.parseInt(txtfield3.getText());
        Arithmetic arth = new Arithmetic(this.num1, this.num2, this.num3);

        txtfield4.setText(Integer.toString(arth.mul()));
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {



    }

    @Override
    public void actionPerformed(ActionEvent e){
        txtField1.setText("");
        txtField2.setText("");
        txtfield3.setText("");
        txtfield4.setText("");
        label4.setText("The result is ");
    }

    public static void main(String[] args) {
        new ArthmeticUI();
    }
}
