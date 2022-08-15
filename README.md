# 接口

---- 小查询 ----

###### 根据作者姓名，查询出相关作者（同籍贯，同风格，朋友），作者画作

```java
/search/relativeAuthor?authorName=张大千
```



###### 根据画作名称，查询出相关画作（同风格: '山水，人物....'，同类型: '轴/卷'）， 画作作者， [根据印章关联的作者] (暂无)

```java
/search/relativePainting?paintingName=秋山访友
```



###### 根据作者姓名，查询出作者的籍贯，朋友，印章，作者画作，风格，题诗

```java
/search/authorDetails?authorName=张大千
```



###### 根据画作名称，查询出画作的风格，作者，题诗，印章，画作作者

```java
/search/paintingDetails?paintingName=秋山访友
```



---- 二级查询 ----
以下均传入 id

###### 根据风格，查询出相应的作者/画作

```java
/search/styleRelative?id=3001
```



###### 根据题诗，查询到作者  (待开发)   /画作

```java
/search/poemRelative?id=
```




###### 根据出生地，查询出相关的作者

```java
/search/areaRelative?id=2000
```




###### 根据印章，查询相同印章的画作/ 盖印章的人

```java
/search/sealRelative?id=5017
```

###### 查询所有作者信息

```
/search/allAuthor
```



###### 查询10条画作（最好作者不同），画作类型为‘轴’，内容包括图片

```
/search/paintings/10
```



###### 根据作者姓名查询出作者所有信息 （没有peoms 缺数据库关系）

```
/search/author/vo?authorName=张大千
```



###### 根据搜索框内容进行模糊查询

```
/search/author/likely?name=张大千
/search/author/likely?name=秋山访友
```



