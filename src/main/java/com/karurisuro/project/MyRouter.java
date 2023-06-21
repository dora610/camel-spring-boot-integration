/**
 * 
 */
package com.karurisuro.project;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author surajitkaruri
 *
 */

@Component
public class MyRouter extends RouteBuilder {
	
	@Autowired
	Greet greet;

	@Override
	public void configure() throws Exception {
		from("timer:hello?period=2000")
			.routeId("hello")
			.bean(greet, "greet")
			.to("stream:out");
	}

}
