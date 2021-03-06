package org.c4sg.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class C4sgUrlService {
	
	@Value("${c4sg.web.url}")
	private String webUrl;
	
	public String getProjectUrl(Integer id) {
		return webUrl + "/project/view/" + id;
	}

}
