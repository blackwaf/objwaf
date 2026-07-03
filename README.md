# Java 面向对象练习项目：校园角色管理系统

## 1. 项目目标

本项目面向 Java 新手小白，通过控制台输入输出完成一个简单的校园角色管理系统。

你会练习图片中的 Java 面向对象知识点：

- Java 继承
- Java Override / Overload
- Java 多态
- Java 抽象类
- Java 封装
- Java 接口
- Java 枚举
- Java 包 package
- Java 反射

项目不依赖数据库，不依赖 Web 框架，只使用 Java 基础语法和控制台交互。

## 2. 项目场景

系统中有三类校园人员：学生 Student、老师 Teacher、管理员 Admin。

他们都有姓名、年龄、角色类型，也都有自己的工作行为。

## 3. 当前半成品代码说明

当前代码已经搭好了基础结构，但故意留下了一些 TODO，方便新手继续完善。

建议按顺序完成：

1. 先运行 `Main.java`，熟悉控制台菜单。
2. 阅读 `Person.java`，理解抽象类和封装。
3. 完善 `Student.java`、`Teacher.java`、`Admin.java` 中的 TODO。
4. 完善 `CampusService.java` 中的 TODO。
5. 完善 `ReflectionUtil.java`，练习反射。
6. 自己新增更多功能，比如删除人员、按姓名查找人员。

## 4. 项目目录

```text
src/
└── com/practice/campus/
    ├── app/Main.java
    ├── model/Person.java
    ├── model/Student.java
    ├── model/Teacher.java
    ├── model/Admin.java
    ├── service/Actionable.java
    ├── service/Manageable.java
    ├── service/CampusService.java
    ├── enums/RoleType.java
    └── util/ReflectionUtil.java
```

## 5. 控制台菜单

```text
===== 校园角色管理系统 =====
1. 添加学生
2. 添加老师
3. 添加管理员
4. 查看所有人员
5. 执行所有人员工作
6. 查看角色类型
7. 使用反射查看类信息
8. 按姓名查找人员
0. 退出系统
```

## 6. 知识点对应关系

| 知识点 | 项目中的体现 |
| --- | --- |
| 继承 | `Student`、`Teacher`、`Admin` 继承 `Person` |
| Override | 子类重写 `doWork()`、`introduce()` |
| Overload | 构造方法重载、`setInfo()` 方法重载 |
| 多态 | `List<Person>` 同时保存学生、老师、管理员 |
| 抽象类 | `Person` 是抽象类，不能直接 new |
| 封装 | 属性使用 `private`，通过 getter/setter 访问 |
| 接口 | `Actionable`、`Manageable` 表示不同能力 |
| 枚举 | `RoleType` 限制角色类型 |
| 包 package | 按 app、model、service、enums、util 分包 |
| 反射 | 输入完整类名，查看类的属性、方法、构造方法 |

## 7. 编译和运行

在 `objwaf` 目录下执行：

```bash
javac -encoding UTF-8 -d out $(find src -name "*.java")
java -cp out com.practice.campus.app.Main
```

如果使用 IDE，直接打开项目并运行 `src/com/practice/campus/app/Main.java`。

## 8. 新手练习任务

1. 完善学生类：补充自我介绍、行为输出、重载方法。
2. 完善老师类：补充老师自我介绍、备课/答疑行为。
3. 完善管理员类：补充管理行为。
4. 完善 `CampusService.findByName`。
5. 完善 `ReflectionUtil`，输出方法参数类型和返回值类型。
6. 扩展删除、修改、文件保存等功能。

## 9. 学习验收问题

1. 为什么 `Student` 可以继承 `Person`？
2. 为什么 `Person person = new Student()` 是多态？
3. Override 和 Overload 有什么区别？
4. 抽象类为什么不能直接创建对象？
5. 接口和抽象类分别适合什么场景？
6. 枚举比字符串角色类型更安全在哪里？
7. package 的作用是什么？
8. 反射为什么可以在运行时查看类信息？
