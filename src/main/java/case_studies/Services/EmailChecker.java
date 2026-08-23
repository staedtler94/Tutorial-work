package case_studies.Services;

import case_studies.models.EmailCheckerModel;

public class EmailChecker {
    public EmailCheckerModel getEmailAttributes(String emailId) {

        String[] emailAtt = emailId.split("@");
        return new EmailCheckerModel(emailAtt[0], emailAtt[1]);
    }
}
