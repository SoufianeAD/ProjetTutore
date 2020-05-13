package com.esisa.back.office.repositories;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.esisa.back.office.entities.File;

public interface FileRepository extends MongoRepository<File, ObjectId> {
	public List<File> findByDocumentId(ObjectId id);
}
