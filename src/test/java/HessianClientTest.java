import com.caucho.hessian.client.HessianProxyFactory;
import com.qudian.entity.User;
import com.qudian.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.MalformedURLException;

/**
 * Created by Sole on 2017/2/23.
 */
public class HessianClientTest {

    //运用Spring配置管理
    @org.junit.Test
    public void test() {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring-application.xml");
        UserService userService = (UserService) factory.getBean("hessianClient");
        User user = userService.get();
        System.out.println(user);
    }

    //不用spring配置
    @org.junit.Test
    public void test2() {
        String url = "http://localhost:8080/hessian/service";
        HessianProxyFactory factory = new HessianProxyFactory();
        UserService userService = null;
        try {
            userService = (UserService) factory.create(UserService.class, url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println(userService);
        User user = userService.get();
        System.out.println(user);
    }

}
