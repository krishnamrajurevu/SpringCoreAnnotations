package com.krishnam.spring.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class SnapDragon implements MobileProcessor {

	public void processor() {
		
		System.out.println("world best processor");

	}

}
