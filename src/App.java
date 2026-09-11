import javax.swing.JFrame;


public class App {
    public static void main(String[] args) throws Exception {
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Pac Man"); // создай окно с названием "Pac Man" и сохрани в переменную

        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);


        PacMan pacmanGame = new PacMan(); //создаёт объект игровой панели, которую ты настроила в классе PacMan.
        frame.add(pacmanGame); //омещает (вкладывает) созданную панель с игрой внутрь главного окна frame.
        frame.pack(); //чтобы всё поместилось идеальное пиксель в пиксель
        frame.setVisible(true);

    }
}
