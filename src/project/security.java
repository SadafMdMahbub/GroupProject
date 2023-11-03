package project;

public class security {

    public security() {
    }

    public boolean check(String user, String pass) {
        if (user.equals("sadaf") && pass.equals("sadaf123")) {
            return true;
        }
        else if (user.equals("tanvir") && pass.equals("tanvir123")) {
            return true;
        }
        else if (user.equals("rifat") && pass.equals("rifat123")) {
            return true;
        }
        else if (user.equals("yeasin") && pass.equals("yeasin123")) {
            return true;
        }
        return false;
    }
}
