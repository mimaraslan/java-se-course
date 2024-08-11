package com.mimaraslan.execption;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {

    private Integer code;
    private String message;
    private List<String> fields;

    @Builder.Default
    private LocalDateTime date = LocalDateTime.now();

    private HttpStatus status;


}
