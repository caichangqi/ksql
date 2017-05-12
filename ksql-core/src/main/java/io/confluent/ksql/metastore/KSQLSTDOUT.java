/**
 * Copyright 2017 Confluent Inc.
 **/

package io.confluent.ksql.metastore;

import org.apache.kafka.connect.data.Field;
import org.apache.kafka.connect.data.Schema;

public class KSQLSTDOUT extends StructuredDataSource {

  public static final String KSQL_STDOUT_NAME = "KSQL_STDOUT_NAME";

  public KSQLSTDOUT(final String datasourceName, final Schema schema, final Field keyField,
                    final DataSourceType dataSourceType) {
    super(datasourceName, schema, keyField, dataSourceType, null);
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public Schema getSchema() {
    return null;
  }

  @Override
  public Field getKeyField() {
    return null;
  }

  @Override
  public DataSourceType getDataSourceType() {
    return null;
  }
}