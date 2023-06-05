CREATE TABLE user_curse (
    user_id bigint NOT NULL,
    curse_id bigint NOT NULL,
    PRIMARY KEY (user_id, curse_id),
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (curse_id) REFERENCES curses (id)
);