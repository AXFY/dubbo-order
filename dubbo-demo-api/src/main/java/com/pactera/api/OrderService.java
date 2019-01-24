package com.pactera.api;

/**
 * @Author: zhoulonghui
 * @Date: 2019/1/24 14:40
 */
public interface OrderService {
    /**
     * 使用用户UserId查找对应订单信息
     * @param userId
     * @return
     */
    public String getOrder(String userId);
}
