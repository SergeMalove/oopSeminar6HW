package Chess;

public class King extends Figure implements Castlingable{
    public static String name = "������";

    public King() {
        super(name);
    }

    @Override
    public String move() {
        return name + " ����� �� 1 ������ � ����� �����������";
    }
}
