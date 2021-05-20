package br.com.turma.simulabanco;

import java.util.ArrayList;
import java.util.List;

import br.com.turma.modelo.Usuario;

public class Banco {
	
	public static List<Usuario> usuarios = new ArrayList<>();
	
	public static void adiciona(Usuario usuario) {
		Banco.usuarios.add(usuario);
	}
	
	public static List<Usuario> getUsuarios() {
		return Banco.usuarios;
	}
}
