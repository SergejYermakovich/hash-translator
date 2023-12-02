package tt.hash.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URISyntaxException;

class HashServiceClientTest {

    @Autowired
    HashServiceClient client = new HashServiceClient();

    @Test
    void testGetHash() throws URISyntaxException, JsonProcessingException {
        // given
        String data = "aaa";
        String expectedResult = "47bce5c74f589f4867dbd57e9ca9f808";

        // when
        String result = client.getHash(data);

        // then
        Assertions.assertEquals(expectedResult, result);
    }
}