package com.microServiceCvs.microServiceCvs;

import org.elasticsearch.client.*;

import org.elasticsearch.client.transport.*;
import org.elasticsearch.common.settings.*;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
public class Config{
    @Value("${elasticsearch.host}")
    public String host;
    @Value("${elasticsearch.port}")
    public int port;
    public String getHost() {
        return host;
    }
    public int getPort() {
        return port;
    }
    @Bean
    public Client client(){
        TransportClient client = null;
        try{
            System.out.println("host:"+ host+"port:"+port);
            client = new PreBuiltTransportClient(Settings.EMPTY)
                    .addTransportAddress(new TransportAddress(InetAddress.getByName(host), port));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return client;
    }
}

