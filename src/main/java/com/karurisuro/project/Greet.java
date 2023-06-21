/**
 * 
 */
package com.karurisuro.project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author surajitkaruri
 *
 */

@Component
public class Greet {
	
	private int counter;
	
	@Value("${greeting}")
	private String greeting;

	public String greet(String body) {
		return String.format("%s, invoked %d times ", greeting, ++counter);
	}
}
