import com.pactera.api.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zhoulonghui
 * @Date: 2019/1/24 15:58
 */
public class TestConsumer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("comsumer start");
        OrderService orderService =context.getBean(OrderService.class);
        String result = orderService.getOrder("4");
        System.out.println("订单信息是"+result);
    }
}
