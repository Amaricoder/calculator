package Com.cal;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteOrder;

public class cal2 implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    JButton add,sub,mul,div,eq,clear,dot,per,back,dzero;
    JTextField tf;

    double n1,n2,result;

    String operation;
JPanel p1;

    cal2(){
        f1=new JFrame();
         tf=new JTextField();
        tf.setBounds(5,5,300,65);
        tf.setFont(new Font("tamoha",Font.BOLD,20));
      //  tf.setBackground(Color.LIGHT_GRAY);
        f1.add(tf);



//button
        b1=new JButton("1");
        b1.setBounds(15,75,70,40);
        b1.setFont(new Font("tamoha",Font.BOLD,20));
        f1.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num=tf.getText()+b1.getText();
                tf.setText(num);
            }
        });


        b2=new JButton("2");
        b2.setBounds(85,75,70,40);
        b2.setFont(new Font("tamoha",Font.BOLD,20));

        f1.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num=tf.getText()+b2.getText();
                tf.setText(num);
            }
        });

        b3=new JButton("3");
        b3.setBounds(155,75,70,40);
        b3.setFont(new Font("tamoha",Font.BOLD,20));
        f1.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num=tf.getText()+b3.getText();
                tf.setText(num);
            }
        });

        add=new JButton("+");
        add.setBounds(225,75,70,40);
        add.setFont(new Font("tamoha",Font.BOLD,20));
        f1.add(add);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(tf.getText());

                tf.setText("");
                operation="+";

            }
        });

        b4=new JButton("4");
        b4.setBounds(15,115,70,40);
        b4.setFont(new Font("tamoha",Font.BOLD,20));

        f1.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num=tf.getText()+b4.getText();
                tf.setText(num);
            }
        });



        b5=new JButton("5");
        b5.setBounds(85,115,70,40);
        b5.setFont(new Font("tamoha",Font.BOLD,20));
        f1.add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num=tf.getText()+b5.getText();
                tf.setText(num);
            }
        });


        b6=new JButton("6");
        b6.setBounds(155,115,70,40);
        b6.setFont(new Font("tamoha",Font.BOLD,20));

        f1.add(b6);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num=tf.getText()+b6.getText();
                tf.setText(num);
            }
        });


        sub=new JButton("-");
        sub.setBounds(225,115,70,40);
        sub.setFont(new Font("tamoha",Font.BOLD,20));
        f1.add(sub);

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(tf.getText());
                tf.setText("");
                 operation="-";

            }
        });



        b7=new JButton("7");
        b7.setBounds(15,155,70,40);
        b7.setFont(new Font("tamoha",Font.BOLD,20));
        f1.add(b7);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num=tf.getText()+b7.getText();
                tf.setText(num);
            }
        });


        b8=new JButton("8");
        b8.setBounds(85,155,70,40);
        b8.setFont(new Font("tamoha",Font.BOLD,20));
        f1.add(b8);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num=tf.getText()+b8.getText();
                tf.setText(num);
            }
        });


        b9=new JButton("9");
        b9.setBounds(155,155,70,40);
        b9.setFont(new Font("tamoha",Font.BOLD,20));

        f1.add(b9);

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num=tf.getText()+b9.getText();
                tf.setText(num);
            }
        });


        mul=new JButton("*");
        mul.setBounds(225,155,70,40);
        f1.add(mul);
        mul.setFont(new Font("tamoha",Font.BOLD,20));

        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(tf.getText());
                tf.setText("");
                 operation="*";

            }
        });


        clear=new JButton("C");
        clear.setBounds(15,235,70,40);
        clear.setFont(new Font("tamoha",Font.BOLD,20));
        f1.add(clear);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(null);
            }
        });

        b0=new JButton("0");
        b0.setBounds(85,195,70,40);
        b0.setFont(new Font("tamoha",Font.BOLD,20));

        f1.add(b0);
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num=tf.getText()+b0.getText();
                tf.setText(num);
            }
        });


        eq=new JButton("=");
        eq.setBounds(155,235,70,40);
        eq.setFont(new Font("tamoha",Font.BOLD,20));
eq.setBackground(Color.blue);
eq.setForeground(Color.white);
        f1.add(eq);
        eq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//String ans;

                n2=Double.parseDouble(tf.getText());
                if(operation=="+"){
                    result=n1+n2;
                 String ans=String.format("%.2f",result);
                    tf.setText(ans);
                } else if (operation=="-") {
                    result=n1-n2;
                   String ans=String.format("%.2f",result);
                    tf.setText(ans);
                } else if (operation=="*") {
                    result=n1*n2;
                  String  ans=String.format("%.2f",result);
                    tf.setText(ans);
                }else if(operation=="/"){
                    result=n1/n2;
                   String ans=String.format("%.2f",result);
                    tf.setText(ans);
                }else {
                    result=n1%n2;
                  String  ans=String.format("%.2f",result);
                    tf.setText(ans);
                }


            }
        });


        div=new JButton("/");
        div.setBounds(225,195,70,40);
        div.setFont(new Font("tamoha",Font.BOLD,20));
        f1.add(div);

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(tf.getText());
                tf.setText("");
                 operation="/";

            }
        });


        per=new JButton("%");
        per.setBounds(225,235,70,40);
        per.setFont(new Font("tamoha",Font.BOLD,20));
        f1.add(per);
        per.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(tf.getText());
                tf.setText("");
                operation="%";
            }
        });

        back=new JButton("\uF0e7");
        back.setBounds(85,235,70,40);
        back.setFont(new Font("tamoha",Font.BOLD,20));

        f1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String back=null;
                if(tf.getText().length()>0){
                    StringBuilder sb=new StringBuilder(tf.getText());
                    sb.deleteCharAt(tf.getText().length()-1);
                    back=sb.toString();
                    tf.setText(back);
                }
            }
        });

        dot=new JButton(".");
        dot.setBounds(155,195,70,40);
        f1.add(dot);

        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num=tf.getText()+dot.getText();
                tf.setText(num);
            }
        });


        dzero=new JButton("00");
        dzero.setBounds(15,195,70,40);
        dzero.setFont(new Font("tamoha",Font.BOLD,20));
        f1.add(dzero);
        dzero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num=tf.getText()+dzero.getText();
                tf.setText(num);
            }
        });
        JButton off=new JButton("OFF");
        off.setBounds(95,280,120,40);
        off.setFont(new Font("tamoha",Font.BOLD,25));
        off.setForeground(Color.white);
        off.setBackground(Color.red);
        f1.add(off);
        off.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        f1.getContentPane().setBackground(Color.LIGHT_GRAY);

        f1.setBounds(350,50,310,360);
        f1.setLayout(null);
        f1.setUndecorated(true);
        f1.setVisible(true);

    }
    public static void main(String[] args) {
new cal2();


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
