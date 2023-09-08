package com.automation.git;

public class LearningGitAutomation {
public static void main(String[] args) {
	System.out.println("My first git automation");
	
	LearningGitAutomation  myObject = new LearningGitAutomation();
	myObject.addition(10, 40);
}

public void emptyMethod() {
	
}

public void addition(int num1, int num2) {
	int result = num1 + num2;
	System.out.println("num1 is: " + num1 + ",num2 is: " + num2);
	System.out.println("num1 + num2" + result);
}
}
