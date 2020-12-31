package officeHoursWithSaim;
/*
* Social Media
(*) Create an abstract class for Social Media that has the following features:
    - Direct messaging(String username, String message)
    - Post(String body)
    - Notifications(int time)
(*) The Social Media will also have the following fields:

    - Personal URl (String)
    - Account length (int)
    - Platform (static String)
*/
public abstract class SocialMedia {
    protected String url;
    protected int accountLength;
    protected static String platform;

    public abstract void directMessage(String username, String message);
    public abstract void post(String body);
    public abstract void notification(int time);






}
