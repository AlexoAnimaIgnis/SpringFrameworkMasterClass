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
