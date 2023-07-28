package com.wendy.dslist.controller;

import com.wendy.dslist.dto.GameDTO;
import com.wendy.dslist.dto.GameMinDTO;
import com.wendy.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {
	@Autowired
	private GameService gameService;

	@GetMapping
	public ResponseEntity<List<GameMinDTO>> findAll() {
		return ResponseEntity.ok(gameService.findAll());
	}

	@GetMapping("/{gameId}")
	public ResponseEntity<GameDTO> findById(@PathVariable Long gameId) {
		GameDTO gameDTO = gameService.findById(gameId);
		if (gameDTO == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(gameDTO);
	}
}
