package tt.hash.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class HashServiceClientTest {

    @Autowired
    HashServiceClient client = new HashServiceClient();

    @Test
    void testGetHash() {
        // given
        String data = "aaa";
        String expectedResult = "47bce5c74f589f4867dbd57e9ca9f808";

        //
        String result = client.getHash(data);

        //
        Assertions.assertEquals(expectedResult, result);
    }
}