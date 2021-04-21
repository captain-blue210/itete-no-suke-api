/*
 * This file is generated by jOOQ.
 */
package app.itetenosuke.infrastructure.jooq.generated.tables;


import app.itetenosuke.infrastructure.jooq.generated.Keys;
import app.itetenosuke.infrastructure.jooq.generated.Sukeroku;
import app.itetenosuke.infrastructure.jooq.generated.tables.records.MedicineRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 薬マスタ
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MEDICINE_TABLE extends TableImpl<MedicineRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sukeroku.medicine</code>
     */
    public static final MEDICINE_TABLE MEDICINE = new MEDICINE_TABLE();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MedicineRecord> getRecordType() {
        return MedicineRecord.class;
    }

    /**
     * The column <code>sukeroku.medicine.medicine_id</code>. 薬ID
     */
    public final TableField<MedicineRecord, Long> MEDICINE_ID = createField(DSL.name("medicine_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "薬ID");

    /**
     * The column <code>sukeroku.medicine.medicine_name</code>. medicine_name
     */
    public final TableField<MedicineRecord, String> MEDICINE_NAME = createField(DSL.name("medicine_name"), SQLDataType.VARCHAR(100).nullable(false).defaultValue(DSL.field("''::character varying", SQLDataType.VARCHAR)), this, "medicine_name");

    /**
     * The column <code>sukeroku.medicine.medicine_memo</code>. 薬メモ
     */
    public final TableField<MedicineRecord, String> MEDICINE_MEMO = createField(DSL.name("medicine_memo"), SQLDataType.VARCHAR(200).defaultValue(DSL.field("''::character varying", SQLDataType.VARCHAR)), this, "薬メモ");

    /**
     * The column <code>sukeroku.medicine.status</code>. 薬ステータス : 使用中ならALIVE, 削除済みならDELETED
     */
    public final TableField<MedicineRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(7).nullable(false).defaultValue(DSL.field("'ALIVE'::character varying", SQLDataType.VARCHAR)), this, "薬ステータス : 使用中ならALIVE, 削除済みならDELETED");

    /**
     * The column <code>sukeroku.medicine.created_at</code>. 登録日時
     */
    public final TableField<MedicineRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "登録日時");

    /**
     * The column <code>sukeroku.medicine.updated_at</code>. 更新日時
     */
    public final TableField<MedicineRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "更新日時");

    private MEDICINE_TABLE(Name alias, Table<MedicineRecord> aliased) {
        this(alias, aliased, null);
    }

    private MEDICINE_TABLE(Name alias, Table<MedicineRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("薬マスタ"), TableOptions.table());
    }

    /**
     * Create an aliased <code>sukeroku.medicine</code> table reference
     */
    public MEDICINE_TABLE(String alias) {
        this(DSL.name(alias), MEDICINE);
    }

    /**
     * Create an aliased <code>sukeroku.medicine</code> table reference
     */
    public MEDICINE_TABLE(Name alias) {
        this(alias, MEDICINE);
    }

    /**
     * Create a <code>sukeroku.medicine</code> table reference
     */
    public MEDICINE_TABLE() {
        this(DSL.name("medicine"), null);
    }

    public <O extends Record> MEDICINE_TABLE(Table<O> child, ForeignKey<O, MedicineRecord> key) {
        super(child, key, MEDICINE);
    }

    @Override
    public Schema getSchema() {
        return Sukeroku.SUKEROKU;
    }

    @Override
    public Identity<MedicineRecord, Long> getIdentity() {
        return (Identity<MedicineRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<MedicineRecord> getPrimaryKey() {
        return Keys.MEDICINE_PKEY;
    }

    @Override
    public List<UniqueKey<MedicineRecord>> getKeys() {
        return Arrays.<UniqueKey<MedicineRecord>>asList(Keys.MEDICINE_PKEY);
    }

    @Override
    public MEDICINE_TABLE as(String alias) {
        return new MEDICINE_TABLE(DSL.name(alias), this);
    }

    @Override
    public MEDICINE_TABLE as(Name alias) {
        return new MEDICINE_TABLE(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MEDICINE_TABLE rename(String name) {
        return new MEDICINE_TABLE(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MEDICINE_TABLE rename(Name name) {
        return new MEDICINE_TABLE(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
