package com.example.smdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.statemachine.StateMachine;
import org.springframework.stereotype.Component;

import com.example.smdemo.config.Events;
import com.example.smdemo.config.States;

@Component
public class CmdRunner implements CommandLineRunner {

	@Autowired
	StateMachine<States, Events> stateMachine;

	@Override
	public void run(String... args) throws Exception {
		stateMachine.sendEvent(Events.E1);
		stateMachine.sendEvent(Events.E1);
		stateMachine.sendEvent(Events.E2);
	}

}
