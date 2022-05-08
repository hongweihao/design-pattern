package pri.hongweihao.desigin_principle.law_of_demeter_principle.bad;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

/**
 * <p>
 * 校长类
 * </p>
 *
 * @author Karl
 * @date 2022/4/28 18:20
 */
public class Principal {
    private final List<Teacher> teachers;

    public Principal(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    // 查询班级的平均分
    public Double clazzAverage(String clazz) {
        // 查到对应的班级
        Optional<Teacher> first = teachers.stream().filter(teacher -> teacher.getClazz().equals(clazz)).findFirst();
        if (!first.isPresent()) {
            return null;
        }

        // 查到对应的学生列表，所有学生总分求平均分
        OptionalDouble optional = first.get().getStudents().stream().mapToDouble(Student::getScore).average();
        if (!optional.isPresent()) {
            return null;
        }

        return optional.getAsDouble();
    }
}
