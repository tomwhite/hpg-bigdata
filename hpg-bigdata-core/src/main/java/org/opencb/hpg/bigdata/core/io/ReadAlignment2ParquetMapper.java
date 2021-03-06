package org.opencb.hpg.bigdata.core.io;

import java.io.IOException;

import org.apache.avro.generic.GenericRecord;
import org.apache.avro.mapred.AvroKey;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Mapper;

public class ReadAlignment2ParquetMapper extends
Mapper<AvroKey<GenericRecord>, NullWritable, Void, GenericRecord> {

	@Override
	protected void map(AvroKey<GenericRecord> key, NullWritable value,
			Context context) throws IOException, InterruptedException {
		context.write(null, key.datum());
	}
}

