package com.example.SpringAOPDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditLog {
	
	@Before("execution(* com.example.SpringAOPDemo.BankService.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Audit: Before Method "+ joinPoint.getSignature().getName() + " was called.");
	}

	@After("execution(* com.example.SpringAOPDemo.BankService.*(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("Audit: After Method "+ joinPoint.getSignature().getName() + " was called.");
	}
	@Before("execution(* com.example.SpringAOPDemo.BankService.transferFund(..))")
	public void sendOTP() {
		System.out.println("otp Send");
	}
	@After("execution(* com.example.SpringAOPDemo.BankService.transferFund(..))")
	public void sendSMS() {
		System.out.println("shows the balance after fund transfer");
	}
	
}
