package Chess;

public class Rook extends Figure implements Castlingable{
    public static String name = "�����";

    public Rook() {
        super(name);
    }

    @Override
    public String move() {
        return name + " ����� �� ��������� � �����������";
    }
}
