package pri.hongweihao.ch02.ch02_4_law_of_demeter_principle;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

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

    // 查询班级的平均分
    public Double clazzAverage() {
        // 查到对应的学生列表，所有学生总分求平均分
        OptionalDouble optional = students.stream().mapToDouble(Student::getScore).average();
        if (!optional.isPresent()) {
            return null;
        }
        return optional.getAsDouble();
    }

    public String getClazz() {
        return clazz;
    }
}
