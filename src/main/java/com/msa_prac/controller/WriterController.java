package com.msa_prac.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/writer")
@RequiredArgsConstructor
public class WriterController {

//    private final WriterService writerService;
//    private final WriterWebBookService writerWebBookService;
//
//    @PostMapping("/")
//    public ResponseEntity<Long> registerWriter(@RequestBody RegisterWriterForm registerWriterForm) {
//        return ResponseEntity.ok(writerService.registerWriter(registerWriterForm));
//    }
//
//    @PostMapping("/{writerId}/webBook")
//    public ResponseEntity<Long> registerWebBook(
//            @PathVariable(value = "writerId") Long writerId,
//            @RequestBody RegisterWebBookForm registerWebBookForm) {
//        return ResponseEntity.ok(writerWebBookService.registerWebBook(writerId, registerWebBookForm));
//    }
//
//    @PostMapping("/{writerId}/webBook/{webBookId}")
//    public ResponseEntity<Long> registerWebBook(
//            @PathVariable(value = "writerId") Long writerId,
//            @PathVariable(value = "webBookId") Long webBookId,
//            @RequestBody RegisterWebBookChapterForm registerWebBookChapterForm) {
//        return ResponseEntity.ok(writerWebBookService.registerWebBookChapter(writerId, webBookId, registerWebBookChapterForm));
//    }

}
