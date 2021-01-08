package com.prueba.consumingrestdataentelgy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.consumingrestdataentelgy.service.CommentService;




@RequestMapping("/api/entelgy/formatted-result")
@RestController
public class CommentController {
	@Autowired
	CommentService commentService;

	@PostMapping
	public String transformData() {
		return commentService.formatJsonData("https://jsonplaceholder.typicode.com/comments");
		
	}

}
