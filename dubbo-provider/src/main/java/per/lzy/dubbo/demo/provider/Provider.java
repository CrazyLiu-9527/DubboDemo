package per.lzy.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuzhiyuan
 * @date 2021/1/7 20:30
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/remote-provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
