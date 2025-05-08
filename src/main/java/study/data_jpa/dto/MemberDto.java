package study.data_jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberDto {

    private Long id;

    private String username;

    private String teamName;

}
