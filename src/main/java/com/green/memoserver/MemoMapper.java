package com.green.memoserver;

import com.green.memoserver.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoMapper {
    int save(MemoPostReq p);
    //인서트전용,
    List<MemoGetRes> findAll(MemoGetReq p);
    //셀렉트 전용
    MemoGetOneRes findById(int id);
    int deleteById(int id);
    int modify(MemoPutReq req);
    //객체로 보내는게 좋다 객체일때는 이름 꼭 맞추기
    //컬럼명이랑 태그명은 무조건 같게
    //무조건 인트

}
//res 응답 req 요청
// mapper , Service Controller