package com.troila.lw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 這個類依然要和ConfigApp類在同一目錄下
 * 調用所有的4個application.properties
 * 目的是明確這4個配置文件的調用順序
 * 順序為：	/config/application.properties
 * 			/application.properties
 * 			/classes/config/application.properties
 * 			/classes/application.properties
 * @author liwei
 *
 */
@Controller
public class MyController {

	@Autowired
	private ApplicationContext ctx;
	
	/**
	 * 用這個請求地址來配合多個配置文件進行測試。
	 * 分別測試abc.properties、application.yml等文件
	 * 
	 * @return
	 */
	@GetMapping("/prop")
	@ResponseBody
	public String getName() {
		
		return ctx.getEnvironment().getProperty("test.user.name");
	}
}
