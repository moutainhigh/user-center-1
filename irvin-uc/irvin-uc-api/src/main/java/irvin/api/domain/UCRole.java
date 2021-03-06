package irvin.api.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UCRole {
    private String id;
    private String name;
    private String expression;
    private Long status;
}
