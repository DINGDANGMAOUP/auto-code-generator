package com.kuroneko.auto.code.generator.model;

import com.baomidou.mybatisplus.annotation.TableField;

/**
 * INSERT INTO `` (`Field`, `Type`, `Collation`, `Null`, `Key`, `Default`, `Extra`, `Privileges`,
 * `Comment`) VALUES ('id', 'bigint', NULL, 'NO', 'PRI', NULL, 'auto_increment',
 * 'select,insert,update,references', '编号');
 *
 * @author dzhao1
 */
public class MysqlTableInfo {

  /** 字段名 */
  @TableField private String Field;

  private String Type;
  private String Collation;
  private String Null;
  private String Key;
  private String Default;
  private String Extra;
  private String Privileges;
  private String Comment;
}
