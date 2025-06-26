package com.green.memoserver.model;

import lombok.Builder;
import lombok.Getter;

import java.beans.ConstructorProperties;

//@Builder// 모든 경우의수의 생성자를 만들어준다
@Getter
public class MemoGetReq {
    private String searchText;
    private Integer page;

    //    public MemoGetReq(String searchText, int page) {
//        this.searchText = searchText;
//        this.page = page;
//    }

    @ConstructorProperties({"search_text","page"})
    public MemoGetReq(String searchText, Integer page) {
        this.searchText = searchText;
        this.page = page;
    }
}
