
# SecureTaskManager

## Overview
SecureTaskManager is a Java-based task management system demonstrating strong software design, efficient algorithms, and database concepts. 
This project features modular architecture, role-based access control, authentication, and efficient task storage using an AVL Tree.

## Key Features
- **Software Design & Engineering**: MVC structure with modular services for handling tasks, authentication, and role-based access control.
- **Algorithms and Data Structures**: Implements an AVL Tree for self-balancing binary search, ensuring O(log n) operations for task insert, search, and deletion.
- **Database Simulation**: Simulates efficient data management through the AVL Tree structure instead of a traditional database.

## Project Structure
- `controller/TaskController.java`: Handles user requests.
- `model/Task.java`, `User.java`, `AVLTree.java`: Define data models and storage structures.
- `service/AuthService.java`, `TaskService.java`, `RBACService.java`: Implement business logic for authentication, task management, and role enforcement.
- `utils/JWTUtil.java`: Provides JWT token utilities for authentication.

## How to Run
- Compile all `.java` files.
- Run `Main.java` to start the application.

## Enhancement Focus
- Upgraded from basic list storage to AVL Tree structure to enhance search, insert, and delete operations from O(n) to O(log n).
- Strengthened security by adding authentication and role-based access control.

---
*Prepared for CS499 Capstone Final Submission.*
