create table pessoa (
    cd_pessoa int primary key auto_increment not null,
    nome varchar(200),
    sobrenome varchar(200)
);

insert into pessoa values(null, 'Gabriel', 'Leandro')