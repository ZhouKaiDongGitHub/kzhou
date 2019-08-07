package com.eis.rpc.comsumer.app;
import com.eis.rpc.comsumer.service.CalculatorRemoteImpl;
import com.eis.rpc.provider.service.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 *
 * @author: hzy created on 2018/05/02
 */
public class ComsumerApp {
    private static Logger log = LoggerFactory.getLogger(ComsumerApp.class);

    public static void main(String[] args) {
        Calculator calculator = new CalculatorRemoteImpl();
        int result = calculator.add(1, 2);
        log.info("result is {}", result);
    }
}
