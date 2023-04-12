package com.group8.services.QuestionPaperGen.service;

//import java.util.Map;
import java.util.List;

import com.group8.services.QuestionPaperGen.Entity.Domain;
import com.group8.services.QuestionPaperGen.Entity.Item;

public interface QuestionPaperService {
	
	public List<Item> genQuestionPaper(Domain domain);
}
