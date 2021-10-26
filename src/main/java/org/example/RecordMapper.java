package org.example;

import org.mapstruct.Mapper;

@Mapper
public interface RecordMapper {

	Record2 mapFrom(Record1 from);
}
