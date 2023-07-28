package com.wendy.dslist.service;

import com.wendy.dslist.dto.GameDTO;
import com.wendy.dslist.dto.GameListDTO;
import com.wendy.dslist.dto.GameMinDTO;
import com.wendy.dslist.entities.Game;
import com.wendy.dslist.repository.GameListRepository;
import com.wendy.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GameListService {
	@Autowired
	private GameListRepository gameListRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		return gameListRepository.findAll().stream().map(GameListDTO::new).collect(Collectors.toList());
	}
}
