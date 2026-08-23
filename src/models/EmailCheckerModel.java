package models;

public class EmailCheckerModel {
    private String userName;
    private String domain;

    public EmailCheckerModel(String userName, String domain) {
        this.setUserName(userName);
        this.setDomain(domain);
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
