Lecture2.4-Maven

- 用IDEA和Eclipse写代码不是一样的，很多内容是写在工程文件中的，所以如果寻求兼容性，我们就需要一个中立的，与IDE无关的项目管理工具，这就是Maven
- 对于jar包的管理很优秀

![image-20221228173658820](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281738061.png)

需要注意，这个.m2/repository不在我们项目工程目录下，而是在你机器的用户目录下，如下：

![image-20221228173820959](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281738004.png)

这是所有的jar包所在的位置，其中存储的是从私有仓库或者中央仓库拷贝而来的jar包，然后当你在编译打包项目的时候，会再从这个.m2/repository拷贝到你的工程项目下。

----

在Maven中，通过一个xml文件 —— pom来搞定所有的配置，其描述了所有需要的事情，其中包括你所需要的jar包。

初学者使用Maven时，很容易遇到jar包不对的问题，那么最简单粗暴的方式就是删除.m2文件夹，让其重新下载。

---

![image-20221228174358679](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281743794.png)

![image-20221228174500319](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281745389.png)

package：将我们编译好的代码打包成jar包，在执行package之前是默认执行其之前的phase的，比如compile，test等。

![image-20221228174512454](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281745562.png)

![image-20221228174701593](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281747663.png)

---

Maven插件是与各个phase相互绑定的。

![image-20221228174749897](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281747967.png)

可以将上次构建的所有文件全部删除

![image-20221228174807517](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281748573.png)

![image-20221228174853029](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281748115.png)

![image-20221228174907490](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281749544.png)

---

POM支持父子关系，POM的意义是定义一个工程中所有的依赖，以及怎么去构建打包等。

但一个工程可能包括多个模块，不同的模块具有不同的依赖等，那么POM就支持将共性的东西定义在父POM中，个性化的东西定义在子POM中间

![image-20221228175218324](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281752566.png)

---

Maven和IDEA运行项目对比：（14分钟开始）

https://www.bilibili.com/video/BV1t24y1o7Vi?p=4&vd_source=ab70a9e722c9b39daeacc07aeafe96d2