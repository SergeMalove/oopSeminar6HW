package Chess;

public class Main {
    public static void main(String[] args) {
        // Принцип L - функции, которые используют базовый тип, должны иметь возможность использовать
        // подтипы базового типа не зная об этом.
        Figure[] figures = new Figure[6];
        figures[0] = new Pawn();
        figures[1] = new Rook();
        figures[2] = new Knight();
        figures[3] = new Bishop();
        figures[4] = new King();
        figures[5] = new Queen();

        for (Figure f: figures) {
            System.out.println(f.getName());
        }
        System.out.println();

        // Принцип D - Зависимость на Абстракциях. Нет зависимости на что-то конкретное

        FigureManager figureManager = new FigureManager();

        for (Figure f: figures) {
            figureManager.setFigure(f);
            System.out.println(figureManager.checkAlife());
            System.out.println(figureManager.moveFigure());
            System.out.println(figureManager.eatenFigure());
            System.out.println(figureManager.checkAlife());
            System.out.println();
        }

        System.out.println();
        MovableManager movableManager = new MovableManager();

        Movable[] movables = new Movable[6];
        movables[0] = new Pawn();
        movables[1] = new Rook();
        movables[2] = new Knight();
        movables[3] = new Bishop();
        movables[4] = new King();
        movables[5] = new Queen();

        for (Movable m: movables) {
            movableManager.setMovable(m);
            System.out.println(movableManager.moveObject());
        }
    }
}
