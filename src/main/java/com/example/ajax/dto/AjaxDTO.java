package com.example.ajax.dto;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AjaxDTO {
    private String param1;
    private String param2;

    @Builder
    public AjaxDTO(String param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
    }
}
