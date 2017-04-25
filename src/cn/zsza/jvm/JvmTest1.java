package cn.zsza.jvm;

/**
 * Created by zs on 2017/3/17.
 * 10:43
 */
public class JvmTest1 {

    public static void main(String[] args) {

        for (int k = 0; k < 20;k++){
            for (int i = 0; i < 300 ; i++) {
                byte b[] = new byte[1024 * 1024];
            }
        }
    }
}
