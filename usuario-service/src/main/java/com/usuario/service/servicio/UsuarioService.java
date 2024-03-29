package com.usuario.service.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usuario.service.entidades.Usuario;
import com.usuario.service.repositorio.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> getAll(){
		return usuarioRepository.findAll();
	}
	
	public Usuario getUsuarioById(int id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	
	public void deleteAll(){
		usuarioRepository.deleteAll();
	}
	
	public void deleteUsuarioById(int id) {
		usuarioRepository.deleteById(id);
	}
	
	public Usuario save(Usuario usuario) {
		Usuario nuevoUsuario = usuarioRepository.save(usuario);
		return nuevoUsuario;
	}
	
	public Usuario editById(int id, Usuario usuarioEditado) {
		//Usuario usuarioAntiguo = getUsuarioById(int id);
		usuarioEditado.setId(id);
		usuarioRepository.save(usuarioEditado);
		return usuarioEditado;
	}
	
	
}
