package com.example.assignment2.milestone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.assignment2.milestone.model.Netflix;
import com.example.assignment2.milestone.repository.NetflixRepository;

@Service
@Transactional
public class MilestoneService {

	@Autowired
	private NetflixRepository netflixRepository;

	public List<Netflix> getAllMovies() {
		List<Netflix> allMovies= (List<Netflix>) netflixRepository.findAll();
		return allMovies;
	}

	
	public List<Netflix> getTvShows(int count) {
		List<Netflix> tvShows= (List<Netflix>) netflixRepository.findByType("TV Show");
		return tvShows;
	}
	
	public List<Netflix> getTvShowsByCountry(String country) {
		List<Netflix> tvShows= (List<Netflix>) netflixRepository.findByType("TV Show");
		return tvShows;
	}
}
