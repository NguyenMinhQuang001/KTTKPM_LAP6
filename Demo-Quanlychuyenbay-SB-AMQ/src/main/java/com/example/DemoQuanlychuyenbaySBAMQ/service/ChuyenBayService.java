package com.example.DemoQuanlychuyenbaySBAMQ.service;

import java.util.List;

import com.example.DemoQuanlychuyenbaySBAMQ.entity.ChuyenBay;

public interface ChuyenBayService {
	ChuyenBay saveChuyenBay(ChuyenBay chuyenBays);
	List<ChuyenBay> getAllChuyenBays();
	List<ChuyenBay> findByGaDen(String gaDen);
	List<ChuyenBay> findChuyenBaysDoDaiNH10000LH8000();
}
