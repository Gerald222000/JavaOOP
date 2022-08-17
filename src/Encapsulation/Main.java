package Encapsulation;

public class Main {
    public static void main(String[]args) {
        //object
        User user = new User(1234, "gerald2000", "Gerald", "Layderos");

        //uncomment this to access the data that didn't set by setter
//		int id = user.getuserID();

        String userName = user.getuserName();	//get the data in the object
        String firstName = user.getfirstName();
        String lastName = user.getlastName();

        // set data in the variable. Go to User.java if you don't understand.
        user.setuserID(4754);

        // get data to the variable. Go to User.java if you don't understand.
        int id = user.getuserID();


        System.out.println(id + " " +userName + " " + firstName + " " + lastName);

        //Using the Set method
        user.setuserID(1235);
        user.setuserName("angelica2002");
        user.setfirstName("Angelica");
        user.setlastName("Layderos");

        int id2 = user.getuserID();
        String userName2 = user.getuserName();
        String firstName2 = user.getfirstName();
        String lastName2 = user.getlastName();


        System.out.println(id2 + " " +userName2 + " " + firstName2 + " " + lastName2);

    }
}
