package bai5;



public class SuperAdmin implements  AdminActions , UserActions{
    @Override
    public void logActivity(String activity) {
        UserActions.super.logActivity(activity);
        AdminActions.super.logActivity(activity);
    }
}

