package bai5;

public interface AdminActions {
    default void logActivity(String activity){
        System.out.println("hoat dong Admin : " + activity);
    };
}
