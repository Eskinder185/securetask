// Main entry point to run the Task Management System
import service.AuthService;
import controller.TaskController;
import model.Task;

public class Main {
    public static void main(String[] args) {
        // Log in as admin (hardcoded for demo purposes)
        String token = AuthService.login("admin", "admin123");

        if (token != null) {
            // Perform task operations using the token
            TaskController.handleRequest(token, "create", new Task("1", "Secure project"));
            TaskController.handleRequest(token, "read", null);
            TaskController.handleRequest(token, "update", new Task("1", "Updated description"));
            TaskController.handleRequest(token, "delete", new Task("1", ""));
        } else {
            System.out.println("Login failed");
        }
    }
}
