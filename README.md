# clj-mysql-ndb

A Clojure library designed to ndbcluster in mysql well.

This demonstration is performed on Ubuntu 20.04 using mysql-cluster-community, version 8.0.20.

## Pre-task


```sh
$ sudo dpkg -i ndbclient_8.0.20-1ubuntu20.04_amd64.deb
$ sudo ln -s /usr/lib/x86_64-linux-gnu/libndbclient.so.6.1.0 libndbclient.so
$ sudo ldconfig
$ wget https://kompics.sics.se/maven/repository/com/mysql/ndb/clusterj/7.5.8/clusterj-7.5.8.jar
$ mvn deploy:deploy-file -Dfile=clusterj-7.5.8.jar -DartifactId=clusterj -Dversion=7.5.8 -DgroupId=com.mysql.ndb -Dpackage=jar -Durl=file:/home/nao/.m2/repository
```

- It would be available one more mysqld for mysql cluster.
- A table with ndb engine  would be created. 

```mysql
```

## Usage
```clojure
(run)
```

