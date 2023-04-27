package com.demo;

import com.demo.config.XXXConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/26
 */
@SpringBootTest
public class CoreFeatureTest {

    @Autowired
    XXXConfig xxxConfig;

    @Test
    public void test() {
        System.out.println(xxxConfig.getInfo());
    }

}
