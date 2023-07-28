package com.wendy.dslist.controller;

import com.wendy.dslist.dto.GameListDTO;
import com.wendy.dslist.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/lists")
public class GameListController {
	@Autowired
	private GameListService gameListService;

	@GetMapping
	public ResponseEntity<List<GameListDTO>> findAll() {
		return ResponseEntity.ok(gameListService.findAll());
	}
}
