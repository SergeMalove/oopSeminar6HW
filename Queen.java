package Chess;

public class Queen extends Figure{
    public static String name = "��������";

    public Queen() {
        super(name);
    }

    @Override
    public String move() {
        return name + " ����� � ����� �����������";
    }
}
