package com.cheng.learningdemo.Algorithm;

import java.math.BigDecimal;

/**
 * 每年投入本金6w，年化10%，计算20年后资产额度。
 * 使用递归，自己调用自己。
 */
public class ProfitTest {

    /**
     * capital——本金
     * year——投资年限
     * yield——预期投资年化收益率
     * @param capital
     * @param year
     * @param yield
     * @return
     */
    public static double getCapitalResult(double capital, int year, double yield, double capitalFirst) {
        double result = 0;
        if(year > 1) {
            // 处理精度损失问题
            BigDecimal b1 = new BigDecimal(Double.toString(capital));
            BigDecimal b2 = new BigDecimal(Double.toString(yield));
            capitalFirst = capitalFirst;
            result = b1.multiply(b2).doubleValue() + capitalFirst;
            year --;
            result = getCapitalResult(result, year, yield, capitalFirst);
        }else {
            // 处理精度损失问题
            BigDecimal b1 = new BigDecimal(Double.toString(capital));
            BigDecimal b2 = new BigDecimal(Double.toString(yield));
            result = b1.multiply(b2).doubleValue();
        }
        return result;
    }

    public static void main(String[] args) {
        double result = 0;
        result = ProfitTest.getCapitalResult(6, 20, 1.1, 6);
        System.out.println(result);
    }
}
