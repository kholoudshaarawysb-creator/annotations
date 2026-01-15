package com.example.annotations;

import com.example.annotations.User.Userr;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationsApplication.class, args);
/*
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the name");
		String input= scanner.nextLine();

	//	Userr userr =new Userr(); xxxx aop -> xxx...proxy




		userr.setName("omar");
*/
	}

}
