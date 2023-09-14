import java.utils.list

public class UserManagement {

    public User createUser(final User user){
        if (user == null || this.isUserValid(user)) {
            //Return validation error.
        } else {
            //save User
        }
    }

    private boolean isUserValid(final User user) {
         user.getname() != null 
            && !user.getname().isEmoty();
    }
    public user updateUser(final User user) {
        return null;
    }

    public List<User> listUser(){
        return null;
    }

    publicvoid removeUser(final int id) {
        
    }
}