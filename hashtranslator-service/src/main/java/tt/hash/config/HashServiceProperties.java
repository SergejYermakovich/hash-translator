package tt.hash.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "hashtranslator.hello")
@Data
public class HashServiceProperties {

    public static String HASH_SERVICE_ADDRESS = "https://hashingservice.com/ajax.php";
    public static String DEFAULT_HASH_VALUE = "";
}
