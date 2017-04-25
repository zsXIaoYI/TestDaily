package cn.zsza.NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by ZhangSong on 2016/7/10.
 */
public class TestNIO {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file\\aa.txt");
        FileChannel fc = fis.getChannel();
        ByteBuffer by = ByteBuffer.allocate(1024);
        int i = fc.read(by);
        System.out.println(i);


    }
}
