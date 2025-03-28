import java.io.*;
import java.util.*;

class Task implements Serializable {
    private String description;
    private boolean isCompleted;
    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[X]" : "[ ]") + " " + description;
    }
}
