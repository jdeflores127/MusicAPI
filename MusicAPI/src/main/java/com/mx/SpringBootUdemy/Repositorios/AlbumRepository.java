package com.mx.SpringBootUdemy.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.SpringBootUdemy.Modelo.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer>{

}
