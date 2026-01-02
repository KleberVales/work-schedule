

CREATE TABLE IF NOT EXISTS tasks(

    id BIGSERIAL PRIMARY KEY,
    title varchar(255),
    description text,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP

);