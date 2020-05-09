(ns clj-mysql-ndb.core
  (:import [com.mysql.clusterj ClusterJHelper])
  (:import [clj_mysql_ndb Sflow])
)

(defn insert-example []
  (let [props (java.util.Properties.)]
    (.put props "com.mysql.clusterj.connectstring" "192.168.0.100:1186")
    (.put props "com.mysql.clusterj.database" "sflow")
    (let [session (.getSession (ClusterJHelper/getSessionFactory props))]
      (let [sflow-data (.newInstance session clj_mysql_ndb.Sflow)]
        (.setAgent sflow-data "router")
        (.setInputport sflow-data "ifalias")
        (.setBytes sflow-data 12345679)
        (.setIpprotocol sflow-data 6)
        (.setSrcip sflow-data "x::1")
        (.setDstip sflow-data "y::1")
        (.setTs sflow-data 0)
        (.makePersistent session sflow-data)
      ))))
