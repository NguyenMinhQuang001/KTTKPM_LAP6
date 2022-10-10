package com.example.DemoQuanlychuyenbaySBAMQ.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.DemoQuanlychuyenbaySBAMQ.entity.ChuyenBay;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
	public List<ChuyenBay> findByGaDen(String gaDen);
	
	@Query(value = " select * from chuyenbay where do_dai < 10000 and do_dai >8000", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaysDoDaiNH10000LH8000();
}
