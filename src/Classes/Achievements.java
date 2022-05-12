package Classes;
import Observer.*;

import java.util.ArrayList;


public class Achievements implements Observer {

    static boolean [] achCheck = new boolean[3];

    public enum Achievement {
        PLAYER_WINS_TTT("Player Wins in Tic-Tac-Toe"), PLAYER_LOSES_TTT("Player Lost in Tic-Tac-Toe"), TIMEOVER("Played for 10 seconds");

        private final String description;
        private Achievement(final String desc) {
            this.description = desc;
        }

        public String getDescription() {
            return this.description;
        }
    }

    private final ArrayList<Achievement> achievements = new ArrayList<>();



    @Override
    public void OnNotify(Event ev) {
        switch (ev) {
            case TIME_10:
                if(achCheck[0] != true) {
                    unlock(Achievement.TIMEOVER);
                    achCheck[0] = true;
                }
                break;
            case PLAYER_WINS:
                if(achCheck[1] != true) {
                    unlock(Achievement.PLAYER_WINS_TTT);
                    achCheck[1] = true;
                }
                    break;
            case PLAYER_LOSES:
                if(achCheck[1] != true) {
                    unlock(Achievement.PLAYER_LOSES_TTT);
                    achCheck[2] = true;
                }
                break;
        }
    }

    private void unlock(Achievement ach) {
        if(!achievements.contains(ach)) {
            achievements.add(ach);
            System.out.println("ACHIEVEMENT UNLOCKED: " + ach.getDescription());
        }
    }
}
