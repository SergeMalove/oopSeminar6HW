package Chess;

public class Knight extends Figure{
    public static String name = "����";

    public Knight() {
        super(name);
    }

    @Override
    public String move() {
        return name + " ����� ������ � �� 4 ������";
    }
}
