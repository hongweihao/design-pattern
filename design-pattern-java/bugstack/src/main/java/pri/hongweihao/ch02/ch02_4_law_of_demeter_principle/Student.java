package pri.hongweihao.ch02.ch02_4_law_of_demeter_principle;

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
