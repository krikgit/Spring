package com.krish.app;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@SuppressWarnings("rawtypes")
@Component
public class EventHandle implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event.toString());
	}
}
