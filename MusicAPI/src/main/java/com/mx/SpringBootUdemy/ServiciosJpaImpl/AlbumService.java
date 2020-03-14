package com.mx.SpringBootUdemy.ServiciosJpaImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringBootUdemy.Modelo.Album;
import com.mx.SpringBootUdemy.Repositorios.AlbumRepository;
import com.mx.SpringBootUdemy.Servicios.IAlbumService;

@Service
public class AlbumService implements IAlbumService{

	@Autowired
	private AlbumRepository albumRepository; 
	
	public List<Album> buscarTodos() {	
		return albumRepository.findAll();
	}
	
}
