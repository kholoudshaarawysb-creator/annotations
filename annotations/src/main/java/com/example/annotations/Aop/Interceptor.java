package com.example.annotations.Aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import  com.example.annotations.annotation.flfl;

@Component
@Aspect
public class Interceptor {

//advice 1
    @Around("@annotation(com.example.annotations.annotation.flfl)") //pointCut?applies to any method annotated with @flfl
    public Object Setter(ProceedingJoinPoint pjp) throws Throwable {
        //setter? validation, exceptions
System.out.println("FLFL");
/*beforeLogic1:starts with an uppercase letter
Logic2: more than 2 letters
logic3:no spaces
 */
     //?name ? args ? pjp.args
       // getArgs method returns an obj
        //method before the args?
/*, checks length , checks type , String name , apply rules , new value , proceed*/

        Object [] args = pjp.getArgs () ; //String name arg [0]
        String name =(String) args[0];      //index, first parameter = name

    //validation
        if (name==null || name.isEmpty())  {
         throw new RuntimeException("name is required");
     }
        name=name.trim();

        if (name.length() <=2)  {
            throw new RuntimeException("at least 3 letters");
        }

        if (name.contains(" "))  {
            throw new RuntimeException("no spaces");
        }
//args[0]=name;
      //return   pjp.proceed();
      Object result= pjp.proceed();
        System.out.println("after aop");

        return result;

        //afterLogic
    }

    //advice 2
    @Around("@annotation(com.example.annotations.annotation.shata)") //pointCut?applies to any method annotated with @flfl
    public Object getter(ProceedingJoinPoint pjp) throws Throwable {
        //getter? return value , transformation
        System.out.println("shata");
// logic: Convert from uppercase to lowercase? returns the value and applies the method

        Object gett = pjp.proceed(); //getter method is executed
/*Obj to String
  obj? String , int , double , .... */
        if (gett instanceof String) {
            String get = (String) gett;
            return get.toLowerCase();
        }


        return pjp.proceed();

    }
    }


