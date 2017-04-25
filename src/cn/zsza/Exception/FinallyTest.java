package cn.zsza.Exception;

/**
 * Created by ZhangSong on 2016/8/8.
 */
class AA{
    int i = 1;
    public int get(){
        try {
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }finally {   // finally在return之后执行
            i++;
            System.out.println("final i=" +i);   // 返回i=2
        }
        return 0;
    }
}
public class FinallyTest {
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println("..." + aa.get());   //
    }
}
