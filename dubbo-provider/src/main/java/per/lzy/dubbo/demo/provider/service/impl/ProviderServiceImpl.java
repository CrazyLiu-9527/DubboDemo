package per.lzy.dubbo.demo.provider.service.impl;

import per.lzy.dubbo.demo.provider.service.ProviderService;

/**
 * @author liuzhiyuan
 * @date 2021/1/7 20:15
 */
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello(String word) {
        return "Hello " + word;
    }
}
