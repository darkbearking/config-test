package com.troila.lw;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	/**
	 * 測試rest風格的請求與json對象格式的返回值
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Person getPerson(@PathVariable Integer id) {
		Person p = new Person();
		p.setId(id);
		p.setName("angus");
		p.setAge(36);
		
		return p;
	}
}
