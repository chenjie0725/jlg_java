package com.sankuai.inf.leaf.server;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
public class LeafServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeafServerApplication.class, args);
    }
}
