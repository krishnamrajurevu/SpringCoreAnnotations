package com.krishnam.spring.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTech implements MobileProcessor {

	public void processor() {
		
		System.out.println("Second best cpu");

	}

}
