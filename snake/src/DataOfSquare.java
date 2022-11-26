import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {


    //ArrayList который содержит цвета
    ArrayList<Color> C =new ArrayList<Color>();
    int color; //2: snake , 1: food, 0:empty
    SquarePanel square;
    public DataOfSquare(int col){

        //Добавление цвета в arrayList
        C.add(Color.darkGray);//0
        C.add(Color.BLUE);    //1
        C.add(Color.white);   //2
        color=col;
        square = new SquarePanel(C.get(color));
    }
    public void lightMeUp(int c){
        square.ChangeColor(C.get(c));
    }
}
