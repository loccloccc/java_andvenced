package bai3;

@FunctionalInterface
public interface Authenticatable {
    String getPassword();
    default boolean isAuthenticated(){
        String pass = getPassword();
        return pass != null && !pass.isEmpty();
    };
    static String  encrypt(String rawPassword){
        return "EN" + rawPassword.hashCode();
    }
}
