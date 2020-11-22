package com.kolli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kolli.util.PasswordEncryptor;

@SpringBootApplication
public class Application {

System.out.println("hello nagarjuna how are you man this is testing of conflict in git");
	public static void main(String[] args) {
		
		//Hello nagarjuna how are you i am fine
		SpringApplication.run(Application.class, args);
		
		//hello stash is really working fine
	}
	

public void kolli(){
System.out.println("hello nagarjuna how are you");
}
	
	@Bean
	public PasswordEncryptor getInstance() {
		PasswordEncryptor pe=new PasswordEncryptor();
		return pe;
	}

}
