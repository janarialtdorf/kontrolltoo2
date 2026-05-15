package ee.kontrolltoo.backend.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopsDto {
    private Long userId;
    private String title;
    private Boolean completed;
}
