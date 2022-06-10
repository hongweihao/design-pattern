package pri.hongweihao.decorator;

import org.junit.Test;

public class DecoratorTest {
    @Test
    public void test() {
        IReader fileReader = new FileReader("/root/test.txt");
        IReader encryptionFileReader = new EncryptionFileReaderDecorator(fileReader);
        IReader compressionFileReader = new CompressionFileReaderDecorator(encryptionFileReader);

        compressionFileReader.write("file content");
        System.out.println("--------------------------");
        compressionFileReader.read();

    }
}
