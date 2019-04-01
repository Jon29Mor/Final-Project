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
public class Index extends JFrame implements ActionListener {

    String[] questions = {"Q One", "Q Two", "Q Three"};
    String[] answers = {"A One", "A Two", "A Three"};
    JLabel test = new JLabel("Hello");
    JLabel question = new JLabel();
    JLabel answer = new JLabel();
    JLabel next = new JLabel("");
    JButton getAnswer = new JButton("Answer");
    JButton nextQuestion = new JButton("Next Question");
    boolean run = true;
    
    Random random = new Random();
    int nextRandom = random.nextInt(3);
    
    

    public Index(){
        super("Flashcards");
        setLayout(new GridLayout(4, 1));
        
        for (int i = 0; i < questions.length; i++) {
            question.setText(questions[nextRandom]);
        }
        
        add(question);
        add(getAnswer);
        add(answer);
        add(nextQuestion);
        
        getAnswer.addActionListener(this);
        nextQuestion.addActionListener(this);
    }

    public static void main(String[] args) {
        Index frame = new Index();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        while(run = true){
            if(source == getAnswer){
                answer.setText(answers[nextRandom]);
                
            }
            if(source == nextQuestion){
                answer = next;
                question.setText(questions[nextRandom]);
                
            }
        }
    }

}
