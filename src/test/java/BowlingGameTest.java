import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BowlingGameTest {
    @Test
    void should_return_score_when_sum_given_twice_Pitching_less_than_10_pin(){

        BowlingGame bowlingGame = new BowlingGame();

        int score = 7;

        int result = bowlingGame.sum_twice_Pitching(4,3);
        assertEquals(score,result);
    }
    @Test
    void should_return_score_when_sum_given_strike(){

        BowlingGame bowlingGame = new BowlingGame();

        int score = 18;

        int result = bowlingGame.sum_strike(10,3,5);
        assertEquals(score,result);
    }

    @Test
    void should_return_score_when_sum_given_spare(){

        BowlingGame bowlingGame = new BowlingGame();

        int score = 20;

        int result = bowlingGame.sum_spare(6,4,10);
        assertEquals(score,result);
    }

    @Test
    void should_return_score_when_sum_total_score_given_bowling_game_over_of_all_twice_Pitching_less_than_10_pin(){

        BowlingGame bowlingGame = new BowlingGame();

        int score = 78;

        int [] competition_record = {4,5,3,4,2,4,6,3,1,5,5,2,5,3,9,0,8,1,4,4};

        int result = bowlingGame.sum_total_score(competition_record);
        assertEquals(score,result);
    }
    @Test
    void should_return_score_when_sum_total_score_given_bowling_game_over_of_all_strike(){

        BowlingGame bowlingGame = new BowlingGame();

        int score = 300;

        int [] competition_record = {10,10,10,10,10,10,10,10,10,10,10,10};

        int result = bowlingGame.sum_total_score(competition_record);
        assertEquals(score,result);
    }

    @Test
    void should_return_score_when_sum_total_score_given_bowling_game_over_of_all_spare(){

        BowlingGame bowlingGame = new BowlingGame();

        int score = 155;

        int [] competition_record = {5,5,6,4,3,7,8,2,1,9,2,8,7,3,4,6,9,1,5,5,10};

        int result = bowlingGame.sum_total_score(competition_record);
        assertEquals(score,result);
    }

    @Test
    void should_return_score_when_sum_total_score_given_bowling_game_over_of_complex_situation(){

        BowlingGame bowlingGame = new BowlingGame();

        int score1 = 136;
        int score2 = 163;
        int score3 = 146;

        int [] competition_record1 = {5,5,3,4,10,7,3,6,3,4,4,7,3,10,8,2,5,3};
        int [] competition_record2 = {5,5,3,4,10,7,3,6,3,4,4,7,3,10,8,2,10,10,10};
        int [] competition_record3 = {5,5,3,4,10,7,3,6,3,4,4,7,3,10,8,2,6,4,7};

        int result1 = bowlingGame.sum_total_score(competition_record1);
        int result2 = bowlingGame.sum_total_score(competition_record2);
        int result3 = bowlingGame.sum_total_score(competition_record3);
        assertEquals(score1,result1);
        assertEquals(score2,result2);
        assertEquals(score3,result3);
    }
}
