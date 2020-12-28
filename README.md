# spring-boot-junit

Simple JUnit project
Reference: https://github.com/in28minutes/spring-boot-master-class/tree/master/03.JUnit-Introduction-In-5-Steps

Manual Run configuration:
  Name: Run My Math Configuration
  Class: MyMathClass

Test includes:
  Testcases: @Test
  Annotation @BeforeClass, @Before, @After, @AfterClass for testing their behavior

Note: 
Project Structure

project
	- src : deploy to production
		- package name, e.g., com.junit.class
			- class name, e.g., MyClass
         - test: not to deploy to production
		- package name, e.g., com.junit.class
			- class name+Test, e.g., MyClassTest
