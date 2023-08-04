package Students;

public class Manage {
    private static final int MAX_STUDENTS = 100;
    private Students[] students;
    private int currentSize;

    public Manage() {
        students=new Students[MAX_STUDENTS];
        currentSize=0;
    }
    public void addStudent(Students student) {
        if (currentSize < MAX_STUDENTS) {
            students[currentSize] = student;
            currentSize++;
        } else {
            System.out.println("Cannot add more students. The database is full.");
        }
    }

    public void updatePoint(int studentId, double newPoint) {
        for (int i = 0; i < currentSize; i++) {
            if (students[i].getId() == studentId) {
                students[i].setPoint(newPoint);
                break;
            }
        }
    }

    public void removeStudent(int studentId) {
        int foundIndex = -1;
        for (int i = 0; i < currentSize; i++) {
            if (students[i].getId() == studentId) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            // Shift elements to remove the student
            for (int i = foundIndex; i < currentSize - 1; i++) {
                students[i] = students[i + 1];
            }

            currentSize--;
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    public void viewAllStudents() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(students[i]);
        }
    }

    public void viewStudentsByClass(String classroom) {
        for (int i = 0; i < currentSize; i++) {
            if (students[i].getClassroom().equalsIgnoreCase(classroom)) {
                System.out.println(students[i]);
            }
        }
    }

    public void sortByName() {
        for (int i = 0; i < currentSize - 1; i++) {
            for (int j = i + 1; j < currentSize; j++) {
                if (students[i].getName().compareToIgnoreCase(students[j].getName()) > 0) {
                    Students temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public void sortByAge() {
        for (int i = 0; i < currentSize - 1; i++) {
            for (int j = i + 1; j < currentSize; j++) {
                if (students[i].getAge() > students[j].getAge()) {
                    Students temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public void sortByPoint() {
        for (int i = 0; i < currentSize - 1; i++) {
            for (int j = i + 1; j < currentSize; j++) {
                if (students[i].getPoint() < students[j].getPoint()) {
                    Students temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

}
