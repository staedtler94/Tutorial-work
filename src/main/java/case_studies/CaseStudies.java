package case_studies;

import case_studies.Services.BinaryChecker;
import case_studies.Services.EmailChecker;
import case_studies.interfaces.Tutorial;
import case_studies.models.EmailCheckerModel;
import case_studies.tutorials.ExploreTutorials;
import case_studies.tutorials.TutorialList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CaseStudies {
    public static void main(String[] args) {

        System.out.println("Welcome to Java Samples and Tutorials");

        Tutorial trainings = new ExploreTutorials().explore(TutorialList.REG_EX);
        trainings.executeCode();

    }
}