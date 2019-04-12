## 添加 maven plugin
spring-boot-maven-plugin

## 运行 maven 打包
```
mvn -U clean package spring-boot:repackage
打包完产生几个包，有个后缀是 exec 的，包括所有的依赖项目
xxx-exec.jar
```

## 运行项目
```
java -jar xxx-exec.jar
```

## java 启动完成，直接访问


## 放进 Linux 中打包，使用 maven 的docker镜像
```
systemctl start docker
docker pull maven

// 把项目 copy 到 linux 的任何一个目录下
// 如果有 parent 项目，需要先 install parent 项目，否则 package 子项目时会提示找不到 parent
// cd 到需要进行 maven 的 parent 项目目录下, 不要带 clean ，否则有 权限问题
docker run -it --rm -v "$PWD":/usr/src/maven -v "$HOME/.m2":/root/.m2 -v "$PWD/target:/usr/src/maven/target" -w /usr/src/maven maven mvn -U clean install
// cd 到子项目
docker run -it --rm -v "$PWD":/usr/src/maven -v "$HOME/.m2":/root/.m2 -v "$PWD/target:/usr/src/maven/target" -w /usr/src/maven maven mvn package spring-boot:repackage

// 然后就可以查看子项目的 target 目录

```
