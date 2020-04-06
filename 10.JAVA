Import java.awt.*;
import java.awt.event.*;

class waisq  ActionListener{
    Frame frame=new Frame();
        Label l1=new Label("Square is");
    Label l2=new Label("Factorial is");
    TextField t1=new TextField("Enter Number");
        TextField t2=new TextField();
    TextField t3=new TextField();

    Button b1=new Button("Square");
       Button b2=new Button("Factorial");
    Button b3=new Button("Clear");

    BCAATWO18BCA1013()
    {
        t1.setBounds(50,50,100,20)
   b1.setBounds(50,70,100,20);
        b2.setBounds(50,90,100,20);
        b3.setBounds(50,110,100,20);
   l1.setBounds(75,150,100,20);
        t2.setBounds(50,170,100,20);
        l2.setBounds(75,200,100,20);
    t3.setBounds(50,220,100,20);

        frame.add(t1);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.add(l1);
        frame.add(t2);

        frame.add(l2);
        frame.add(t3);



        b1.addActionListener(this);

        b2.addActionListener(this);
        b3.addActionListener(this);

        frame.setLayout(null);

        frame.setTitle("Square and Factorial Calculator");

        frame.setVisible(true);
           frame.setSize(250,400);
    }

    public void actionPerformed(ActionEvent e)
    {
        int n1=Integer.parseInt(t1.getText());
        if(e.getSource()==b1)
        {
            int sq;
            sq=n1*n1;
            t2.setText(String.valueOf(sq));
        }
        if(e.getSource()==b2)
        {
            long factorial = 1;
            for(int i = 1; i <= n1; ++i)
            {
                factorial *= i;
            }
            t3.setText(String.valueOf(factorial));
        } else if( e.getSource() ==b3){
            t1.setText("");
    }

    }

    public static void main(String[] args)
    {
        new wasiq();
    }
}