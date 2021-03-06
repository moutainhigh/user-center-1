package irvin.api.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UCUserOauth {
    private String id;
    private String user_basic_id;
    private Long account_type;
    private String account;
    private Long status;
}
