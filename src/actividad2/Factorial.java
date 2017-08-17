package actividad2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Factorial extends JFrame implements ActionListener{

    private JTextField numero;
    private JLabel titulo;
    private JButton Factorial, Fibonacci;
    
    Factorial() {
        ventana();
        iniciar();
    }
    
    public void ventana(){
        setTitle("Factorial y Fibonacci");
        setSize(400,400);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(new Color(220, 216,255));
        getContentPane().setBackground(Color.BLACK); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    
    public void iniciar(){
        titulo=new JLabel("Actidad 2 :D");
        titulo.setBounds(100, 100, 500, 30);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("High Tower Text",Font.BOLD,30));
        titulo.setVisible(true);
        add(titulo);
        
        numero=new JTextField();
        numero.setBounds(100, 150, 200, 20);
        numero.setVisible(true);
        add(numero);
        
        Factorial=new JButton("Factorial");
        Factorial.setBounds(50, 200, 100, 40);
        add(Factorial);
        Factorial.addActionListener(this);
        Factorial.setVisible(true);
        
        Fibonacci=new JButton("Fibonacci");
        Fibonacci.setBounds(50, 300, 100, 40);
        add(Fibonacci);
        Fibonacci.addActionListener(this);
        Fibonacci.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==Fibonacci) {
            int v=Integer.parseInt(numero.getText());
            if (v<=0) {
              JOptionPane.showMessageDialog(null,JOptionPane.ERROR_MESSAGE);  
            }
            else {
            Fibonacci1();
            }
        }
     if(e.getSource()==Factorial) {
            int v=Integer.parseInt(numero.getText());
            if (v<=0) {
              JOptionPane.showMessageDialog(null,JOptionPane.ERROR_MESSAGE);  
            }
            else {
            Factorial();
            }
        }
    }
    
    public void Fibonacci() {
        int num = 0;
        int resultado = 0;
        //System.out.println("Inserta un numero");
        //num=Leer.datoInt();
        
        //ESTE NO JALO }:
        
        num = Integer.parseInt(numero.getText());
        for (int i = 0; i <= num; i++) {
            
            if (i == 0) {
                System.out.println("Fibonnacci (" + i + ")=" + 0);
            }
            if (i == 1) {
                System.out.println("Fibonnacci (" + i + ")=" + 1);
            }
            if (i > 1) {
                resultado = (i - 1 ) + (i - 2);
                System.out.println("Fibonnacci (" + i + ")=" + resultado);
            }
        }
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado , "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void Factorial(){
        int num=0;
        int resultado=0;
        int op=1;
        num = Integer.parseInt(numero.getText());
        
        for(int i=num; i>=1; i--){
            
            resultado=i*(1);
             
            op=resultado*op;
           // resultado=0;
                    
        }
        System.out.println(op);
            JOptionPane.showMessageDialog(null, "El resultado es: " + op , "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }
    
    public void Fibonacci1(){
     int num;
     int num1;
     int num2;
     
     num = Integer.parseInt(numero.getText());
        do{
         
        }while(num<=1);
        System.out.println("Serie de Fibonacci en la posición " + num); 

        num1=1;
        num2=1; 

        System.out.print(num1+" ");
        
        for(int i=2;i<=num;i++){
             System.out.print(num2+" ");
             num2=num1+num2;
             num1=num2-num1;
        }
                JOptionPane.showMessageDialog(null, "El resultado de la serie Fibonacci en la posicion " +num+" es: " + num1 + " " , "Resultado", JOptionPane.INFORMATION_MESSAGE);

        System.out.println();
        
    }

    
}
