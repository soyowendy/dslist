package com.wendy.dslist.service;

import com.wendy.dslist.dto.GameDTO;
import com.wendy.dslist.dto.GameMinDTO;
import com.wendy.dslist.entities.Game;
import com.wendy.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		return gameRepository.findAll().stream().map(GameMinDTO::new).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Optional<Game> game = gameRepository.findById(id);

		return game.map(GameDTO::new).orElse(null);

	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		return gameRepository.searchByList(listId).stream().map(GameMinDTO::new).collect(Collectors.toList());
	}
}
