package tutorials;

import interfaces.Tutorial;

public class ExploreTutorials {

    public Tutorial explore(TutorialList explore){
        switch (explore){
            case REG_EX -> {
                return new RegEx();
            }
            case INHERITANCE -> {
                return null;
            }
        }

        return null;
    }
}
