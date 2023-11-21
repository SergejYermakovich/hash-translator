package tt.hash.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tt.hash.config.HashServiceProperties;

@AllArgsConstructor
@Service
public class HashService {

    private final HashServiceClient client;

    public String getHash(String data) {
        try {
            return client.getHash(data);
        } catch (Exception exception) {
            return HashServiceProperties.DEFAULT_HASH_VALUE;
        }

    }

}
