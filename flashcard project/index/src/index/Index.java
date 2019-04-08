/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dstat
 */
public class Index extends JFrame implements ActionListener {

    static int randomNum = 0;
    ArrayList<String> questions = new ArrayList();
    ArrayList<String> answers = new ArrayList();
    Path questionsPath = 
            Paths.get("D:\\PTCwork\\Project Management\\Final-Project-Git\\Final-Project\\Questions.txt");
    Path answersPath = 
            Paths.get("D:\\PTCwork\\Project Management\\Final-Project-Git\\Final-Project\\Answers.txt");
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
        
        try{
            //get file size
            BasicFileAttributes fileSize = Files.readAttributes(questionsPath, BasicFileAttributes.class);
            //get number of words in file
            InputStream input1 = new BufferedInputStream(Files.newInputStream(questionsPath));
            BufferedReader read = new BufferedReader(new InputStreamReader(input1));
            String j = read.readLine();
            while (j != null) {
                questions.add(j);
                j = read.readLine();
            }
            input1.close();
            read.close();
            
            try{
            //get file size
            BasicFileAttributes fileSize2 = Files.readAttributes(answersPath, BasicFileAttributes.class);
            //get number of words in file
            InputStream input2 = new BufferedInputStream(Files.newInputStream(answersPath));
            BufferedReader read1 = new BufferedReader(new InputStreamReader(input2));
            String k = read1.readLine();
            while (k != null) {
                answers.add(k);
                k = read1.readLine();
            }
            input2.close();
            read1.close();
        }
            catch(IllegalArgumentException a){
            System.out.println(a);
        }
        catch(FileSystemNotFoundException b){
            System.out.println(b);
        }
        catch(SecurityException c){
            System.out.println(c);
        }
        catch(UnsupportedOperationException d){
            System.out.println(d);
        }
        catch(IOException e){
            System.out.println(e);
        }
        }
        catch(IllegalArgumentException a){
            System.out.println(a);
        }
        catch(FileSystemNotFoundException b){
            System.out.println(b);
        }
        catch(SecurityException c){
            System.out.println(c);
        }
        catch(UnsupportedOperationException d){
            System.out.println(d);
        }
        catch(IOException e){
            System.out.println(e);
        }
        //check
        
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
        
            if(source == getAnswer){
                answer.setText(answers.get(randomNum));
            }
            if(source == nextQuestion){
                randomNum = random.nextInt(questions.size());
                answer.setText("");
                question.setText(questions.get(randomNum));
                
            }
        }
    }


