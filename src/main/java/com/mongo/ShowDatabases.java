package com.mongo;

import java.util.List;

import com.mongodb.MongoClient;

public class ShowDatabases {

	public static void main(String[] args) {
		
		MongoClient mongo = new MongoClient("23.96.61.234",27017);
		List<String> db = mongo.getDatabaseNames();
		db.forEach((dbName)->System.out.println(dbName));

	}

}
