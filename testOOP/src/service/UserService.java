package service;

import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {
    public List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }
    public void save(User user){
        users.add(user);
    }
    public User findUserByUsername(String username){
        for(User user:users){
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }
    public User findUserByEmail(String email){
        for (User user:users){
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }
    public boolean isValidEmail(String email){
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public  boolean emailExists(String email) {
        for (User user : users) {
            if(user.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }
    public boolean isValidPassword(String password){
        if (password == null || password.length() < 7 || password.length() > 15) {
            return false; // Kiểm tra độ dài
        }

        boolean hasUppercase = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (".,-_;".indexOf(c) != -1) {
                hasSpecialChar = true;
            }
        }

        return hasUppercase && hasSpecialChar;
    }

}
