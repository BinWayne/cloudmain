#### Practise of Nacos and Loadbalancer

##### project tree
```aidl
├── ReadMe.md
├── balancer-a
│   ├── pom.xml
│   ├── src
│   └── target
├── nacos-a         **please ignore**
│   ├── pom.xml
│   ├── src
│   └── target
├── pom.xml
└── server-a
    ├── pom.xml
    ├── src
    └── target

```

##### how to quickly start

1. first you should download the nacos
https://github.com/alibaba/nacos/releases

2. navigate to ${nacos}/bin `./startup.sh` then you could checkout it 
at http://localhost:8848  the user/pwd  -> nacos/nacos

3. then I would advise you that you start the server-a project with port 8081 8082 8083 three instance
and you could check it on nacos website 

4. checkout the ServerConfiguration.java under the balancer-a , you could update the port as you startup the server-a

well
最后实在无法通过 openfeign 配合 hystrix实现服务熔断
如果有任何高手 请给指点
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty({"feign.circuitbreaker.enabled"})
protected static class CircuitBreakerPresentFeignTargeterConfiguration {
protected CircuitBreakerPresentFeignTargeterConfiguration() { /* compiled code */ }

我在源码找到 的是
feign.circuitbreaker.enabled = true
我已经配置 但是还是没效果