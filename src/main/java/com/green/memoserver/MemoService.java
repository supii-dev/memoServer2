package com.green.memoserver;

import com.green.memoserver.model.MemoPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service // 이걸로 빈등록
@RequiredArgsConstructor // final
public class MemoService { // 외부에서 주소값을 받을수 있어야한다 그게 스프링
    private final MemoMepper memoMepper;

    public int save(MemoPostReq p){
        return memoMepper.save(p);
    }

}
