/*
 * This file is generated by jOOQ.
 */
package app.itetenosuke.infrastructure.jooq.generated.tables.records;


import app.itetenosuke.infrastructure.jooq.generated.tables.PAIN_RECORDS_TABLE;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PainRecordsRecord extends UpdatableRecordImpl<PainRecordsRecord> implements Record5<Long, Integer, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sukeroku.pain_records.painrecord_id</code>. 痛み記録ID
     */
    public void setPainrecordId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>sukeroku.pain_records.painrecord_id</code>. 痛み記録ID
     */
    public Long getPainrecordId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>sukeroku.pain_records.pain_level</code>. 痛みレベル
     */
    public void setPainLevel(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>sukeroku.pain_records.pain_level</code>. 痛みレベル
     */
    public Integer getPainLevel() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>sukeroku.pain_records.memo</code>. メモ
     */
    public void setMemo(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sukeroku.pain_records.memo</code>. メモ
     */
    public String getMemo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sukeroku.pain_records.created_at</code>. 登録日時
     */
    public void setCreatedAt(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>sukeroku.pain_records.created_at</code>. 登録日時
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>sukeroku.pain_records.updated_at</code>. 更新日時
     */
    public void setUpdatedAt(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>sukeroku.pain_records.updated_at</code>. 更新日時
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Integer, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, Integer, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PAIN_RECORDS_TABLE.PAIN_RECORDS.PAINRECORD_ID;
    }

    @Override
    public Field<Integer> field2() {
        return PAIN_RECORDS_TABLE.PAIN_RECORDS.PAIN_LEVEL;
    }

    @Override
    public Field<String> field3() {
        return PAIN_RECORDS_TABLE.PAIN_RECORDS.MEMO;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return PAIN_RECORDS_TABLE.PAIN_RECORDS.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return PAIN_RECORDS_TABLE.PAIN_RECORDS.UPDATED_AT;
    }

    @Override
    public Long component1() {
        return getPainrecordId();
    }

    @Override
    public Integer component2() {
        return getPainLevel();
    }

    @Override
    public String component3() {
        return getMemo();
    }

    @Override
    public LocalDateTime component4() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component5() {
        return getUpdatedAt();
    }

    @Override
    public Long value1() {
        return getPainrecordId();
    }

    @Override
    public Integer value2() {
        return getPainLevel();
    }

    @Override
    public String value3() {
        return getMemo();
    }

    @Override
    public LocalDateTime value4() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value5() {
        return getUpdatedAt();
    }

    @Override
    public PainRecordsRecord value1(Long value) {
        setPainrecordId(value);
        return this;
    }

    @Override
    public PainRecordsRecord value2(Integer value) {
        setPainLevel(value);
        return this;
    }

    @Override
    public PainRecordsRecord value3(String value) {
        setMemo(value);
        return this;
    }

    @Override
    public PainRecordsRecord value4(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public PainRecordsRecord value5(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public PainRecordsRecord values(Long value1, Integer value2, String value3, LocalDateTime value4, LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PainRecordsRecord
     */
    public PainRecordsRecord() {
        super(PAIN_RECORDS_TABLE.PAIN_RECORDS);
    }

    /**
     * Create a detached, initialised PainRecordsRecord
     */
    public PainRecordsRecord(Long painrecordId, Integer painLevel, String memo, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(PAIN_RECORDS_TABLE.PAIN_RECORDS);

        setPainrecordId(painrecordId);
        setPainLevel(painLevel);
        setMemo(memo);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
    }
}
