package pri.hongweihao.decorator;

public class CompressionFileReaderDecorator extends FileReaderDecorator {
    public CompressionFileReaderDecorator(IReader fileReader) {
        super(fileReader);
    }

    @Override
    public String read() {
        String read = super.read();
        String decompress = "decompress:" + read;
        System.out.println("把读出来的文件内容解压缩：" + decompress);
        return decompress;
    }

    @Override
    public void write(String content) {
        String compress = "compress:" + content;
        System.out.println("把写入内容压缩:" + compress);
        super.write(compress);
    }
}
