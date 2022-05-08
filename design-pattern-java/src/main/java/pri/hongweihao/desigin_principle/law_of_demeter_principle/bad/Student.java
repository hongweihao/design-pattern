package pri.hongweihao.desigin_principle.law_of_demeter_principle.bad;

/**
 * <p>
 * 学生类
 * </p>
 *
 * @author Karl
 * @date 2022/4/28 18:18
 */
public class Student {
    // 学生的总分
    private final double score;

    public Student(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }
}
