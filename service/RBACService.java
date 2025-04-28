package service;

// Role-Based Access Control (RBAC) logic
public class RBACService {
    // Only ADMINs can do everything; USERs can only read
    public static boolean isAuthorized(String role, String action) {
        if (role.equals("ADMIN")) return true;
        return action.equals("read");
    }
}
