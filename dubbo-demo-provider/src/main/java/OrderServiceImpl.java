import com.pactera.api.OrderService;

/**
 * @Author: zhoulonghui
 * @Date: 2019/1/24 14:42
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public String getOrder(String userId) {
        String result = null;
        switch (userId){
            case "1":
                result = "电脑订单";
                break;
            case "2":
                result = "手机订单";
                break;
            case "3":
                result = "床上用品订单";
                break;
                default:
                    result = "厨房用品订单";
                    break;
        }
        return result;
    }
}
