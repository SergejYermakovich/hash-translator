package tt.hash.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class HashService {

    private final HashServiceClient client;

    public String getHash(String data) {
        return client.getHash(data);
    }

}
