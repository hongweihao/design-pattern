package pri.hongweihao.decorator;

public class FileReader implements IReader {
    private final String filepath;

    public FileReader(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public String read() {
        String content = "file content";
        System.out.println("从" + filepath + "中读出内容: " + content);
        return content;
    }

    @Override
    public void write(String content) {
        System.out.println("写入到" + filepath + ": " + content);
    }
}
