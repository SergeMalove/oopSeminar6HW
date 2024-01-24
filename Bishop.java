package Chess;

public class Bishop extends Figure{
    public static String name = "Слон";

    public Bishop() {
        super(name);
    }

    @Override
    public String move() {
        return name + " ходит на по диаганали";
    }
}
