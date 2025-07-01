package com.green.memoserver.config.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
//@Builder
public class ResultResponse<T> {
    private String resultMessage;
    private T resultData;


}
