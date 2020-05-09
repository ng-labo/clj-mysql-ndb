package clj_mysql_ndb;
import com.mysql.clusterj.annotation.Column;
import com.mysql.clusterj.annotation.PersistenceCapable;
import com.mysql.clusterj.annotation.PrimaryKey;
@PersistenceCapable(table="sflow")
public interface Sflow {
    @PrimaryKey     
    long getId();
    void setId(long i); 

    @Column(name = "agent")
    String getAgent();     
    void setAgent(String b);

    @Column(name = "inputport")
    String getInputport();     
    void setInputport(String b);

    @Column(name = "bytes")
    float getBytes();     
    void setBytes(float f);

    @Column(name = "ipprotocol")
    int getIpprotocol();     
    void setIpprotocol(int i);

    @Column(name = "srcip")
    String getSrcip();     
    void setSrcip(String b);

    @Column(name = "dstip")
    String getDstip();     
    void setDstip(String b);

    @Column(name = "ts")
    long getTs();
    void setTs(long ts);
}
