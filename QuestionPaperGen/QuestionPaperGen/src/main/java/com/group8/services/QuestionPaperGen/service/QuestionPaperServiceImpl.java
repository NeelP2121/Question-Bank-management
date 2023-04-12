package com.group8.services.QuestionPaperGen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group8.services.QuestionPaperGen.repositories.QuestionPaperRepository;
import java.util.List;

import com.group8.services.QuestionPaperGen.Entity.Domain;
import com.group8.services.QuestionPaperGen.Entity.Item;

@Service
public class QuestionPaperServiceImpl implements QuestionPaperService {
	@Autowired
	private QuestionPaperRepository QuestionPaperRepository;
	
	@Override
	public List<Item> genQuestionPaper(Domain domain){
		List<Item> mathqsns =  QuestionPaperRepository.findByDomain("Math", domain.getMath(), "Phy", domain.getPhy(), "Chem", domain.getChem());
		return mathqsns;
	}
}
