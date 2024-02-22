public class Student {
    private int id, age, yearLevel;
    private String firstName, lastName;
    private static int studentCount;
    public Student(String a, String b, int c, int d){
        this.firstName = a;
        this.lastName = b;
        this.age = c;
        this.yearLevel = d;
        this.id = studentCount++;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }
    public int getStudentCount(){
        return studentCount;
    }
    public boolean equals(Student student) {
        return (id == student.id && age == student.age && yearLevel == student.yearLevel && firstName.equals(student.firstName) && lastName.equals(student.lastName));
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "', age=" + age + ", yearLevel=" + yearLevel + "}";
    }



}
