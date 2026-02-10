package ex05;

import ex05.teacher.HtmlTeacher;
import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;
import ex05.teacher.Teacher;

public class App {
    public static void main(String[] args) {

        Teacher tt = new HtmlTeacher(); // 동적 바인딩
        //Teacher tt2 = new PythonTeacher(); // 동적 바인딩
        //Teacher tt3 = new JavaTeacher(); // 동적 바인딩

        tt.수업하기();

    }
}
