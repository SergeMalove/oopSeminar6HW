package Chess;

public class Knight extends Figure{
    public static String name = "Конь";

    public Knight() {
        super(name);
    }

    @Override
    public String move() {
        return name + " ходит буквой Г на 4 клетки";
    }
}
