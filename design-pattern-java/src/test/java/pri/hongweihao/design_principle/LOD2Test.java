package pri.hongweihao.design_principle;

import org.junit.Test;
import pri.hongweihao.desigin_principle.law_of_demeter_principle.Principal;
import pri.hongweihao.desigin_principle.law_of_demeter_principle.Student;
import pri.hongweihao.desigin_principle.law_of_demeter_principle.Teacher;

import java.util.Arrays;

/**
 * <p>
 * 迪米特法则原则正确示例测试类
 * </p>
 *
 * @author Karl
 * @date 2022/4/28 18:36
 */
public class LOD2Test {
    @Test
    public void test() {
        Student student1 = new Student(40);
        Student student2 = new Student(50);
        Student student3 = new Student(60);

        Student student4 = new Student(70);
        Student student5 = new Student(80);
        Student student6 = new Student(90);

        Teacher teacher1 = new Teacher("1", Arrays.asList(student1, student2, student3));
        Teacher teacher2 = new Teacher("2", Arrays.asList(student4, student5, student6));

        Principal principal = new Principal(Arrays.asList(teacher1, teacher2));
        System.out.println(principal.clazzAverage("1"));
        System.out.println(principal.clazzAverage("2"));
        System.out.println(principal.clazzAverage("3"));
    }
}
