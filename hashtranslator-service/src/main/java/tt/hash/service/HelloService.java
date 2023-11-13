package tt.hash.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tt.hash.config.HashServiceProperties;


import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@Service
public class HelloService {
    private final HashServiceProperties properties;

    @Autowired
    public HelloService(HashServiceProperties properties) {
        this.properties = properties;
    }

    public String makeGreetingMessageFor(String name) {
        String instanceId = "unknown";
        try {
            instanceId = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            log.warn("can't get hostname", e);
        }
        return String.format(properties.getTemplate(), name, instanceId);
    }
}
