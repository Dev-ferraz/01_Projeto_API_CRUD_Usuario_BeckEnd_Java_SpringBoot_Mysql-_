INSERT INTO usuario (nome, login, senha, email)
VALUES ('Rapha Silava', 'ra00', 'senha33', 'ra@email.com');

INSERT INTO perfil (descricao) 
VALUES ('Descrição');

INSERT INTO recurso (nome, chave) 
VALUES ('Ferraz', '7786');


INSERT INTO UsuarioPerfil (id_usuario, id_perfil) 
VALUES ('1', '1');


INSERT INTO UsuarioPerfil_recuso (id_perfil, id_recurso) 
VALUES ('1', '1');
 