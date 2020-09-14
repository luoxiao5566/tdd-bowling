public class BowlingGame {
    public Integer sum_twice_Pitching(int first_pin, int second_pin) {
        return first_pin + second_pin;
    }


    public Integer sum_strike(int strike, int next_first_pin, int next_second_pin) {
        return strike+next_first_pin+next_second_pin;
    }

    public Integer sum_spare(int first_pin, int second_pin, int next_pin) {
        return first_pin+second_pin+next_pin;
    }


    public int sum_total_score(int[] competition_record) {
        int number_of_rounds = 0;
        int rounds_sign = 0;
        int score = 0;
        while (number_of_rounds<10){
            if (competition_record[rounds_sign]+competition_record[rounds_sign+1]<10){
                score += sum_twice_Pitching(competition_record[rounds_sign],competition_record[rounds_sign+1]);
                number_of_rounds++;
                rounds_sign += 2;
                continue;
            }
            if (competition_record[rounds_sign] == 10){
                score += sum_strike(competition_record[rounds_sign],competition_record[rounds_sign+1],competition_record[rounds_sign+2]);
                number_of_rounds++;
                rounds_sign += 1;
                continue;
            }


        }
        return score;
    }
}

