package zadania_1703.game;

interface OutputManager {

    void printGameField(SingleNode[][] field);

    void printWelcome();

    void printSelectSign();

    void printSelectFieldPoint(Player currentPlayer);

    void printSelectFieldPoint();

    void fieldAlreadyTaken();

    void printVictory(Player currentPlayer);

    void printWrongInput();
}
