package com.mx.SpringBootUdemy.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mx.SpringBootUdemy.Modelo.Album;
import com.mx.SpringBootUdemy.Servicios.IAlbumService;

@RestController
public class HomeController {
	@Autowired
	private IAlbumService albumService;
	
	@RequestMapping("/api")
	public List<Album> buscarTodos() {
		List<Album> listaAlbumes=albumService.buscarTodos();
		for(Album album_item:listaAlbumes)
			System.out.println(album_item.toString());
		return listaAlbumes;
	}
}
