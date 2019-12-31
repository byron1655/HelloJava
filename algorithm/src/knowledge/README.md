# 算法-知识

* 给定一个字符串，根据字符出现频率排序 [code](A1.java)
* 给定一个数值型的数组，根据数字出现的频率排序 [code](A2.java)

## 给定一个字符串，根据字符出现频率排序

```
题目描述：
给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
示例 1:
输入:
"tree"
输出:
"eert"
解释:
'e'出现两次，'r'和't'都只出现一次。
因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
示例 2:
输入:
"cccaaa"
输出:
"cccaaa"
解释:
'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
注意"cacaca"是不正确的，因为相同的字母必须放在一起。
示例 3:
输入:
"Aabb"
输出:
"bbAa"
解释:
此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
注意'A'和'a'被认为是两种不同的字符。
```
 
### 解题思路

用一个map来存每个字符出现的次数（键为字符，值为出现的次数），再将map中的entry按值来从大到小排序，然后再连接起来（根据map的值对应的key进行拼接）。
Map没有按值排序的方法，java有 `Comparator` 比较器接口，但要求的参数是 `list`，我们可以通过Arraylist构造函数把map.entrySet()转化为list，就可以用比较器了。

`Comparator` 比较器接口：
我们若需要控制某个类的次序，而该类本身不支持排序(即没有实现Comparable接口)；我们可以建立一个“比较器”来进行排序。这个“比较器”只需要实现Comparator接口即可。

```java
Collections.sort(list, new PriceComparator())
```
 
参数一：需要排序的list
参数二：比较器，实现Comparator接口的类，返回一个int型的值，就相当于一个标志，告诉sort方法按什么顺序来对list进行排序。
`Comparator` 是个接口，可重写compare()及equals()这两个方法,用于比较功能；如果是null的话，就是使用元素的默认顺序，如a,b,c,d,e,f,g，就是a,b,c,d,e,f,g这样，当然数字也是这样的。
 
compare（a,b）方法:根据第一个参数小于、等于或大于第二个参数分别返回负整数、零或正整数。
equals（obj）方法：仅当指定的对象也是一个 Comparator，并且强行实施与此 `Comparator` 相同的排序时才返回 true。


