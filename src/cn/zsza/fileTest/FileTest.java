package cn.zsza.fileTest;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by zs on 2017/3/20.
 * 11:57
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file\\aa.txt");


        FileDescriptor fd = fis.getFD();
        System.out.println(fd.toString());

    }
}
