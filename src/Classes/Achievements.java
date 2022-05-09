package Classes;
import Observer.*;

import java.util.ArrayList;

public class Achievements implements Observer {

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
                unlock(Achievement.TIMEOVER);
            case PLAYER_WINS:
                unlock(Achievement.PLAYER_WINS_TTT);
            case PLAYER_LOSES:
                unlock(Achievement.PLAYER_LOSES_TTT);
        }
    }

    private void unlock(Achievement ach) {
        if(!achievements.contains(ach)) {
            achievements.add(ach);
            System.out.println("ACHIEVEMENT UNLOCKED: " + ach.getDescription());
        }
    }
}
