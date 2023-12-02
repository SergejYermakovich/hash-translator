package tt.hash.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class HashRequest {
    public HashRequest(String algorithm, String salt, String string) {
        this.algorithm = algorithm;
        this.salt = salt;
        this.string = string;
    }

    private String algorithm;
    private String salt;
    private String string;



}
