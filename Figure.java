package Chess;

public abstract class Figure implements Movable, Eatable{
    private String name;
    boolean isAlife = true;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String eaten(){
        isAlife = false;
        return "Фигура " + name + " была съедена";
    }
}
