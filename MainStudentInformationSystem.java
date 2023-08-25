public class MainStudentInformationSystem {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Teacher t1 = new Teacher("Mahmut Hoca", "MAT", "0551");
        Teacher t2 = new Teacher("Fatma Hoca", "KMY", "0552");
        Teacher t3 = new Teacher("Ali Hoca", "FZK", "0553");

        mat.addTeacher(t1);
        kimya.addTeacher(t2);
        fizik.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "1234", 4, mat, fizik, kimya);
        s1.addBulkExamNote(50, 20, 40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "5678", 4, mat, fizik, kimya);
        s2.addBulkExamNote(50, 20, 40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "9012", 4, mat, fizik, kimya);
        s3.addBulkExamNote(50, 20, 40);
        s3.isPass();


    }
}
