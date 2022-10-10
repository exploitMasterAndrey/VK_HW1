CREATE TABLE IF NOT EXISTS Author(
                                     id serial PRIMARY KEY,
                                     author_name varchar(50) NOT NULL
    );

CREATE TABLE IF NOT EXISTS Book(
                                   id serial,
                                   book_name varchar(50),
    author_id INT REFERENCES Author(id)
    );

INSERT INTO Author (author_name) VALUES
                                     ('Pushkin A.S.'),
                                     ('Tolstoy L.N.');

INSERT INTO Book (book_name, author_id) VALUES
                                            ('Boris Godunov', 1),
                                            ('Evgeniy Onegin', 1),
                                            ('Vlast tmi', 2),
                                            ('zhivoy trup', 2);