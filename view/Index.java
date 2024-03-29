package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends JFrame{
    // 상속 extends JFrame

    // 화면 만들기

    Index(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("홈페이지");
        this.setLayout(new GridLayout(3,3,10,10));

        // 버튼만들기 시작
        JButton joinBtn = new JButton("회원가입");
        joinBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(joinBtn);
        // 버튼 만들기 끝

        JButton accountBtn = new JButton("통장생성");
        accountBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(accountBtn);

        JButton list = new JButton("목록보기");
        list.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(list);

        setSize(600, 600);
        setLocation(100, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Index();

    }
}
