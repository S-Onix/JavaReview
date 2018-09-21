package thisIsJAVA.Practice.chapter13.coursegeneric;

import java.util.Arrays;

public class WildCardExample {

    //모든 제너릭타입을 받아올수 있음
    public static void registerCourse (Course <?> course){
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
    }

    //Student 클래스와 Student 클래스를 상속하는 클래스의 타입을 받아올 수 있음
    public static void registerCouresStudent(Course<? extends Student> course){
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
    }

    //Worker 클래스와 상위의 클래스들의 타입을 받아올 수 있음
    public static void registerCourseWorker(Course <? super Worker> course){
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        Course <Person> personCourse = new Course<Person>("일반인과정",5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("중학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course <Worker> workerCourse = new Course<Worker>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<Student>("학생과정", 5);
        studentCourse.add(new Student("중학생"));

        Course<HighStudent> highStudentCourse= new Course<HighStudent>("고등학생과정" , 5);
        highStudentCourse.add(new HighStudent("고등학생"));

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        System.out.println();

        registerCouresStudent(studentCourse);
        registerCouresStudent(highStudentCourse);
        System.out.println();

        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
        System.out.println();




    }
}
