# yifeng-shop  一丰商城 Dubbo版  
此项目为本人空闲时间为了更好的熟悉Spring Boot + Dubbo + Zookeeper分布式微服务架构解决方案编写的实战项目     
众所周知微服务要解决的最大问题就是网络不可靠的问题，而服务之间的通行可以用Dubbo 这款轻量级的开源 Java RPC 分布式服务框架:Dubbo提供了三大核心能力：面向接口的远程方法调用，智能容错和负载均衡，以及服务自动注册和发现。 使各个层之间解耦合（或者最大限度地松耦合）。所以本项目所有服务都抽象出相应的 API接口/服务提供者/服务消费者 "三位一体"的服务编写方式 ，并使用Zookeeper分布式协调技术来实现分布式锁来解决服务中的单点故障问题    
 
## 目前暂时只完成项目基本架构。  
目前已完成的功能有 Dubbo的远程方法调用/智能容错/负载均衡/服务自动注册和发现/高速序列化/服务熔断/熔断器仪表盘    
通过Zookeeper集群的方式实现了分布式锁来做到分布式协调 避免服务中的单点故障问题   
FastDFS文件上传下载，跨域问题，缓存集群，分页，熔断跳转页面,CDN,持续集成 持续交付 等功能  来做到高可用,高性能，高并发    

## 开发环境
操作系统：Windows 7 Enterprise  
开发工具：Intellij IDEA  
数据库：MySQL 5.7.22  
Java SDK：Oracle JDK 1.8.152  
## 部署环境
操作系统：Linux Ubuntu Server 16.04 X64   
虚拟化技术：VMware + Docker   
## 项目管理工具
项目构建：Maven + Nexus    （依赖管理平台）  
代码管理：Git + GitLab     （代码管理平台）  
镜像管理：Docker +Registry （镜像管理平台）  
## 后台主要技术栈
核心框架：Spring Boot + Dubbo + Zookeeper  
视图框架：Spring MVC   
页面引擎：Thymeleaf  
ORM 框架：tk.mybatis 简化 MyBatis 开发  
数据库连接池：Alibaba Druid  
数据库缓存：Redis Sentinel   (哨兵模式)  
接口文档引擎：Swagger2 RESTful 风格 API 文档生成  
全文检索引擎：solr  
高速序列化: Dubbo + Kryo  
服务熔断+熔断器仪表盘: Dubbo + Hystrix  
分布式协调系统：Zookeeper集群 
分布式服务监控：Dubbo Admin 管理控制台  
分布式文件系统：Alibaba FastDFS  
分布式日志系统：ELK（ElasticSearch + Logstash + Kibana）  
反向代理负载均衡+跨域问题：Nginx  
## 前端主要技术栈 
前端框架：Bootstrap + jQuery +javascript  
前端模板：AdminLTE  
## 自动化运维
持续集成：GitLab + GitLab Runner(持续集成)  
持续交付：Jenkins               (运维) 

### 代码实际完成时间为2019年4月，代码仅可以作为学习用途使用，不可用于任何商业行为   
#### 下载源码后还需配置相关的技术栈的环境 在相关配置文件中替换成自己的地址即可正常使用  
