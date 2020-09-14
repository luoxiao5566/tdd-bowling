import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BowlingGameTest {
    @Test
    void should_return_score_when_sum_given_twice_Pitching_less_than_10_pin(){

        BowlingGame bowlingGame = new BowlingGame();

        Integer score = 7;

        Integer result = bowlingGame.sum_twice_Pitching(4,3);
        assertEquals(score,result);
    }
    @Test
    void should_return_score_when_sum_given_strike(){

        BowlingGame bowlingGame = new BowlingGame();

        Integer score = 18;

        Integer result = bowlingGame.sum_strike(10,3,5);
        assertEquals(score,result);
    }
}
