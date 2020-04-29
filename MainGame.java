import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainGame extends JFrame {
    JButton new1,new2,new3,eat1,eat2,eat3,run1,run2,run3,attack1,attack2,attack3;
    JPanel JpTop,Jp1,JpIM,Jp2,Jp3;
    JLabel image;
    Icon start,Treecko1,TreeckoEat,TreeckoRun,TreeckoATK,Torchic1,TorchicEat,TorchicRun,TorchicATK,Mudkip1,MudkipEat,MudkipRun,MudkipATK;
    JTextArea area;
    int member;
    
     public static String printPokemons(ArrayList<Pokemon> pokemons, int member){
        return "Pokemon Status \n"+"Pokemon: "+
                pokemons.get(member).getName()+"\n"+"HP : "+pokemons.get(member).getHealth()
                +"/"+pokemons.get(member).maxHealth+"\n"+"Weight : "+
                pokemons.get(member).getWeight();
    }
     
    public MainGame(){
         super("PokemonsGame");
         
         ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        new1 = new JButton("Treecko");
        new2 = new JButton("Torchic");
        new3 = new JButton("Mudkip");
        eat1 = new JButton("Food");
        eat2 = new JButton("Food");
        eat3 = new JButton("Food");
        run1 = new JButton("Exercise");
        run2 = new JButton("Exercise");
        run3 = new JButton("Exercise");
        attack1 = new JButton("Attack");
        attack2 = new JButton("Attack");
        attack3 = new JButton("Attack");
        area = new JTextArea("");
        start = new ImageIcon(getClass().getResource("Start.gif"));
        Treecko1 =  new ImageIcon(getClass().getResource("252.png"));
        Torchic1 = new ImageIcon(getClass().getResource("255.png"));
        Mudkip1 =  new ImageIcon(getClass().getResource("258.png"));
        TreeckoEat =  new ImageIcon(getClass().getResource("eat1.gif"));
        TorchicEat =  new ImageIcon(getClass().getResource("eat2.gif"));
        MudkipEat =  new ImageIcon(getClass().getResource("eat3.gif"));
        TreeckoRun =  new ImageIcon(getClass().getResource("run1.gif"));
        TorchicRun =  new ImageIcon(getClass().getResource("run2.gif"));
        MudkipRun =  new ImageIcon(getClass().getResource("run3.gif"));
        TreeckoATK =  new ImageIcon(getClass().getResource("attack.gif"));
        TorchicATK =  new ImageIcon(getClass().getResource("attack2.gif"));
        MudkipATK =  new ImageIcon(getClass().getResource("attack3.gif"));
        image = new JLabel("");
        image.setIcon(start);
        JpTop = new JPanel();
        JpTop.setLayout(new FlowLayout());
        Jp1 = new JPanel();
        Jp1.setLayout(new FlowLayout());
        JpIM = new JPanel();
        JpIM.setLayout(new FlowLayout());
        Jp2 = new JPanel();
        Jp2.setLayout(new FlowLayout());
        Jp3 = new JPanel();
        Jp3.setLayout(new FlowLayout());
        pokemons.add(new Treecko());
        pokemons.add(new Torchic());
        pokemons.add(new Mudkip());
        //event
       eat1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Berry berry = new Berry(0);
			pokemons.get(0).eat(berry);
               area.setText(printPokemons(pokemons,0));
                    image.setIcon(TreeckoEat);
               }
            
        });
        eat2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Berry berry = new Berry(0);
			pokemons.get(1).eat(berry);
               area.setText(printPokemons(pokemons,1));
              image.setIcon(TorchicEat);
               
               }
            
        });
        eat3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Berry berry = new Berry(0);
			pokemons.get(2).eat(berry);
               area.setText(printPokemons(pokemons,2));
               image.setIcon(MudkipEat);
               
               }
            
        });
        run1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
			pokemons.get(0).move();
               area.setText(printPokemons(pokemons,0));
              image.setIcon(TreeckoRun);
               }
            
        });
        run2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
			pokemons.get(1).move();
               area.setText(printPokemons(pokemons,1));
              image.setIcon(TorchicRun);
               }
            
        });
        run3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
			pokemons.get(2).move();
               area.setText(printPokemons(pokemons,2));
              image.setIcon(MudkipRun);
               }
            
        });
        new1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              image.setIcon(Treecko1);  
              area.setText(printPokemons(pokemons,0));
                c.remove(Jp2);
                c.remove(Jp3);
                c.add(Jp1, BorderLayout.PAGE_END);
            }
        });
        new2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              image.setIcon(Torchic1);  
              area.setText(printPokemons(pokemons,1));
                c.remove(Jp1);
                c.remove(Jp3);
                c.add(Jp2, BorderLayout.PAGE_END);
            }
        });
        new3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              image.setIcon(Mudkip1);  
              area.setText(printPokemons(pokemons,2));
                c.remove(Jp1);
                c.remove(Jp2);                
                c.add(Jp3, BorderLayout.PAGE_END);
            }
        });
        attack1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
			pokemons.get(0).reducedHealth(5);
               area.setText(printPokemons(pokemons,0));
              image.setIcon(TreeckoATK);
               }
            
        });
        attack2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
			pokemons.get(1).reducedHealth(5);
               area.setText(printPokemons(pokemons,1));
              image.setIcon(TorchicATK);
               }
            
        });
        
        attack3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
		pokemons.get(2).reducedHealth(5);
               area.setText(printPokemons(pokemons,2));
              image.setIcon(MudkipATK);
               }
            
        });
        JpTop.add(new1);
        Jp1.add(eat1);
        Jp1.add(run1);
        Jp1.add(attack1);
        JpTop.add(new2);
        Jp2.add(eat2);
        Jp2.add(run2);
        Jp2.add(attack2);
        JpTop.add(new3);
        Jp3.add(eat3);
        Jp3.add(run3);
        Jp3.add(attack3);
        JpIM.add(image);
        JpTop.add(area);
        c.add(JpTop, BorderLayout.PAGE_START);
        c.add(JpIM, BorderLayout.CENTER);
        //set others
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(500,550);
        setResizable(false);
        setVisible(true);   
    }

    
    
}
