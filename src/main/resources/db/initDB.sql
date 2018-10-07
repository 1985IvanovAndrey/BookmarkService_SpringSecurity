CREATE TABLE bookmark
(
  id           SERIAL NOT NULL
    CONSTRAINT bookmark_pkey
    PRIMARY KEY,
  bookmark     VARCHAR(255),
  description  VARCHAR(255),
  url_bookmark VARCHAR(255),
  group_id     INTEGER
    CONSTRAINT fkjpwivgva369bxytq6a8gp9vp2
    REFERENCES groups
);CREATE TABLE groups
(
  id        INTEGER NOT NULL
    CONSTRAINT groups_pkey
    PRIMARY KEY,
  namegroup VARCHAR(255)
);
