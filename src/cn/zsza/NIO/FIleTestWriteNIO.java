package cn.zsza.NIO;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by ZhangSong on 2016/7/10.
 */
public class FIleTestWriteNIO {
    @Test
    public void test1() throws IOException {
        File file = new File("file\\data.txt");
        FileOutputStream outputStream = new FileOutputStream(file,true);

        // 拿到一个文件Channel
        FileChannel channel = outputStream.getChannel();
        // 拿到一个Buffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String str = "Hello,Java\r\n";
        buffer.put(str.getBytes());
        buffer.flip();     //此处必须要调用buffer的flip方法
        channel.write(buffer);
        channel.close();
        outputStream.close();
    }
    @Test
    public void test2(){
        IntBuffer buffer = IntBuffer.allocate(8);
        System.out.println(buffer.capacity());

        for (int i = 0; i < buffer.capacity(); i++) {
            int j = 2 * (i + 1);
            buffer.put(j);
        }
        buffer.flip();

        while (buffer.hasRemaining()){
            int j = buffer.get();
            System.out.println(j + "");
        }
    }
}
