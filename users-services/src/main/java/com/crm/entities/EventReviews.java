package com.crm.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "eventuserreview")
public class EventReviews {
	@Id
	private String id;
}
