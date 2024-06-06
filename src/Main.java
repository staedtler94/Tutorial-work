import Services.BinaryChecker;
import Services.EmailChecker;
import interfaces.Tutorial;
import models.EmailCheckerModel;
import tutorials.ExploreTutorials;
import tutorials.TutorialList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Java Samples and Tutorials");

        Tutorial trainings = new ExploreTutorials().explore(TutorialList.REG_EX);
        trainings.executeCode();

    }
}