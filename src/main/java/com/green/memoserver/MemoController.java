package com.green.memoserver;

import com.green.memoserver.model.MemoGetReq;
import com.green.memoserver.model.MemoPostReq;
import com.green.memoserver.model.MemoPutReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/memo")
@Slf4j
public class MemoController { // 빈등록
    private final MemoService memoService;
    //c
    //r
    //u
    //d

    @PostMapping
    public String postMemo(@RequestBody MemoPostReq req){ //애노테이션 안넣으면 form 데이터로 들어온다고 생각함
        log.info("req={}", req);
        return "저장성공";
    }
    //Read
    @GetMapping
    // public String getMemo(@RequestParam(name="search_text",required=false) String searchText){ // 반드시 같은 키값이 있어야함  required
    // int 를 쓰고싶으면 앞에 Integer 넣어주면됨
    public String getMemo(@RequestParam (name = "search_text", required = false) String searchText
    ,@RequestParam(required = false) Integer page) {
        log.info("search={}","page={}", searchText, page);
        MemoGetReq.builder()
                  .searchText(searchText)
                  .page(page)
                  .build();
        return "메모리스트";
    }
    @GetMapping("{id}")
    public String getMemoById(@PathVariable int id){
        log.info("id={}",id);
        return "메모하나";
 }
 //업데이트 JSON
    @PutMapping
    public String putMemo(@RequestBody MemoPutReq req){
        log.info("MemoId={}",req.getMemoId());
        return "수정완료";
    }
    @DeleteMapping
    public String deleteMemo(@RequestParam("memo_id") int memoId){
        log.info("memoId={}",memoId);
        return "삭제완료";
    }

}
// @RequestParam
// memoService.getMemoList(searchText,page);

