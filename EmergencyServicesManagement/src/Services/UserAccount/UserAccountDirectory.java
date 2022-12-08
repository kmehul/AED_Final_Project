/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author Anirudh
 */
public class UserAccountDirectory {
        
    private ArrayList<UserAccount> userAccountList;
    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList) {
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        }      
        return null;
    }
//    
//    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
//        UserAccount userAccount = new UserAccount();
//        userAccount.setUserName(username);
//        userAccount.setPassword(password);
////        userAccount.setEmployee(employee);
////        userAccount.setRole(role);
//        userAccountList.add(userAccount);
//        return userAccount;
//    }
//    
     public UserAccount createUserAccount(String username, String password, String role, String firstname, String lastname){
        UserAccount userAccount = new UserAccount();
        userAccount.setFirstName(firstname);
        userAccount.setLastName(lastname);
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;  
     }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUserName().equals(username))
                return false;
        }
        return true;
    }

}
