package bai5;

public interface UserActions {
    default void logActivity(String activity){
        System.out.println("hoat dong User: " + activity);
    };
}
