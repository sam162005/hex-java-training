import java.util.*;
public class LoginService{
    Map<String,String> users=new HashMap<>();
    public LoginService(){
        users.put("user1","pass1");
        users.put("user2","pass2");
        users.put("user3","pass3");
    }
    public boolean validate(String username,String password){
        if(users.containsKey(username)){
            String originalpwd=users.get(username);
            if(originalpwd.equals(password)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}