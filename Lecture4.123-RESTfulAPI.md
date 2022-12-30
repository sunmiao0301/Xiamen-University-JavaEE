Lecture4.123-RESTfulAPI

RESTful风格是面向资源，依靠HTTP的五种操作，用JSON来表述的。

- 面向资源，通过URL来描述资源：

![image-20221230140929085](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301409241.png)

更具体的，其意义解释看描述：

![image-20221230141649609](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301416686.png)

在RestFul中选择JSON作为数据传输的语言：

- 便于机器解析，易于人类阅读
- 更简洁，有利于网络传输
- ![image-20221230142210948](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301422070.png)

HTTP的五种操作：（PATCH原本是用来修改某个对象的特定属性，但是现在用PUT就完成了这一操作：原来PUT是修改对象的全部属性，但是今天大家会默认，当我们使用PUT操作的时候，如果这个对象是空的，就认为该属性不需要修改，由此，PUT就成功取代了PATCH的功能）

![image-20221230142253069](C:\Users\sunmiao\AppData\Roaming\Typora\typora-user-images\image-20221230142253069.png)

五种操作的返回值，首先会利用HTTP的状态码

![image-20221230142747953](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301427997.png)

五种操作共用的状态码

![image-20221230143049080](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301430120.png)

看看五种操作的例子：

- GET以及其操作的返回值

![image-20221230143141309](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301431362.png)

![image-20221230143523739](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301435790.png)

- POST以及其操作的返回值 —— 新建资源，注意登陆操作也是POST完成

![image-20221230143602001](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301436040.png)

![image-20221230143802514](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301438574.png)

- PUT以及其操作的返回值

![image-20221230143919260](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301439299.png)

![image-20221230143930356](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301439407.png)

- DELETE以及其操作的返回值

![](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301443654.png)

![image-20221230144502299](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301445346.png)

