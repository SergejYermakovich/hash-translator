package tt.hash.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "hashtranslator.hello")
@Data
public class HashServiceProperties {

    private String template = "Hello %s from %s";
    private static String HASH_SERVICE_ADDRESS = "http://hash-code.io";
    public static String DEFAULT_HASH_VALUE = "";
}
