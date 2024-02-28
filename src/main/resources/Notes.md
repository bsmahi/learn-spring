# Aspect-Oriented Programming - AOP

**XML Namespace Declarations:** The <beans> element declares namespaces for XML Schema Instance (xmlns:xsi) and Spring AOP (xmlns:aop).

These namespaces are used to reference specific XML schemas throughout the document.

**Schema Location:** The xsi:schemaLocation attribute specifies the locations of the XML schemas associated with the declared namespaces.

This attribute is used by XML parsers to validate the document against the specified schemas.

1. For the http://www.springframework.org/schema/beans namespace, the schema is located at http://www.springframework.org/schema/beans/spring-beans-4.0.xsd.

   This schema defines the structure and elements allowed in the Spring Beans configuration.

2. For the http://www.springframework.org/schema/aop namespace, the schema is located at http://www.springframework.org/schema/aop/spring-aop-4.0.xsd.

    This schema defines elements related to Aspect-Oriented Programming (AOP) configuration in Spring.

**Point Cut:** PointCut is the expression used to define when a call to a method should be intercepted
In this case -> execution(* com.bsmlabs.learnspring.aop.repository.*.*(..))"

**Advice:** What do you want to do?
It is the logic that you would want to invoke when you intercept a method
In this example, it is the code inside the before(JoinPoint joinpoint) method.

**Aspect:** Advice + PointCut

**Join Point:** When the code is executed and the condition for pointcut is met, the advice is executed.
It is a specific execution instance of an advice

**Weaver:** It is the framework which implements AOP - AspectJ or SpringAOP

1. execution(public * *(..)) - the execution of any public method

2. execution(* set*(..)) - the execution of any method with a name beginning with "set"

3. execution(* com.bsmlabs.learnspring.service.EmployeeService.*(..)) - the execution of any method defined by the BusinessService class/interface

4. execution(* com.bsmlabs.learnspring.service.*.*(..)) - the execution of any method defined in the service package

5. execution(* com.bsmlabs.learnspring.service..*.*(..)) - the execution of any method defined in the service package or a sub-package

6. within(com.bsmlabs.learnspring.service.*) - any join point (method execution only in Spring AOP) within the service package

7. within(com.bsmlabs.learnspring.service..*) - any join point (method execution only in Spring AOP) within the service package or a sub-package

8. this(com.bsmlabs.learnspring.service.BusinessService) - any join point (method execution only in Spring AOP) where the proxy implements the BusinessService interface

9. target(com.bsmlabs.learnspring.service.BusinessService) - any join point (method execution only in Spring AOP) where the target object implements the BusinessService interface

