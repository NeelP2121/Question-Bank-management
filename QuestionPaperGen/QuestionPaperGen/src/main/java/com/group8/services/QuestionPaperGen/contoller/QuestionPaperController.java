package com.group8.services.QuestionPaperGen.contoller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.group8.services.QuestionPaperGen.service.QuestionPaperService;
import com.group8.services.QuestionPaperGen.Entity.Item;
import com.group8.services.QuestionPaperGen.Entity.Domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class QuestionPaperController {
	
	@Autowired 
	private QuestionPaperService QuestionPaperService;

	@PostMapping("/QuestionPaper")
	public List<Item> genQuestionPaper(@RequestBody Domain domain){
		return QuestionPaperService.genQuestionPaper(domain);
	}
}
