package Chess;

public class Pawn extends Figure{
    public static String name = "�����";

    public Pawn() {
        super(name);
    }

    @Override
    public String move() {
        return name + " ����� �� 1 ������ ������ ������";
    }
}
