package com.msa_prac.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
@RequiredArgsConstructor
public class ReaderController {

//    private final ReaderService ReaderService;
//    private final WebBookService webBookService;
//    private final WebBookPaymentService webBookPaymentService;
//
//    @PostMapping("/")
//    public ResponseEntity<Long> registerReader(@RequestBody RegisterReaderForm registerReaderForm){
//        return ResponseEntity.ok(ReaderService.registerReader(registerReaderForm));
//    }
//
//    @GetMapping("/webBook")
//    public ResponseEntity<List<WebBookDto>> getWebBookList(){
//        return ResponseEntity.ok(webBookService.getWebBookList());
//    }
//
//    @GetMapping("/{readerId}/webBook/{webBookId}/chapter")
//    public ResponseEntity<List<WebBookChapterDto>> getWebBookChapterList(
//            @PathVariable(value = "readerId") Long readerId,
//            @PathVariable(value = "webBookId") Long webBookId){
//        return ResponseEntity.ok(webBookService.getWebBookList(readerId,webBookId));
//    }
//
//    @PostMapping("/{readerId}/payment/")
//    public ResponseEntity<WebBookChapterPaidDto> paymentWebBookChapter(
//            @PathVariable(value = "readerId") Long readerId,
//            @RequestBody WebBookChapterPaymentForm webBookChapterPaymentForm){
//        return ResponseEntity.ok(webBookPaymentService.payment(readerId,webBookChapterPaymentForm));
//    }
}
