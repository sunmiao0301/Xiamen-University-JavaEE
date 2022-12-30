Lecture4.4-SpringMVC

- 传统的SpringMVC如下图

  但引入RESTful之后，流程会被大大简化。控制器层返回的数据将被包装为JSON格式，通过HTTP Response直接返回到客户端。

![image-20221230145014811](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301450887.png)

在这种情况下，需要通过一系列注解来标识控制器和控制器的方法该处理什么URL，今天大量使用的是RESTful风格的，首先需要通过@RestController来标识该控制器是RESTful风格的API。

![image-20221230145711343](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301457389.png)

![image-20221230145339938](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301453991.png)

---

SpringMVC的注解：

见下面视频-从九分钟开始

https://www.icourse163.org/learn/XMU-1462056168?tid=1468868446#/learn/content?type=detail&id=1252078011&sm=1