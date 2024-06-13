[SPRING CORE CONCEPTS]


[Annotations]

        @SpringBootApplication
        @Controller
        @RestController
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
