# springcloud-gateway-zookeeper

spring-admin-server  显示springboot-admin的UI界面
spring-admin-server-zookeeper(2)是两个相同的服务  只是端口不同

springcloud-rest-cliet-zookeeper 是一个消费者 走springcould-gateway进行数据访问

另外在使用 springboot2.0.4的时候 会有一个小bug 必须实例化一个 ServerCodecConfigurer 不然就报错 在启动类里面添加 就好了
还有一些是路由的设置 貌似和想的有点不一样 具体的内容在配置文件中

 这里写上gateway里面比较重点的文字这个对于集群很重要

 The LoadBalancerClientFilter looks for a URI in the exchange attribute ServerWebExchangeUtils.GATEWAY_REQUEST_URL_ATTR.
 If the url has a lb scheme (ie lb://myservice), it will use the Spring Cloud LoadBalancerClient to resolve the name
(myservice in the previous example) to an actual host and port and replace the URI in the same attribute.
 The unmodified original url is appended to the list in the ServerWebExchangeUtils.GATEWAY_ORIGINAL_REQUEST_URL_ATTR
 attribute. The filter will also look in the ServerWebExchangeUtils.GATEWAY_SCHEME_PREFIX_ATTR attribute to see
 if it equals lb and then the same rules apply.

大意是说 使用“lb//serviceName"这种形式后 会自己去找这个名字的服务 并且使用 fegin或者ribbion进行负载均衡 

先就这么多吧

