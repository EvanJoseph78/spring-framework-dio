package com.dio.webapi.repository;

import com.dio.webapi.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
  public void save(Usuario usuario) {
    if (usuario.getId() == null)
      System.out.println("SAVE - Recebendo o usuário na camada de repositório");
    else
      System.out.println(
          "UPDATE - Recebendo o usuário na camada de repositório");
    System.out.println(usuario);
  }

  public void deleteById(Integer id) {
    System.out.println(String.format(
        "DELETE/id - Recebendo o id: %d para excluir usuario", id));
    System.out.println(id);
  }

  public List<Usuario> findAll() {
    System.out.println("LIST - Listando os usuários do sistema");
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("Evan", "123456"));
    usuarios.add(new Usuario("Joseph", "333555"));
    return usuarios;
  }

  public Usuario findById(Integer id) {
    System.out.println(String.format(
        "FIND/id - o id: %d para localizar um usuário pelo id", id));
    return new Usuario("Evan", "123456");
  }

  public Usuario findByUsername(String username) {
    System.out.println(String.format(
        "FIND/username - o username: %s para localizar um usuário pelo username",
        username));
    return new Usuario("Evan", "123456");
  }
}
