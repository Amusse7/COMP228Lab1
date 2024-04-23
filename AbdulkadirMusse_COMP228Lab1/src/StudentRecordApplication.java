public class StudentRecordApplication {
    public static void main(String[] args) {
        Student student1 = new Student();

        displayStudentDetails(student1);

        student1.setId(1);
        student1.setName("James Worthy");
        student1.setAddress("320 Dixon Road");
        student1.setDateOfBirth("1997-01-04");
        student1.setDepartment("Electrical Engineering Technology");

        // Display updated values
        displayStudentDetails(student1);

        student1.setAllValues(2, "Abdulkadir Musse", "165 Lakeshore Street", "1994-03-11", "Software Engineering Technology");

        displayStudentDetails(student1);
    }

    private static void displayStudentDetails(Student student) {
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Date of Birth: " + student.getDateOfBirth());
        System.out.println("Department: " + student.getDepartment());
        System.out.println();
    }
}