class Student{
    //instance variables belongs to method not in class
    int roll_no;
    String names;
    int marks;
}

public class ArrayOfObjects {

public static void main(String[] args) {
    
    Student s1 = new Student();
    s1.roll_no = 1;
    s1.names = "Aiswariya";
    s1.marks = 56 ;

    Student s2 = new Student();
    s2.roll_no = 2;
    s2.names = "esha";
    s2.marks = 46 ;

    Student s3 = new Student();
    s3.roll_no = 3;
    s3.names = "riya";
    s3.marks = 26 ;

    Student students[] = new Student[3];
    students[0] = s1 ;
    students[1] = s2 ;
    students[2] = s3 ;


    // for(int i = 0 ; i < students.length; i++){
    //     System.out.println(students[i].names + " : " + students[i].marks);
    // }
//enhanced for loop

for(Student stud : students){
    System.out.println(stud.names + " : "+ stud.marks );
}
}
    
}
