package com.company;

import javax.swing.*;


public class ProgrammerFrame extends JFrame {
    JFrame f;
    public ProgrammerFrame(String state) {

        this.f = new JFrame("Programmer at work");
        if(state.equals("Typing")) {
            Icon typingThings = new ImageIcon("src/typingGif.gif");
            f.setContentPane(new JLabel(typingThings));
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setVisible(true);

        }else if(state.equals("Pouring")) {

            Icon pouringCoffee = new ImageIcon("src/pouringCoffeeGif.gif");
            try {
                f.setContentPane(new JLabel(pouringCoffee));
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            } catch (Exception e) {
            }

        }else {
            Icon drinkingCoffee = new ImageIcon("src/drinkingCoffeeGif.gif");
            try {
                f.setContentPane(new JLabel(drinkingCoffee));
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            } catch (Exception e) {
            }
        }
    }

    public void changeState(String state){
        if(state.equals("Typing")) {
            Icon typingThings = new ImageIcon("src/typingGif.gif");
            try {
                f.setContentPane(new JLabel(typingThings));
                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }

        }else if(state.equals("Pouring")) {

            Icon pouringCoffee = new ImageIcon("src/pouringCoffeeGif.gif");
            try {
                f.setContentPane(new JLabel(pouringCoffee));
                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }

        }else {
            Icon drinkingCoffee = new ImageIcon("src/drinkingCoffeeGif.gif");
            try {
                f.setContentPane(new JLabel(drinkingCoffee));
                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
