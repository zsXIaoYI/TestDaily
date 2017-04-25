package cn.zsza.BinaryTreeTest;

/**
 * Created by ZhangSong on 2016/8/13.
 * 二叉树遍历
 */
class Node {
    int data;      //根节点数据
    Node left;     //左子树
    Node right;    //右子树

    public Node(int data)  {  //实例化二叉树类
        this.data = data;
        left = null;
        right = null;
    }

    public void insert(Node root,int data){     //向二叉树中插入子节点
        if(data > root.data)  {                            //插入的节点比根节点大
            if(root.right==null){
                root.right = new Node(data);
            }else{
                this.insert(root.right, data);
            }
        }else {                                              //插入的节点比比根节点小
            if(root.left==null){
                root.left = new Node(data);
            }else{
                this.insert(root.left, data);
            }
        }
    }
}
//当建立好二叉树类后可以创建二叉树实例，并实现二叉树的先根遍历，中根遍历，后根遍历，代码如下：
public class BinaryTrees {

    public static void preOrder(Node root) {  //先根遍历
        if (root != null) {
            System.out.print(root.data + "-");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void inOrder(Node root) {     //中根遍历

        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + "--");
            inOrder(root.right);
        }
    }

    public static void postOrder(Node root) {    //后根遍历

        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + "---");
        }
    }

    public static void main(String[] str) {
        int[] array = {12, 76, 35, 22, 16, 48, 90, 46, 9, 40};
        Node root = new Node(array[0]);   //创建二叉树
        for (int i = 1; i < array.length; i++) {
            root.insert(root, array[i]);       //向二叉树中插入数据
        }
        System.out.println("先根遍历：");
        preOrder(root);
        System.out.println();
        System.out.println("中根遍历：");
        inOrder(root);
        System.out.println();
        System.out.println("后根遍历：");
        postOrder(root);
    }
}