package com.wendy.dslist.service;

import com.wendy.dslist.dto.GameMinDTO;
import com.wendy.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;

	@GetMapping
	public List<GameMinDTO> findAll() {
		return gameRepository.findAll().stream().map(GameMinDTO::new).collect(Collectors.toList());
	}
}
