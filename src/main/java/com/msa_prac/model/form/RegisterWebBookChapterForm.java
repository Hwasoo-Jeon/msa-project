package com.msa_prac.model.form;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class RegisterWebBookChapterForm {
	private String name;
	private String detail;
	private Integer price;
}
