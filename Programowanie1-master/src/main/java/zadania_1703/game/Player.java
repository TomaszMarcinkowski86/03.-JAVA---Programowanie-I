package zadania_1703.game;

import java.util.Objects;

public class Player {
    private boolean isPlayerOne;

    private SingleNode sign;

    public Player(boolean isPlayerOne, SingleNode sign) {
        this.isPlayerOne = isPlayerOne;
        this.sign = sign;
    }

    public boolean isPlayerOne() {
        return isPlayerOne;
    }

    public SingleNode getSign() {
        return sign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return isPlayerOne == player.isPlayerOne &&
                sign == player.sign;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPlayerOne, sign);
    }
}
