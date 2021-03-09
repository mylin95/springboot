package com.lmy.springboot.modules.elasticsearch.config;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
public class MyConfig {

    @Bean
    public TransportClient client() throws UnknownHostException {

        TransportAddress node = new TransportAddress(
                InetAddress.getByName("47.100.108.80"),
                9300
        );

        Settings settings = Settings.builder()
                // .put("xpack.security.user", "elastic:lmy.123")
                .put("cluster.name", "es-cluster")
                .put("node.name", "main")
                .build();

        TransportClient client = new PreBuiltTransportClient(settings);
        // 可添加多个节点node
        client.addTransportAddress(node);
        return client;
    }
}
