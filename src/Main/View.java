/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import bidang.Persegi;
import java.awt.event.*;
import javax.swing.*;
import ruang.Balok;
/**
 *
 * @author Eka Pryhananto
 */
public class View extends JFrame implements ActionListener{

    JLabel lPanjang = new JLabel("Panjang");
    final JTextField fPanjang = new JTextField(11);
    
    JLabel lLebar = new JLabel("Lebar");
    final JTextField fLebar = new JTextField(11);
    
    JLabel lTinggi = new JLabel("Tinggi");
    final JTextField fTinggi = new JTextField(11);
    
    JLabel lHasil = new JLabel("Hasil :");
    
    JLabel lLuasP = new JLabel(); 
    
    JLabel lKelilingP = new JLabel();
    
    JLabel lVolumeB = new JLabel();
    
    JLabel lLuasPer = new JLabel();
    
    
    JButton bHitung = new JButton("Hitung");
    JButton bReset = new JButton("Reset");
    
    
    View(){
        setTitle("Tugas Pertemuan 5");
        setSize(400,500);
        setLayout(null);

        add(lPanjang);
        add(fPanjang);
        add(lLebar);
        add(fLebar);
        add(lTinggi);
        add(fTinggi);
        add(lHasil);
        add(bHitung);
        add(bReset);
        
        lPanjang.setBounds(10,10,200,20);
        fPanjang.setBounds(90, 10, 200, 20);
        lLebar.setBounds(10,40,150,20);
        fLebar.setBounds(90, 40, 200, 20);
        lTinggi.setBounds(10,70,150,20);
        fTinggi.setBounds(90, 70, 200, 20);
        lHasil.setBounds(50, 100, 150, 20);
        bHitung.setBounds(45, 250, 100, 30);
        bReset.setBounds(150, 250, 100, 30);
        bHitung.addActionListener(this);
        bReset.addActionListener(this);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bHitung) {
            
            try{
                double p, l, t;

                p = Double.parseDouble(fPanjang.getText());
                l = Double.parseDouble(fLebar.getText());
                t = Double.parseDouble(fTinggi.getText());


                Persegi per = new Persegi(p, l);
                Balok bal = new Balok(p, l, t);
              

                        

                lLuasP.setText("Luas Persegi    : " + Double.toString(per.luas()));
                add(lLuasP);
                lLuasP.setBounds(50, 120, 200, 20);
                
                lKelilingP.setText("Keliling Persegi    : " + Double.toString(per.keliling()));
                add(lKelilingP);
                lKelilingP.setBounds(50, 140, 200, 20);
                
                lVolumeB.setText("Volume Balok    : " + Double.toString(bal.volume()));
                add(lVolumeB);
                lVolumeB.setBounds(50, 160, 200, 20);
                
                lLuasPer.setText("Luas Permukaan Balok  : " + Double.toString(bal.luas()));
                add(lLuasPer);
                lLuasPer.setBounds(50, 180, 200, 20);
                
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            
        }
        
        if (ae.getSource() == bReset) {
            fPanjang.setText(null);
            fLebar.setText(null);
            fTinggi.setText(null);
            lLuasP.setText(null);
            lKelilingP.setText(null);
            lVolumeB.setText(null);
            lLuasPer.setText(null);
        }
    }

    
    
}
