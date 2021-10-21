package cn.tedu.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Date:2021/10/20 16:44
 * @Author:NANDI_GUO
 */
public class TestFile {
    public static void main(String[] args) throws IOException {
        //创建file类的对象
        File file = new File("D:\\ready\\1.txt");
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.getPath());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());

        /*new只会在内存中创建一个File类型的对象
        * 并不会帮我们创建一个在磁盘路径下真实存在的文件*/

        File file2 = new File("D:\\ready\\2.txt");

        /*如果指定创建文件的位置不对，会抛出异常：IOException
        * 所以需要提前处理这个问题
        * 我们暂时选择在main方法上抛出，如果不处理方法调用会报错，通不过编译*/
        System.out.println(file2.createNewFile());

        File file3 = new File("D:\\ready\\n");
        System.out.println(file3.mkdir());
        //创建当前不存在的多层文件夹
        file3 = new File("D:\\ready\\a\\b\\c");
        System.out.println(file3.mkdirs());

        //delete只能删除文件，或者空的文件夹
        file2.delete();
        file3.delete();

        //展示文件
        File file4 = new File("D:\\ready");
        String[] list = file4.list();
        System.out.println(Arrays.toString(list));

        File[] fs = file4.listFiles();
        System.out.println(Arrays.toString(fs));
        System.out.println(fs[0].exists());
    }
}
