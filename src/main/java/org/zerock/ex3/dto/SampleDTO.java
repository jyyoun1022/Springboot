package org.zerock.ex3.dto;


import lombok.Builder;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.time.LocalDateTime;

@Builder(toBuilder = true)
@Data //getter/setter +toString+ equals + hashCode를 자동생성하게한다.
public class SampleDTO {

    private Long sno;

    private String first;

    private String last;

    private LocalDateTime regTime;
}
