package com.green.memoserver.model;

import lombok.Builder;
import lombok.Getter;

@Builder// 모든 경우의수의 생성자를 만들어준다

@Getter
public class MemoGetReq {
    private String searchText;
    private Integer page;
}
