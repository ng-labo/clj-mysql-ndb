(defproject clj-mysql-ndb "0.1.0-SNAPSHOT"
  :description "mysql-cluster monitor"
  :repositories {"local" "file:/home/nao/.m2/repository"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.mysql.ndb/clusterj "7.5.8"]]
                 ;[mysql/mysql-connector-java "8.0.20"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :java-source-paths ["src/java"]
  ;:javac-options     ["-target" "1.8" "-source" "1.8"]
  :repl-options {:init-ns clj-mysql-ndb.core})
