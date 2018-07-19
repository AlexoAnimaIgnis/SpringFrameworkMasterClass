# SpringFrameworkMasterClass
Spring Framework Master class (Udemy tutorial)

This is the project I have worked on based on the online tutorial I enrolled in Udemy class.

Notes:

Process of Spring upon startup

Searching the package for any classes 

****Spring starts with @ComponentScan. Spring search for all anotations such as @component
2018-07-13 15:42:41.021 DEBUG 70556 --- [           main] .i.s.PathMatchingResourcePatternResolver : Resolved classpath location [com/alexo/springframework/springframework/] to resources [URL [file:/C:/Users/alexander.ballester/Documents/Developer%20Files/Web%20Development%20Programming/Spring%20Framework/SpringFrameworkMasterClass/01-spring-in-depth/target/classes/com/alexo/springframework/springframework/]]


****Spring found two classes with @Component annotation
2018-07-13 15:42:41.116 DEBUG 70556 --- [           main] o.s.c.a.ClassPathBeanDefinitionScanner   : Identified candidate component class: file [C:\Users\alexander.ballester\Documents\Developer Files\Web Development Programming\Spring Framework\SpringFrameworkMasterClass\01-spring-in-depth\target\classes\com\alexo\springframework\springframework\BinarySearchImpl.class]
2018-07-13 15:42:41.118 DEBUG 70556 --- [           main] o.s.c.a.ClassPathBeanDefinitionScanner   : Identified candidate component class: file [C:\Users\alexander.ballester\Documents\Developer Files\Web Development Programming\Spring Framework\SpringFrameworkMasterClass\01-spring-in-depth\target\classes\com\alexo\springframework\springframework\BubbleSortAlgorithm.class]

****Then Spring creates instance of the bean
'org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory'
2018-07-13 15:42:41.842 DEBUG 70556 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'binarySearchImpl'
2018-07-13 15:42:41.842 DEBUG 70556 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating instance of bean 'binarySearchImpl'
2018-07-13 15:42:41.853 DEBUG 70556 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'bubbleSortAlgorithm'
2018-07-13 15:42:41.853 DEBUG 70556 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating instance of bean 'bubbleSortAlgorithm'


****Then Spring will autowire the dependencies
2018-07-13 15:42:41.854 DEBUG 70556 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Finished creating instance of bean 'bubbleSortAlgorithm'
2018-07-13 15:42:41.855 DEBUG 70556 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'binarySearchImpl' via constructor to bean named 'bubbleSortAlgorithm'
2018-07-13 15:42:41.867 DEBUG 70556 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Returning cached instance of singleton bean 'bubbleSortAlgorithm'
2018-07-13 15:42:41.868 DEBUG 70556 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : Autowiring by type from bean name 'binarySearchImpl' to bean named 'bubbleSortAlgorithm'
2018-07-13 15:42:41.868 DEBUG 70556 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Finished creating instance of bean 'binarySearchImpl'


****Then Spring will autowire the dependencies through setter injection OR NO SETTER OR NO CONSTRUCTOR
2018-07-13 17:33:32.429 DEBUG 73760 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Finished creating instance of bean 'bubbleSortAlgorithm'
2018-07-13 17:33:32.429 DEBUG 73760 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : Autowiring by type from bean name 'binarySearchImpl' to bean named 'bubbleSortAlgorithm'
2018-07-13 17:33:32.429 DEBUG 73760 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Finished creating instance of bean 'binarySearchImpl'


****How do you know when to use a constructor injection or setter injection 
Mandatory dependencies - CONSTRUCTOR INJECTION
Optional dependencies - SETTER INJECTION


****SPRING MODULES
Spring is built in a modular way which lets you use one spring module without using other module.
- Core container i.e beans, core, context
- Data access/integration ie jdbc, orm, oxm, jms
- Web ie. websocket, web, servlet, portlet
- Cross-cutting stuff (applicable to more than one layer)
-- Test, 
- Spring AOP, Aspects, Instrumentation, Messaging

****SPRING PROJECTS
Spring projects provides solutions for different problems faced by enterprise applications
- Spring Boot framework to develop microservices. Makes very easy to develop web application
- Spring Cloud build cloud native applications
- Spring Data provides consistent data access
- Spring Integration addresses problem with application enterprise integration. helps us connecting application
- Spring Batch for batch applications. Enables developing batch applications
- Spring Security provide security applications. Provides solution in providing security 
- Spring HATEOAS enables you to develop hateos compatible application.

****WHY IS SPRING POPULAR
1. Enables testable code. Core feature of Spring is dependency injection
2. No plumbing of code. (Unnecessary code)
3. Flexible Architecture
4. Staying current. (microservices)

****QUALIFIER OR PRIMARY
Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed

****BEAN SCOPE
DEFAULT - SINGLETOn

singleton - one instance of bean per Spring Context
prototype - new bean whenever requested
request - one bean per HTTP request
session - one bean per HTTP session

****COMPLEX SCOPE SCENARIOS
If two related class has different scope, you can add additional attribute to @Scope
If youre trying to get a bean and one of its dependency is a prototype you can use proxy on that dependency 
- proxyMode = ScopeProxyMode.TARGET_CLASS

****DIFFERENCE BETWEEN SPRING SINGLETON and GOF SINGLETON
Gang of Four definition
- one instance of bean for the whole JVM
Spring
- one instance of bean per application context. (if there are 5 application context in single JVM, if I have spring beans that scope is set to singleton, then I will have 5 instance of that bean.


**** COMPONENT SCAN
Whenever we say something is a @SpringBootApplication it automatically defines a component scan on the package where the springbootapplication is defined.
Whenever you encountered a problem about NoSuchBeanDefinedException or of some sort, probably will be on @Component or @ComponentScan, to find the eligible
bean for Spring to create. Its on you to tell Spring where to find the component through @ComponentScan