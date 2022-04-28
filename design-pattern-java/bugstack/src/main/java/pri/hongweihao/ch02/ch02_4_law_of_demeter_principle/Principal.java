package pri.hongweihao.ch02.ch02_4_law_of_demeter_principle;

import java.util.List;
import java.util.Optional;

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
        return first.map(Teacher::clazzAverage).orElse(null);
    }
}
