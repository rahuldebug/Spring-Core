[SPRING CORE CONCEPTS]

        Java Beans - they are java Object managed by Spring Container(IOC Container)
        two ways to create java beans 

        1> @Component annotation
        2> @Bean annotation 


[convention over configuration]


        @Autoconfiguration , nobody tells spring IOC how to create beans this is part of autoconfiguration .
        (Component scan for the base package is auto configured , we can also add other packages for component scan, hence auto configuration is non invasive)
        
        
        @AutoConfiguration is non-invasive properties of Spring where , it tries to configure the 
        spring boot app based on dependency(mentioned in pom.xml) and default configuration ,
        if we have defined data-source (in dependency) it will look for its configuration in application
        file else look for data dource , if not found it will stop the applucation. 

        It will spin the application server at default port . 

        [ a class example of @Bean @Configuration & @Component is below given package] 
        
        [com/rahul/spring5/core/beanconfigEx ]
        
        suppose we are creating a class and which doesn't have default constructor 
        so here we have to create a a class @Configuration , and provide a @Bean method 
        with constructor parameters , under @Bean return new object of that type
        
        this can also be used for external object creation . 

[DISPATCHER Servlets -- the core of web handler , first controller ]

[There are different bean scopes :: Singleton , Prototype , Session , Request , Application, websocket]

        [Eager and Lazy Beans] Singleton beans are eagerly initialized , while Prototype are lazyily initialized 
[Bean LifeCycle]
        Application Start --> IOC Container Created (Configuration Loaded) --> (Component Scan) Bean Created---
                                                                                                                |
                                                                                                                |
                                    Bean Destroyed <-- Pre Destroy <-- Use Bean <--   PostConstruct       <----







[Annotations]

        @SpringBootApplication

        -this encapsulates @ComponentScan ,@EnableAutoConfiguration ,  @Configuration
            -@ComponentScan::

        
        @Component , @Service, @Repository @Controller
        -this is basically @Component specifically used for controller classes, 
        similarly @Service is component for service class and so is @Repository for repository class
        
        
        
        @RestController
        - @Controller and @ResponseBody  , the annotation of response body 

        @RequestMapping
        @GetMapping @PostMapping @PutMapping @PatchMapping @DeleteMapping
        @Autowired
        @Component
        @Service
        @Repository
        @ComponentScan
        @Configuration
        @Value
        @Qualifier
        @Profile
        @EnableAutoConfiguration
        @Entity
        @Transactional
        @EnableCaching
        @Async
        @EnableScheduling


[API Best Practices]

[Naming]
Name should be meaningful and must tell what Api actually does, it should be a verb.
[Parameters]
Just to make api future-proof we should not take in unnecessary parameters , instead
we should rely  on versioning . 
[information]
Fetched data should not send extra information , over fetching and under-fetching should be avoided 
[HTTP Verbs]
Proper verbs should be used , we should not be sending data in get call . 
so POST , GET , PUT , PATCH, DELETE should be used correctly . 
Http Verbs 
- GET Request to retrieve data 
- HEAD similar to GET without response body 
- POST uses entity to create resource 
- PUT it replaces current target resource with the payload 
- DELETE it deletes the resource 
- CONNECT , TRACE  -- never used 
- OPTIONS describes the supported communication. 
- PATCH partial modification of resource 

[Error Codes]
Proper codes and correct errors should be sent on call . 
- 1xx continuing processing 
- 2xx Success
- 3xx redirection
- 4xx client error
- 5xx server error

[MAVEN LIFECYCLE]