package com.wendy.dslist.controller;

import com.wendy.dslist.dto.GameListDTO;
import com.wendy.dslist.dto.GameMinDTO;
import com.wendy.dslist.service.GameListService;
import com.wendy.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/lists")
public class GameListController {
	@Autowired
	private GameListService gameListService;

	@Autowired
	private GameService gameService;

	@GetMapping
	public ResponseEntity<List<GameListDTO>> findAll() {
		return ResponseEntity.ok(gameListService.findAll());
	}

	@GetMapping("/{listId}/games")
	public ResponseEntity<List<GameMinDTO>> findByList(@PathVariable Long listId) {
		return ResponseEntity.ok(gameService.findByList(listId));
	}
}
