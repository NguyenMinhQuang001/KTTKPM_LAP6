package com.example.DemoQuanlychuyenbaySBAMQ.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DemoQuanlychuyenbaySBAMQ.entity.ChuyenBay;
import com.example.DemoQuanlychuyenbaySBAMQ.repository.ChuyenBayRepository;
import com.example.DemoQuanlychuyenbaySBAMQ.service.ChuyenBayService;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;

	public ChuyenBayServiceImpl(ChuyenBayRepository chuyenBayRepository) {
		super();
		this.chuyenBayRepository = chuyenBayRepository;
	}

	@Override
	public ChuyenBay saveChuyenBay(ChuyenBay chuyenBays) {
		return chuyenBayRepository.save(chuyenBays);
	}

	@Override
	public List<ChuyenBay> getAllChuyenBays() {
		return chuyenBayRepository.findAll();
	}

	@Override
	
	public List<ChuyenBay> findByGaDen(String gaDen) {
		return chuyenBayRepository.findByGaDen(gaDen);
	}

	@Override
	public List<ChuyenBay> findChuyenBaysDoDaiNH10000LH8000() {
		return chuyenBayRepository.findChuyenBaysDoDaiNH10000LH8000();
	}
	

}
