Lecture3.4-SpringBoot

（建议复习）

https://www.bilibili.com/video/BV1eW4y1e7Gf?p=4

SpringBoot的目的：

- 简化配置
- 将依赖成组管理（一个Starter，大量jar包被引入）

- 巧合？

  Spring，打包好的项目是War包，需要在服务器中再安装Tomcat，然后才能运行
  但是SpringBoot打包好的项目是Jar包，内嵌了Tomcat，与Docker浑然天成。

- 提供监控，用第三方工具（AdminUI，Nacos）对返回的复杂Json文件进行阅读

![image-20221229171012267](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291710342.png)

- Starter  

  将大量的jar包，事先合并，分组管理，用的时候直接引入Starter而不是大量的依赖，避免出现不熟练导致的jar包冲突问题，如下：

![](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291714305.png)

除了这些，你还可以自己修改一些jar包配置，会覆盖你原先配置的不一样之处，一般写在application.properties/application.yaml中。

又或者是写在命令行参数等中，如下：

![](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291717104.png)