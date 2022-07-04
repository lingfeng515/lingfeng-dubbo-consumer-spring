# lingfeng-dubbo-consumer-spring-
dubbo消费者服务搭建--xml配置方式
1、先启动dubbo提供者服务：lingfeng-dubbo-provider-spring，消费者配置文件中的zookeeper地址跟提供者的地址保持一致
2、启动UserServiceApp中的main方法调用dubbo接口，能正常调用接口并返回期望值即调用成功
