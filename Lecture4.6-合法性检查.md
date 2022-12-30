Lecture4.67-合法性检查

控制器的另外一个重要作用：合法性检查

虽然前端会进行合法性检查，但是出于安全角度考虑，后端也应该进行合法性检查。

一般会借助javax.validation的注解进行合法性检查，如果输入的参数不符合要求的话，控制器会抛出MethodArgumentNotValidException异常。

![image-20221230163958507](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301639607.png)

具体实例：https://www.icourse163.org/learn/XMU-1462056168?tid=1468868446#/learn/content?type=detail&id=1252081007&cid=1281555020&replay=true

![image-20221230164202279](C:\Users\sunmiao\AppData\Roaming\Typora\typora-user-images\image-20221230164202279.png)



![image-20221230164224929](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301642960.png)



![image-20221230164239898](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212301642933.png)