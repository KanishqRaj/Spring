package com.example.Project_1.Repositary;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.Project_1.database.Donorinfo;
@Repository
public interface bloodrepo extends JpaRepository< Donorinfo , Integer> {
	
	@Query(value="select * from dinfo", nativeQuery=true)
	public List<Donorinfo> getAllData();

	@Query(value="select * from dinfo where id=?1", nativeQuery=true)
	public List<Donorinfo> byDonorName(@Param("donorid") int did);
	
	@Query(value="select * from dinfo where donorid between :start and :end",nativeQuery=true)
	public List<Donorinfo> startEnd (@Param("start") int start , @Param("end") int end);
}
