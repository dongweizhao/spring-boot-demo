# spring-boot-demo
### spring-boot-demo-annotation
1.  基于注解与mybatis整合
2.  支持druid数据源
3.  支持热更新
4.  支持已war包形式,独立部署,需要放开scope注释
		
	```
 		<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <scope>provided</scope>
        </dependency>
	```