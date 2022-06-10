package pri.hongweihao.decorator;

public class EncryptionFileReaderDecorator extends FileReaderDecorator {
    public EncryptionFileReaderDecorator(IReader fileReader) {
        super(fileReader);
    }

    @Override
    public String read() {
        String read = super.read();
        String decode = "decode:" + read;
        System.out.println("把读出来的文件内容解密：" + decode);
        return decode;
    }

    @Override
    public void write(String content) {
        String compress = "encode:" + content;
        System.out.println("把写入内容加密: " + compress);
        super.write(compress);
    }
}
