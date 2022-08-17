package Encapsulation;

public class User {
    // Use Encapsulation to make data private
    //	have a control in the data, how to set the data and how to get the data.
    private int userID;
    private String userName;
    private String firstName;
    private String lastName;

    //constructor
    public User(int userID, String userName, String firstName, String lastName) {
        this.userID = userID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setuserID(int userID) {	// make set to only write

        this.userID = userID;
    }

    public void setuserName(String userName) {

        this.userName = userName;
    }

    public void setfirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setlastName(String lastName) {

        this.lastName = lastName;
    }



    public int getuserID() {	// make get to only read

        return userID;
    }

    public String getuserName() {

        return userName;
    }

    public String getfirstName() {

        return firstName;
    }

    public String getlastName() {

        return lastName;
    }
}
