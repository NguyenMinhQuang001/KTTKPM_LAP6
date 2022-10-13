package com.example.DemoQuanlychuyenbaySBAMQ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DemoQuanlychuyenbaySBAMQ.entity.ChuyenBay;
import com.example.DemoQuanlychuyenbaySBAMQ.service.ChuyenBayService;

//import com.example.DemoQuanlychuyenbaySBAMQ.entity.ChuyenBay;
//import com.example.DemoQuanlychuyenbaySBAMQ.service.ChuyenBayService;

@RestController
@RequestMapping("/api/chuyenbays")
public class ChuyenBayController {
	@Autowired
	private ChuyenBayService chuyenBayService;
//
//	public ChuyenBayController(ChuyenBayService chuyenBayService) {
//		super();
//		this.chuyenBayService = chuyenBayService;
//	}
//
//	// Build create Chuyenbay REST API
//	@PostMapping()
//	public ResponseEntity<ChuyenBay> saveChuyenBay(@RequestBody ChuyenBay chuyenBay) {
//		return new ResponseEntity<ChuyenBay>(chuyenBayService.saveChuyenBay(chuyenBay), HttpStatus.CREATED);
//	}

	@RequestMapping("")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}

//1.	Cho biết các chuyến bay đi Đà Lạt (DAD)
	@GetMapping("/didalat")
	public List<ChuyenBay> getChuyenBayDaLat() {
		return chuyenBayService.findByGaDen("DAD");
	}

// 4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.
	@GetMapping("/cau4")
	public List<ChuyenBay> getChuyenBayNH10000LH8000() {
		return chuyenBayService.findChuyenBaysDoDaiNH10000LH8000();
	}

}
