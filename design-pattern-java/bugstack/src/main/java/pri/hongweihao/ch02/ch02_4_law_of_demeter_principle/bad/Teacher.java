package pri.hongweihao.ch02.ch02_4_law_of_demeter_principle.bad;

import java.util.List;

/**
 * <p>
 * 老师类
 * </p>
 *
 * @author Karl
 * @date 2022/4/28 18:18
 */
public class Teacher {
    // 班级
    private final String clazz;
    // 学生列表
    private final List<Student> students;

    public Teacher(String clazz, List<Student> students) {
        this.clazz = clazz;
        this.students = students;
    }

    public String getClazz() {
        return clazz;
    }

    public List<Student> getStudents() {
        return students;
    }
}
