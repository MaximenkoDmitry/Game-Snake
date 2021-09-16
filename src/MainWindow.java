import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(334,378);
        add(new GameField());
        setLocation(400,400);
        setVisible(true);
        setResizable(false);
    }
    public static void main(String[] args){
        MainWindow mv = new MainWindow();
    }
}
