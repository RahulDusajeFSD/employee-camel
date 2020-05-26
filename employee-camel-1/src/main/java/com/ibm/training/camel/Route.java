package com.ibm.training.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.BindyDataFormat;
import org.apache.camel.model.dataformat.BindyType;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Route extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		csvToJson();
	}
		public void csvToJson() {

			BindyDataFormat csv = new BindyDataFormat();
			csv.setClassType(EmpDetails.class);
			csv.setType(BindyType.Csv);

			from("file:CsvFile?noop=true")

					.unmarshal(csv).marshal().json(JsonLibrary.Jackson) // using Jackson library

					.to("file://destination?FileName=rahul.json");

		
		
	}

}
