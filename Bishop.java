package Chess;

public class Bishop extends Figure{
    public static String name = "����";

    public Bishop() {
        super(name);
    }

    @Override
    public String move() {
        return name + " ����� �� �� ���������";
    }
}
