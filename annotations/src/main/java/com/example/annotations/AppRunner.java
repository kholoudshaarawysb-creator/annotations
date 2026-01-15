package com.example.annotations;

import com.example.annotations.User.Userr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class AppRunner  implements CommandLineRunner {
    @Autowired
    Userr userr;

    @Override
    public void run(String... args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the name");
        String input= scanner.nextLine();
 userr.setName(input);
 System.out.println(userr.getName());
    }
}
