package models;

import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by wutianxiong on 2017/5/26.
 */
@Entity
@Table(name="partition_data")
public class PartitionDataSet extends Model{

    @Column
    public Long inputDataSize;
    @Column
    public int partitionNums;
    @Column
    public Long shuffleDataSize;
    @Column
    public Long stageDuration;
}

