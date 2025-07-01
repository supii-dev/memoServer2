package com.green.memoserver;

import com.green.memoserver.config.model.ResultResponse;
import com.green.memoserver.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
//공통 URL
@RequestMapping("api/memo")
public class MemoController {
    private final MemoService memoService;

    //Create
    @PostMapping
    public ResultResponse<Integer> postMemo(@RequestBody MemoPostReq req) { //JSON로 넘어오는구나
        log.info("req={}", req);
        int result =  memoService.save(req);
        return new ResultResponse<>("삽입성공",result);
        //new 키워드 다음은 생성자 , 데이터를 보내주고있는 파라미터가 있는 생성자 ,
    }

   //Read
    @GetMapping
    public ResultResponse<List<MemoGetRes>> getMemo(@ModelAttribute MemoGetReq req) {
       log.info("req={}", req);
       List<MemoGetRes> result = memoService.findAll(req);
       String message = String.format("row: %d ", result.size());
        return new ResultResponse<>(message, result);
   }

    @GetMapping("{memoId}")
    public ResultResponse<MemoGetOneRes> findById(@PathVariable int memoId) {
        log.info("memoId={}", memoId);
        MemoGetOneRes result = memoService.findById(memoId);
        return new ResultResponse<>("조회성공",result);
    }


    //Update
    @PutMapping
    public ResultResponse<Integer> modify(@RequestBody MemoPutReq p) { //JSON로 넘어오는구나
        log.info("modify={}",p);
        int result =  memoService.modify(p);
        return new ResultResponse<>("수정성공",result);
    }

    //Delete
    @DeleteMapping
    public ResultResponse<Integer> deleteMemo(@RequestParam ("memo_id") int memoId) {
        log.info("memoId={}", memoId);
        int result = memoService.deleteById(memoId);
        return new ResultResponse<>("삭제성공",result);
    }
}