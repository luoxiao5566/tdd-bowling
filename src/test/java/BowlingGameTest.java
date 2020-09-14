import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BowlingGameTest {
    @Test
    void should_return_score_when_Summation_given_twice_Pitching_less_than_10_pin(){

        BowlingGame bowlingGame = new BowlingGame();

        Integer score = 7;

        Integer result = bowlingGame.twice_Pitching_less_than_10_pin(4,3);
        assertEquals(score,result);
    }
}
