package tt.hash.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tt.hash.config.HashServiceProperties;
import tt.hash.dto.HashRequest;

import java.net.URI;
import java.net.URISyntaxException;

@Component
public class HashServiceClient {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    public String getHash(String data) throws URISyntaxException, JsonProcessingException {
        String resourceUrl = HashServiceProperties.HASH_SERVICE_ADDRESS;
        HashRequest hashRequest = new HashRequest("2", "aaa", data);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        URI url = new URI(resourceUrl);

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String payload = ow.writeValueAsString(hashRequest);

        HttpEntity<String> requestEntity = new HttpEntity<>(payload, headers);

        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);

        return responseEntity.getBody();
    }
}
