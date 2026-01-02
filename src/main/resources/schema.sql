

CREATE TABLE tasks IF NOT EXISTS tasks(

    id BIGSERIAL PRIMARY KEY,
    title varchar(255),
    description text,
    current_data TIMESTAMP DEFAULT CURRENT_TIMESTAMP

);