package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.job4j.chess.firuges.Cell.*;;

public class BishopBlackTest {

    @Test
    public void position() {
        Figure bishopBlack = new BishopBlack(Cell.A5);
        assertThat(bishopBlack.position(), is(Cell.A5));
    }

    @Test
    public void copy() {
        Figure bishopBlack = new BishopBlack(Cell.A5);
        bishopBlack = bishopBlack.copy(Cell.A5);
        assertThat(bishopBlack.position(), is(Cell.A5));
    }

    @Test
    public void way() throws ImpossibleMoveException {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = bishopBlack.way(Cell.G5);
        Cell[] cells = new Cell[] {D2, E3, F4, G5};
        assertThat(way, is(cells));
    }
}