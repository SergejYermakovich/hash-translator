package tt.hash.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tt.hash.config.HashServiceProperties;

@Component
public class HashServiceClient {

    public String getHash(String data) {
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = HashServiceProperties.HASH_SERVICE_ADDRESS + "/ajax.php?algorithm=2&salt=&string=" + data;
        ResponseEntity<String> response = restTemplate.getForEntity(resourceUrl, String.class);
        return response.getBody();
    }
}
