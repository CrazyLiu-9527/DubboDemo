package per.lzy.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import per.lzy.dubbo.demo.provider.service.ProviderService;

/**
 * @author liuzhiyuan
 * @date 2021/1/7 20:34
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/remote-consumer.xml"});
        context.start();
        ProviderService providerService = (ProviderService) context.getBean("providerService"); // 获取远程服务代理
        String hello = providerService.sayHello("world"); // 执行远程方法
        System.out.println(hello); // 显示调用结果
    }
}
