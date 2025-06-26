package com.green.memoserver;

import com.green.memoserver.model.MemoGetReq;
import com.green.memoserver.model.MemoPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemoMepper {
    int save(MemoPostReq req);

}
