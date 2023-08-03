package shop.mtcoding.conbasic.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.conbasic.dto.BoardReqDto;

@RestController
public class HttpBodyController {
    @PostMapping("/data/body/v1")
    public String bodyV1(@RequestParam("title") String title){
        return "받은 값 : "+title;
    }
    @PostMapping("/data/body/v2")
    public String bodyV2(@RequestParam("title") String title, @RequestParam("content") String content){
        return "받은 값 : "+title+", "+content;
    }

    // 스프링에서 json언어로 파싱 번역
    // @RequestBody
    // application/json -> { "title": "값", "content": "값"}
@PostMapping("/data/body/v3")
public String bodyV3(@RequestBody BoardReqDto boardReqDto){
    return "받은 값 : "+boardReqDto.getTitle()+", "+boardReqDto.getContent();
}

    // 스프링기본 언어
    // localhost:8080/data/body/v3
    // post
    // x-www-form-urlencoded -> title=값&content=값 
@PostMapping("/data/body/v4")
public String bodyV4(BoardReqDto boardReqDto){
    return "받은 값 : "+boardReqDto.getTitle()+", "+boardReqDto.getContent();
}
} 
