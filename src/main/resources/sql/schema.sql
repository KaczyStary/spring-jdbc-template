create table if not exists books(
    id integer identity primary key,
    title varchar(50),
    author varchar(50)
);