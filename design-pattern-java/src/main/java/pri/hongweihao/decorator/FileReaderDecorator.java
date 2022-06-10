package pri.hongweihao.decorator;

public class FileReaderDecorator implements IReader {
    private final IReader fileReader;

    public FileReaderDecorator(IReader fileReader) {
        this.fileReader = fileReader;
    }

    @Override
    public String read() {
        return fileReader.read();
    }

    @Override
    public void write(String content) {
        fileReader.write(content);
    }
}
