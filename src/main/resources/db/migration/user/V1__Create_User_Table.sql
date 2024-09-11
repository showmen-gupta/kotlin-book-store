CREATE TABLE IF NOT EXISTS app_user
(
    id        SERIAL PRIMARY KEY,
    firstname TEXT NOT NULL,
    lastname  TEXT not null,
    email     TEXT not null,
    address   TEXT not null,
    phone     TEXT not null
)