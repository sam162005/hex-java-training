import java.util.*;
public class Login{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Sample Login Service");
       System.out.println("Enter username:");
       String username=sc.next();
       System.out.println("Enter password:");
       String password=sc.next();
       LoginService loginservice=new LoginService();
       boolean isvalid=loginservice.validate(username,password);
       if(isvalid){
           System.out.println("Login Successful !"); 
         }else{
           System.out.println("Login Failed....Invalid credentials !");
         }
         sc.close();
    }
}