package zadania_1703.game;

enum SingleNode {
    X("X"),
    O("O"),
    BLANK("_");

    private String field;

    SingleNode(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public String toString() {
        return getField();
    }
}
