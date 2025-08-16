package javaStudy.ch07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class Ex7_20 {
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action");
            }
        });
    }
}

//class Handle implements Action {
//    public void action(ActionEvent e){
//        System.out.println("Action");
//    }
//}
