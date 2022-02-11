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
