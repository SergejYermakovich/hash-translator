package tt.hash.service;

import org.springframework.stereotype.Component;

@Component
public class HashServiceClient {

    public String getHash(String data) {
        return "result: " + data;
    }
}
