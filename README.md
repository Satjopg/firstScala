# firstScala
初めてのScala(備忘録)

# Usage
* Scala:2.11.11
* sbt:0.13.15
* El Capitan 10.11.6

# Scalaのインストール
[公式のページ](http://www.scala-lang.org/download/)からダウンロードできるけど、コマンドでやったほうが楽ですね    

```shell
$ mkdir ./tmp ; cd ./tmp
$ curl -O http://downloads.typesafe.com/scala/2.11.11/scala-2.11.11.tgz
$ tar -xvzf scala-2.11.11.tgz
$ mv ./scala-2.11.11 ./scala
$ mv ./scala /usr/local/src/
$ export PATH=$PATH:/usr/local/src/scala/bin
$ export SCALA_HOME=/usr/local/src/scala
```

公式ページだと、2.12.* がトップに出てくるけど、atomでensimとか使いたい時は11系にしとくこと(2017.05現在)

パス通したら、whichなどで確認する。

# sbtのインストール
Macなら、brewを使うと楽

```shell
$ brew install sbt
```

# sbtの使い方
sbtはコンパイルと実行をしてくれる  
前準備として、プロジェクトフォルダ直下に **Build.sbt**　を作成する。

```Build.sbt:PlainText
name := "Project Name"
version := "1.0"
scalaVersion := "2.11.1"
```

コンパイル

```
sbt compile
```

実行

```
sbt run
```

# atomにensimを入れて使う
Scalaの矯正をしてくれるパッケージがこれくらいしかなかったので．．．  
