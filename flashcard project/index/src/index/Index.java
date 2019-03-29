/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math.*;
import java.util.Random;
/**
 *
 * @author dstat
 */
public class Index {
    
    public static void main(String[] args) {
    String[] questions = {"Q One", "Q Two", "Q Three"};
    String[] answers = {"A One", "A Two", "A Three"};
    Random random = new Random();
    for (int i = 0; i < 2; i++) {
        int nextRandom = random.nextInt(3);
        JLabel q = new JLabel();
        
        }
    JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
