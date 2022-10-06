package com.example.command;

import lombok.Data;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

@Data
public class NewArticleCommand {
	
	private String title;
	private String content;
	private int parentId;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date regdate;

}
