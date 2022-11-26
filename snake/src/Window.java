import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;


class Window extends JFrame{
    private static final long serialVersionUID = -2542001418764869760L;
    public static ArrayList<ArrayList<DataOfSquare>> Grid;
    public static int width = 20;
    public static int height = 20;
    public Window(){


        // Создает arraylist, который будет содержать потоки
        Grid = new ArrayList<ArrayList<DataOfSquare>>();
        ArrayList<DataOfSquare> data;

        // Создает потоки и их данные и добавляет их в ArrayList
        for(int i=0;i<width;i++){
            data= new ArrayList<DataOfSquare>();
            for(int j=0;j<height;j++){
                DataOfSquare c = new DataOfSquare(2);
                data.add(c);
            }
            Grid.add(data);
        }

        // Настройка макета панели
        getContentPane().setLayout(new GridLayout(20,20,0,0));

        // Запускает и приостанавливает все потоки, затем добавляет каждый квадрат каждого потока на панель
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                getContentPane().add(Grid.get(i).get(j).square);
            }
        }

        // исходное положение змеи
        Tuple position = new Tuple(10,10);
        // передаем значение контроллеру
        ThreadsController c = new ThreadsController(position);
        c.start();

        // Связывает окно с клавиатурой
        this.addKeyListener((KeyListener) new KeyboardListener());
    }
}
