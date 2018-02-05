package com.example.demo.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Producto;

public interface ProductoService {
	List<Producto> findAllProducto();

//	List<Producto> findById(long id);

	
	
	
	Producto findById(Long id);

	boolean isProductoExist(Producto producto);

	boolean saveProduct(Producto producto);

	boolean updateProducto(Producto producto);

	boolean deleteProducto(Producto currentProduct);

}
