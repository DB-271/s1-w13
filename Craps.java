public class Craps {
    DiceRoll r;

    public Craps() {
        r = new DiceRoll();
    }

    // Returns 0 if lose, otherwise the amount won.
    public int play() {
        r.roll();
        int roll1 = r.total();
        if (roll1 == 2 || roll1 == 3 || roll1 == 12) {
            return 0;
        } else if (roll1 == 7 || roll1 == 11) {
            return 1;
        } else {
            int point = roll1;
            r.roll();
            roll1 = r.total();
            while (roll1 != point) {
                if (roll1 = 7) {
                    return 0;
                } else if (roll1 == point) {
                    point = roll1;
                    return point;
                }
                return point;
            }
        }
    }

    // simulate play to see your odds of winning
    public void tester(int howMany)
    {
    	int index = 0;
        while 
    }
}
