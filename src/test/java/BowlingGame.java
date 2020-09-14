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
}

