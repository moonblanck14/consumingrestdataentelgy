package com.prueba.consumingrestdataentelgy.service;

import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prueba.consumingrestdataentelgy.model.Comment;




@Service
public class CommentService {

	public String formatJsonData(String resource) {
		RestTemplate restTemplate = new RestTemplate();
		Comment comments[] = restTemplate.getForObject(resource, Comment[].class);
		JSONObject json_obj = new JSONObject();
		return json_obj.put("data", List.of(comments).stream().map(comment -> comment.toString())
				.collect(Collectors.toList())).toString();
	}
}
