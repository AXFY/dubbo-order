import com.pactera.api.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zhoulonghui
 * @Date: 2019/1/24 16:15
 */
public class TestConsumer1 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer2.xml");
        context.start();
        System.out.println("consumer1 start");
        OrderService orderService = context.getBean(OrderService.class);
        String result = orderService.getOrder("2");
        System.out.println("订单信息是"+result);
    }
}
