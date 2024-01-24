package Chess;

public class FigureManager {
    private Figure figure;

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    String moveFigure() {
        return figure.move();
    }

    String eatenFigure() {
        return figure.eaten();
    }

    String checkAlife() {
        return figure.isAlife ? figure.getName() + " На поле" : figure.getName() + " Съедена";
    }
}
