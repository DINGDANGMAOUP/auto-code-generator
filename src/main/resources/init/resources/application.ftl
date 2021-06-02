spring:
  application:
    name: system-${projectName}
  profiles:
    active: @environment@
server:
  port: 8080
mybatis-plus:
  type-aliases-package: com.yinlu.system.generator.model
  mapper-locations: classpath:mapper/*.xml
  global-config:
    banner: false
swagger:
  contact:
    name: "${author}"
    email: "dingdangmaoup@vip.qq.com"
    url: "https://kuroneko.fun"
  enabled: true
  base-package: com.yinlu.system.generator
  version: 1.0.0
  title: ${projectName}



